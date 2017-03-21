package program;

import builder.Camera;
import builder.CameraBuilder;
import builder.CameraBuilderV2;

public class Program {

	public static void main(String[] args) {
		Camera camera=new Camera();
		Camera camera2=new Camera(4, "Dubla", true, true, true, false);
		camera.setMicDejun(true);
		camera.setVedere(true);
		camera.setLocParcare(true);
		
		System.out.println(camera.toString());
		
		//prin builder
	Camera camera3=new CameraBuilder().setMicDejun(true).setVedere(true).
			setLocParcare(true).build();
	
	System.out.println(camera3.toString());
	
	
	//prin builder 2
	Camera camera4=new CameraBuilderV2().setMicDejun(true).setVedere(true).
			setLocParcare(true).build();
	System.out.println(camera4.toString());

	}

}
