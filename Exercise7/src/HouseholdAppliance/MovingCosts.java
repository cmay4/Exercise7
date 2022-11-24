package HouseholdAppliance;

public class MovingCosts implements Visitor {

	@Override
	public void visitGlass(Glass g) {
		// TODO Auto-generated method stub
		double costs = 0.0;
		switch (g.getTickness()) {
		case 1:
			costs = (2 * (double) g.getLenght());
			break;
		case 2:
			costs = (1.2 * (double) g.getLenght());
			break;
		case 3:
			costs = (0.7 * (double) g.getLenght());
			break;
		}

		System.out.println("Total Costs for " + g.getName() + " is: " + costs + " Euros");
	}

	@Override
	public void visitFurniture(Furniture f) {
		// TODO Auto-generated method stub
		Double costs = ((double) f.weight / 20) * 5;
		System.out.println("Total Costs for " + f.getName() + " is: " + costs + " Euros");
	}

	@Override
	public void visitElectronic(Electronic e) {
		// TODO Auto-generated method stub
		Double costs;
		if (!e.fragile) {
			costs = ((double) e.weight / 15) * 5;
		} else {
			costs = ((double) e.weight / 10) * 5;
		}
		System.out.println("Total Costs for " + e.getName() + " is: " + costs + " Euros");
	}

	public Double getMovingCosts(HouseholdItem h) {
		Double costs = 0.0;
		h.accept(this);
		return costs;
	}

}
