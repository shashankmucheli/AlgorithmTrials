package algorithmtrials;
public class WarringNeighbors {
	public static void main(String[] args){
		Neighbors[] n=new Neighbors[3];
		Flags[] f=new Flags[3];
		n[1]=new Neighbors(1,f[1],f[2]);
		n[2]=new Neighbors(2,f[2],f[1]);
		Thread n1=new Thread(n[1]);
		Thread n2=new Thread(n[2]);
		n1.start();
		n2.start();
	}
}
class Neighbors implements Runnable{
	int id;
	Flags ownFlag;
	Flags neighborFlag;
	Neighbors(int id,Flags ownFlag,Flags neighborFlag){
		this.id=id;
		this.ownFlag=ownFlag;
		this.neighborFlag=neighborFlag;
	}
        @Override
	public void run(){
		//while(true){			
			try{
				Thread.sleep(400);
			}catch(Exception e) {
                            e.printStackTrace();
                        }
			ownFlag.Raise();
			if(neighborFlag.Flag()==false){
				System.out.println("neighbor"+id+"enters the field");
				try{
					Thread.sleep(400);
				}catch(Exception e) {}
				System.out.println(					"n"+id+" is picking wild berries ..........");
				try{
					Thread.sleep(300);
				}catch(Exception e) {}
				System.out.println("n"+id+" exits the field");
			}
			ownFlag.Lower();
			
		//}
	}
}

class Flags{
	boolean f=false;	
	public synchronized void Raise(){
		f=true;
	}	
	public synchronized void Lower(){
		f=false;
	}
	public synchronized boolean Flag(){
		return f;
	} 
}