package jp.horie1024.gradlejvmtestsample;

import android.test.ActivityInstrumentationTestCase2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    public MainActivityTest() {
        super(MainActivity.class);
    }

    MainActivity mActivity;

    @Before
    public void setUp() throws Exception {
        super.setUp();

        setActivityInitialTouchMode(false);

        mActivity = getActivity();
    }

    @Test
    public void testApp() {

        assertTrue(mActivity != null);
    }

    @After
    public void tearDown() throws Exception {
        super.tearDown();
    }
}