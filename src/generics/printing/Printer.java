package generics.printing;

public class Printer<T> implements IMachine 
{
	private String modelNumber;
	private PaperTray paperTray = new PaperTray();
	private Machine machine;
	
	T cartridge;
	
	public T getCartridge() {
		return cartridge;
	}
	
	
	public Printer(boolean isOn, String modelNumber, T cartridge)
	{
		machine = new Machine(isOn);
		this.modelNumber = modelNumber;
		this.cartridge = cartridge;
	}
	
	public static <U extends ICartridge> void  printCartidgeOf(U myCartridge) {
		System.out.println(myCartridge.getFillPercentage());
	}
	
	
	@Override
	public void TurnOn()
	{
		System.out.println("Warming up printer");
		machine.TurnOn();
	}
	
	
	public void print(int copies)
	{	
//		System.out.println(cartridge.getFillPercentage());
		
		
		String onStatus = "";
		if(machine.isOn())
			onStatus = " is On!";
		else
			onStatus = " is Off!";
		
		String textToPrint = "Printing...";
						
		while( copies > 0 && !paperTray.isEmpty() )
		{
			System.out.println(textToPrint);
			copies--;
			paperTray.usePage();
		}
		
		if(paperTray.isEmpty())
			System.out.println("Load more paper!");
	}
		
	
	
	public void loadPaper(int count) 
	{
		paperTray.addPaper(count);
	}

	@Override
	public void TurnOff() {
		machine.TurnOff();
	}

	@Override
	public boolean isOn() {
		return machine.isOn();
	}
}
