package QAHW_Testng.priority;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

    public class Priority1 {
        @Test(dependsOnGroups = {"g"})
        public void a() {
            assertTrue(true);
        }

        @Test(dependsOnGroups = {"f"})
        public void b() {
            assertTrue(true);
        }

        @Test(dependsOnGroups = {"e"})
        public void c() {
            assertTrue(true);
        }

        @Test(dependsOnGroups = {"d"})
        public void d() {
            assertTrue(true);
        }

        @Test(dependsOnGroups = {"c"})
        public void e() {
            assertTrue(true);
        }

        @Test(dependsOnGroups = {"b"})
        public void f() {
            assertTrue(true);
        }

        @Test(dependsOnGroups = {"a"})
        public void g() {
            assertTrue(true);
        }
    }

