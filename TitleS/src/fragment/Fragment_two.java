package fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/**
 * 
 * @author 郑赛
 *第二个碎片
 */

public class Fragment_two extends Fragment{
	
	@Override
	public View onCreateView(LayoutInflater inflater,
			 ViewGroup container,  Bundle savedInstanceState) {
		View view=inflater.inflate(com.veryedu.titles.R.layout.activity_two, null);
		return view;
	}

}
