package HouseholdAppliance;

public class PackingInstructions implements Visitor {

	private Double packing;

	@Override
	public void visitGlass(Glass g) {
		// TODO Auto-generated method stub
		System.out.println(g.getName() + ":");
		System.out.println("> should be covered with Bubble wraps and packed in a box with dimension: " + (g.lenght + 1)
				+ "x" + (g.width + 1) + "x" + (g.height + 1));
	}

	@Override
	public void visitFurniture(Furniture f) {
		// TODO Auto-generated method stub
		System.out.println(f.getName() + ":");
		System.out.println("> should be covered with waterproof covers with area of: " + (f.lenght) + "x" + (f.width));
	}

	@Override
	public void visitElectronic(Electronic e) {
		// TODO Auto-generated method stub
		System.out.println(e.getName() + ":");
		System.out.println("> should be covered with Polyethylene foam film and packed in a box with dimension: "
				+ (e.lenght + 1) + "x" + (e.width + 1) + "x" + (e.height + 1));
	}

	public Double getPackingInstruction(HouseholdItem h) {
		h.accept(this);
		return packing;
	}
}
