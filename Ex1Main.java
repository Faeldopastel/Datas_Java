import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Ex1Main {

    public static void main(String[] args) {

        List<LocalDate> Lista_Feriados = new ArrayList<>();
       


        LocalDate dt1 = LocalDate.parse("2024-01-01");
        LocalDate dt2 = LocalDate.parse("2024-09-14");
        LocalDate feriados = LocalDate.of(dt1.getYear(),9,07 );
        
        Lista_Feriados.add(feriados);

        feriados = LocalDate.of(dt1.getYear(),5,01 );
        
        Lista_Feriados.add(feriados);

        

        

        

        System.out.println(Ex1.Cont_sab(dt1, dt2));
        System.out.println(Ex1.dias_ut(dt1, dt2, Lista_Feriados));
        Ex1.Fatura(dt1, dt2, 3, Lista_Feriados);
        System.out.println(Ex1.dia_da_semana(dt1));
        System.out.println(Ex1.calendario(2024,06));
    }
    
}
