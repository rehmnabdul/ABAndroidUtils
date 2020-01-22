# ABAndroidUtils
ABAndroidUtils
[![](https://jitpack.io/v/rehmnabdul/ABAndroidUtils.svg)](https://jitpack.io/#rehmnabdul/ABAndroidUtils)

Step 1. Add the JitPack repository to your build file

	Add it in your root build.gradle at the end of repositories:
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
Step 2. Add the dependency
  
  	dependencies {
	        implementation 'com.github.rehmnabdul:ABAndroidUtils:[version code]'
	}

Step 3. Usage
	
	Display Messages:
	
	1. From any context you can call showToast(message)
		context.showToast("Your Message")
		
	   To change time you can pass another parameter
		context.showToast("Your Message", Toast.LENGTH_SHORT)
	
	2. In any class or activity, you can simply call loge(message) to show your message on logcat.
		loge("Your Message")
		
	   Other methods are also available i.e. 
	   	loge("Message")
		logd("Message")
		logw("Message")
		logi("Message")
		logv("Message")
		
	Threads:
	
	1. In any class or object, you can simply call runOnBackgroundThread() and pass a runnable object top run it on background thread.
		
		runOnBackgroundThread(object : Runnable{
		    override fun run() {

		    }
		})
	
	2. From any thread in you can call runOnUiThread()
		
		runOnUiThread(object : Runnable{
		    override fun run() {

		    }
		})
		
	Utilities:
	
	1. Convert DP to PX from any class or vice versa.
		
		dpToPx(dp)
		pxToDp(px)
		
	2. Get Screen Size from any class
		
		getScreenWidth()
		getScreenHeight()
		
	3. Get Statusbar Height from any class
		
		getStatusBarHeight()
		
	4. Vibrate Device from any class
	
		vibrate(context)
	
	5. You can check any of your service is running or not  from context reference
	
		context.isServiceRunning(className)
		or
		isServiceRunning(className)
		
	6. Check Permission from context reference
	
		context.checkIfPermissionGranted(permission)
		or
		checkIfPermissionGranted(permission)
		
	7. Copy any text to Clipboard
		
		context.copyToClipboard()
		or
		copyToClipboard()
		
	8. Broadcast Data from a context reference
	
		context.broadcastData(data, action)
		or
		broadcastData(data, action)
		
		
		
		
