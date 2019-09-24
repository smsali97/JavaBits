import java.util.List;

import generics.printing.BWCartridge;
import generics.printing.ColorCartridge;
import generics.printing.ICartridge;
import generics.printing.Printer;

public class HelloWorld {

	public static void main(String[] args) 
	{
		Printer<BWCartridge> printer = new Printer<>(true, "Model 1",new BWCartridge());		
		
		getPrinterCartridge(printer);
		
//		printer.print(1);
//		
//		Printer.printCartidgeOf(new ColorCartridge());
//		
//		
//		List<ICartridge> list;
//		List<BWCartridge> list2;
//		
//		list = list2;
//		
//		
	}	

	public static void getPrinterCartridge(Printer<? extends ICartridge> printer) {
		System.out.println(printer.getCartridge().getFillPercentage());
	}
	
}

