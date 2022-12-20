package junit5runnerpackage;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

import junit5tests.TaggingTest;
import junit5tests.TestAnnotationTest;
import login.TestExecutionOrderTest;

@SuppressWarnings("deprecation")
@RunWith(JUnitPlatform.class)
//@SelectPackages({"login","junit5tests"})
@SelectClasses({TaggingTest.class, TestExecutionOrderTest.class})
//@IncludeTags({"sanity","regression"})
@ExcludeTags("regression")
public class JUnit5Runner1 {

}
