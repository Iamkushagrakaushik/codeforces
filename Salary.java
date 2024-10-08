import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
 
import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;

public class Salary {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Choose locale
            System.out.println("Choose locale:");
            System.out.println("1. US (en-US)");
            System.out.println("2. India (en-IN)");
            System.out.println("3. France (fr-FR)");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            // Set locale based on user choice
            Locale locale;
            switch (choice) {
                case 1:
                    locale = Locale.US;
                    break;
                case 2:
                    locale = new Locale("en", "IN");
                    
                    break;
                case 3:
                    locale = Locale.FRANCE;
                    break;
                default:
                    System.out.println("Invalid choice, defaulting to US locale.");
                    locale = Locale.US;
                    break;
            }

            // Get employee details
            System.out.print("Enter employee name: ");
            String employeeName = scanner.nextLine();
            System.out.print("Enter employee ID: ");
            int employeeID = scanner.nextInt();
            scanner.nextLine(); // consume newline

            // Get current date and time
            LocalDateTime objectDateTime = LocalDateTime.now();
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd MMM yyyy", locale);
            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm a", locale);

            // Get salary details
            System.out.print("Enter basic pay in lakh: ");
            double basicSalary = scanner.nextDouble();

            // Determine tax percentage based on salary slabs
            double taxPercentage = 0.0;
            if (basicSalary > 3.21 && basicSalary <= 4.5) {
                taxPercentage = 12;
            } else if (basicSalary > 4.51 && basicSalary <= 6.99) {
                taxPercentage = 15;
            } else if (basicSalary >= 7.0) {
                taxPercentage = 20;
            }

            // Calculate salary components
            double hra = (basicSalary * 25) / 100;
            double da = (basicSalary * 30) / 100;
            double pf = (basicSalary * 12) / 100;
            double ta = (basicSalary * 20) / 100;
            double tax = (basicSalary * taxPercentage) / 100;
            double grossSalary = basicSalary + hra + da;
            double netSalary = grossSalary - pf - tax;

            // Format salary components as currency
            NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
            String basicSalaryFormatted = currencyFormatter.format(basicSalary * 100000); // Converting lakh to actual value
            String hraFormatted = currencyFormatter.format(hra * 100000);
            String daFormatted = currencyFormatter.format(da * 100000);
            String pfFormatted = currencyFormatter.format(pf * 100000);
            String taFormatted = currencyFormatter.format(ta * 100000);
            String grossSalaryFormatted = currencyFormatter.format(grossSalary * 100000);
            String taxFormatted = currencyFormatter.format(tax * 100000);
            String netSalaryFormatted = currencyFormatter.format(netSalary * 100000);

            // Print salary slip
            System.out.println("\nSalary Slip");
            System.out.println("Java Company");
            System.out.println("Date: " + objectDateTime.toLocalDate().format(dateFormatter));
            System.out.println("Time: " + objectDateTime.toLocalTime().format(timeFormatter));
            System.out.println("-----------");
            System.out.println("Employee Name: " + employeeName);
            System.out.println("Employee ID: " + employeeID);
            System.out.println("Basic Salary: " + basicSalaryFormatted);
            System.out.println("HRA (@25%): " + hraFormatted);
            System.out.println("DA (@30%): " + daFormatted);
            System.out.println("PF (@12%): " + pfFormatted);
            System.out.println("TA (@20%): " + taFormatted);
            System.out.println("Gross Salary: " + grossSalaryFormatted);
            System.out.println("Tax (@" + taxPercentage + "%): " + taxFormatted);
            System.out.println("Net Salary: " + netSalaryFormatted);
        }
    }
}