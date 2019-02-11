

public class Main {

	public static void main(String[] args) {
		
		ITCluster cluster1 = new ITCluster();

		ITCluster cluster2 = new ITCluster(
				"Odessa",
				"Ukraine",
				23,
				7,
				"Ben Afflack",
				12,
				"Rusovyh"
		);

		ITCluster cluster3 = new ITCluster(
				"Kyiv",
				"Ukraine",
				5,
				2	
		);

		cluster3.setCluster_leader("Mat Damon");
		cluster3.setPerformance_time_in_hours(6);
		cluster3.setAddress_of_conducting("Ukrainku");

		System.out.println(cluster1.toString() + '\n');
		System.out.println(cluster2.toString() + '\n');
		System.out.println(cluster3.toString() + '\n');

		System.out.println("printStaticField: ");
		ITCluster.printStaticTicketPriceInDollars();
		

		System.out.println("printField");
		cluster1.printTicketPriceInDollars();
		cluster2.printTicketPriceInDollars();
		cluster3.printTicketPriceInDollars();
	}


}
