package Aula126_TemporalAdjusters;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.time.DayOfWeek;

public class Test01 {
    public static void main(String[] args) {
        // Obtém a data atual
        LocalDate today = LocalDate.now();
        System.out.println("Data atual: " + today);
        
        // Ajusta para o primeiro dia do mês
        LocalDate firstDayOfMonth = today.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println("Primeiro dia do mês: " + firstDayOfMonth);
        
        // Ajusta para o último dia do mês
        LocalDate lastDayOfMonth = today.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("Último dia do mês: " + lastDayOfMonth);
        
        // Ajusta para o primeiro dia do próximo mês
        LocalDate firstDayOfNextMonth = today.with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println("Primeiro dia do próximo mês: " + firstDayOfNextMonth);
        
        // Ajusta para o primeiro dia do próximo ano
        LocalDate firstDayOfNextYear = today.with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println("Primeiro dia do próximo ano: " + firstDayOfNextYear);
        
        // Ajusta para a próxima segunda-feira
        LocalDate nextMonday = today.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        System.out.println("Próxima segunda-feira: " + nextMonday);
        
        // Ajusta para a próxima ou mesma segunda-feira
        LocalDate nextOrSameMonday = today.with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
        System.out.println("Próxima ou mesma segunda-feira: " + nextOrSameMonday);
        
        // Ajusta para a última sexta-feira do mês
        LocalDate lastFridayOfMonth = today.with(TemporalAdjusters.lastInMonth(DayOfWeek.FRIDAY));
        System.out.println("Última sexta-feira do mês: " + lastFridayOfMonth);
        
        // Ajusta para o dia 15 do mês atual
        LocalDate dayOfMonth = today.withDayOfMonth(15);
        System.out.println("Dia 15 do mês atual: " + dayOfMonth);
    }
}
