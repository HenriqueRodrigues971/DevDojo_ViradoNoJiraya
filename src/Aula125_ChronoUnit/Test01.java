package Aula125_ChronoUnit;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Test01 {
    public static void main(String[] args) {
        // Exemplo 1: Medição de tempo entre duas datas
        LocalDate startDate = LocalDate.of(2022, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 5, 20);

        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate); // Dias entre duas datas
        long monthsBetween = ChronoUnit.MONTHS.between(startDate, endDate); // Meses entre duas datas
        long yearsBetween = ChronoUnit.YEARS.between(startDate, endDate); // Anos entre duas datas

        System.out.println("Dias entre as datas: " + daysBetween);
        System.out.println("Meses entre as datas: " + monthsBetween);
        System.out.println("Anos entre as datas: " + yearsBetween);

        // Exemplo 2: Medição de tempo entre duas datas e horas
        LocalDateTime startDateTime = LocalDateTime.of(2022, 1, 1, 0, 0);
        LocalDateTime endDateTime = LocalDateTime.of(2023, 5, 20, 12, 30);

        long hoursBetween = ChronoUnit.HOURS.between(startDateTime, endDateTime); // Horas entre duas datas e horas
        long minutesBetween = ChronoUnit.MINUTES.between(startDateTime, endDateTime); // Minutos entre duas datas e horas

        System.out.println("Horas entre as datas e horas: " + hoursBetween);
        System.out.println("Minutos entre as datas e horas: " + minutesBetween);

        // Exemplo 3: Adição de tempo usando ChronoUnit
        LocalDate newDate = startDate.plus(10, ChronoUnit.DAYS); // Adiciona 10 dias à data inicial
        LocalDateTime newDateTime = startDateTime.plus(3, ChronoUnit.HOURS); // Adiciona 3 horas à data e hora inicial

        System.out.println("Nova data após adicionar 10 dias: " + newDate);
        System.out.println("Nova data e hora após adicionar 3 horas: " + newDateTime);

        // Exemplo 4: Subtração de tempo usando ChronoUnit
        LocalDate subtractedDate = endDate.minus(2, ChronoUnit.MONTHS); // Subtrai 2 meses da data final
        LocalDateTime subtractedDateTime = endDateTime.minus(45, ChronoUnit.MINUTES); // Subtrai 45 minutos da data e hora final

        System.out.println("Data após subtrair 2 meses: " + subtractedDate);
        System.out.println("Data e hora após subtrair 45 minutos: " + subtractedDateTime);

        // Exemplo 5: Uso de outras unidades de tempo com ChronoUnit
        long weeksBetween = ChronoUnit.WEEKS.between(startDate, endDate); // Semanas entre duas datas
        long decadesBetween = ChronoUnit.DECADES.between(startDate, endDate); // Décadas entre duas datas

        System.out.println("Semanas entre as datas: " + weeksBetween);
        System.out.println("Décadas entre as datas: " + decadesBetween);
    }
}
