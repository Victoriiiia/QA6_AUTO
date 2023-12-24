package QAHW_Testng.priority;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

    public class Priority1_1 {
        @Test(dependsOnGroups = {"seven"})
        public void a() {
            assertTrue(true);
        }

        @Test(dependsOnGroups = {"six"})
        public void b() {
            assertTrue(true);
        }

        @Test(dependsOnGroups = {"five"})
        public void c() {
            assertTrue(true);
        }

        @Test(dependsOnGroups = {"four"})
        public void d() {
            assertTrue(true);
        }

        @Test(dependsOnGroups = {"three"})
        public void e() {
            assertTrue(true);
        }

        @Test(dependsOnGroups = {"two"})
        public void f() {
            assertTrue(true);
        }

        @Test(dependsOnGroups = {"first"})
        public void g() {
            assertTrue(true);
        }
    }

