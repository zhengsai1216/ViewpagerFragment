package fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/**
 * 
 * @author 郑赛
 *第四个碎片
 */

public class Fragment_four extends Fragment{
	@Override
	public View onCreateView(LayoutInflater inflater,
			 ViewGroup container,  Bundle savedInstanceState) {
		View view=inflater.inflate(com.veryedu.titles.R.layout.activity_four, null);
		return view;
	}

}
