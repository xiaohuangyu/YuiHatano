package net.yui;

import android.content.Context;

import net.kb.test.library.KBCase;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by kkmike999 on 2017/06/06.
 */
public class KBCaseTest extends KBCase {
    private Context mContext;

    @Before
    public void setUp() throws Exception {
        mContext = getContext();
    }

    @Test
    public void testMethod() {
        Assert.assertEquals("Yui Hatano", mContext.getString(R.string.test_string));
        System.out.println();
    }
}