package ca.laplanete.mobile.pageddragdropgrid;

import ca.laplanete.mobile.pageddragdropgrid.PagedDragDropGrid;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.ScrollView;

public class StoppableScrollView extends ScrollView {

	PagedDragDropGrid gridView;
	
	public StoppableScrollView(Context context) {
		super(context);
		init();
	}
	
	public StoppableScrollView(Context context, AttributeSet attrs) {
		super(context, attrs);
		init();
	}
	
	public StoppableScrollView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		init();
	}
	
	private void init() {
//		gridView = (PagedDragDropGrid) getChildAt(0);
//		Log.e("gridView", String.valueOf(gridView));
	}
	
//	private float mX, mY;
	
//	@Override
//    public boolean onTouchEvent(MotionEvent ev) {		
//		float curX = 0, curY = 0;		
//		if (gridView == null) {
//			gridView = (PagedDragDropGrid) getChildAt(0);
//		}
//		
////		switch (ev.getAction()) {
////	        case MotionEvent.ACTION_DOWN:
////	            mX = ev.getX();
////	            mY = ev.getY();
////	            break;
////	        case MotionEvent.ACTION_MOVE:
////	            curX = ev.getX();
////	            curY = ev.getY();
////	            
////	            Log.e("(mY - curY)", String.valueOf((mY - curY)));
////	            if (gridView != null && (getScrollY() + getHeight()) < gridView.getGrid().getCurrentPageHeight()) {
////	            	super.onTouchEvent(ev);
////	    		} else if ( (mY - curY) < 0 ) {
//	    			super.onTouchEvent(ev);
////	    		}
////	            
////	            break;
////	        case MotionEvent.ACTION_UP:
////	        	curX = ev.getX();
////                curY = ev.getY();
////                break;
////		}
//		
//		
//	
////		if ( (mY - curY) < 0 ) {
////        	super.onTouchEvent(ev);
////        } else 
//        
//        
////        mX = curX;
////        mY = curY;
//		
//        return true;
//    }
	
//	@Override
//    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
//        super.onScrollChanged(l, t, oldl, oldt);
//        Log.e("t", String.valueOf(t));
//        Log.e("oldt", String.valueOf(oldt));
//        if (scrollViewListener != null) {
//            scrollViewListener.onScrollChanged(this, l, t, oldl, oldt);
//        }
		
//		if (gridView != null && (t + getHeight()) > gridView.getGrid().getCurrentPageHeight()) {
//			Log.e("t", String.valueOf(t));
//        	scrollTo(t, t);
//		}		
//    }
}
