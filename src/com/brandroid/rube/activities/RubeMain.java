package com.brandroid.rube.activities;

import org.anddev.andengine.engine.Engine;
import org.anddev.andengine.engine.camera.ZoomCamera;
import org.anddev.andengine.engine.options.EngineOptions;
import org.anddev.andengine.engine.options.EngineOptions.ScreenOrientation;
import org.anddev.andengine.engine.options.resolutionpolicy.RatioResolutionPolicy;
import org.anddev.andengine.entity.scene.Scene;
import org.anddev.andengine.entity.scene.background.ColorBackground;
import org.anddev.andengine.entity.util.FPSLogger;
import org.anddev.andengine.ui.activity.BaseGameActivity;

import android.app.Activity;
import android.os.Bundle;

public class RubeMain extends BaseGameActivity {
	
	static final int CAMERA_WIDTH = 480,
					CAMERA_HEIGHT = 320;
	
	static final String TAG = "BrandRube";
	
	private ZoomCamera mCamera;

	@Override
	public void onLoadComplete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Engine onLoadEngine() {
		mCamera = new ZoomCamera(0, 0, CAMERA_WIDTH, CAMERA_HEIGHT);
		return new Engine(new EngineOptions(true, ScreenOrientation.LANDSCAPE, new RatioResolutionPolicy(CAMERA_WIDTH, CAMERA_HEIGHT), mCamera));
	}

	@Override
	public void onLoadResources() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Scene onLoadScene() {
		mEngine.registerUpdateHandler(new FPSLogger());
		final Scene scene = new Scene(1);
		scene.setBackground(new ColorBackground(0, 0, 0.8784f));
		return scene;
	}
}