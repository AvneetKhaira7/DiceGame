package Exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class RollDie {

	//PRIVATE MEMBERS +++++++++++++++++++++++++++++++++++++++++++++++
		private int _die1;
		private int _die2;
		private ArrayList<Integer> _sumOfDies = new ArrayList<Integer>();
		private int _numTimesRolled;
		private int _sum;
		
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
			Set<Integer> diceSet = new HashSet<Integer>(this._sumOfDies);
			for(int temp: diceSet){
				System.out.println("Number of times " + temp + " rolled: " + Collections.frequency(this._sumOfDies, temp));
			
			}
			
			}
			
		}
		
		
		

