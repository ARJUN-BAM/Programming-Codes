/*A villege has a population of cp and in every 7 secs a child births,13 sec a person dies and 45 secs a person migrate now calculate the total new population of the villege.*\


class Population
{
	public static void main(String[] args)
	{
		long cp = 312032486;
		final long secs = 5*365*24*60*60;
		long birth = secs/7;
		long death = secs/13;
		long mig = secs/45;
		cp = cp+birth-death+mig;
		System.out.println("Total latest population: "+ cp);
		
	}
}