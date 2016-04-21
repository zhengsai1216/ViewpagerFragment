package fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/**
 * 
 * @author 郑赛
 *第一个碎片
 */

public class Fragment_one extends Fragment{
	@Override
	public View onCreateView(LayoutInflater inflater,
			 ViewGroup container,  Bundle savedInstanceState) {
		View view=inflater.inflate(com.veryedu.titles.R.layout.activity_one, null);
		Log.i("sssw", "ssswlll");
		return view;
	}

}
