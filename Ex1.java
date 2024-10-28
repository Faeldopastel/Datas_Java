
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;



public class Ex1 {


    public static int Cont_sab(LocalDate dt1, LocalDate dt2){
        int cont = 0;

        while(!dt1.equals(dt2)){
            if(dt1.getDayOfWeek() == DayOfWeek.SATURDAY || dt1.getDayOfWeek() == DayOfWeek.SUNDAY){
                cont++;
            }
            dt1 = dt1.plusDays(1);

        }

        return cont;

    }


    public static int dias_ut(LocalDate dt1, LocalDate dt2, List<LocalDate> Lista_Feriados) {
        int cont = 0;
        LocalDate[] feriado = new LocalDate[Lista_Feriados.size()];

        for (int j = 0; j < Lista_Feriados.size(); j++) {
            feriado[j] = Lista_Feriados.get(j);
        }

        while (!dt1.equals(dt2)) {
            boolean isFeriado = false;

            for (int j = 0; j < feriado.length; j++) {
                if (dt1.getMonth() == feriado[j].getMonth() && dt1.getDayOfMonth() == feriado[j].getDayOfMonth()) {
                    isFeriado = true;

                    feriado[j] = feriado[j].plusYears(1);
                    break;
                }
            }
            if (dt1.getDayOfWeek() != DayOfWeek.SATURDAY && dt1.getDayOfWeek() != DayOfWeek.SUNDAY && !isFeriado) {
                cont++;
            }

            
            dt1 = dt1.plusDays(1);
        }

        return cont;
    }



    public static void Fatura(LocalDate dt1, LocalDate dt2, int fatura, List<LocalDate> Lista_Feriados){

        int i = 0;
        LocalDate[] feriado = new LocalDate[Lista_Feriados.size()];

        for (int j = 0; j < Lista_Feriados.size(); j++) {
            feriado[j] = Lista_Feriados.get(j);
        }

        while (i < fatura) {
            boolean isFeriado = false;

            for (int j = 0; j < feriado.length; j++) {
                if (dt1.getMonth() == feriado[j].getMonth() && dt1.getDayOfMonth() == feriado[j].getDayOfMonth()) {
                        isFeriado = true;

                    feriado[j] = feriado[j].plusYears(1);
                    break;
                }
            }
            if (dt1.getDayOfWeek() != DayOfWeek.SATURDAY && dt1.getDayOfWeek() != DayOfWeek.SUNDAY && !isFeriado) {
                dt1 = dt1.plusDays(30);
            } 
            
            if(dt1.getDayOfWeek() == DayOfWeek.SATURDAY){
                dt1 = dt1.plusDays(2);
            } else if (dt1.getDayOfWeek() == DayOfWeek.SUNDAY || isFeriado){
                dt1 = dt1.plusDays(1);
            }
            
            
            
            System.out.println("Dia da próxima = " + dt1);
            i++;

        }
    
    }



    public static DayOfWeek dia_da_semana(LocalDate dt1){

        DayOfWeek dia = dt1.getDayOfWeek();

        return(dia);

    }


    public static List <LocalDate> calendario(int ano, int mes){
        List<LocalDate> dias = new ArrayList<>();
        LocalDate data = LocalDate.of(ano, mes, 1);

        while(data.getMonthValue() == mes){
            dias.add(data);
            data = data.plusDays(1);
        }

        return dias;
    

    }
}
