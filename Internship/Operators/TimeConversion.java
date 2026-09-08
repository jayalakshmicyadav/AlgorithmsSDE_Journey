class TimeConversion{
    public static void main(String[] args)
    {
        int sec = 36000;
        int minute,hours;
        minute = sec/60;
        hours = sec/(60*60); //minute/60;
        int min2sec = minute*60;
        int hour2sec = hours*60*60;
        System.out.println("Time in seconds: " + sec);
        System.out.println("Time in minutes: " + minute);
        System.out.println("Time in hours: " + hours);
        System.out.println("Time in seconds from minutes: " + min2sec);
        System.out.println("Time in seconds from hours: " + hour2sec);  
    }
}