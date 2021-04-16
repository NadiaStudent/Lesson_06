package ua.lviv.lgs;

public class FixedZarplata extends Worker implements Zarplata{
    private double montRate;
	public FixedZarplata(String name, double montRate) {
		super(name);
		this.montRate=montRate;
		
	}
	@Override
	public void zarplata() {
		double zarplata =this.montRate;
		System.out.println("Зарплата працівника  "+super.getName()+zarplata+"  грн");
		
	}

}
