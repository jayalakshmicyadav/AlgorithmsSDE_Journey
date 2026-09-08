class CinemaHall
{
    public static void main(String[] args)
    {
        int totalAudiance = 125;
        int SeatsPerRow = 12;
        int totalRowsCompleted = totalAudiance/SeatsPerRow;
        int seatsRemained = totalAudiance%SeatsPerRow;
        int peolpleinLastRow = seatsRemained;
        //System.out.println("Total Audiance: " + totalAudiance);
        //System.out.println("Seats Per Row: " + SeatsPerRow);
        System.out.println("Total Rows Completed: " + totalRowsCompleted);
        System.out.println("Seats remaining: " + seatsRemained);   
        System.out.println("People in Last Row: " + peolpleinLastRow);
    }
}