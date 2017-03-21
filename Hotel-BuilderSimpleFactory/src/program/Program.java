package program;

import builderfactory.Camera;
import builderfactory.CameraBuilder;
import builderfactory.TipCamera;

public class Program {

	public static void main(String[] args) {
		Camera camera=new CameraBuilder(TipCamera.DOUBLE).setLocParcare(true).
				setMicDejun(true).build();
		System.out.println(camera.toString());

	}

}
