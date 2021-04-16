package ua.lviv.lgs;

public class HourZarplata extends Worker implements Zarplata{
	private int monthWorkedHours;
	private double hourRate;
	
	public HourZarplata(String name,int monthWorkedHours,double hourRate ) {
		super(name);
		this.monthWorkedHours=monthWorkedHours;
		this.hourRate=hourRate;
		
	}
	



	@Override
	public void zarplata() {
	double zarplata=this.monthWorkedHours*this.hourRate;
	System.out.println("Зарплата працівника "+super.getName()+zarplata+ "  грн");
		
	}}
