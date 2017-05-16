package testing;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@IncludeCategory(TesteInmultire.class)
@SuiteClasses({ PersoanaTest.class })
public class TestePentruMetodaInmultire {

}
