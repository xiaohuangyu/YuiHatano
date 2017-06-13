package net.kb.test.library.testCase;

import net.kb.test.library.KBSharedPrefCase;
import net.kb.test.library.xutils.XUtilsDbUtils;

import org.junit.Rule;
import org.junit.rules.ExternalResource;


/**
 * Created by kkmike999 on 2017/06/13.
 */
public class XUtilsCase extends KBSharedPrefCase {

    @Rule
    public ExternalResource xutilsRule = new ExternalResource() {
        @Override
        protected void before() throws Throwable {
            System.out.println("XUtilsCase before");
            XUtilsDbUtils.setUp();
            XUtilsDbUtils.init(getApplication());
        }

        @Override
        protected void after() {
            System.out.println("XUtilsCase after");
            XUtilsDbUtils.clearAndCloseAndDrop();
        }
    };
}
