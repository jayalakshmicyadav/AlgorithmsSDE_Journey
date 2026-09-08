class DaysConversion
{
    public static void main(String[] args)
    {
        int days = 550;
        int years, months;
        years = days/365;
        months = days/30;
        int year2days = years*365;
        int month2days = months*30;
        System.out.println("Days: " + days);
        System.out.println("Years: " + years);
        System.out.println("Months: " + months);
        System.out.println("Days from years: " + year2days);
        System.out.println("Days from months: " + month2days);    
    }
}