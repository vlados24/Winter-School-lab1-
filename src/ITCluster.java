

public class ITCluster {
    private String city;
    private String country ;
    private int numberOfParticipants;
    private int numberOfSpeakers;
    private String clusterLeader;
    
    protected int performanceTimeInHours;
    protected String addressOfConducting;
    
    static int ticketPriceInDollars = 12;

    ITCluster() {

        this.city = "Lviv";
        this.country = "Ukraine" ;
        this.numberOfParticipants = 5000 ;
        this.numberOfSpeakers = 13 ;
        this.clusterLeader = "Anton Shikhmat" ;
        this.performanceTimeInHours = 3 ;
        this.addressOfConducting = "Sadovoa" ;
    }

    ITCluster(
        String city,
        String country,
        int numberOfParticipants,
        int numberOfSpeakers
    ) {
        this.city = city ;
        this.country = country ;
        this.numberOfParticipants = numberOfParticipants ;
        this.numberOfSpeakers = numberOfSpeakers ;
    }

    public ITCluster(String city,
                     String country,
                     int numberOfParticipants,
                     int numberOfSpeakers,
                     String clusterLeader,
                     int performanceTimeInHours,
                     String addressOfConducting) {
        this(city, country, numberOfParticipants, numberOfSpeakers);
        
        this.clusterLeader = clusterLeader;
        this.performanceTimeInHours = performanceTimeInHours;
        this.addressOfConducting = addressOfConducting;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getNumberOfParticipants() {
        return numberOfParticipants;
    }

    public void setNumberOfParticipants(int numberOfParticipants) {
        this.numberOfParticipants = numberOfParticipants;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public String getClusterLeader() {
        return clusterLeader;
    }

    public void setClusterLeader(String clusterLeader) {
        this.clusterLeader = clusterLeader;
    }

    public int getPerformanceTimeInHours() {
        return performanceTimeInHours;
    }

    public void setPerformanceTimeInHours(int performanceTimeInHours) {
        this.performanceTimeInHours = performanceTimeInHours;
    }

    public String getAddressOfConducting() {
        return addressOfConducting;
    }

    public void setAddressOfConducting(String addressOfConducting) {
        this.addressOfConducting = addressOfConducting;
    }

    public String toString() {
        return "ITCluster{" + '\n' +
                "city=" + city + '\n' +
                "country=" + country + '\n' +
                "numberOfParticipants=" + numberOfParticipants + '\n' +
                "numberOfSpeakers=" + numberOfSpeakers + '\n' +
                "clusterLeader=" + clusterLeader + '\n' +
                "performanceTimeInHours=" + performanceTimeInHours + '\n' +
                "addressOfConducting='" + addressOfConducting + '\n' +
                '}';
    }
    
    static void printStaticTicketPriceInDollars() {
		System.out.println("TickePriceInDollarst " + ticketPriceInDollars);
	}

	public void printTicketPriceInDollars() {
		System.out.println("TickePriceInDollarst " + ticketPriceInDollars);
	}

	public void resetValues(String city,
            String country,
            int numberOfParticipants,
            int numberOfSpeakers,
            String clusterLeader,
            int performanceTimeInHours,
            String addressOfConducting) 
	{
		this.city = city;
        this.country = country;
        this.numberOfParticipants = numberOfParticipants;
        this.numberOfSpeakers = numberOfSpeakers;
        this.clusterLeader = clusterLeader;
        this.performanceTimeInHours = performanceTimeInHours;
        this.addressOfConducting = addressOfConducting;
	}
} 