
public class BuyNItemsGetOneFree extends DiscountPolicy {
private int N;
	
	
	


	@Override
	double computeDiscount(int count, float itemCost) {
		if(count >= this.N) {
			int nUp = count / this.N;
			double discount = itemCost * nUp;
			return discount;
		}
		return 0;
	}
	
	public BuyNItemsGetOneFree(int n){
		N = n;
	}

}
