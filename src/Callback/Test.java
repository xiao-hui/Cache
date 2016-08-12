package Callback;

public class Test {
	public static void main(String[] args){
		new TestCallBack().compute(5,new ComputeCallBack(){
			@Override
			public void onComputeEnd(){
				System.out.println("end back!");
			}
			
		});
	}
	
}
