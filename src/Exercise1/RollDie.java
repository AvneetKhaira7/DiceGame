package Exercise1;

import java.util.ArrayList;

public class RollDie {

	//PRIVATE MEMBERS +++++++++++++++++++++++++++++++++++++++++++++++
		private int _die1;
		private int _die2;
		private ArrayList<Integer> _sumOfDies = new ArrayList<Integer>();
		private int _numTimesRolled;
		private int _sum;
		private int _count2 = 0;
		private int _count3 = 0;
		private int _count4 = 0;
		private int _count5 = 0;
		private int _count6 = 0;
		private int _count7 = 0;
		private int _count8 = 0;
		private int _count9 = 0;
		private int _count10 = 0;
		private int _count11 = 0;
		private int _count12 = 0;
		
		//CONSTRUCTOR TO INITIALIZE ++++++++++++++++++++++++++++++++++++++
		public RollDie(int numTimesRolled){
			this._numTimesRolled = numTimesRolled;
			
		}
		
		//METHOD FOR ROLLING AND CALCULATING SUM OF TWO DIES ++++++++++++++++++
		public void rollBothDies(){
			this._die1 = (int) (1 + Math.random()*6);
			this._die2 = (int) (1 + Math.random()*6);
			this._sum = this._die1 + this._die2;
			//return this._sum;
		}
		
		//METHOD FOR STORING THE VALUES OF POSSIBLE SUMS
		public void gameBegins(){
			for (int i=0; i<this._numTimesRolled; i++){
				rollBothDies();
				this._sumOfDies.add(this._sum);
			}
			
		}
		
		public void calculateResults(){
			gameBegins();
			for(int i=0; i<this._sumOfDies.size(); i++){
				if(this._sumOfDies.get(i).equals(2)){
					this._count2++;
				}
				else if(this._sumOfDies.get(i).equals(3)){
					this._count3++;
				}
				else if(this._sumOfDies.get(i).equals(4)){
					this._count4++;
				}
				else if(this._sumOfDies.get(i).equals(5)){
					this._count5++;
				}
				else if(this._sumOfDies.get(i).equals(6)){
					this._count6++;
				}
				else if(this._sumOfDies.get(i).equals(7)){
					this._count7++;
				}
				else if(this._sumOfDies.get(i).equals(8)){
					this._count8++;
				}
				else if(this._sumOfDies.get(i).equals(9)){
					this._count9++;
				}
				else if(this._sumOfDies.get(i).equals(10)){
					this._count10++;
				}
				else if(this._sumOfDies.get(i).equals(11)){
					this._count11++;
				}
				else {
					this._count12++;
				}
			}
			
		}
		
		public void displayResults(){
			System.out.println("Number of times 2 rolled: " + this._count2);
			System.out.println("Number of times 3 rolled: " + this._count3);
			System.out.println("Number of times 4 rolled: " + this._count4);
			System.out.println("Number of times 5 rolled: " + this._count5);
			System.out.println("Number of times 6 rolled: " + this._count6);
			System.out.println("Number of times 7 rolled: " + this._count7);
			System.out.println("Number of times 8 rolled: " + this._count8);
			System.out.println("Number of times 9 rolled: " + this._count9);
			System.out.println("Number of times 10 rolled: " + this._count10);
			System.out.println("Number of times 11 rolled: " + this._count11);
			System.out.println("Number of times 12 rolled: " + this._count12);
			//System.out.println("Hello");
		}
		
}
