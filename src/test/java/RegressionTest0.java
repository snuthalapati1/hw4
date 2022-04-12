import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        java.lang.Class<?> wildcardClass1 = aVLTree0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        java.lang.Class<?> wildcardClass3 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        java.lang.Class<?> wildcardClass5 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        java.lang.Class<?> wildcardClass6 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        java.lang.Class<?> wildcardClass5 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        java.lang.Class<?> wildcardClass7 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        AvlTree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        AvlTree.AVLTree.Node node10 = null;
        int int11 = aVLTree0.getBalance(node10);
        aVLTree0.delete((int) (short) 0);
        java.lang.Class<?> wildcardClass14 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = node5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.insert((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        aVLTree0.delete((int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = aVLTree0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int6 = aVLTree0.height();
        java.lang.Class<?> wildcardClass7 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = node3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        AvlTree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        int int9 = aVLTree0.height();
        aVLTree0.delete(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        java.lang.Class<?> wildcardClass11 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node1 = aVLTree0.getRoot();
        int int2 = aVLTree0.height();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass6 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((int) 'a');
        AvlTree.AVLTree.Node node7 = aVLTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        AvlTree.AVLTree.Node node8 = aVLTree0.find((int) (short) 0);
        aVLTree0.delete(100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        AvlTree.AVLTree aVLTree6 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        AvlTree.AVLTree.Node node9 = null;
        int int10 = aVLTree6.getBalance(node9);
        aVLTree6.insert((int) (short) 100);
        AvlTree.AVLTree.Node node14 = aVLTree6.find((int) ' ');
        int int15 = aVLTree6.height();
        AvlTree.AVLTree.Node node16 = aVLTree6.getRoot();
        int int17 = aVLTree0.getBalance(node16);
        java.lang.Class<?> wildcardClass18 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        AvlTree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        AvlTree.AVLTree.Node node11 = aVLTree0.find((int) (short) 10);
        AvlTree.AVLTree.Node node13 = aVLTree0.find((int) (byte) 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        int int3 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 1);
        java.lang.Class<?> wildcardClass6 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) 10);
        AvlTree.AVLTree.Node node8 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass9 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((int) 'a');
        AvlTree.AVLTree.Node node8 = aVLTree0.find((int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = node8.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        AvlTree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        java.lang.Class<?> wildcardClass11 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        AvlTree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        AvlTree.AVLTree aVLTree11 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        AvlTree.AVLTree.Node node14 = aVLTree11.getRoot();
        aVLTree11.delete(100);
        aVLTree11.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node19 = aVLTree11.getRoot();
        int int20 = aVLTree0.getBalance(node19);
        AvlTree.AVLTree.Node node21 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node6 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node7 = aVLTree0.getRoot();
        AvlTree.AVLTree aVLTree8 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node9 = null;
        int int10 = aVLTree8.getBalance(node9);
        AvlTree.AVLTree aVLTree11 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        AvlTree.AVLTree.Node node14 = aVLTree11.getRoot();
        aVLTree11.insert((int) (byte) 100);
        AvlTree.AVLTree aVLTree17 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        AvlTree.AVLTree.Node node20 = null;
        int int21 = aVLTree17.getBalance(node20);
        aVLTree17.insert((int) (short) 100);
        AvlTree.AVLTree.Node node25 = aVLTree17.find((int) ' ');
        int int26 = aVLTree17.height();
        AvlTree.AVLTree.Node node27 = aVLTree17.getRoot();
        int int28 = aVLTree11.getBalance(node27);
        int int29 = aVLTree8.getBalance(node27);
        int int30 = aVLTree0.getBalance(node27);
        java.lang.Class<?> wildcardClass31 = node27.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node8 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass9 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        aVLTree0.delete((int) (short) -1);
        aVLTree0.insert((int) (short) -1);
        java.lang.Class<?> wildcardClass13 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        AvlTree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        AvlTree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        AvlTree.AVLTree aVLTree9 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        AvlTree.AVLTree.Node node12 = null;
        int int13 = aVLTree9.getBalance(node12);
        aVLTree9.insert((int) (short) 100);
        AvlTree.AVLTree.Node node17 = aVLTree9.find((int) ' ');
        int int18 = aVLTree9.height();
        AvlTree.AVLTree.Node node19 = aVLTree9.getRoot();
        int int20 = aVLTree0.getBalance(node19);
        java.lang.Class<?> wildcardClass21 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        AvlTree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        AvlTree.AVLTree.Node node10 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node11 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        AvlTree.AVLTree.Node node8 = aVLTree0.find((int) (short) 0);
        aVLTree0.insert((int) (byte) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.insert((int) (short) 0);
        aVLTree0.insert((int) '4');
        org.junit.Assert.assertNull(node2);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        AvlTree.AVLTree.Node node7 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node9 = aVLTree0.find((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = node9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        AvlTree.AVLTree.Node node7 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        int int7 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        AvlTree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        java.lang.Class<?> wildcardClass9 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        AvlTree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        aVLTree0.delete((int) '#');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node8 = aVLTree0.getRoot();
        AvlTree.AVLTree aVLTree9 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        aVLTree9.delete((int) 'a');
        AvlTree.AVLTree.Node node14 = aVLTree9.getRoot();
        AvlTree.AVLTree.Node node15 = null;
        int int16 = aVLTree9.getBalance(node15);
        AvlTree.AVLTree.Node node18 = aVLTree9.find((int) ' ');
        AvlTree.AVLTree aVLTree19 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        AvlTree.AVLTree.Node node23 = aVLTree19.find((int) 'a');
        aVLTree19.delete((int) (short) 10);
        AvlTree.AVLTree aVLTree26 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node27 = null;
        int int28 = aVLTree26.getBalance(node27);
        aVLTree26.insert((int) (byte) 100);
        aVLTree26.insert((int) 'a');
        AvlTree.AVLTree.Node node34 = aVLTree26.find((int) (byte) 100);
        int int35 = aVLTree19.getBalance(node34);
        int int36 = aVLTree9.getBalance(node34);
        int int37 = aVLTree0.getBalance(node34);
        AvlTree.AVLTree aVLTree38 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node40 = aVLTree38.find((int) '4');
        AvlTree.AVLTree.Node node42 = aVLTree38.find((int) 'a');
        AvlTree.AVLTree.Node node43 = aVLTree38.getRoot();
        AvlTree.AVLTree.Node node44 = aVLTree38.getRoot();
        AvlTree.AVLTree.Node node45 = aVLTree38.getRoot();
        AvlTree.AVLTree aVLTree46 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node47 = null;
        int int48 = aVLTree46.getBalance(node47);
        AvlTree.AVLTree aVLTree49 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node51 = aVLTree49.find((int) '4');
        AvlTree.AVLTree.Node node52 = aVLTree49.getRoot();
        aVLTree49.insert((int) (byte) 100);
        AvlTree.AVLTree aVLTree55 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node57 = aVLTree55.find((int) '4');
        AvlTree.AVLTree.Node node58 = null;
        int int59 = aVLTree55.getBalance(node58);
        aVLTree55.insert((int) (short) 100);
        AvlTree.AVLTree.Node node63 = aVLTree55.find((int) ' ');
        int int64 = aVLTree55.height();
        AvlTree.AVLTree.Node node65 = aVLTree55.getRoot();
        int int66 = aVLTree49.getBalance(node65);
        int int67 = aVLTree46.getBalance(node65);
        int int68 = aVLTree38.getBalance(node65);
        int int69 = aVLTree0.getBalance(node65);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        AvlTree.AVLTree.Node node7 = aVLTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = node7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node6 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass7 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        AvlTree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        int int9 = aVLTree0.height();
        aVLTree0.insert((int) 'a');
        int int12 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        AvlTree.AVLTree.Node node9 = null;
        int int10 = aVLTree0.getBalance(node9);
        java.lang.Class<?> wildcardClass11 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        AvlTree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        aVLTree0.delete((int) ' ');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        AvlTree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        AvlTree.AVLTree aVLTree11 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        AvlTree.AVLTree.Node node14 = aVLTree11.getRoot();
        aVLTree11.delete(100);
        aVLTree11.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node19 = aVLTree11.getRoot();
        int int20 = aVLTree0.getBalance(node19);
        int int21 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        aVLTree0.delete(1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        AvlTree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        AvlTree.AVLTree aVLTree11 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        AvlTree.AVLTree.Node node14 = aVLTree11.getRoot();
        aVLTree11.delete(100);
        aVLTree11.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node19 = aVLTree11.getRoot();
        int int20 = aVLTree0.getBalance(node19);
        java.lang.Class<?> wildcardClass21 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        AvlTree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        AvlTree.AVLTree aVLTree11 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        AvlTree.AVLTree.Node node14 = aVLTree11.getRoot();
        aVLTree11.delete(100);
        aVLTree11.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node19 = aVLTree11.getRoot();
        int int20 = aVLTree0.getBalance(node19);
        AvlTree.AVLTree aVLTree21 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node23 = aVLTree21.find((int) '4');
        aVLTree21.delete((int) 'a');
        AvlTree.AVLTree.Node node26 = aVLTree21.getRoot();
        aVLTree21.delete(0);
        AvlTree.AVLTree.Node node29 = null;
        int int30 = aVLTree21.getBalance(node29);
        int int31 = aVLTree21.height();
        AvlTree.AVLTree aVLTree32 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node34 = aVLTree32.find((int) '4');
        AvlTree.AVLTree.Node node35 = aVLTree32.getRoot();
        aVLTree32.delete(100);
        aVLTree32.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node40 = aVLTree32.getRoot();
        int int41 = aVLTree21.getBalance(node40);
        int int42 = aVLTree0.getBalance(node40);
        java.lang.Class<?> wildcardClass43 = node40.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree aVLTree5 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node7 = aVLTree5.find((int) '4');
        AvlTree.AVLTree.Node node8 = aVLTree5.getRoot();
        aVLTree5.insert((int) (byte) 100);
        AvlTree.AVLTree aVLTree11 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        AvlTree.AVLTree.Node node14 = null;
        int int15 = aVLTree11.getBalance(node14);
        aVLTree11.insert((int) (short) 100);
        AvlTree.AVLTree.Node node19 = aVLTree11.find((int) ' ');
        int int20 = aVLTree11.height();
        AvlTree.AVLTree.Node node21 = aVLTree11.getRoot();
        int int22 = aVLTree5.getBalance(node21);
        int int23 = aVLTree0.getBalance(node21);
        aVLTree0.delete((int) (byte) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) 'a');
        AvlTree.AVLTree.Node node8 = aVLTree0.find(10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) 'a');
        aVLTree0.delete((int) (byte) 10);
        AvlTree.AVLTree.Node node10 = aVLTree0.find((int) (short) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        AvlTree.AVLTree aVLTree3 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node5 = aVLTree3.find((int) '4');
        AvlTree.AVLTree.Node node6 = null;
        int int7 = aVLTree3.getBalance(node6);
        aVLTree3.insert((int) (short) 100);
        AvlTree.AVLTree.Node node11 = aVLTree3.find((int) ' ');
        int int12 = aVLTree3.height();
        AvlTree.AVLTree.Node node13 = aVLTree3.getRoot();
        int int14 = aVLTree0.getBalance(node13);
        aVLTree0.delete((int) (short) 1);
        int int17 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = node3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        AvlTree.AVLTree.Node node9 = aVLTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node8 = aVLTree0.getRoot();
        AvlTree.AVLTree aVLTree9 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        aVLTree9.delete((int) 'a');
        AvlTree.AVLTree.Node node14 = aVLTree9.getRoot();
        AvlTree.AVLTree.Node node15 = null;
        int int16 = aVLTree9.getBalance(node15);
        AvlTree.AVLTree.Node node18 = aVLTree9.find((int) ' ');
        AvlTree.AVLTree aVLTree19 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        AvlTree.AVLTree.Node node23 = aVLTree19.find((int) 'a');
        aVLTree19.delete((int) (short) 10);
        AvlTree.AVLTree aVLTree26 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node27 = null;
        int int28 = aVLTree26.getBalance(node27);
        aVLTree26.insert((int) (byte) 100);
        aVLTree26.insert((int) 'a');
        AvlTree.AVLTree.Node node34 = aVLTree26.find((int) (byte) 100);
        int int35 = aVLTree19.getBalance(node34);
        int int36 = aVLTree9.getBalance(node34);
        int int37 = aVLTree0.getBalance(node34);
        java.lang.Class<?> wildcardClass38 = node34.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        AvlTree.AVLTree aVLTree3 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node5 = aVLTree3.find((int) '4');
        AvlTree.AVLTree.Node node6 = null;
        int int7 = aVLTree3.getBalance(node6);
        aVLTree3.insert((int) (short) 100);
        AvlTree.AVLTree.Node node11 = aVLTree3.find((int) ' ');
        int int12 = aVLTree3.height();
        AvlTree.AVLTree.Node node13 = aVLTree3.getRoot();
        int int14 = aVLTree0.getBalance(node13);
        AvlTree.AVLTree.Node node16 = aVLTree0.find((int) (short) 0);
        java.lang.Class<?> wildcardClass17 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert(100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        AvlTree.AVLTree.Node node8 = aVLTree0.find((int) (short) -1);
        AvlTree.AVLTree.Node node9 = aVLTree0.getRoot();
        AvlTree.AVLTree aVLTree10 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node11 = null;
        int int12 = aVLTree10.getBalance(node11);
        aVLTree10.insert((int) (byte) 100);
        aVLTree10.insert((int) 'a');
        AvlTree.AVLTree.Node node18 = aVLTree10.find((int) (byte) 100);
        AvlTree.AVLTree aVLTree19 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        aVLTree19.delete((int) 'a');
        AvlTree.AVLTree.Node node24 = aVLTree19.getRoot();
        aVLTree19.delete(0);
        AvlTree.AVLTree.Node node27 = null;
        int int28 = aVLTree19.getBalance(node27);
        int int29 = aVLTree19.height();
        AvlTree.AVLTree aVLTree30 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        AvlTree.AVLTree.Node node33 = aVLTree30.getRoot();
        aVLTree30.delete(100);
        aVLTree30.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node38 = aVLTree30.getRoot();
        int int39 = aVLTree19.getBalance(node38);
        int int40 = aVLTree10.getBalance(node38);
        int int41 = aVLTree0.getBalance(node38);
        java.lang.Class<?> wildcardClass42 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 1);
        AvlTree.AVLTree aVLTree8 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node9 = null;
        int int10 = aVLTree8.getBalance(node9);
        AvlTree.AVLTree aVLTree11 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        AvlTree.AVLTree.Node node14 = aVLTree11.getRoot();
        aVLTree11.insert((int) (byte) 100);
        AvlTree.AVLTree aVLTree17 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        AvlTree.AVLTree.Node node20 = null;
        int int21 = aVLTree17.getBalance(node20);
        aVLTree17.insert((int) (short) 100);
        AvlTree.AVLTree.Node node25 = aVLTree17.find((int) ' ');
        int int26 = aVLTree17.height();
        AvlTree.AVLTree.Node node27 = aVLTree17.getRoot();
        int int28 = aVLTree11.getBalance(node27);
        int int29 = aVLTree8.getBalance(node27);
        int int30 = aVLTree0.getBalance(node27);
        java.lang.Class<?> wildcardClass31 = node27.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        AvlTree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        AvlTree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        AvlTree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = node8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        AvlTree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        aVLTree0.insert((-1));
        int int12 = aVLTree0.height();
        java.lang.Class<?> wildcardClass13 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        aVLTree0.insert((int) (byte) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        AvlTree.AVLTree.Node node5 = aVLTree0.find((int) (byte) 100);
        aVLTree0.delete((int) (short) 100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        AvlTree.AVLTree.Node node4 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        AvlTree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        AvlTree.AVLTree.Node node10 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass11 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        AvlTree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        AvlTree.AVLTree aVLTree10 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node12 = aVLTree10.find((int) '4');
        AvlTree.AVLTree.Node node14 = aVLTree10.find((int) 'a');
        aVLTree10.delete((int) (short) 10);
        AvlTree.AVLTree aVLTree17 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node18 = null;
        int int19 = aVLTree17.getBalance(node18);
        aVLTree17.insert((int) (byte) 100);
        aVLTree17.insert((int) 'a');
        AvlTree.AVLTree.Node node25 = aVLTree17.find((int) (byte) 100);
        int int26 = aVLTree10.getBalance(node25);
        int int27 = aVLTree0.getBalance(node25);
        AvlTree.AVLTree.Node node29 = aVLTree0.find((int) (short) 0);
        AvlTree.AVLTree.Node node30 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node30);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        AvlTree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        AvlTree.AVLTree.Node node10 = aVLTree0.find((int) (short) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        AvlTree.AVLTree.Node node8 = aVLTree0.find((int) (short) 0);
        aVLTree0.delete((int) '4');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node8 = aVLTree0.getRoot();
        AvlTree.AVLTree aVLTree9 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        aVLTree9.delete((int) 'a');
        AvlTree.AVLTree.Node node14 = aVLTree9.getRoot();
        AvlTree.AVLTree.Node node15 = null;
        int int16 = aVLTree9.getBalance(node15);
        AvlTree.AVLTree.Node node18 = aVLTree9.find((int) ' ');
        AvlTree.AVLTree aVLTree19 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        AvlTree.AVLTree.Node node23 = aVLTree19.find((int) 'a');
        aVLTree19.delete((int) (short) 10);
        AvlTree.AVLTree aVLTree26 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node27 = null;
        int int28 = aVLTree26.getBalance(node27);
        aVLTree26.insert((int) (byte) 100);
        aVLTree26.insert((int) 'a');
        AvlTree.AVLTree.Node node34 = aVLTree26.find((int) (byte) 100);
        int int35 = aVLTree19.getBalance(node34);
        int int36 = aVLTree9.getBalance(node34);
        int int37 = aVLTree0.getBalance(node34);
        java.lang.Class<?> wildcardClass38 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node5 = aVLTree0.find((int) (short) -1);
        AvlTree.AVLTree aVLTree6 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        aVLTree6.delete((int) 'a');
        AvlTree.AVLTree.Node node11 = aVLTree6.getRoot();
        aVLTree6.delete(0);
        AvlTree.AVLTree.Node node14 = null;
        int int15 = aVLTree6.getBalance(node14);
        int int16 = aVLTree6.height();
        aVLTree6.delete(100);
        AvlTree.AVLTree aVLTree19 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        AvlTree.AVLTree.Node node22 = aVLTree19.getRoot();
        aVLTree19.delete(100);
        aVLTree19.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node27 = aVLTree19.getRoot();
        int int28 = aVLTree6.getBalance(node27);
        int int29 = aVLTree0.getBalance(node27);
        int int30 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        AvlTree.AVLTree.Node node5 = aVLTree0.find((int) (byte) 100);
        AvlTree.AVLTree.Node node6 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node7 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        int int5 = aVLTree0.height();
        aVLTree0.delete(1);
        java.lang.Class<?> wildcardClass8 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        AvlTree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        aVLTree0.insert(0);
        aVLTree0.insert((int) '#');
        aVLTree0.insert((int) (short) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        AvlTree.AVLTree.Node node4 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node6 = aVLTree0.find((-1));
        int int7 = aVLTree0.height();
        int int8 = aVLTree0.height();
        java.lang.Class<?> wildcardClass9 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        AvlTree.AVLTree aVLTree3 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node5 = aVLTree3.find((int) '4');
        AvlTree.AVLTree.Node node6 = aVLTree3.getRoot();
        aVLTree3.insert((int) (byte) 100);
        AvlTree.AVLTree aVLTree9 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        AvlTree.AVLTree.Node node12 = null;
        int int13 = aVLTree9.getBalance(node12);
        aVLTree9.insert((int) (short) 100);
        AvlTree.AVLTree.Node node17 = aVLTree9.find((int) ' ');
        int int18 = aVLTree9.height();
        AvlTree.AVLTree.Node node19 = aVLTree9.getRoot();
        int int20 = aVLTree3.getBalance(node19);
        int int21 = aVLTree0.getBalance(node19);
        AvlTree.AVLTree.Node node23 = aVLTree0.find((int) 'a');
        AvlTree.AVLTree.Node node24 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int6 = aVLTree0.height();
        aVLTree0.insert(1);
        java.lang.Class<?> wildcardClass9 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node6 = aVLTree0.getRoot();
        int int7 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree aVLTree5 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node7 = aVLTree5.find((int) '4');
        AvlTree.AVLTree.Node node8 = aVLTree5.getRoot();
        aVLTree5.insert((int) (byte) 100);
        AvlTree.AVLTree aVLTree11 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        AvlTree.AVLTree.Node node14 = null;
        int int15 = aVLTree11.getBalance(node14);
        aVLTree11.insert((int) (short) 100);
        AvlTree.AVLTree.Node node19 = aVLTree11.find((int) ' ');
        int int20 = aVLTree11.height();
        AvlTree.AVLTree.Node node21 = aVLTree11.getRoot();
        int int22 = aVLTree5.getBalance(node21);
        int int23 = aVLTree0.getBalance(node21);
        aVLTree0.delete((int) (short) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((-1));
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        AvlTree.AVLTree.Node node7 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node9 = aVLTree0.find((int) (byte) 10);
        AvlTree.AVLTree.Node node10 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass11 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        AvlTree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        aVLTree0.delete(100);
        AvlTree.AVLTree aVLTree13 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        AvlTree.AVLTree.Node node16 = aVLTree13.getRoot();
        aVLTree13.delete(100);
        aVLTree13.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node21 = aVLTree13.getRoot();
        int int22 = aVLTree0.getBalance(node21);
        java.lang.Class<?> wildcardClass23 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node1 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 10);
        org.junit.Assert.assertNull(node1);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((-1));
        aVLTree0.delete(100);
        AvlTree.AVLTree.Node node6 = aVLTree0.find((int) '#');
        int int7 = aVLTree0.height();
        AvlTree.AVLTree aVLTree8 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node10 = aVLTree8.find((int) '4');
        AvlTree.AVLTree.Node node11 = aVLTree8.getRoot();
        aVLTree8.delete(100);
        aVLTree8.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node16 = aVLTree8.getRoot();
        int int17 = aVLTree0.getBalance(node16);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.delete((int) (short) 10);
        AvlTree.AVLTree aVLTree7 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node8 = null;
        int int9 = aVLTree7.getBalance(node8);
        aVLTree7.insert((int) (byte) 100);
        aVLTree7.insert((int) 'a');
        AvlTree.AVLTree.Node node15 = aVLTree7.find((int) (byte) 100);
        int int16 = aVLTree0.getBalance(node15);
        AvlTree.AVLTree.Node node17 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node18 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        AvlTree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        AvlTree.AVLTree aVLTree11 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        AvlTree.AVLTree.Node node14 = aVLTree11.getRoot();
        aVLTree11.delete(100);
        aVLTree11.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node19 = aVLTree11.getRoot();
        int int20 = aVLTree0.getBalance(node19);
        AvlTree.AVLTree aVLTree21 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node22 = null;
        int int23 = aVLTree21.getBalance(node22);
        aVLTree21.insert((int) (byte) 100);
        aVLTree21.insert((int) 'a');
        AvlTree.AVLTree.Node node29 = aVLTree21.find((int) (byte) 100);
        AvlTree.AVLTree aVLTree30 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        aVLTree30.delete((int) 'a');
        AvlTree.AVLTree.Node node35 = aVLTree30.getRoot();
        aVLTree30.delete(0);
        AvlTree.AVLTree.Node node38 = null;
        int int39 = aVLTree30.getBalance(node38);
        int int40 = aVLTree30.height();
        AvlTree.AVLTree aVLTree41 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node43 = aVLTree41.find((int) '4');
        AvlTree.AVLTree.Node node44 = aVLTree41.getRoot();
        aVLTree41.delete(100);
        aVLTree41.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node49 = aVLTree41.getRoot();
        int int50 = aVLTree30.getBalance(node49);
        int int51 = aVLTree21.getBalance(node49);
        AvlTree.AVLTree.Node node52 = aVLTree21.getRoot();
        AvlTree.AVLTree.Node node53 = aVLTree21.getRoot();
        AvlTree.AVLTree aVLTree54 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node56 = aVLTree54.find((int) '4');
        aVLTree54.delete((int) 'a');
        AvlTree.AVLTree.Node node59 = aVLTree54.getRoot();
        aVLTree54.delete(0);
        AvlTree.AVLTree.Node node62 = null;
        int int63 = aVLTree54.getBalance(node62);
        AvlTree.AVLTree.Node node64 = null;
        int int65 = aVLTree54.getBalance(node64);
        AvlTree.AVLTree aVLTree66 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node68 = aVLTree66.find((int) '4');
        aVLTree66.delete((int) 'a');
        AvlTree.AVLTree.Node node71 = aVLTree66.getRoot();
        AvlTree.AVLTree.Node node72 = null;
        int int73 = aVLTree66.getBalance(node72);
        AvlTree.AVLTree.Node node75 = aVLTree66.find((int) ' ');
        AvlTree.AVLTree aVLTree76 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node78 = aVLTree76.find((int) '4');
        AvlTree.AVLTree.Node node80 = aVLTree76.find((int) 'a');
        aVLTree76.delete((int) (short) 10);
        AvlTree.AVLTree aVLTree83 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node84 = null;
        int int85 = aVLTree83.getBalance(node84);
        aVLTree83.insert((int) (byte) 100);
        aVLTree83.insert((int) 'a');
        AvlTree.AVLTree.Node node91 = aVLTree83.find((int) (byte) 100);
        int int92 = aVLTree76.getBalance(node91);
        int int93 = aVLTree66.getBalance(node91);
        int int94 = aVLTree54.getBalance(node91);
        int int95 = aVLTree21.getBalance(node91);
        int int96 = aVLTree0.getBalance(node91);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNull(node68);
        org.junit.Assert.assertNull(node71);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNull(node75);
        org.junit.Assert.assertNull(node78);
        org.junit.Assert.assertNull(node80);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNotNull(node91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + (-1) + "'", int96 == (-1));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        int int5 = aVLTree0.height();
        aVLTree0.delete(1);
        aVLTree0.insert((int) 'a');
        aVLTree0.insert((int) '#');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        AvlTree.AVLTree aVLTree6 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        AvlTree.AVLTree.Node node9 = aVLTree6.getRoot();
        aVLTree6.delete(100);
        aVLTree6.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node14 = aVLTree6.getRoot();
        AvlTree.AVLTree aVLTree15 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node17 = aVLTree15.find((int) '4');
        aVLTree15.delete((int) 'a');
        AvlTree.AVLTree.Node node20 = aVLTree15.getRoot();
        AvlTree.AVLTree.Node node21 = null;
        int int22 = aVLTree15.getBalance(node21);
        AvlTree.AVLTree.Node node24 = aVLTree15.find((int) ' ');
        AvlTree.AVLTree aVLTree25 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node27 = aVLTree25.find((int) '4');
        AvlTree.AVLTree.Node node29 = aVLTree25.find((int) 'a');
        aVLTree25.delete((int) (short) 10);
        AvlTree.AVLTree aVLTree32 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node33 = null;
        int int34 = aVLTree32.getBalance(node33);
        aVLTree32.insert((int) (byte) 100);
        aVLTree32.insert((int) 'a');
        AvlTree.AVLTree.Node node40 = aVLTree32.find((int) (byte) 100);
        int int41 = aVLTree25.getBalance(node40);
        int int42 = aVLTree15.getBalance(node40);
        int int43 = aVLTree6.getBalance(node40);
        int int44 = aVLTree0.getBalance(node40);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        AvlTree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        AvlTree.AVLTree aVLTree11 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        AvlTree.AVLTree.Node node14 = aVLTree11.getRoot();
        aVLTree11.delete(100);
        aVLTree11.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node19 = aVLTree11.getRoot();
        int int20 = aVLTree0.getBalance(node19);
        java.lang.Class<?> wildcardClass21 = node19.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        AvlTree.AVLTree.Node node8 = aVLTree0.find((int) (short) -1);
        java.lang.Class<?> wildcardClass9 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        AvlTree.AVLTree aVLTree3 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node5 = aVLTree3.find((int) '4');
        AvlTree.AVLTree.Node node6 = aVLTree3.getRoot();
        aVLTree3.insert((int) (byte) 100);
        AvlTree.AVLTree aVLTree9 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        AvlTree.AVLTree.Node node12 = null;
        int int13 = aVLTree9.getBalance(node12);
        aVLTree9.insert((int) (short) 100);
        AvlTree.AVLTree.Node node17 = aVLTree9.find((int) ' ');
        int int18 = aVLTree9.height();
        AvlTree.AVLTree.Node node19 = aVLTree9.getRoot();
        int int20 = aVLTree3.getBalance(node19);
        int int21 = aVLTree0.getBalance(node19);
        aVLTree0.insert((int) (short) 1);
        AvlTree.AVLTree.Node node25 = aVLTree0.find((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.delete((int) (short) -1);
        AvlTree.AVLTree aVLTree8 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node10 = aVLTree8.find((int) '4');
        aVLTree8.insert((int) (short) 0);
        AvlTree.AVLTree.Node node14 = aVLTree8.find(100);
        AvlTree.AVLTree aVLTree15 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node17 = aVLTree15.find((int) '4');
        aVLTree15.delete((int) 'a');
        AvlTree.AVLTree.Node node20 = aVLTree15.getRoot();
        aVLTree15.delete(0);
        AvlTree.AVLTree.Node node23 = null;
        int int24 = aVLTree15.getBalance(node23);
        int int25 = aVLTree15.height();
        AvlTree.AVLTree aVLTree26 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node28 = aVLTree26.find((int) '4');
        AvlTree.AVLTree.Node node29 = aVLTree26.getRoot();
        aVLTree26.delete(100);
        aVLTree26.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node34 = aVLTree26.getRoot();
        int int35 = aVLTree15.getBalance(node34);
        AvlTree.AVLTree aVLTree36 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node38 = aVLTree36.find((int) '4');
        aVLTree36.delete((int) 'a');
        AvlTree.AVLTree.Node node41 = aVLTree36.getRoot();
        aVLTree36.delete(0);
        AvlTree.AVLTree.Node node44 = null;
        int int45 = aVLTree36.getBalance(node44);
        int int46 = aVLTree36.height();
        AvlTree.AVLTree aVLTree47 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node49 = aVLTree47.find((int) '4');
        AvlTree.AVLTree.Node node50 = aVLTree47.getRoot();
        aVLTree47.delete(100);
        aVLTree47.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node55 = aVLTree47.getRoot();
        int int56 = aVLTree36.getBalance(node55);
        int int57 = aVLTree15.getBalance(node55);
        int int58 = aVLTree8.getBalance(node55);
        int int59 = aVLTree0.getBalance(node55);
        aVLTree0.insert(1);
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert(1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        AvlTree.AVLTree.Node node6 = aVLTree0.find((-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        AvlTree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        AvlTree.AVLTree aVLTree10 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node12 = aVLTree10.find((int) '4');
        AvlTree.AVLTree.Node node14 = aVLTree10.find((int) 'a');
        aVLTree10.delete((int) (short) 10);
        AvlTree.AVLTree aVLTree17 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node18 = null;
        int int19 = aVLTree17.getBalance(node18);
        aVLTree17.insert((int) (byte) 100);
        aVLTree17.insert((int) 'a');
        AvlTree.AVLTree.Node node25 = aVLTree17.find((int) (byte) 100);
        int int26 = aVLTree10.getBalance(node25);
        int int27 = aVLTree0.getBalance(node25);
        AvlTree.AVLTree.Node node29 = aVLTree0.find((int) (short) 0);
        AvlTree.AVLTree.Node node31 = aVLTree0.find((int) (byte) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node31);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        int int9 = aVLTree0.height();
        int int10 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        AvlTree.AVLTree.Node node4 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert(1);
        java.lang.Class<?> wildcardClass9 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        AvlTree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        int int9 = aVLTree0.height();
        AvlTree.AVLTree.Node node10 = aVLTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.insert((int) (short) 1);
        java.lang.Class<?> wildcardClass7 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        AvlTree.AVLTree aVLTree6 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        AvlTree.AVLTree.Node node10 = aVLTree6.find((int) 'a');
        aVLTree6.delete((int) (short) 10);
        AvlTree.AVLTree aVLTree13 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node14 = null;
        int int15 = aVLTree13.getBalance(node14);
        aVLTree13.insert((int) (byte) 100);
        aVLTree13.insert((int) 'a');
        AvlTree.AVLTree.Node node21 = aVLTree13.find((int) (byte) 100);
        int int22 = aVLTree6.getBalance(node21);
        int int23 = aVLTree0.getBalance(node21);
        java.lang.Class<?> wildcardClass24 = node21.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        AvlTree.AVLTree aVLTree6 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        AvlTree.AVLTree.Node node9 = null;
        int int10 = aVLTree6.getBalance(node9);
        aVLTree6.insert((int) (short) 100);
        AvlTree.AVLTree.Node node14 = aVLTree6.find((int) ' ');
        int int15 = aVLTree6.height();
        AvlTree.AVLTree.Node node16 = aVLTree6.getRoot();
        int int17 = aVLTree0.getBalance(node16);
        AvlTree.AVLTree.Node node19 = aVLTree0.find((int) '4');
        aVLTree0.insert((int) (byte) -1);
        java.lang.Class<?> wildcardClass22 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node5 = aVLTree0.find((int) (short) -1);
        AvlTree.AVLTree aVLTree6 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        aVLTree6.delete((int) 'a');
        AvlTree.AVLTree.Node node11 = aVLTree6.getRoot();
        aVLTree6.delete(0);
        AvlTree.AVLTree.Node node14 = null;
        int int15 = aVLTree6.getBalance(node14);
        int int16 = aVLTree6.height();
        aVLTree6.delete(100);
        AvlTree.AVLTree aVLTree19 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        AvlTree.AVLTree.Node node22 = aVLTree19.getRoot();
        aVLTree19.delete(100);
        aVLTree19.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node27 = aVLTree19.getRoot();
        int int28 = aVLTree6.getBalance(node27);
        int int29 = aVLTree0.getBalance(node27);
        aVLTree0.delete((int) ' ');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        AvlTree.AVLTree.Node node8 = aVLTree0.find(100);
        aVLTree0.delete((int) (byte) 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        AvlTree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        int int9 = aVLTree0.height();
        AvlTree.AVLTree.Node node10 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass11 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        AvlTree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        aVLTree0.insert(10);
        AvlTree.AVLTree.Node node14 = aVLTree0.find((int) '4');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        AvlTree.AVLTree aVLTree6 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        aVLTree6.delete((int) 'a');
        AvlTree.AVLTree.Node node11 = aVLTree6.getRoot();
        aVLTree6.delete(0);
        AvlTree.AVLTree.Node node14 = null;
        int int15 = aVLTree6.getBalance(node14);
        int int16 = aVLTree6.height();
        AvlTree.AVLTree aVLTree17 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        AvlTree.AVLTree.Node node20 = aVLTree17.getRoot();
        aVLTree17.delete(100);
        aVLTree17.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node25 = aVLTree17.getRoot();
        int int26 = aVLTree6.getBalance(node25);
        int int27 = aVLTree0.getBalance(node25);
        aVLTree0.insert((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) 10);
        AvlTree.AVLTree.Node node8 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node9 = aVLTree0.getRoot();
        AvlTree.AVLTree aVLTree10 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node11 = null;
        int int12 = aVLTree10.getBalance(node11);
        aVLTree10.insert((int) (byte) 100);
        aVLTree10.insert((int) 'a');
        AvlTree.AVLTree.Node node18 = aVLTree10.find((int) (byte) 100);
        int int19 = aVLTree0.getBalance(node18);
        AvlTree.AVLTree.Node node21 = aVLTree0.find(1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int6 = aVLTree0.height();
        aVLTree0.insert(1);
        aVLTree0.insert((int) (short) 10);
        java.lang.Class<?> wildcardClass11 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        AvlTree.AVLTree.Node node4 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node6 = aVLTree0.find((-1));
        int int7 = aVLTree0.height();
        int int8 = aVLTree0.height();
        int int9 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.delete((int) (short) 10);
        AvlTree.AVLTree.Node node8 = aVLTree0.find((int) 'a');
        java.lang.Class<?> wildcardClass9 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        AvlTree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        AvlTree.AVLTree.Node node10 = null;
        int int11 = aVLTree0.getBalance(node10);
        aVLTree0.delete((int) (short) 0);
        AvlTree.AVLTree.Node node14 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node15 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.delete((int) (short) 10);
        int int7 = aVLTree0.height();
        int int8 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node5 = aVLTree0.find((int) (short) -1);
        aVLTree0.delete((int) ' ');
        int int8 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        AvlTree.AVLTree.Node node9 = aVLTree0.getRoot();
        aVLTree0.delete((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert(0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        AvlTree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        AvlTree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        aVLTree0.delete((int) (short) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        AvlTree.AVLTree aVLTree3 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node5 = aVLTree3.find((int) '4');
        AvlTree.AVLTree.Node node6 = null;
        int int7 = aVLTree3.getBalance(node6);
        aVLTree3.insert((int) (short) 100);
        AvlTree.AVLTree.Node node11 = aVLTree3.find((int) ' ');
        int int12 = aVLTree3.height();
        AvlTree.AVLTree.Node node13 = aVLTree3.getRoot();
        int int14 = aVLTree0.getBalance(node13);
        AvlTree.AVLTree.Node node16 = aVLTree0.find((int) (short) 0);
        AvlTree.AVLTree.Node node17 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((-1));
        AvlTree.AVLTree.Node node4 = aVLTree0.find((int) (short) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        AvlTree.AVLTree aVLTree7 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        aVLTree7.delete((int) 'a');
        AvlTree.AVLTree.Node node12 = aVLTree7.getRoot();
        aVLTree7.delete(0);
        AvlTree.AVLTree.Node node15 = null;
        int int16 = aVLTree7.getBalance(node15);
        int int17 = aVLTree7.height();
        AvlTree.AVLTree aVLTree18 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node20 = aVLTree18.find((int) '4');
        AvlTree.AVLTree.Node node21 = aVLTree18.getRoot();
        aVLTree18.delete(100);
        aVLTree18.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node26 = aVLTree18.getRoot();
        int int27 = aVLTree7.getBalance(node26);
        AvlTree.AVLTree aVLTree28 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node30 = aVLTree28.find((int) '4');
        aVLTree28.delete((int) 'a');
        AvlTree.AVLTree.Node node33 = aVLTree28.getRoot();
        aVLTree28.delete(0);
        AvlTree.AVLTree.Node node36 = null;
        int int37 = aVLTree28.getBalance(node36);
        int int38 = aVLTree28.height();
        AvlTree.AVLTree aVLTree39 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node41 = aVLTree39.find((int) '4');
        AvlTree.AVLTree.Node node42 = aVLTree39.getRoot();
        aVLTree39.delete(100);
        aVLTree39.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node47 = aVLTree39.getRoot();
        int int48 = aVLTree28.getBalance(node47);
        int int49 = aVLTree7.getBalance(node47);
        int int50 = aVLTree0.getBalance(node47);
        aVLTree0.delete((-1));
        int int53 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        AvlTree.AVLTree.Node node8 = aVLTree0.find((int) (short) 0);
        int int9 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) 'a');
        int int7 = aVLTree0.height();
        aVLTree0.delete((int) 'a');
        aVLTree0.delete((int) (byte) 100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        aVLTree0.delete((int) (short) -1);
        AvlTree.AVLTree.Node node11 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node13 = aVLTree0.find((int) (byte) 100);
        int int14 = aVLTree0.height();
        AvlTree.AVLTree.Node node16 = aVLTree0.find(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        AvlTree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        aVLTree0.delete(100);
        AvlTree.AVLTree.Node node13 = null;
        int int14 = aVLTree0.getBalance(node13);
        aVLTree0.delete((int) (short) 10);
        AvlTree.AVLTree.Node node17 = aVLTree0.getRoot();
        int int18 = aVLTree0.height();
        aVLTree0.delete((int) (short) 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        AvlTree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        AvlTree.AVLTree.Node node10 = null;
        int int11 = aVLTree0.getBalance(node10);
        aVLTree0.delete((int) 'a');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node6 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 10);
        int int10 = aVLTree0.height();
        AvlTree.AVLTree.Node node12 = aVLTree0.find((int) (short) 10);
        AvlTree.AVLTree aVLTree13 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        AvlTree.AVLTree.Node node16 = aVLTree13.getRoot();
        aVLTree13.delete(100);
        aVLTree13.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node21 = aVLTree13.getRoot();
        int int22 = aVLTree0.getBalance(node21);
        AvlTree.AVLTree aVLTree23 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node25 = aVLTree23.find((int) '4');
        AvlTree.AVLTree.Node node27 = aVLTree23.find((int) 'a');
        AvlTree.AVLTree.Node node29 = aVLTree23.find((int) ' ');
        AvlTree.AVLTree.Node node31 = aVLTree23.find(0);
        AvlTree.AVLTree aVLTree32 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node34 = aVLTree32.find((int) '4');
        aVLTree32.delete((int) 'a');
        aVLTree32.delete(1);
        aVLTree32.delete((int) '#');
        aVLTree32.delete((int) (short) -1);
        AvlTree.AVLTree.Node node43 = aVLTree32.getRoot();
        AvlTree.AVLTree.Node node45 = aVLTree32.find((int) (byte) 100);
        int int46 = aVLTree32.height();
        AvlTree.AVLTree aVLTree47 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node49 = aVLTree47.find((int) '4');
        AvlTree.AVLTree.Node node50 = aVLTree47.getRoot();
        aVLTree47.insert((int) (byte) 100);
        AvlTree.AVLTree aVLTree53 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node55 = aVLTree53.find((int) '4');
        AvlTree.AVLTree.Node node57 = aVLTree53.find((int) 'a');
        aVLTree53.delete((int) (short) 10);
        AvlTree.AVLTree aVLTree60 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node61 = null;
        int int62 = aVLTree60.getBalance(node61);
        aVLTree60.insert((int) (byte) 100);
        aVLTree60.insert((int) 'a');
        AvlTree.AVLTree.Node node68 = aVLTree60.find((int) (byte) 100);
        int int69 = aVLTree53.getBalance(node68);
        int int70 = aVLTree47.getBalance(node68);
        int int71 = aVLTree32.getBalance(node68);
        int int72 = aVLTree23.getBalance(node68);
        int int73 = aVLTree0.getBalance(node68);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        AvlTree.AVLTree.Node node9 = aVLTree0.getRoot();
        aVLTree0.delete((int) '4');
        aVLTree0.delete((int) (short) 100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        AvlTree.AVLTree.Node node13 = aVLTree0.find((int) (byte) -1);
        AvlTree.AVLTree.Node node15 = aVLTree0.find((int) 'a');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        AvlTree.AVLTree.Node node9 = null;
        int int10 = aVLTree0.getBalance(node9);
        AvlTree.AVLTree.Node node11 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        AvlTree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        int int10 = aVLTree0.height();
        aVLTree0.delete(0);
        AvlTree.AVLTree aVLTree13 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node14 = null;
        int int15 = aVLTree13.getBalance(node14);
        aVLTree13.insert((int) (byte) 100);
        aVLTree13.insert((int) 'a');
        AvlTree.AVLTree.Node node21 = aVLTree13.find((int) (byte) 100);
        int int22 = aVLTree0.getBalance(node21);
        AvlTree.AVLTree.Node node23 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        AvlTree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        AvlTree.AVLTree.Node node10 = null;
        int int11 = aVLTree0.getBalance(node10);
        AvlTree.AVLTree aVLTree12 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node14 = aVLTree12.find((int) '4');
        aVLTree12.delete((int) 'a');
        AvlTree.AVLTree.Node node17 = aVLTree12.getRoot();
        AvlTree.AVLTree.Node node18 = null;
        int int19 = aVLTree12.getBalance(node18);
        AvlTree.AVLTree.Node node21 = aVLTree12.find((int) ' ');
        AvlTree.AVLTree aVLTree22 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node24 = aVLTree22.find((int) '4');
        AvlTree.AVLTree.Node node26 = aVLTree22.find((int) 'a');
        aVLTree22.delete((int) (short) 10);
        AvlTree.AVLTree aVLTree29 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node30 = null;
        int int31 = aVLTree29.getBalance(node30);
        aVLTree29.insert((int) (byte) 100);
        aVLTree29.insert((int) 'a');
        AvlTree.AVLTree.Node node37 = aVLTree29.find((int) (byte) 100);
        int int38 = aVLTree22.getBalance(node37);
        int int39 = aVLTree12.getBalance(node37);
        int int40 = aVLTree0.getBalance(node37);
        int int41 = aVLTree0.height();
        java.lang.Class<?> wildcardClass42 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.insert(100);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        AvlTree.AVLTree.Node node8 = aVLTree0.find(100);
        AvlTree.AVLTree.Node node9 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        AvlTree.AVLTree.Node node10 = aVLTree0.find((int) (byte) 0);
        aVLTree0.delete((int) (byte) 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        AvlTree.AVLTree.Node node4 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.delete(100);
        java.lang.Class<?> wildcardClass9 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        AvlTree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        int int9 = aVLTree0.height();
        aVLTree0.insert((int) 'a');
        AvlTree.AVLTree.Node node13 = aVLTree0.find((-1));
        aVLTree0.insert((int) (short) 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree aVLTree5 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node7 = aVLTree5.find((int) '4');
        AvlTree.AVLTree.Node node8 = aVLTree5.getRoot();
        aVLTree5.insert((int) (byte) 100);
        AvlTree.AVLTree aVLTree11 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        AvlTree.AVLTree.Node node14 = null;
        int int15 = aVLTree11.getBalance(node14);
        aVLTree11.insert((int) (short) 100);
        AvlTree.AVLTree.Node node19 = aVLTree11.find((int) ' ');
        int int20 = aVLTree11.height();
        AvlTree.AVLTree.Node node21 = aVLTree11.getRoot();
        int int22 = aVLTree5.getBalance(node21);
        int int23 = aVLTree0.getBalance(node21);
        AvlTree.AVLTree.Node node25 = aVLTree0.find((int) (byte) -1);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (byte) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        AvlTree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        AvlTree.AVLTree.Node node10 = aVLTree0.getRoot();
        AvlTree.AVLTree aVLTree11 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        AvlTree.AVLTree.Node node14 = aVLTree11.getRoot();
        aVLTree11.insert((int) (byte) 100);
        AvlTree.AVLTree aVLTree17 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        AvlTree.AVLTree.Node node20 = null;
        int int21 = aVLTree17.getBalance(node20);
        aVLTree17.insert((int) (short) 100);
        AvlTree.AVLTree.Node node25 = aVLTree17.find((int) ' ');
        int int26 = aVLTree17.height();
        AvlTree.AVLTree.Node node27 = aVLTree17.getRoot();
        int int28 = aVLTree11.getBalance(node27);
        int int29 = aVLTree0.getBalance(node27);
        AvlTree.AVLTree.Node node30 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node30);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.delete((int) (short) -1);
        AvlTree.AVLTree aVLTree8 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node10 = aVLTree8.find((int) '4');
        aVLTree8.insert((int) (short) 0);
        AvlTree.AVLTree.Node node14 = aVLTree8.find(100);
        AvlTree.AVLTree aVLTree15 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node17 = aVLTree15.find((int) '4');
        aVLTree15.delete((int) 'a');
        AvlTree.AVLTree.Node node20 = aVLTree15.getRoot();
        aVLTree15.delete(0);
        AvlTree.AVLTree.Node node23 = null;
        int int24 = aVLTree15.getBalance(node23);
        int int25 = aVLTree15.height();
        AvlTree.AVLTree aVLTree26 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node28 = aVLTree26.find((int) '4');
        AvlTree.AVLTree.Node node29 = aVLTree26.getRoot();
        aVLTree26.delete(100);
        aVLTree26.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node34 = aVLTree26.getRoot();
        int int35 = aVLTree15.getBalance(node34);
        AvlTree.AVLTree aVLTree36 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node38 = aVLTree36.find((int) '4');
        aVLTree36.delete((int) 'a');
        AvlTree.AVLTree.Node node41 = aVLTree36.getRoot();
        aVLTree36.delete(0);
        AvlTree.AVLTree.Node node44 = null;
        int int45 = aVLTree36.getBalance(node44);
        int int46 = aVLTree36.height();
        AvlTree.AVLTree aVLTree47 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node49 = aVLTree47.find((int) '4');
        AvlTree.AVLTree.Node node50 = aVLTree47.getRoot();
        aVLTree47.delete(100);
        aVLTree47.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node55 = aVLTree47.getRoot();
        int int56 = aVLTree36.getBalance(node55);
        int int57 = aVLTree15.getBalance(node55);
        int int58 = aVLTree8.getBalance(node55);
        int int59 = aVLTree0.getBalance(node55);
        aVLTree0.insert(1);
        int int62 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        AvlTree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        aVLTree0.insert((-1));
        int int12 = aVLTree0.height();
        aVLTree0.insert(1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.insert(10);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        AvlTree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        aVLTree0.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node13 = aVLTree0.find((int) ' ');
        aVLTree0.insert((int) (byte) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node6 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node7 = aVLTree0.getRoot();
        int int8 = aVLTree0.height();
        java.lang.Class<?> wildcardClass9 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        AvlTree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        int int9 = aVLTree0.height();
        aVLTree0.insert((int) 'a');
        AvlTree.AVLTree.Node node13 = aVLTree0.find((-1));
        int int14 = aVLTree0.height();
        int int15 = aVLTree0.height();
        aVLTree0.delete((int) (byte) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node6 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 10);
        int int10 = aVLTree0.height();
        AvlTree.AVLTree.Node node12 = aVLTree0.find((int) (short) 10);
        AvlTree.AVLTree aVLTree13 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        AvlTree.AVLTree.Node node16 = aVLTree13.getRoot();
        aVLTree13.delete(100);
        aVLTree13.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node21 = aVLTree13.getRoot();
        int int22 = aVLTree0.getBalance(node21);
        java.lang.Class<?> wildcardClass23 = node21.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 0);
        AvlTree.AVLTree aVLTree14 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node16 = aVLTree14.find((int) '4');
        aVLTree14.delete((int) 'a');
        AvlTree.AVLTree.Node node19 = aVLTree14.getRoot();
        aVLTree14.delete(0);
        AvlTree.AVLTree.Node node22 = null;
        int int23 = aVLTree14.getBalance(node22);
        AvlTree.AVLTree.Node node24 = null;
        int int25 = aVLTree14.getBalance(node24);
        AvlTree.AVLTree aVLTree26 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node28 = aVLTree26.find((int) '4');
        AvlTree.AVLTree.Node node30 = aVLTree26.find((int) 'a');
        AvlTree.AVLTree.Node node31 = aVLTree26.getRoot();
        aVLTree26.delete((int) (short) 10);
        AvlTree.AVLTree.Node node34 = aVLTree26.getRoot();
        AvlTree.AVLTree.Node node35 = aVLTree26.getRoot();
        AvlTree.AVLTree aVLTree36 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node37 = null;
        int int38 = aVLTree36.getBalance(node37);
        aVLTree36.insert((int) (byte) 100);
        aVLTree36.insert((int) 'a');
        AvlTree.AVLTree.Node node44 = aVLTree36.find((int) (byte) 100);
        int int45 = aVLTree26.getBalance(node44);
        int int46 = aVLTree14.getBalance(node44);
        int int47 = aVLTree0.getBalance(node44);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        int int6 = aVLTree0.height();
        java.lang.Class<?> wildcardClass7 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        AvlTree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        int int9 = aVLTree0.height();
        aVLTree0.insert((int) 'a');
        AvlTree.AVLTree.Node node13 = aVLTree0.find((-1));
        int int14 = aVLTree0.height();
        int int15 = aVLTree0.height();
        int int16 = aVLTree0.height();
        aVLTree0.delete((int) (short) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        AvlTree.AVLTree.Node node7 = aVLTree0.getRoot();
        int int8 = aVLTree0.height();
        AvlTree.AVLTree.Node node9 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        AvlTree.AVLTree.Node node9 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        AvlTree.AVLTree aVLTree12 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node14 = aVLTree12.find((int) '4');
        aVLTree12.delete((int) 'a');
        AvlTree.AVLTree.Node node17 = aVLTree12.getRoot();
        aVLTree12.delete(0);
        AvlTree.AVLTree.Node node20 = null;
        int int21 = aVLTree12.getBalance(node20);
        AvlTree.AVLTree.Node node22 = null;
        int int23 = aVLTree12.getBalance(node22);
        AvlTree.AVLTree aVLTree24 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        AvlTree.AVLTree.Node node28 = aVLTree24.find((int) 'a');
        AvlTree.AVLTree.Node node29 = aVLTree24.getRoot();
        aVLTree24.delete((int) (short) 10);
        AvlTree.AVLTree.Node node32 = aVLTree24.getRoot();
        AvlTree.AVLTree.Node node33 = aVLTree24.getRoot();
        AvlTree.AVLTree aVLTree34 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node35 = null;
        int int36 = aVLTree34.getBalance(node35);
        aVLTree34.insert((int) (byte) 100);
        aVLTree34.insert((int) 'a');
        AvlTree.AVLTree.Node node42 = aVLTree34.find((int) (byte) 100);
        int int43 = aVLTree24.getBalance(node42);
        int int44 = aVLTree12.getBalance(node42);
        int int45 = aVLTree0.getBalance(node42);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.insert((int) (short) 1);
        aVLTree0.insert((int) '#');
        aVLTree0.delete(10);
        java.lang.Class<?> wildcardClass11 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        int int5 = aVLTree0.height();
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        java.lang.Class<?> wildcardClass10 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.insert((int) '#');
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        AvlTree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        aVLTree0.delete((int) (byte) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.insert((int) (short) -1);
        AvlTree.AVLTree.Node node7 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        int int3 = aVLTree0.height();
        int int4 = aVLTree0.height();
        AvlTree.AVLTree aVLTree5 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node6 = null;
        int int7 = aVLTree5.getBalance(node6);
        aVLTree5.insert((int) (byte) 100);
        aVLTree5.insert((int) 'a');
        AvlTree.AVLTree.Node node13 = aVLTree5.find((int) (byte) 100);
        AvlTree.AVLTree aVLTree14 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node16 = aVLTree14.find((int) '4');
        aVLTree14.delete((int) 'a');
        AvlTree.AVLTree.Node node19 = aVLTree14.getRoot();
        aVLTree14.delete(0);
        AvlTree.AVLTree.Node node22 = null;
        int int23 = aVLTree14.getBalance(node22);
        int int24 = aVLTree14.height();
        AvlTree.AVLTree aVLTree25 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node27 = aVLTree25.find((int) '4');
        AvlTree.AVLTree.Node node28 = aVLTree25.getRoot();
        aVLTree25.delete(100);
        aVLTree25.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node33 = aVLTree25.getRoot();
        int int34 = aVLTree14.getBalance(node33);
        int int35 = aVLTree5.getBalance(node33);
        int int36 = aVLTree0.getBalance(node33);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        AvlTree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        AvlTree.AVLTree aVLTree10 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node12 = aVLTree10.find((int) '4');
        AvlTree.AVLTree.Node node14 = aVLTree10.find((int) 'a');
        aVLTree10.delete((int) (short) 10);
        AvlTree.AVLTree aVLTree17 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node18 = null;
        int int19 = aVLTree17.getBalance(node18);
        aVLTree17.insert((int) (byte) 100);
        aVLTree17.insert((int) 'a');
        AvlTree.AVLTree.Node node25 = aVLTree17.find((int) (byte) 100);
        int int26 = aVLTree10.getBalance(node25);
        int int27 = aVLTree0.getBalance(node25);
        AvlTree.AVLTree.Node node28 = aVLTree0.getRoot();
        AvlTree.AVLTree aVLTree29 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node31 = aVLTree29.find((int) '4');
        AvlTree.AVLTree.Node node32 = null;
        int int33 = aVLTree29.getBalance(node32);
        AvlTree.AVLTree.Node node34 = aVLTree29.getRoot();
        AvlTree.AVLTree aVLTree35 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node37 = aVLTree35.find((int) '4');
        aVLTree35.insert((int) (short) 0);
        AvlTree.AVLTree.Node node41 = aVLTree35.find(100);
        AvlTree.AVLTree aVLTree42 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node44 = aVLTree42.find((int) '4');
        aVLTree42.delete((int) 'a');
        AvlTree.AVLTree.Node node47 = aVLTree42.getRoot();
        aVLTree42.delete(0);
        AvlTree.AVLTree.Node node50 = null;
        int int51 = aVLTree42.getBalance(node50);
        int int52 = aVLTree42.height();
        AvlTree.AVLTree aVLTree53 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node55 = aVLTree53.find((int) '4');
        AvlTree.AVLTree.Node node56 = aVLTree53.getRoot();
        aVLTree53.delete(100);
        aVLTree53.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node61 = aVLTree53.getRoot();
        int int62 = aVLTree42.getBalance(node61);
        AvlTree.AVLTree aVLTree63 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node65 = aVLTree63.find((int) '4');
        aVLTree63.delete((int) 'a');
        AvlTree.AVLTree.Node node68 = aVLTree63.getRoot();
        aVLTree63.delete(0);
        AvlTree.AVLTree.Node node71 = null;
        int int72 = aVLTree63.getBalance(node71);
        int int73 = aVLTree63.height();
        AvlTree.AVLTree aVLTree74 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node76 = aVLTree74.find((int) '4');
        AvlTree.AVLTree.Node node77 = aVLTree74.getRoot();
        aVLTree74.delete(100);
        aVLTree74.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node82 = aVLTree74.getRoot();
        int int83 = aVLTree63.getBalance(node82);
        int int84 = aVLTree42.getBalance(node82);
        int int85 = aVLTree35.getBalance(node82);
        int int86 = aVLTree29.getBalance(node82);
        int int87 = aVLTree0.getBalance(node82);
        aVLTree0.delete(10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNull(node65);
        org.junit.Assert.assertNull(node68);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNull(node76);
        org.junit.Assert.assertNull(node77);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node8 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node10 = aVLTree0.find((int) (byte) 0);
        aVLTree0.delete((int) '4');
        AvlTree.AVLTree.Node node13 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        AvlTree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        AvlTree.AVLTree aVLTree11 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        AvlTree.AVLTree.Node node14 = aVLTree11.getRoot();
        aVLTree11.delete(100);
        aVLTree11.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node19 = aVLTree11.getRoot();
        int int20 = aVLTree0.getBalance(node19);
        AvlTree.AVLTree aVLTree21 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node23 = aVLTree21.find((-1));
        int int24 = aVLTree21.height();
        AvlTree.AVLTree.Node node25 = aVLTree21.getRoot();
        AvlTree.AVLTree aVLTree26 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node27 = null;
        int int28 = aVLTree26.getBalance(node27);
        aVLTree26.insert((int) (byte) 100);
        aVLTree26.insert((int) 'a');
        AvlTree.AVLTree.Node node34 = aVLTree26.find((int) (byte) 100);
        AvlTree.AVLTree aVLTree35 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node37 = aVLTree35.find((int) '4');
        aVLTree35.delete((int) 'a');
        AvlTree.AVLTree.Node node40 = aVLTree35.getRoot();
        aVLTree35.delete(0);
        AvlTree.AVLTree.Node node43 = null;
        int int44 = aVLTree35.getBalance(node43);
        int int45 = aVLTree35.height();
        AvlTree.AVLTree aVLTree46 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node48 = aVLTree46.find((int) '4');
        AvlTree.AVLTree.Node node49 = aVLTree46.getRoot();
        aVLTree46.delete(100);
        aVLTree46.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node54 = aVLTree46.getRoot();
        int int55 = aVLTree35.getBalance(node54);
        int int56 = aVLTree26.getBalance(node54);
        AvlTree.AVLTree.Node node57 = aVLTree26.getRoot();
        int int58 = aVLTree21.getBalance(node57);
        int int59 = aVLTree0.getBalance(node57);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.insert((int) (short) -1);
        AvlTree.AVLTree aVLTree7 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        aVLTree7.insert((int) (short) 0);
        AvlTree.AVLTree.Node node13 = aVLTree7.find(100);
        AvlTree.AVLTree aVLTree14 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node16 = aVLTree14.find((int) '4');
        AvlTree.AVLTree.Node node17 = aVLTree14.getRoot();
        aVLTree14.delete(100);
        aVLTree14.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node22 = aVLTree14.getRoot();
        int int23 = aVLTree7.getBalance(node22);
        int int24 = aVLTree0.getBalance(node22);
        aVLTree0.delete((int) (byte) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node6 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 10);
        int int10 = aVLTree0.height();
        AvlTree.AVLTree.Node node12 = aVLTree0.find((int) (short) 10);
        AvlTree.AVLTree aVLTree13 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        AvlTree.AVLTree.Node node16 = aVLTree13.getRoot();
        aVLTree13.delete(100);
        aVLTree13.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node21 = aVLTree13.getRoot();
        int int22 = aVLTree0.getBalance(node21);
        int int23 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        int int9 = aVLTree0.height();
        aVLTree0.delete((-1));
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        AvlTree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        AvlTree.AVLTree.Node node10 = aVLTree0.find((int) (byte) 0);
        int int11 = aVLTree0.height();
        AvlTree.AVLTree.Node node13 = aVLTree0.find((int) (short) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        AvlTree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        AvlTree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        AvlTree.AVLTree aVLTree9 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        AvlTree.AVLTree.Node node12 = null;
        int int13 = aVLTree9.getBalance(node12);
        aVLTree9.insert((int) (short) 100);
        AvlTree.AVLTree.Node node17 = aVLTree9.find((int) ' ');
        int int18 = aVLTree9.height();
        AvlTree.AVLTree.Node node19 = aVLTree9.getRoot();
        int int20 = aVLTree0.getBalance(node19);
        int int21 = aVLTree0.height();
        int int22 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((int) 'a');
        AvlTree.AVLTree aVLTree7 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        AvlTree.AVLTree.Node node10 = null;
        int int11 = aVLTree7.getBalance(node10);
        aVLTree7.insert((int) (short) 100);
        AvlTree.AVLTree.Node node15 = aVLTree7.find((int) ' ');
        int int16 = aVLTree7.height();
        AvlTree.AVLTree.Node node17 = aVLTree7.getRoot();
        int int18 = aVLTree0.getBalance(node17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        AvlTree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        AvlTree.AVLTree.Node node10 = aVLTree0.getRoot();
        AvlTree.AVLTree aVLTree11 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        AvlTree.AVLTree.Node node14 = aVLTree11.getRoot();
        aVLTree11.insert((int) (byte) 100);
        AvlTree.AVLTree aVLTree17 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        AvlTree.AVLTree.Node node20 = null;
        int int21 = aVLTree17.getBalance(node20);
        aVLTree17.insert((int) (short) 100);
        AvlTree.AVLTree.Node node25 = aVLTree17.find((int) ' ');
        int int26 = aVLTree17.height();
        AvlTree.AVLTree.Node node27 = aVLTree17.getRoot();
        int int28 = aVLTree11.getBalance(node27);
        int int29 = aVLTree0.getBalance(node27);
        AvlTree.AVLTree.Node node31 = aVLTree0.find((int) (byte) 100);
        int int32 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.delete((int) (short) 10);
        AvlTree.AVLTree aVLTree7 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node8 = null;
        int int9 = aVLTree7.getBalance(node8);
        aVLTree7.insert((int) (byte) 100);
        aVLTree7.insert((int) 'a');
        AvlTree.AVLTree.Node node15 = aVLTree7.find((int) (byte) 100);
        int int16 = aVLTree0.getBalance(node15);
        AvlTree.AVLTree.Node node17 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node18 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node20 = aVLTree0.find((int) 'a');
        aVLTree0.insert((int) 'a');
        aVLTree0.delete(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) 'a');
        int int7 = aVLTree0.height();
        aVLTree0.delete((int) 'a');
        java.lang.Class<?> wildcardClass10 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        int int3 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 1);
        aVLTree0.insert((int) (byte) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        AvlTree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        aVLTree0.delete(100);
        AvlTree.AVLTree.Node node13 = null;
        int int14 = aVLTree0.getBalance(node13);
        aVLTree0.delete((int) (short) 10);
        AvlTree.AVLTree.Node node17 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node18 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        AvlTree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        AvlTree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        AvlTree.AVLTree aVLTree9 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        AvlTree.AVLTree.Node node12 = null;
        int int13 = aVLTree9.getBalance(node12);
        aVLTree9.insert((int) (short) 100);
        AvlTree.AVLTree.Node node17 = aVLTree9.find((int) ' ');
        int int18 = aVLTree9.height();
        AvlTree.AVLTree.Node node19 = aVLTree9.getRoot();
        int int20 = aVLTree0.getBalance(node19);
        int int21 = aVLTree0.height();
        AvlTree.AVLTree aVLTree22 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node23 = aVLTree22.getRoot();
        AvlTree.AVLTree aVLTree24 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        AvlTree.AVLTree.Node node27 = aVLTree24.getRoot();
        AvlTree.AVLTree.Node node29 = aVLTree24.find((int) (short) -1);
        AvlTree.AVLTree aVLTree30 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        aVLTree30.delete((int) 'a');
        AvlTree.AVLTree.Node node35 = aVLTree30.getRoot();
        aVLTree30.delete(0);
        AvlTree.AVLTree.Node node38 = null;
        int int39 = aVLTree30.getBalance(node38);
        int int40 = aVLTree30.height();
        aVLTree30.delete(100);
        AvlTree.AVLTree aVLTree43 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node45 = aVLTree43.find((int) '4');
        AvlTree.AVLTree.Node node46 = aVLTree43.getRoot();
        aVLTree43.delete(100);
        aVLTree43.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node51 = aVLTree43.getRoot();
        int int52 = aVLTree30.getBalance(node51);
        int int53 = aVLTree24.getBalance(node51);
        int int54 = aVLTree22.getBalance(node51);
        int int55 = aVLTree0.getBalance(node51);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.insert((int) (short) 1);
        aVLTree0.insert((int) '#');
        aVLTree0.delete(10);
        aVLTree0.delete((int) (byte) 10);
        org.junit.Assert.assertNull(node2);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) (byte) -1);
        int int5 = aVLTree0.height();
        int int6 = aVLTree0.height();
        AvlTree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        AvlTree.AVLTree.Node node10 = aVLTree0.find((int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        AvlTree.AVLTree aVLTree7 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        aVLTree7.delete((int) 'a');
        AvlTree.AVLTree.Node node12 = aVLTree7.getRoot();
        aVLTree7.delete(0);
        AvlTree.AVLTree.Node node15 = null;
        int int16 = aVLTree7.getBalance(node15);
        int int17 = aVLTree7.height();
        AvlTree.AVLTree aVLTree18 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node20 = aVLTree18.find((int) '4');
        AvlTree.AVLTree.Node node21 = aVLTree18.getRoot();
        aVLTree18.delete(100);
        aVLTree18.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node26 = aVLTree18.getRoot();
        int int27 = aVLTree7.getBalance(node26);
        AvlTree.AVLTree aVLTree28 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node30 = aVLTree28.find((int) '4');
        aVLTree28.delete((int) 'a');
        AvlTree.AVLTree.Node node33 = aVLTree28.getRoot();
        aVLTree28.delete(0);
        AvlTree.AVLTree.Node node36 = null;
        int int37 = aVLTree28.getBalance(node36);
        int int38 = aVLTree28.height();
        AvlTree.AVLTree aVLTree39 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node41 = aVLTree39.find((int) '4');
        AvlTree.AVLTree.Node node42 = aVLTree39.getRoot();
        aVLTree39.delete(100);
        aVLTree39.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node47 = aVLTree39.getRoot();
        int int48 = aVLTree28.getBalance(node47);
        int int49 = aVLTree7.getBalance(node47);
        int int50 = aVLTree0.getBalance(node47);
        aVLTree0.delete(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) (byte) -1);
        int int5 = aVLTree0.height();
        int int6 = aVLTree0.height();
        AvlTree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        AvlTree.AVLTree.Node node9 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        AvlTree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        aVLTree0.insert((-1));
        AvlTree.AVLTree.Node node12 = aVLTree0.getRoot();
        AvlTree.AVLTree aVLTree13 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        AvlTree.AVLTree.Node node17 = aVLTree13.find((int) 'a');
        int int18 = aVLTree13.height();
        AvlTree.AVLTree aVLTree19 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node20 = null;
        int int21 = aVLTree19.getBalance(node20);
        AvlTree.AVLTree.Node node22 = aVLTree19.getRoot();
        aVLTree19.insert((int) (byte) 100);
        AvlTree.AVLTree aVLTree25 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node27 = aVLTree25.find((int) '4');
        aVLTree25.delete((int) 'a');
        AvlTree.AVLTree.Node node30 = aVLTree25.getRoot();
        aVLTree25.delete(0);
        AvlTree.AVLTree.Node node33 = null;
        int int34 = aVLTree25.getBalance(node33);
        int int35 = aVLTree25.height();
        AvlTree.AVLTree aVLTree36 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node38 = aVLTree36.find((int) '4');
        AvlTree.AVLTree.Node node39 = aVLTree36.getRoot();
        aVLTree36.delete(100);
        aVLTree36.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node44 = aVLTree36.getRoot();
        int int45 = aVLTree25.getBalance(node44);
        int int46 = aVLTree19.getBalance(node44);
        int int47 = aVLTree13.getBalance(node44);
        int int48 = aVLTree0.getBalance(node44);
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int6 = aVLTree0.height();
        aVLTree0.insert((int) (short) 1);
        AvlTree.AVLTree.Node node10 = aVLTree0.find(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node6 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 10);
        aVLTree0.insert((int) '#');
        int int12 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        AvlTree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        AvlTree.AVLTree.Node node8 = aVLTree0.find(0);
        AvlTree.AVLTree aVLTree9 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        aVLTree9.delete((int) 'a');
        aVLTree9.delete(1);
        aVLTree9.delete((int) '#');
        aVLTree9.delete((int) (short) -1);
        AvlTree.AVLTree.Node node20 = aVLTree9.getRoot();
        AvlTree.AVLTree.Node node22 = aVLTree9.find((int) (byte) 100);
        int int23 = aVLTree9.height();
        AvlTree.AVLTree aVLTree24 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        AvlTree.AVLTree.Node node27 = aVLTree24.getRoot();
        aVLTree24.insert((int) (byte) 100);
        AvlTree.AVLTree aVLTree30 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        AvlTree.AVLTree.Node node34 = aVLTree30.find((int) 'a');
        aVLTree30.delete((int) (short) 10);
        AvlTree.AVLTree aVLTree37 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node38 = null;
        int int39 = aVLTree37.getBalance(node38);
        aVLTree37.insert((int) (byte) 100);
        aVLTree37.insert((int) 'a');
        AvlTree.AVLTree.Node node45 = aVLTree37.find((int) (byte) 100);
        int int46 = aVLTree30.getBalance(node45);
        int int47 = aVLTree24.getBalance(node45);
        int int48 = aVLTree9.getBalance(node45);
        int int49 = aVLTree0.getBalance(node45);
        AvlTree.AVLTree.Node node50 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNull(node50);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.delete((int) (short) 10);
        AvlTree.AVLTree aVLTree7 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node8 = null;
        int int9 = aVLTree7.getBalance(node8);
        aVLTree7.insert((int) (byte) 100);
        aVLTree7.insert((int) 'a');
        AvlTree.AVLTree.Node node15 = aVLTree7.find((int) (byte) 100);
        int int16 = aVLTree0.getBalance(node15);
        int int17 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        AvlTree.AVLTree.Node node9 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node11 = aVLTree0.find((int) (short) 0);
        AvlTree.AVLTree.Node node13 = aVLTree0.find((int) (byte) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node8 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node10 = aVLTree0.find((int) (byte) 0);
        aVLTree0.delete((int) (byte) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        AvlTree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        AvlTree.AVLTree aVLTree11 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        AvlTree.AVLTree.Node node14 = aVLTree11.getRoot();
        aVLTree11.delete(100);
        aVLTree11.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node19 = aVLTree11.getRoot();
        int int20 = aVLTree0.getBalance(node19);
        AvlTree.AVLTree aVLTree21 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node23 = aVLTree21.find((int) '4');
        aVLTree21.delete((int) 'a');
        AvlTree.AVLTree.Node node26 = aVLTree21.getRoot();
        aVLTree21.delete(0);
        AvlTree.AVLTree.Node node29 = null;
        int int30 = aVLTree21.getBalance(node29);
        int int31 = aVLTree21.height();
        AvlTree.AVLTree aVLTree32 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node34 = aVLTree32.find((int) '4');
        AvlTree.AVLTree.Node node35 = aVLTree32.getRoot();
        aVLTree32.delete(100);
        aVLTree32.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node40 = aVLTree32.getRoot();
        int int41 = aVLTree21.getBalance(node40);
        int int42 = aVLTree0.getBalance(node40);
        AvlTree.AVLTree.Node node43 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node44 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node46 = aVLTree0.find((int) (short) 1);
        int int47 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        AvlTree.AVLTree aVLTree7 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        aVLTree7.delete((int) 'a');
        AvlTree.AVLTree.Node node12 = aVLTree7.getRoot();
        aVLTree7.delete(0);
        AvlTree.AVLTree.Node node15 = null;
        int int16 = aVLTree7.getBalance(node15);
        int int17 = aVLTree7.height();
        AvlTree.AVLTree aVLTree18 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node20 = aVLTree18.find((int) '4');
        AvlTree.AVLTree.Node node21 = aVLTree18.getRoot();
        aVLTree18.delete(100);
        aVLTree18.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node26 = aVLTree18.getRoot();
        int int27 = aVLTree7.getBalance(node26);
        AvlTree.AVLTree aVLTree28 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node30 = aVLTree28.find((int) '4');
        aVLTree28.delete((int) 'a');
        AvlTree.AVLTree.Node node33 = aVLTree28.getRoot();
        aVLTree28.delete(0);
        AvlTree.AVLTree.Node node36 = null;
        int int37 = aVLTree28.getBalance(node36);
        int int38 = aVLTree28.height();
        AvlTree.AVLTree aVLTree39 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node41 = aVLTree39.find((int) '4');
        AvlTree.AVLTree.Node node42 = aVLTree39.getRoot();
        aVLTree39.delete(100);
        aVLTree39.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node47 = aVLTree39.getRoot();
        int int48 = aVLTree28.getBalance(node47);
        int int49 = aVLTree7.getBalance(node47);
        int int50 = aVLTree0.getBalance(node47);
        AvlTree.AVLTree aVLTree51 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node53 = aVLTree51.find((int) '4');
        aVLTree51.delete((int) 'a');
        AvlTree.AVLTree.Node node56 = aVLTree51.getRoot();
        aVLTree51.delete((int) (byte) 1);
        AvlTree.AVLTree aVLTree59 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node60 = null;
        int int61 = aVLTree59.getBalance(node60);
        AvlTree.AVLTree aVLTree62 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node64 = aVLTree62.find((int) '4');
        AvlTree.AVLTree.Node node65 = aVLTree62.getRoot();
        aVLTree62.insert((int) (byte) 100);
        AvlTree.AVLTree aVLTree68 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node70 = aVLTree68.find((int) '4');
        AvlTree.AVLTree.Node node71 = null;
        int int72 = aVLTree68.getBalance(node71);
        aVLTree68.insert((int) (short) 100);
        AvlTree.AVLTree.Node node76 = aVLTree68.find((int) ' ');
        int int77 = aVLTree68.height();
        AvlTree.AVLTree.Node node78 = aVLTree68.getRoot();
        int int79 = aVLTree62.getBalance(node78);
        int int80 = aVLTree59.getBalance(node78);
        int int81 = aVLTree51.getBalance(node78);
        int int82 = aVLTree0.getBalance(node78);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertNull(node65);
        org.junit.Assert.assertNull(node70);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNull(node76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        AvlTree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        aVLTree0.insert((-1));
        AvlTree.AVLTree.Node node12 = aVLTree0.getRoot();
        int int13 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 10);
        java.lang.Class<?> wildcardClass16 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        AvlTree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        AvlTree.AVLTree.Node node8 = aVLTree0.find(0);
        AvlTree.AVLTree.Node node10 = aVLTree0.find((int) (byte) 0);
        aVLTree0.delete((int) ' ');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        aVLTree0.delete((int) (short) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        AvlTree.AVLTree aVLTree3 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node5 = aVLTree3.find((int) '4');
        AvlTree.AVLTree.Node node6 = null;
        int int7 = aVLTree3.getBalance(node6);
        aVLTree3.insert((int) (short) 100);
        AvlTree.AVLTree.Node node11 = aVLTree3.find((int) ' ');
        int int12 = aVLTree3.height();
        AvlTree.AVLTree.Node node13 = aVLTree3.getRoot();
        int int14 = aVLTree0.getBalance(node13);
        int int15 = aVLTree0.height();
        AvlTree.AVLTree aVLTree16 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node17 = null;
        int int18 = aVLTree16.getBalance(node17);
        AvlTree.AVLTree aVLTree19 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        AvlTree.AVLTree.Node node22 = aVLTree19.getRoot();
        aVLTree19.insert((int) (byte) 100);
        AvlTree.AVLTree aVLTree25 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node27 = aVLTree25.find((int) '4');
        AvlTree.AVLTree.Node node28 = null;
        int int29 = aVLTree25.getBalance(node28);
        aVLTree25.insert((int) (short) 100);
        AvlTree.AVLTree.Node node33 = aVLTree25.find((int) ' ');
        int int34 = aVLTree25.height();
        AvlTree.AVLTree.Node node35 = aVLTree25.getRoot();
        int int36 = aVLTree19.getBalance(node35);
        int int37 = aVLTree16.getBalance(node35);
        AvlTree.AVLTree.Node node39 = aVLTree16.find((int) 'a');
        AvlTree.AVLTree aVLTree40 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node42 = aVLTree40.find((int) '4');
        AvlTree.AVLTree.Node node43 = aVLTree40.getRoot();
        aVLTree40.delete(100);
        int int46 = aVLTree40.height();
        AvlTree.AVLTree.Node node48 = aVLTree40.find((int) (short) -1);
        AvlTree.AVLTree.Node node49 = aVLTree40.getRoot();
        AvlTree.AVLTree aVLTree50 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node51 = null;
        int int52 = aVLTree50.getBalance(node51);
        aVLTree50.insert((int) (byte) 100);
        aVLTree50.insert((int) 'a');
        AvlTree.AVLTree.Node node58 = aVLTree50.find((int) (byte) 100);
        AvlTree.AVLTree aVLTree59 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node61 = aVLTree59.find((int) '4');
        aVLTree59.delete((int) 'a');
        AvlTree.AVLTree.Node node64 = aVLTree59.getRoot();
        aVLTree59.delete(0);
        AvlTree.AVLTree.Node node67 = null;
        int int68 = aVLTree59.getBalance(node67);
        int int69 = aVLTree59.height();
        AvlTree.AVLTree aVLTree70 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node72 = aVLTree70.find((int) '4');
        AvlTree.AVLTree.Node node73 = aVLTree70.getRoot();
        aVLTree70.delete(100);
        aVLTree70.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node78 = aVLTree70.getRoot();
        int int79 = aVLTree59.getBalance(node78);
        int int80 = aVLTree50.getBalance(node78);
        int int81 = aVLTree40.getBalance(node78);
        int int82 = aVLTree16.getBalance(node78);
        int int83 = aVLTree0.getBalance(node78);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNull(node72);
        org.junit.Assert.assertNull(node73);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        AvlTree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        aVLTree0.delete((int) '4');
        aVLTree0.delete((int) (short) 100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        AvlTree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        aVLTree0.delete(100);
        AvlTree.AVLTree.Node node13 = null;
        int int14 = aVLTree0.getBalance(node13);
        aVLTree0.delete(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node6 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node7 = aVLTree0.getRoot();
        int int8 = aVLTree0.height();
        AvlTree.AVLTree.Node node9 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        AvlTree.AVLTree.Node node4 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.delete(100);
        AvlTree.AVLTree aVLTree9 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        aVLTree9.delete((int) 'a');
        AvlTree.AVLTree.Node node14 = aVLTree9.getRoot();
        aVLTree9.delete(0);
        AvlTree.AVLTree.Node node17 = null;
        int int18 = aVLTree9.getBalance(node17);
        AvlTree.AVLTree.Node node19 = null;
        int int20 = aVLTree9.getBalance(node19);
        AvlTree.AVLTree aVLTree21 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node23 = aVLTree21.find((int) '4');
        aVLTree21.delete((int) 'a');
        AvlTree.AVLTree.Node node26 = aVLTree21.getRoot();
        AvlTree.AVLTree.Node node27 = null;
        int int28 = aVLTree21.getBalance(node27);
        AvlTree.AVLTree.Node node30 = aVLTree21.find((int) ' ');
        AvlTree.AVLTree aVLTree31 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node33 = aVLTree31.find((int) '4');
        AvlTree.AVLTree.Node node35 = aVLTree31.find((int) 'a');
        aVLTree31.delete((int) (short) 10);
        AvlTree.AVLTree aVLTree38 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node39 = null;
        int int40 = aVLTree38.getBalance(node39);
        aVLTree38.insert((int) (byte) 100);
        aVLTree38.insert((int) 'a');
        AvlTree.AVLTree.Node node46 = aVLTree38.find((int) (byte) 100);
        int int47 = aVLTree31.getBalance(node46);
        int int48 = aVLTree21.getBalance(node46);
        int int49 = aVLTree9.getBalance(node46);
        int int50 = aVLTree0.getBalance(node46);
        AvlTree.AVLTree.Node node51 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNull(node51);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete((int) ' ');
        org.junit.Assert.assertNull(node2);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        int int4 = aVLTree0.height();
        java.lang.Class<?> wildcardClass5 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        AvlTree.AVLTree.Node node5 = aVLTree0.find((int) (byte) 100);
        aVLTree0.insert(0);
        AvlTree.AVLTree.Node node8 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 0);
        AvlTree.AVLTree.Node node15 = aVLTree0.find(0);
        int int16 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node6 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 10);
        int int10 = aVLTree0.height();
        AvlTree.AVLTree.Node node12 = aVLTree0.find((int) (short) 10);
        AvlTree.AVLTree aVLTree13 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        AvlTree.AVLTree.Node node16 = aVLTree13.getRoot();
        aVLTree13.delete(100);
        aVLTree13.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node21 = aVLTree13.getRoot();
        int int22 = aVLTree0.getBalance(node21);
        AvlTree.AVLTree aVLTree23 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node24 = null;
        int int25 = aVLTree23.getBalance(node24);
        aVLTree23.insert((int) (byte) 100);
        aVLTree23.insert((int) 'a');
        AvlTree.AVLTree.Node node31 = aVLTree23.find((int) (byte) 100);
        AvlTree.AVLTree aVLTree32 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node34 = aVLTree32.find((int) '4');
        aVLTree32.delete((int) 'a');
        AvlTree.AVLTree.Node node37 = aVLTree32.getRoot();
        aVLTree32.delete(0);
        AvlTree.AVLTree.Node node40 = null;
        int int41 = aVLTree32.getBalance(node40);
        int int42 = aVLTree32.height();
        AvlTree.AVLTree aVLTree43 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node45 = aVLTree43.find((int) '4');
        AvlTree.AVLTree.Node node46 = aVLTree43.getRoot();
        aVLTree43.delete(100);
        aVLTree43.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node51 = aVLTree43.getRoot();
        int int52 = aVLTree32.getBalance(node51);
        int int53 = aVLTree23.getBalance(node51);
        AvlTree.AVLTree.Node node54 = aVLTree23.getRoot();
        int int55 = aVLTree0.getBalance(node54);
        java.lang.Class<?> wildcardClass56 = node54.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node8 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node10 = aVLTree0.find((int) (byte) 0);
        AvlTree.AVLTree.Node node12 = aVLTree0.find((int) (short) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        AvlTree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        int int10 = aVLTree0.height();
        aVLTree0.delete(0);
        AvlTree.AVLTree aVLTree13 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node14 = null;
        int int15 = aVLTree13.getBalance(node14);
        aVLTree13.insert((int) (byte) 100);
        aVLTree13.insert((int) 'a');
        AvlTree.AVLTree.Node node21 = aVLTree13.find((int) (byte) 100);
        int int22 = aVLTree0.getBalance(node21);
        java.lang.Class<?> wildcardClass23 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        aVLTree0.delete((int) (byte) -1);
        int int3 = aVLTree0.height();
        aVLTree0.insert(1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        AvlTree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        AvlTree.AVLTree aVLTree10 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node12 = aVLTree10.find((int) '4');
        AvlTree.AVLTree.Node node14 = aVLTree10.find((int) 'a');
        aVLTree10.delete((int) (short) 10);
        AvlTree.AVLTree aVLTree17 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node18 = null;
        int int19 = aVLTree17.getBalance(node18);
        aVLTree17.insert((int) (byte) 100);
        aVLTree17.insert((int) 'a');
        AvlTree.AVLTree.Node node25 = aVLTree17.find((int) (byte) 100);
        int int26 = aVLTree10.getBalance(node25);
        int int27 = aVLTree0.getBalance(node25);
        AvlTree.AVLTree.Node node28 = aVLTree0.getRoot();
        AvlTree.AVLTree aVLTree29 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node31 = aVLTree29.find((int) '4');
        AvlTree.AVLTree.Node node32 = null;
        int int33 = aVLTree29.getBalance(node32);
        AvlTree.AVLTree.Node node34 = aVLTree29.getRoot();
        AvlTree.AVLTree aVLTree35 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node37 = aVLTree35.find((int) '4');
        aVLTree35.insert((int) (short) 0);
        AvlTree.AVLTree.Node node41 = aVLTree35.find(100);
        AvlTree.AVLTree aVLTree42 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node44 = aVLTree42.find((int) '4');
        aVLTree42.delete((int) 'a');
        AvlTree.AVLTree.Node node47 = aVLTree42.getRoot();
        aVLTree42.delete(0);
        AvlTree.AVLTree.Node node50 = null;
        int int51 = aVLTree42.getBalance(node50);
        int int52 = aVLTree42.height();
        AvlTree.AVLTree aVLTree53 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node55 = aVLTree53.find((int) '4');
        AvlTree.AVLTree.Node node56 = aVLTree53.getRoot();
        aVLTree53.delete(100);
        aVLTree53.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node61 = aVLTree53.getRoot();
        int int62 = aVLTree42.getBalance(node61);
        AvlTree.AVLTree aVLTree63 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node65 = aVLTree63.find((int) '4');
        aVLTree63.delete((int) 'a');
        AvlTree.AVLTree.Node node68 = aVLTree63.getRoot();
        aVLTree63.delete(0);
        AvlTree.AVLTree.Node node71 = null;
        int int72 = aVLTree63.getBalance(node71);
        int int73 = aVLTree63.height();
        AvlTree.AVLTree aVLTree74 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node76 = aVLTree74.find((int) '4');
        AvlTree.AVLTree.Node node77 = aVLTree74.getRoot();
        aVLTree74.delete(100);
        aVLTree74.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node82 = aVLTree74.getRoot();
        int int83 = aVLTree63.getBalance(node82);
        int int84 = aVLTree42.getBalance(node82);
        int int85 = aVLTree35.getBalance(node82);
        int int86 = aVLTree29.getBalance(node82);
        int int87 = aVLTree0.getBalance(node82);
        java.lang.Class<?> wildcardClass88 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNull(node65);
        org.junit.Assert.assertNull(node68);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNull(node76);
        org.junit.Assert.assertNull(node77);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((int) 'a');
        AvlTree.AVLTree.Node node8 = aVLTree0.find((int) (byte) 100);
        AvlTree.AVLTree aVLTree9 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        aVLTree9.delete((int) 'a');
        AvlTree.AVLTree.Node node14 = aVLTree9.getRoot();
        aVLTree9.delete(0);
        AvlTree.AVLTree.Node node17 = null;
        int int18 = aVLTree9.getBalance(node17);
        int int19 = aVLTree9.height();
        AvlTree.AVLTree aVLTree20 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node22 = aVLTree20.find((int) '4');
        AvlTree.AVLTree.Node node23 = aVLTree20.getRoot();
        aVLTree20.delete(100);
        aVLTree20.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node28 = aVLTree20.getRoot();
        int int29 = aVLTree9.getBalance(node28);
        int int30 = aVLTree0.getBalance(node28);
        AvlTree.AVLTree.Node node31 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass32 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        AvlTree.AVLTree aVLTree3 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node5 = aVLTree3.find((int) '4');
        AvlTree.AVLTree.Node node6 = aVLTree3.getRoot();
        aVLTree3.insert((int) (byte) 100);
        AvlTree.AVLTree aVLTree9 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        AvlTree.AVLTree.Node node12 = null;
        int int13 = aVLTree9.getBalance(node12);
        aVLTree9.insert((int) (short) 100);
        AvlTree.AVLTree.Node node17 = aVLTree9.find((int) ' ');
        int int18 = aVLTree9.height();
        AvlTree.AVLTree.Node node19 = aVLTree9.getRoot();
        int int20 = aVLTree3.getBalance(node19);
        int int21 = aVLTree0.getBalance(node19);
        aVLTree0.delete((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        AvlTree.AVLTree.Node node10 = aVLTree0.find((int) (short) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        int int3 = aVLTree0.height();
        int int4 = aVLTree0.height();
        java.lang.Class<?> wildcardClass5 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        AvlTree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        int int9 = aVLTree0.height();
        aVLTree0.insert((int) 'a');
        AvlTree.AVLTree aVLTree12 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node13 = null;
        int int14 = aVLTree12.getBalance(node13);
        AvlTree.AVLTree aVLTree15 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node17 = aVLTree15.find((int) '4');
        AvlTree.AVLTree.Node node18 = aVLTree15.getRoot();
        aVLTree15.insert((int) (byte) 100);
        AvlTree.AVLTree aVLTree21 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node23 = aVLTree21.find((int) '4');
        AvlTree.AVLTree.Node node24 = null;
        int int25 = aVLTree21.getBalance(node24);
        aVLTree21.insert((int) (short) 100);
        AvlTree.AVLTree.Node node29 = aVLTree21.find((int) ' ');
        int int30 = aVLTree21.height();
        AvlTree.AVLTree.Node node31 = aVLTree21.getRoot();
        int int32 = aVLTree15.getBalance(node31);
        int int33 = aVLTree12.getBalance(node31);
        AvlTree.AVLTree.Node node35 = aVLTree12.find((int) 'a');
        AvlTree.AVLTree aVLTree36 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node37 = null;
        int int38 = aVLTree36.getBalance(node37);
        aVLTree36.insert((int) (byte) 100);
        aVLTree36.insert((int) 'a');
        AvlTree.AVLTree.Node node44 = aVLTree36.find((int) (byte) 100);
        AvlTree.AVLTree aVLTree45 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node47 = aVLTree45.find((int) '4');
        aVLTree45.delete((int) 'a');
        AvlTree.AVLTree.Node node50 = aVLTree45.getRoot();
        aVLTree45.delete(0);
        AvlTree.AVLTree.Node node53 = null;
        int int54 = aVLTree45.getBalance(node53);
        int int55 = aVLTree45.height();
        AvlTree.AVLTree aVLTree56 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node58 = aVLTree56.find((int) '4');
        AvlTree.AVLTree.Node node59 = aVLTree56.getRoot();
        aVLTree56.delete(100);
        aVLTree56.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node64 = aVLTree56.getRoot();
        int int65 = aVLTree45.getBalance(node64);
        int int66 = aVLTree36.getBalance(node64);
        AvlTree.AVLTree.Node node67 = aVLTree36.getRoot();
        int int68 = aVLTree12.getBalance(node67);
        int int69 = aVLTree0.getBalance(node67);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 0);
        AvlTree.AVLTree aVLTree11 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        aVLTree11.delete((int) 'a');
        AvlTree.AVLTree.Node node16 = aVLTree11.getRoot();
        aVLTree11.delete(0);
        AvlTree.AVLTree.Node node19 = null;
        int int20 = aVLTree11.getBalance(node19);
        int int21 = aVLTree11.height();
        AvlTree.AVLTree aVLTree22 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node24 = aVLTree22.find((int) '4');
        AvlTree.AVLTree.Node node25 = aVLTree22.getRoot();
        aVLTree22.delete(100);
        aVLTree22.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node30 = aVLTree22.getRoot();
        int int31 = aVLTree11.getBalance(node30);
        AvlTree.AVLTree aVLTree32 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node34 = aVLTree32.find((int) '4');
        aVLTree32.delete((int) 'a');
        AvlTree.AVLTree.Node node37 = aVLTree32.getRoot();
        aVLTree32.delete(0);
        AvlTree.AVLTree.Node node40 = null;
        int int41 = aVLTree32.getBalance(node40);
        int int42 = aVLTree32.height();
        AvlTree.AVLTree aVLTree43 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node45 = aVLTree43.find((int) '4');
        AvlTree.AVLTree.Node node46 = aVLTree43.getRoot();
        aVLTree43.delete(100);
        aVLTree43.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node51 = aVLTree43.getRoot();
        int int52 = aVLTree32.getBalance(node51);
        int int53 = aVLTree11.getBalance(node51);
        int int54 = aVLTree0.getBalance(node51);
        aVLTree0.delete((int) (short) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        AvlTree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        int int9 = aVLTree0.height();
        aVLTree0.insert((int) 'a');
        AvlTree.AVLTree.Node node13 = aVLTree0.find((-1));
        int int14 = aVLTree0.height();
        int int15 = aVLTree0.height();
        AvlTree.AVLTree aVLTree16 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node18 = aVLTree16.find((int) '4');
        AvlTree.AVLTree.Node node19 = aVLTree16.getRoot();
        aVLTree16.insert((int) (byte) 100);
        AvlTree.AVLTree aVLTree22 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node24 = aVLTree22.find((int) '4');
        AvlTree.AVLTree.Node node26 = aVLTree22.find((int) 'a');
        aVLTree22.delete((int) (short) 10);
        AvlTree.AVLTree aVLTree29 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node30 = null;
        int int31 = aVLTree29.getBalance(node30);
        aVLTree29.insert((int) (byte) 100);
        aVLTree29.insert((int) 'a');
        AvlTree.AVLTree.Node node37 = aVLTree29.find((int) (byte) 100);
        int int38 = aVLTree22.getBalance(node37);
        int int39 = aVLTree16.getBalance(node37);
        int int40 = aVLTree0.getBalance(node37);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        int int4 = aVLTree0.height();
        AvlTree.AVLTree.Node node6 = aVLTree0.find((int) (short) 100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        int int4 = aVLTree0.height();
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int6 = aVLTree0.height();
        aVLTree0.insert(1);
        aVLTree0.insert(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.delete((int) '4');
        int int7 = aVLTree0.height();
        AvlTree.AVLTree.Node node9 = aVLTree0.find((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.insert((int) (short) 1);
        AvlTree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        AvlTree.AVLTree.Node node10 = aVLTree0.find(1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.delete((int) (short) -1);
        AvlTree.AVLTree aVLTree8 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node10 = aVLTree8.find((int) '4');
        aVLTree8.insert((int) (short) 0);
        AvlTree.AVLTree.Node node14 = aVLTree8.find(100);
        AvlTree.AVLTree aVLTree15 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node17 = aVLTree15.find((int) '4');
        aVLTree15.delete((int) 'a');
        AvlTree.AVLTree.Node node20 = aVLTree15.getRoot();
        aVLTree15.delete(0);
        AvlTree.AVLTree.Node node23 = null;
        int int24 = aVLTree15.getBalance(node23);
        int int25 = aVLTree15.height();
        AvlTree.AVLTree aVLTree26 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node28 = aVLTree26.find((int) '4');
        AvlTree.AVLTree.Node node29 = aVLTree26.getRoot();
        aVLTree26.delete(100);
        aVLTree26.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node34 = aVLTree26.getRoot();
        int int35 = aVLTree15.getBalance(node34);
        AvlTree.AVLTree aVLTree36 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node38 = aVLTree36.find((int) '4');
        aVLTree36.delete((int) 'a');
        AvlTree.AVLTree.Node node41 = aVLTree36.getRoot();
        aVLTree36.delete(0);
        AvlTree.AVLTree.Node node44 = null;
        int int45 = aVLTree36.getBalance(node44);
        int int46 = aVLTree36.height();
        AvlTree.AVLTree aVLTree47 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node49 = aVLTree47.find((int) '4');
        AvlTree.AVLTree.Node node50 = aVLTree47.getRoot();
        aVLTree47.delete(100);
        aVLTree47.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node55 = aVLTree47.getRoot();
        int int56 = aVLTree36.getBalance(node55);
        int int57 = aVLTree15.getBalance(node55);
        int int58 = aVLTree8.getBalance(node55);
        int int59 = aVLTree0.getBalance(node55);
        aVLTree0.insert(1);
        AvlTree.AVLTree.Node node63 = aVLTree0.find((int) (byte) 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNull(node63);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        AvlTree.AVLTree.Node node13 = aVLTree0.find((int) (byte) -1);
        aVLTree0.insert((-1));
        aVLTree0.delete(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree aVLTree5 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node7 = aVLTree5.find((int) '4');
        AvlTree.AVLTree.Node node8 = aVLTree5.getRoot();
        aVLTree5.insert((int) (byte) 100);
        AvlTree.AVLTree aVLTree11 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        AvlTree.AVLTree.Node node14 = null;
        int int15 = aVLTree11.getBalance(node14);
        aVLTree11.insert((int) (short) 100);
        AvlTree.AVLTree.Node node19 = aVLTree11.find((int) ' ');
        int int20 = aVLTree11.height();
        AvlTree.AVLTree.Node node21 = aVLTree11.getRoot();
        int int22 = aVLTree5.getBalance(node21);
        int int23 = aVLTree0.getBalance(node21);
        AvlTree.AVLTree aVLTree24 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        aVLTree24.delete((int) 'a');
        aVLTree24.delete(1);
        aVLTree24.delete((int) '#');
        aVLTree24.delete((int) (short) -1);
        aVLTree24.insert((int) (short) -1);
        aVLTree24.delete((int) (byte) 100);
        AvlTree.AVLTree.Node node39 = aVLTree24.getRoot();
        int int40 = aVLTree0.getBalance(node39);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        AvlTree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        AvlTree.AVLTree.Node node10 = aVLTree0.getRoot();
        AvlTree.AVLTree aVLTree11 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        AvlTree.AVLTree.Node node14 = aVLTree11.getRoot();
        aVLTree11.insert((int) (byte) 100);
        AvlTree.AVLTree aVLTree17 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        AvlTree.AVLTree.Node node20 = null;
        int int21 = aVLTree17.getBalance(node20);
        aVLTree17.insert((int) (short) 100);
        AvlTree.AVLTree.Node node25 = aVLTree17.find((int) ' ');
        int int26 = aVLTree17.height();
        AvlTree.AVLTree.Node node27 = aVLTree17.getRoot();
        int int28 = aVLTree11.getBalance(node27);
        int int29 = aVLTree0.getBalance(node27);
        aVLTree0.delete(100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int6 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 10);
        aVLTree0.delete((int) (byte) 1);
        AvlTree.AVLTree.Node node11 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.insert((int) (short) 1);
        AvlTree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        aVLTree0.insert((int) (short) 10);
        aVLTree0.delete((-1));
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.insert((int) (short) 1);
        AvlTree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        aVLTree0.insert((int) (short) 10);
        aVLTree0.insert((int) (short) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        int int3 = aVLTree0.height();
        int int4 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.insert((int) (short) 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        AvlTree.AVLTree aVLTree3 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node5 = aVLTree3.find((int) '4');
        AvlTree.AVLTree.Node node6 = aVLTree3.getRoot();
        aVLTree3.insert((int) (byte) 100);
        AvlTree.AVLTree aVLTree9 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        AvlTree.AVLTree.Node node12 = null;
        int int13 = aVLTree9.getBalance(node12);
        aVLTree9.insert((int) (short) 100);
        AvlTree.AVLTree.Node node17 = aVLTree9.find((int) ' ');
        int int18 = aVLTree9.height();
        AvlTree.AVLTree.Node node19 = aVLTree9.getRoot();
        int int20 = aVLTree3.getBalance(node19);
        int int21 = aVLTree0.getBalance(node19);
        AvlTree.AVLTree.Node node23 = aVLTree0.find((int) 'a');
        AvlTree.AVLTree aVLTree24 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node25 = null;
        int int26 = aVLTree24.getBalance(node25);
        aVLTree24.insert((int) (byte) 100);
        aVLTree24.insert((int) 'a');
        AvlTree.AVLTree.Node node32 = aVLTree24.find((int) (byte) 100);
        AvlTree.AVLTree aVLTree33 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node35 = aVLTree33.find((int) '4');
        aVLTree33.delete((int) 'a');
        AvlTree.AVLTree.Node node38 = aVLTree33.getRoot();
        aVLTree33.delete(0);
        AvlTree.AVLTree.Node node41 = null;
        int int42 = aVLTree33.getBalance(node41);
        int int43 = aVLTree33.height();
        AvlTree.AVLTree aVLTree44 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node46 = aVLTree44.find((int) '4');
        AvlTree.AVLTree.Node node47 = aVLTree44.getRoot();
        aVLTree44.delete(100);
        aVLTree44.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node52 = aVLTree44.getRoot();
        int int53 = aVLTree33.getBalance(node52);
        int int54 = aVLTree24.getBalance(node52);
        AvlTree.AVLTree.Node node55 = aVLTree24.getRoot();
        int int56 = aVLTree0.getBalance(node55);
        AvlTree.AVLTree aVLTree57 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node59 = aVLTree57.find((int) '4');
        aVLTree57.delete((int) 'a');
        AvlTree.AVLTree.Node node62 = aVLTree57.getRoot();
        aVLTree57.delete(0);
        AvlTree.AVLTree.Node node65 = null;
        int int66 = aVLTree57.getBalance(node65);
        int int67 = aVLTree57.height();
        AvlTree.AVLTree aVLTree68 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node70 = aVLTree68.find((int) '4');
        AvlTree.AVLTree.Node node71 = aVLTree68.getRoot();
        aVLTree68.delete(100);
        aVLTree68.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node76 = aVLTree68.getRoot();
        int int77 = aVLTree57.getBalance(node76);
        int int78 = aVLTree0.getBalance(node76);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNull(node70);
        org.junit.Assert.assertNull(node71);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        AvlTree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        AvlTree.AVLTree.Node node10 = null;
        int int11 = aVLTree0.getBalance(node10);
        aVLTree0.delete((int) (short) 0);
        AvlTree.AVLTree.Node node15 = aVLTree0.find(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        AvlTree.AVLTree.Node node8 = aVLTree0.find((int) (short) -1);
        AvlTree.AVLTree.Node node9 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node10 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        AvlTree.AVLTree aVLTree6 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        AvlTree.AVLTree.Node node10 = aVLTree6.find((int) 'a');
        aVLTree6.delete((int) (short) 10);
        AvlTree.AVLTree aVLTree13 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node14 = null;
        int int15 = aVLTree13.getBalance(node14);
        aVLTree13.insert((int) (byte) 100);
        aVLTree13.insert((int) 'a');
        AvlTree.AVLTree.Node node21 = aVLTree13.find((int) (byte) 100);
        int int22 = aVLTree6.getBalance(node21);
        int int23 = aVLTree0.getBalance(node21);
        int int24 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node6 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 10);
        int int10 = aVLTree0.height();
        aVLTree0.delete((int) (short) 100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        AvlTree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        int int9 = aVLTree0.height();
        aVLTree0.insert((int) 'a');
        aVLTree0.insert((int) (byte) 10);
        aVLTree0.delete((int) (byte) 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.delete((int) (short) 10);
        int int7 = aVLTree0.height();
        aVLTree0.delete((int) '#');
        aVLTree0.delete((int) (short) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        aVLTree0.delete((int) (short) -1);
        AvlTree.AVLTree.Node node11 = aVLTree0.getRoot();
        aVLTree0.insert(10);
        aVLTree0.delete(1);
        AvlTree.AVLTree.Node node16 = aVLTree0.getRoot();
        int int17 = aVLTree0.height();
        AvlTree.AVLTree aVLTree18 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node20 = aVLTree18.find((int) '4');
        AvlTree.AVLTree.Node node21 = null;
        int int22 = aVLTree18.getBalance(node21);
        aVLTree18.insert((int) (short) 100);
        AvlTree.AVLTree.Node node26 = aVLTree18.find((int) ' ');
        int int27 = aVLTree18.height();
        AvlTree.AVLTree.Node node28 = aVLTree18.getRoot();
        int int29 = aVLTree0.getBalance(node28);
        aVLTree0.delete((int) (short) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.delete(0);
        AvlTree.AVLTree.Node node8 = aVLTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = node8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node6 = aVLTree0.find((int) (short) 0);
        AvlTree.AVLTree.Node node8 = aVLTree0.find((int) (short) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        AvlTree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        int int9 = aVLTree0.height();
        AvlTree.AVLTree.Node node11 = aVLTree0.find((int) (short) 100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        AvlTree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        aVLTree0.insert(10);
        aVLTree0.delete((int) (short) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        aVLTree0.insert((int) (byte) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) (byte) -1);
        java.lang.Class<?> wildcardClass5 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node6 = aVLTree0.getRoot();
        aVLTree0.insert(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node6 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((-1));
        aVLTree0.delete(100);
        AvlTree.AVLTree.Node node6 = aVLTree0.find((int) '#');
        int int7 = aVLTree0.height();
        AvlTree.AVLTree.Node node9 = aVLTree0.find((-1));
        AvlTree.AVLTree.Node node10 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        AvlTree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        AvlTree.AVLTree.Node node10 = aVLTree0.find((int) (byte) 0);
        java.lang.Class<?> wildcardClass11 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        AvlTree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        AvlTree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        AvlTree.AVLTree aVLTree9 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        AvlTree.AVLTree.Node node12 = null;
        int int13 = aVLTree9.getBalance(node12);
        aVLTree9.insert((int) (short) 100);
        AvlTree.AVLTree.Node node17 = aVLTree9.find((int) ' ');
        int int18 = aVLTree9.height();
        AvlTree.AVLTree.Node node19 = aVLTree9.getRoot();
        int int20 = aVLTree0.getBalance(node19);
        int int21 = aVLTree0.height();
        AvlTree.AVLTree.Node node23 = aVLTree0.find(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        AvlTree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        int int10 = aVLTree0.height();
        AvlTree.AVLTree.Node node12 = aVLTree0.find((int) (short) 1);
        int int13 = aVLTree0.height();
        AvlTree.AVLTree.Node node14 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.delete((int) '4');
        java.lang.Class<?> wildcardClass7 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.delete((int) ' ');
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        AvlTree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        aVLTree0.delete(100);
        AvlTree.AVLTree.Node node13 = aVLTree0.getRoot();
        aVLTree0.insert((int) '4');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((int) 'a');
        AvlTree.AVLTree.Node node8 = aVLTree0.find((int) (byte) 100);
        AvlTree.AVLTree aVLTree9 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        aVLTree9.delete((int) 'a');
        AvlTree.AVLTree.Node node14 = aVLTree9.getRoot();
        aVLTree9.delete(0);
        AvlTree.AVLTree.Node node17 = null;
        int int18 = aVLTree9.getBalance(node17);
        int int19 = aVLTree9.height();
        AvlTree.AVLTree aVLTree20 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node22 = aVLTree20.find((int) '4');
        AvlTree.AVLTree.Node node23 = aVLTree20.getRoot();
        aVLTree20.delete(100);
        aVLTree20.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node28 = aVLTree20.getRoot();
        int int29 = aVLTree9.getBalance(node28);
        int int30 = aVLTree0.getBalance(node28);
        int int31 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.insert((int) (short) -1);
        int int7 = aVLTree0.height();
        AvlTree.AVLTree.Node node8 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node6 = aVLTree0.find((int) (short) 0);
        aVLTree0.insert((int) (short) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        AvlTree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        aVLTree0.delete((int) '4');
        AvlTree.AVLTree.Node node10 = aVLTree0.find((-1));
        AvlTree.AVLTree.Node node12 = aVLTree0.find((int) (byte) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete((int) (byte) 0);
        int int5 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        AvlTree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        int int9 = aVLTree0.height();
        aVLTree0.delete((int) (short) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node5 = aVLTree0.find((int) (short) -1);
        AvlTree.AVLTree aVLTree6 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        aVLTree6.delete((int) 'a');
        AvlTree.AVLTree.Node node11 = aVLTree6.getRoot();
        aVLTree6.delete(0);
        AvlTree.AVLTree.Node node14 = null;
        int int15 = aVLTree6.getBalance(node14);
        int int16 = aVLTree6.height();
        aVLTree6.delete(100);
        AvlTree.AVLTree aVLTree19 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        AvlTree.AVLTree.Node node22 = aVLTree19.getRoot();
        aVLTree19.delete(100);
        aVLTree19.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node27 = aVLTree19.getRoot();
        int int28 = aVLTree6.getBalance(node27);
        int int29 = aVLTree0.getBalance(node27);
        AvlTree.AVLTree.Node node30 = aVLTree0.getRoot();
        AvlTree.AVLTree aVLTree31 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node33 = aVLTree31.find((-1));
        int int34 = aVLTree31.height();
        AvlTree.AVLTree.Node node35 = aVLTree31.getRoot();
        aVLTree31.insert((int) (byte) 100);
        aVLTree31.delete(100);
        AvlTree.AVLTree aVLTree40 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node42 = aVLTree40.find((int) '4');
        aVLTree40.delete((int) 'a');
        AvlTree.AVLTree.Node node45 = aVLTree40.getRoot();
        aVLTree40.delete(0);
        AvlTree.AVLTree.Node node48 = null;
        int int49 = aVLTree40.getBalance(node48);
        AvlTree.AVLTree.Node node50 = null;
        int int51 = aVLTree40.getBalance(node50);
        AvlTree.AVLTree aVLTree52 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node54 = aVLTree52.find((int) '4');
        aVLTree52.delete((int) 'a');
        AvlTree.AVLTree.Node node57 = aVLTree52.getRoot();
        AvlTree.AVLTree.Node node58 = null;
        int int59 = aVLTree52.getBalance(node58);
        AvlTree.AVLTree.Node node61 = aVLTree52.find((int) ' ');
        AvlTree.AVLTree aVLTree62 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node64 = aVLTree62.find((int) '4');
        AvlTree.AVLTree.Node node66 = aVLTree62.find((int) 'a');
        aVLTree62.delete((int) (short) 10);
        AvlTree.AVLTree aVLTree69 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node70 = null;
        int int71 = aVLTree69.getBalance(node70);
        aVLTree69.insert((int) (byte) 100);
        aVLTree69.insert((int) 'a');
        AvlTree.AVLTree.Node node77 = aVLTree69.find((int) (byte) 100);
        int int78 = aVLTree62.getBalance(node77);
        int int79 = aVLTree52.getBalance(node77);
        int int80 = aVLTree40.getBalance(node77);
        int int81 = aVLTree31.getBalance(node77);
        int int82 = aVLTree0.getBalance(node77);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        AvlTree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        aVLTree0.insert(10);
        aVLTree0.delete((int) ' ');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        AvlTree.AVLTree.Node node8 = aVLTree0.find((int) (short) -1);
        aVLTree0.insert(0);
        aVLTree0.delete((int) 'a');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        AvlTree.AVLTree aVLTree6 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        AvlTree.AVLTree.Node node10 = aVLTree6.find((int) 'a');
        aVLTree6.delete((int) (short) 10);
        AvlTree.AVLTree aVLTree13 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node14 = null;
        int int15 = aVLTree13.getBalance(node14);
        aVLTree13.insert((int) (byte) 100);
        aVLTree13.insert((int) 'a');
        AvlTree.AVLTree.Node node21 = aVLTree13.find((int) (byte) 100);
        int int22 = aVLTree6.getBalance(node21);
        int int23 = aVLTree0.getBalance(node21);
        java.lang.Class<?> wildcardClass24 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        AvlTree.AVLTree.Node node8 = aVLTree0.find(100);
        aVLTree0.delete((int) (short) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        int int3 = aVLTree0.height();
        aVLTree0.insert((-1));
        AvlTree.AVLTree.Node node6 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) 10);
        AvlTree.AVLTree.Node node8 = aVLTree0.getRoot();
        int int9 = aVLTree0.height();
        AvlTree.AVLTree aVLTree10 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node12 = aVLTree10.find((int) '4');
        aVLTree10.insert((int) (short) 0);
        AvlTree.AVLTree.Node node16 = aVLTree10.find(100);
        AvlTree.AVLTree aVLTree17 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        AvlTree.AVLTree.Node node20 = aVLTree17.getRoot();
        aVLTree17.delete(100);
        aVLTree17.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node25 = aVLTree17.getRoot();
        int int26 = aVLTree10.getBalance(node25);
        int int27 = aVLTree0.getBalance(node25);
        aVLTree0.delete((int) (byte) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        AvlTree.AVLTree.Node node13 = aVLTree0.find((int) (byte) -1);
        AvlTree.AVLTree.Node node15 = aVLTree0.find((int) (byte) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int6 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 10);
        aVLTree0.delete((int) (byte) 1);
        aVLTree0.delete((int) ' ');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.insert((int) '4');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node5 = aVLTree0.find((int) (byte) 1);
        int int6 = aVLTree0.height();
        AvlTree.AVLTree aVLTree7 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        aVLTree7.delete((int) 'a');
        AvlTree.AVLTree.Node node12 = aVLTree7.getRoot();
        AvlTree.AVLTree.Node node13 = null;
        int int14 = aVLTree7.getBalance(node13);
        AvlTree.AVLTree.Node node16 = aVLTree7.find((int) ' ');
        aVLTree7.insert((-1));
        AvlTree.AVLTree.Node node19 = aVLTree7.getRoot();
        int int20 = aVLTree0.getBalance(node19);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        AvlTree.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 0);
        AvlTree.AVLTree.Node node10 = aVLTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        AvlTree.AVLTree aVLTree7 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node8 = null;
        int int9 = aVLTree7.getBalance(node8);
        aVLTree7.insert((int) (byte) 100);
        aVLTree7.insert((int) 'a');
        AvlTree.AVLTree.Node node14 = aVLTree7.getRoot();
        int int15 = aVLTree0.getBalance(node14);
        AvlTree.AVLTree.Node node17 = aVLTree0.find((int) (short) 100);
        aVLTree0.delete((int) (short) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 1);
        AvlTree.AVLTree aVLTree8 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node10 = aVLTree8.find((-1));
        int int11 = aVLTree8.height();
        AvlTree.AVLTree.Node node12 = aVLTree8.getRoot();
        aVLTree8.insert((int) (byte) 100);
        aVLTree8.delete(100);
        AvlTree.AVLTree aVLTree17 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        aVLTree17.delete((int) 'a');
        AvlTree.AVLTree.Node node22 = aVLTree17.getRoot();
        aVLTree17.delete(0);
        AvlTree.AVLTree.Node node25 = null;
        int int26 = aVLTree17.getBalance(node25);
        AvlTree.AVLTree.Node node27 = null;
        int int28 = aVLTree17.getBalance(node27);
        AvlTree.AVLTree aVLTree29 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node31 = aVLTree29.find((int) '4');
        aVLTree29.delete((int) 'a');
        AvlTree.AVLTree.Node node34 = aVLTree29.getRoot();
        AvlTree.AVLTree.Node node35 = null;
        int int36 = aVLTree29.getBalance(node35);
        AvlTree.AVLTree.Node node38 = aVLTree29.find((int) ' ');
        AvlTree.AVLTree aVLTree39 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node41 = aVLTree39.find((int) '4');
        AvlTree.AVLTree.Node node43 = aVLTree39.find((int) 'a');
        aVLTree39.delete((int) (short) 10);
        AvlTree.AVLTree aVLTree46 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node47 = null;
        int int48 = aVLTree46.getBalance(node47);
        aVLTree46.insert((int) (byte) 100);
        aVLTree46.insert((int) 'a');
        AvlTree.AVLTree.Node node54 = aVLTree46.find((int) (byte) 100);
        int int55 = aVLTree39.getBalance(node54);
        int int56 = aVLTree29.getBalance(node54);
        int int57 = aVLTree17.getBalance(node54);
        int int58 = aVLTree8.getBalance(node54);
        int int59 = aVLTree0.getBalance(node54);
        aVLTree0.delete((int) '#');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        AvlTree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        AvlTree.AVLTree aVLTree11 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        AvlTree.AVLTree.Node node14 = aVLTree11.getRoot();
        aVLTree11.delete(100);
        aVLTree11.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node19 = aVLTree11.getRoot();
        int int20 = aVLTree0.getBalance(node19);
        AvlTree.AVLTree aVLTree21 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node23 = aVLTree21.find((int) '4');
        aVLTree21.delete((int) 'a');
        AvlTree.AVLTree.Node node26 = aVLTree21.getRoot();
        aVLTree21.delete(0);
        AvlTree.AVLTree.Node node29 = null;
        int int30 = aVLTree21.getBalance(node29);
        int int31 = aVLTree21.height();
        AvlTree.AVLTree aVLTree32 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node34 = aVLTree32.find((int) '4');
        AvlTree.AVLTree.Node node35 = aVLTree32.getRoot();
        aVLTree32.delete(100);
        aVLTree32.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node40 = aVLTree32.getRoot();
        int int41 = aVLTree21.getBalance(node40);
        int int42 = aVLTree0.getBalance(node40);
        AvlTree.AVLTree.Node node43 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node44 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node46 = aVLTree0.find((int) (short) 1);
        AvlTree.AVLTree.Node node47 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNull(node47);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((-1));
        aVLTree0.delete(100);
        AvlTree.AVLTree.Node node6 = aVLTree0.find((int) '#');
        int int7 = aVLTree0.height();
        AvlTree.AVLTree.Node node9 = aVLTree0.find(10);
        aVLTree0.insert(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        AvlTree.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 0);
        AvlTree.AVLTree.Node node10 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node4 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) 100);
        AvlTree.AVLTree.Node node8 = aVLTree0.find((int) (short) 100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        AvlTree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        AvlTree.AVLTree.Node node10 = aVLTree0.getRoot();
        AvlTree.AVLTree aVLTree11 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        AvlTree.AVLTree.Node node14 = aVLTree11.getRoot();
        aVLTree11.insert((int) (byte) 100);
        AvlTree.AVLTree aVLTree17 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        AvlTree.AVLTree.Node node20 = null;
        int int21 = aVLTree17.getBalance(node20);
        aVLTree17.insert((int) (short) 100);
        AvlTree.AVLTree.Node node25 = aVLTree17.find((int) ' ');
        int int26 = aVLTree17.height();
        AvlTree.AVLTree.Node node27 = aVLTree17.getRoot();
        int int28 = aVLTree11.getBalance(node27);
        int int29 = aVLTree0.getBalance(node27);
        java.lang.Class<?> wildcardClass30 = node27.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        AvlTree.AVLTree aVLTree8 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node10 = aVLTree8.find((int) '4');
        AvlTree.AVLTree.Node node11 = aVLTree8.getRoot();
        aVLTree8.delete(100);
        aVLTree8.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node16 = aVLTree8.getRoot();
        int int17 = aVLTree0.getBalance(node16);
        AvlTree.AVLTree.Node node18 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) (byte) -1);
        int int5 = aVLTree0.height();
        int int6 = aVLTree0.height();
        AvlTree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        java.lang.Class<?> wildcardClass9 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        AvlTree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        int int7 = aVLTree0.height();
        int int8 = aVLTree0.height();
        AvlTree.AVLTree.Node node9 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        AvlTree.AVLTree.Node node7 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node8 = aVLTree0.getRoot();
        int int9 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.insert((int) (byte) -1);
        aVLTree0.delete(10);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        int int5 = aVLTree0.height();
        aVLTree0.delete(1);
        aVLTree0.insert((int) 'a');
        AvlTree.AVLTree aVLTree10 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node12 = aVLTree10.find((int) '4');
        AvlTree.AVLTree.Node node13 = aVLTree10.getRoot();
        aVLTree10.delete(100);
        int int16 = aVLTree10.height();
        AvlTree.AVLTree.Node node18 = aVLTree10.find((int) (short) -1);
        AvlTree.AVLTree.Node node19 = aVLTree10.getRoot();
        AvlTree.AVLTree aVLTree20 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node21 = null;
        int int22 = aVLTree20.getBalance(node21);
        aVLTree20.insert((int) (byte) 100);
        aVLTree20.insert((int) 'a');
        AvlTree.AVLTree.Node node28 = aVLTree20.find((int) (byte) 100);
        AvlTree.AVLTree aVLTree29 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node31 = aVLTree29.find((int) '4');
        aVLTree29.delete((int) 'a');
        AvlTree.AVLTree.Node node34 = aVLTree29.getRoot();
        aVLTree29.delete(0);
        AvlTree.AVLTree.Node node37 = null;
        int int38 = aVLTree29.getBalance(node37);
        int int39 = aVLTree29.height();
        AvlTree.AVLTree aVLTree40 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node42 = aVLTree40.find((int) '4');
        AvlTree.AVLTree.Node node43 = aVLTree40.getRoot();
        aVLTree40.delete(100);
        aVLTree40.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node48 = aVLTree40.getRoot();
        int int49 = aVLTree29.getBalance(node48);
        int int50 = aVLTree20.getBalance(node48);
        int int51 = aVLTree10.getBalance(node48);
        int int52 = aVLTree0.getBalance(node48);
        aVLTree0.delete(10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((int) 'a');
        AvlTree.AVLTree.Node node8 = aVLTree0.find((int) (byte) 100);
        AvlTree.AVLTree aVLTree9 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        aVLTree9.delete((int) 'a');
        AvlTree.AVLTree.Node node14 = aVLTree9.getRoot();
        aVLTree9.delete(0);
        AvlTree.AVLTree.Node node17 = null;
        int int18 = aVLTree9.getBalance(node17);
        int int19 = aVLTree9.height();
        AvlTree.AVLTree aVLTree20 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node22 = aVLTree20.find((int) '4');
        AvlTree.AVLTree.Node node23 = aVLTree20.getRoot();
        aVLTree20.delete(100);
        aVLTree20.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node28 = aVLTree20.getRoot();
        int int29 = aVLTree9.getBalance(node28);
        int int30 = aVLTree0.getBalance(node28);
        AvlTree.AVLTree.Node node31 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node32 = aVLTree0.getRoot();
        AvlTree.AVLTree aVLTree33 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node35 = aVLTree33.find((int) '4');
        aVLTree33.delete((int) 'a');
        AvlTree.AVLTree.Node node38 = aVLTree33.getRoot();
        aVLTree33.delete(0);
        AvlTree.AVLTree.Node node41 = null;
        int int42 = aVLTree33.getBalance(node41);
        AvlTree.AVLTree.Node node43 = null;
        int int44 = aVLTree33.getBalance(node43);
        AvlTree.AVLTree aVLTree45 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node47 = aVLTree45.find((int) '4');
        aVLTree45.delete((int) 'a');
        AvlTree.AVLTree.Node node50 = aVLTree45.getRoot();
        AvlTree.AVLTree.Node node51 = null;
        int int52 = aVLTree45.getBalance(node51);
        AvlTree.AVLTree.Node node54 = aVLTree45.find((int) ' ');
        AvlTree.AVLTree aVLTree55 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node57 = aVLTree55.find((int) '4');
        AvlTree.AVLTree.Node node59 = aVLTree55.find((int) 'a');
        aVLTree55.delete((int) (short) 10);
        AvlTree.AVLTree aVLTree62 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node63 = null;
        int int64 = aVLTree62.getBalance(node63);
        aVLTree62.insert((int) (byte) 100);
        aVLTree62.insert((int) 'a');
        AvlTree.AVLTree.Node node70 = aVLTree62.find((int) (byte) 100);
        int int71 = aVLTree55.getBalance(node70);
        int int72 = aVLTree45.getBalance(node70);
        int int73 = aVLTree33.getBalance(node70);
        int int74 = aVLTree0.getBalance(node70);
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.delete((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        AvlTree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        AvlTree.AVLTree.Node node8 = aVLTree0.find((int) (byte) 100);
        AvlTree.AVLTree aVLTree9 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node10 = aVLTree9.getRoot();
        AvlTree.AVLTree aVLTree11 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        AvlTree.AVLTree.Node node14 = aVLTree11.getRoot();
        AvlTree.AVLTree.Node node16 = aVLTree11.find((int) (short) -1);
        AvlTree.AVLTree aVLTree17 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        aVLTree17.delete((int) 'a');
        AvlTree.AVLTree.Node node22 = aVLTree17.getRoot();
        aVLTree17.delete(0);
        AvlTree.AVLTree.Node node25 = null;
        int int26 = aVLTree17.getBalance(node25);
        int int27 = aVLTree17.height();
        aVLTree17.delete(100);
        AvlTree.AVLTree aVLTree30 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        AvlTree.AVLTree.Node node33 = aVLTree30.getRoot();
        aVLTree30.delete(100);
        aVLTree30.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node38 = aVLTree30.getRoot();
        int int39 = aVLTree17.getBalance(node38);
        int int40 = aVLTree11.getBalance(node38);
        int int41 = aVLTree9.getBalance(node38);
        int int42 = aVLTree0.getBalance(node38);
        java.lang.Class<?> wildcardClass43 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node5 = aVLTree0.find((int) (short) -1);
        AvlTree.AVLTree aVLTree6 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        AvlTree.AVLTree.Node node10 = aVLTree6.find((int) 'a');
        AvlTree.AVLTree.Node node11 = aVLTree6.getRoot();
        aVLTree6.delete((int) (short) 10);
        AvlTree.AVLTree.Node node14 = aVLTree6.getRoot();
        AvlTree.AVLTree.Node node15 = aVLTree6.getRoot();
        aVLTree6.insert((int) (byte) 100);
        AvlTree.AVLTree.Node node18 = aVLTree6.getRoot();
        int int19 = aVLTree0.getBalance(node18);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        AvlTree.AVLTree aVLTree6 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        AvlTree.AVLTree.Node node9 = null;
        int int10 = aVLTree6.getBalance(node9);
        aVLTree6.insert((int) (short) 100);
        AvlTree.AVLTree.Node node14 = aVLTree6.find((int) ' ');
        int int15 = aVLTree6.height();
        AvlTree.AVLTree.Node node16 = aVLTree6.getRoot();
        int int17 = aVLTree0.getBalance(node16);
        AvlTree.AVLTree.Node node19 = aVLTree0.find((int) '4');
        java.lang.Class<?> wildcardClass20 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        AvlTree.AVLTree.Node node9 = aVLTree0.getRoot();
        AvlTree.AVLTree aVLTree10 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node11 = null;
        int int12 = aVLTree10.getBalance(node11);
        aVLTree10.insert((int) (byte) 100);
        aVLTree10.insert((int) 'a');
        AvlTree.AVLTree.Node node18 = aVLTree10.find((int) (byte) 100);
        AvlTree.AVLTree aVLTree19 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        aVLTree19.delete((int) 'a');
        AvlTree.AVLTree.Node node24 = aVLTree19.getRoot();
        aVLTree19.delete(0);
        AvlTree.AVLTree.Node node27 = null;
        int int28 = aVLTree19.getBalance(node27);
        int int29 = aVLTree19.height();
        AvlTree.AVLTree aVLTree30 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        AvlTree.AVLTree.Node node33 = aVLTree30.getRoot();
        aVLTree30.delete(100);
        aVLTree30.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node38 = aVLTree30.getRoot();
        int int39 = aVLTree19.getBalance(node38);
        int int40 = aVLTree10.getBalance(node38);
        int int41 = aVLTree0.getBalance(node38);
        AvlTree.AVLTree.Node node43 = aVLTree0.find((int) (byte) -1);
        AvlTree.AVLTree.Node node45 = aVLTree0.find((int) (byte) -1);
        aVLTree0.insert((int) (short) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node45);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.insert((int) (short) 1);
        AvlTree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        aVLTree0.insert((int) (short) 10);
        aVLTree0.insert(0);
        AvlTree.AVLTree.Node node13 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        int int5 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 1);
        AvlTree.AVLTree.Node node8 = aVLTree0.getRoot();
        int int9 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        AvlTree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        int int10 = aVLTree0.height();
        AvlTree.AVLTree.Node node12 = aVLTree0.find((int) (short) 1);
        int int13 = aVLTree0.height();
        AvlTree.AVLTree aVLTree14 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node16 = aVLTree14.find((int) '4');
        AvlTree.AVLTree.Node node17 = null;
        int int18 = aVLTree14.getBalance(node17);
        aVLTree14.insert((int) '4');
        AvlTree.AVLTree.Node node22 = aVLTree14.find(100);
        AvlTree.AVLTree.Node node23 = aVLTree14.getRoot();
        int int24 = aVLTree0.getBalance(node23);
        aVLTree0.insert((-1));
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        AvlTree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        AvlTree.AVLTree.Node node8 = aVLTree0.find((int) (byte) 100);
        AvlTree.AVLTree aVLTree9 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node10 = aVLTree9.getRoot();
        AvlTree.AVLTree aVLTree11 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        AvlTree.AVLTree.Node node14 = aVLTree11.getRoot();
        AvlTree.AVLTree.Node node16 = aVLTree11.find((int) (short) -1);
        AvlTree.AVLTree aVLTree17 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        aVLTree17.delete((int) 'a');
        AvlTree.AVLTree.Node node22 = aVLTree17.getRoot();
        aVLTree17.delete(0);
        AvlTree.AVLTree.Node node25 = null;
        int int26 = aVLTree17.getBalance(node25);
        int int27 = aVLTree17.height();
        aVLTree17.delete(100);
        AvlTree.AVLTree aVLTree30 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        AvlTree.AVLTree.Node node33 = aVLTree30.getRoot();
        aVLTree30.delete(100);
        aVLTree30.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node38 = aVLTree30.getRoot();
        int int39 = aVLTree17.getBalance(node38);
        int int40 = aVLTree11.getBalance(node38);
        int int41 = aVLTree9.getBalance(node38);
        int int42 = aVLTree0.getBalance(node38);
        aVLTree0.delete(10);
        AvlTree.AVLTree.Node node46 = aVLTree0.find(100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(node46);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node8 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node10 = aVLTree0.find((int) (byte) 0);
        aVLTree0.delete(10);
        java.lang.Class<?> wildcardClass13 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        AvlTree.AVLTree.Node node8 = aVLTree0.find((int) (short) -1);
        AvlTree.AVLTree.Node node9 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node11 = aVLTree0.find(1);
        aVLTree0.delete(10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node6 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node7 = aVLTree0.getRoot();
        int int8 = aVLTree0.height();
        int int9 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        AvlTree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        aVLTree0.delete(100);
        int int13 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) 10);
        AvlTree.AVLTree.Node node8 = aVLTree0.getRoot();
        int int9 = aVLTree0.height();
        int int10 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 1);
        java.lang.Class<?> wildcardClass8 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        AvlTree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        AvlTree.AVLTree.Node node8 = aVLTree0.find(0);
        AvlTree.AVLTree aVLTree9 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        aVLTree9.delete((int) 'a');
        aVLTree9.delete(1);
        aVLTree9.delete((int) '#');
        aVLTree9.delete((int) (short) -1);
        AvlTree.AVLTree.Node node20 = aVLTree9.getRoot();
        AvlTree.AVLTree.Node node22 = aVLTree9.find((int) (byte) 100);
        int int23 = aVLTree9.height();
        AvlTree.AVLTree aVLTree24 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        AvlTree.AVLTree.Node node27 = aVLTree24.getRoot();
        aVLTree24.insert((int) (byte) 100);
        AvlTree.AVLTree aVLTree30 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        AvlTree.AVLTree.Node node34 = aVLTree30.find((int) 'a');
        aVLTree30.delete((int) (short) 10);
        AvlTree.AVLTree aVLTree37 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node38 = null;
        int int39 = aVLTree37.getBalance(node38);
        aVLTree37.insert((int) (byte) 100);
        aVLTree37.insert((int) 'a');
        AvlTree.AVLTree.Node node45 = aVLTree37.find((int) (byte) 100);
        int int46 = aVLTree30.getBalance(node45);
        int int47 = aVLTree24.getBalance(node45);
        int int48 = aVLTree9.getBalance(node45);
        int int49 = aVLTree0.getBalance(node45);
        AvlTree.AVLTree.Node node51 = aVLTree0.find(0);
        aVLTree0.delete((int) '4');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNull(node51);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        AvlTree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        AvlTree.AVLTree.Node node10 = null;
        int int11 = aVLTree0.getBalance(node10);
        AvlTree.AVLTree aVLTree12 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node14 = aVLTree12.find((int) '4');
        aVLTree12.delete((int) 'a');
        AvlTree.AVLTree.Node node17 = aVLTree12.getRoot();
        AvlTree.AVLTree.Node node18 = null;
        int int19 = aVLTree12.getBalance(node18);
        AvlTree.AVLTree.Node node21 = aVLTree12.find((int) ' ');
        AvlTree.AVLTree aVLTree22 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node24 = aVLTree22.find((int) '4');
        AvlTree.AVLTree.Node node26 = aVLTree22.find((int) 'a');
        aVLTree22.delete((int) (short) 10);
        AvlTree.AVLTree aVLTree29 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node30 = null;
        int int31 = aVLTree29.getBalance(node30);
        aVLTree29.insert((int) (byte) 100);
        aVLTree29.insert((int) 'a');
        AvlTree.AVLTree.Node node37 = aVLTree29.find((int) (byte) 100);
        int int38 = aVLTree22.getBalance(node37);
        int int39 = aVLTree12.getBalance(node37);
        int int40 = aVLTree0.getBalance(node37);
        int int41 = aVLTree0.height();
        AvlTree.AVLTree.Node node43 = aVLTree0.find((int) (byte) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNull(node43);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        AvlTree.AVLTree aVLTree3 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node5 = aVLTree3.find((int) '4');
        AvlTree.AVLTree.Node node6 = aVLTree3.getRoot();
        aVLTree3.insert((int) (byte) 100);
        AvlTree.AVLTree aVLTree9 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        AvlTree.AVLTree.Node node12 = null;
        int int13 = aVLTree9.getBalance(node12);
        aVLTree9.insert((int) (short) 100);
        AvlTree.AVLTree.Node node17 = aVLTree9.find((int) ' ');
        int int18 = aVLTree9.height();
        AvlTree.AVLTree.Node node19 = aVLTree9.getRoot();
        int int20 = aVLTree3.getBalance(node19);
        int int21 = aVLTree0.getBalance(node19);
        aVLTree0.insert((int) (short) 1);
        AvlTree.AVLTree aVLTree24 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        aVLTree24.insert((int) (short) 0);
        AvlTree.AVLTree.Node node30 = aVLTree24.find(100);
        AvlTree.AVLTree aVLTree31 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node33 = aVLTree31.find((int) '4');
        aVLTree31.delete((int) 'a');
        AvlTree.AVLTree.Node node36 = aVLTree31.getRoot();
        aVLTree31.delete(0);
        AvlTree.AVLTree.Node node39 = null;
        int int40 = aVLTree31.getBalance(node39);
        int int41 = aVLTree31.height();
        AvlTree.AVLTree aVLTree42 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node44 = aVLTree42.find((int) '4');
        AvlTree.AVLTree.Node node45 = aVLTree42.getRoot();
        aVLTree42.delete(100);
        aVLTree42.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node50 = aVLTree42.getRoot();
        int int51 = aVLTree31.getBalance(node50);
        AvlTree.AVLTree aVLTree52 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node54 = aVLTree52.find((int) '4');
        aVLTree52.delete((int) 'a');
        AvlTree.AVLTree.Node node57 = aVLTree52.getRoot();
        aVLTree52.delete(0);
        AvlTree.AVLTree.Node node60 = null;
        int int61 = aVLTree52.getBalance(node60);
        int int62 = aVLTree52.height();
        AvlTree.AVLTree aVLTree63 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node65 = aVLTree63.find((int) '4');
        AvlTree.AVLTree.Node node66 = aVLTree63.getRoot();
        aVLTree63.delete(100);
        aVLTree63.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node71 = aVLTree63.getRoot();
        int int72 = aVLTree52.getBalance(node71);
        int int73 = aVLTree31.getBalance(node71);
        int int74 = aVLTree24.getBalance(node71);
        int int75 = aVLTree0.getBalance(node71);
        AvlTree.AVLTree.Node node76 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNull(node65);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(node76);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node5 = aVLTree0.find((int) (short) -1);
        AvlTree.AVLTree aVLTree6 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        aVLTree6.delete((int) 'a');
        AvlTree.AVLTree.Node node11 = aVLTree6.getRoot();
        aVLTree6.delete(0);
        AvlTree.AVLTree.Node node14 = null;
        int int15 = aVLTree6.getBalance(node14);
        int int16 = aVLTree6.height();
        aVLTree6.delete(100);
        AvlTree.AVLTree aVLTree19 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        AvlTree.AVLTree.Node node22 = aVLTree19.getRoot();
        aVLTree19.delete(100);
        aVLTree19.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node27 = aVLTree19.getRoot();
        int int28 = aVLTree6.getBalance(node27);
        int int29 = aVLTree0.getBalance(node27);
        AvlTree.AVLTree.Node node30 = aVLTree0.getRoot();
        AvlTree.AVLTree aVLTree31 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node33 = aVLTree31.find((int) '4');
        AvlTree.AVLTree.Node node35 = aVLTree31.find((int) 'a');
        int int36 = aVLTree31.height();
        AvlTree.AVLTree aVLTree37 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node38 = null;
        int int39 = aVLTree37.getBalance(node38);
        AvlTree.AVLTree.Node node40 = aVLTree37.getRoot();
        aVLTree37.insert((int) (byte) 100);
        AvlTree.AVLTree aVLTree43 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node45 = aVLTree43.find((int) '4');
        aVLTree43.delete((int) 'a');
        AvlTree.AVLTree.Node node48 = aVLTree43.getRoot();
        aVLTree43.delete(0);
        AvlTree.AVLTree.Node node51 = null;
        int int52 = aVLTree43.getBalance(node51);
        int int53 = aVLTree43.height();
        AvlTree.AVLTree aVLTree54 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node56 = aVLTree54.find((int) '4');
        AvlTree.AVLTree.Node node57 = aVLTree54.getRoot();
        aVLTree54.delete(100);
        aVLTree54.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node62 = aVLTree54.getRoot();
        int int63 = aVLTree43.getBalance(node62);
        int int64 = aVLTree37.getBalance(node62);
        int int65 = aVLTree31.getBalance(node62);
        int int66 = aVLTree0.getBalance(node62);
        AvlTree.AVLTree.Node node67 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNull(node67);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 1);
        aVLTree0.delete((int) '#');
        AvlTree.AVLTree aVLTree10 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node12 = aVLTree10.find((int) '4');
        AvlTree.AVLTree.Node node14 = aVLTree10.find((int) 'a');
        AvlTree.AVLTree.Node node15 = aVLTree10.getRoot();
        AvlTree.AVLTree.Node node16 = aVLTree10.getRoot();
        AvlTree.AVLTree.Node node17 = aVLTree10.getRoot();
        AvlTree.AVLTree aVLTree18 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node19 = null;
        int int20 = aVLTree18.getBalance(node19);
        AvlTree.AVLTree aVLTree21 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node23 = aVLTree21.find((int) '4');
        AvlTree.AVLTree.Node node24 = aVLTree21.getRoot();
        aVLTree21.insert((int) (byte) 100);
        AvlTree.AVLTree aVLTree27 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node29 = aVLTree27.find((int) '4');
        AvlTree.AVLTree.Node node30 = null;
        int int31 = aVLTree27.getBalance(node30);
        aVLTree27.insert((int) (short) 100);
        AvlTree.AVLTree.Node node35 = aVLTree27.find((int) ' ');
        int int36 = aVLTree27.height();
        AvlTree.AVLTree.Node node37 = aVLTree27.getRoot();
        int int38 = aVLTree21.getBalance(node37);
        int int39 = aVLTree18.getBalance(node37);
        int int40 = aVLTree10.getBalance(node37);
        int int41 = aVLTree0.getBalance(node37);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete((int) (byte) 0);
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node7 = aVLTree0.find(1);
        java.lang.Class<?> wildcardClass8 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        AvlTree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        AvlTree.AVLTree aVLTree11 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        AvlTree.AVLTree.Node node14 = aVLTree11.getRoot();
        aVLTree11.delete(100);
        aVLTree11.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node19 = aVLTree11.getRoot();
        int int20 = aVLTree0.getBalance(node19);
        AvlTree.AVLTree aVLTree21 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node23 = aVLTree21.find((int) '4');
        aVLTree21.delete((int) 'a');
        AvlTree.AVLTree.Node node26 = aVLTree21.getRoot();
        aVLTree21.delete(0);
        AvlTree.AVLTree.Node node29 = null;
        int int30 = aVLTree21.getBalance(node29);
        int int31 = aVLTree21.height();
        AvlTree.AVLTree aVLTree32 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node34 = aVLTree32.find((int) '4');
        AvlTree.AVLTree.Node node35 = aVLTree32.getRoot();
        aVLTree32.delete(100);
        aVLTree32.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node40 = aVLTree32.getRoot();
        int int41 = aVLTree21.getBalance(node40);
        int int42 = aVLTree0.getBalance(node40);
        AvlTree.AVLTree.Node node43 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass44 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.delete((int) (short) -1);
        AvlTree.AVLTree aVLTree8 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node10 = aVLTree8.find((int) '4');
        aVLTree8.insert((int) (short) 0);
        AvlTree.AVLTree.Node node14 = aVLTree8.find(100);
        AvlTree.AVLTree aVLTree15 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node17 = aVLTree15.find((int) '4');
        aVLTree15.delete((int) 'a');
        AvlTree.AVLTree.Node node20 = aVLTree15.getRoot();
        aVLTree15.delete(0);
        AvlTree.AVLTree.Node node23 = null;
        int int24 = aVLTree15.getBalance(node23);
        int int25 = aVLTree15.height();
        AvlTree.AVLTree aVLTree26 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node28 = aVLTree26.find((int) '4');
        AvlTree.AVLTree.Node node29 = aVLTree26.getRoot();
        aVLTree26.delete(100);
        aVLTree26.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node34 = aVLTree26.getRoot();
        int int35 = aVLTree15.getBalance(node34);
        AvlTree.AVLTree aVLTree36 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node38 = aVLTree36.find((int) '4');
        aVLTree36.delete((int) 'a');
        AvlTree.AVLTree.Node node41 = aVLTree36.getRoot();
        aVLTree36.delete(0);
        AvlTree.AVLTree.Node node44 = null;
        int int45 = aVLTree36.getBalance(node44);
        int int46 = aVLTree36.height();
        AvlTree.AVLTree aVLTree47 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node49 = aVLTree47.find((int) '4');
        AvlTree.AVLTree.Node node50 = aVLTree47.getRoot();
        aVLTree47.delete(100);
        aVLTree47.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node55 = aVLTree47.getRoot();
        int int56 = aVLTree36.getBalance(node55);
        int int57 = aVLTree15.getBalance(node55);
        int int58 = aVLTree8.getBalance(node55);
        int int59 = aVLTree0.getBalance(node55);
        int int60 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        aVLTree0.delete((int) (short) -1);
        AvlTree.AVLTree.Node node11 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node13 = aVLTree0.find((int) (byte) 100);
        AvlTree.AVLTree.Node node15 = aVLTree0.find((int) ' ');
        aVLTree0.delete((int) ' ');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        AvlTree.AVLTree aVLTree6 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        aVLTree6.insert((int) (short) 0);
        AvlTree.AVLTree.Node node12 = aVLTree6.find(100);
        AvlTree.AVLTree aVLTree13 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        aVLTree13.delete((int) 'a');
        AvlTree.AVLTree.Node node18 = aVLTree13.getRoot();
        aVLTree13.delete(0);
        AvlTree.AVLTree.Node node21 = null;
        int int22 = aVLTree13.getBalance(node21);
        int int23 = aVLTree13.height();
        AvlTree.AVLTree aVLTree24 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        AvlTree.AVLTree.Node node27 = aVLTree24.getRoot();
        aVLTree24.delete(100);
        aVLTree24.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node32 = aVLTree24.getRoot();
        int int33 = aVLTree13.getBalance(node32);
        AvlTree.AVLTree aVLTree34 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node36 = aVLTree34.find((int) '4');
        aVLTree34.delete((int) 'a');
        AvlTree.AVLTree.Node node39 = aVLTree34.getRoot();
        aVLTree34.delete(0);
        AvlTree.AVLTree.Node node42 = null;
        int int43 = aVLTree34.getBalance(node42);
        int int44 = aVLTree34.height();
        AvlTree.AVLTree aVLTree45 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node47 = aVLTree45.find((int) '4');
        AvlTree.AVLTree.Node node48 = aVLTree45.getRoot();
        aVLTree45.delete(100);
        aVLTree45.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node53 = aVLTree45.getRoot();
        int int54 = aVLTree34.getBalance(node53);
        int int55 = aVLTree13.getBalance(node53);
        int int56 = aVLTree6.getBalance(node53);
        int int57 = aVLTree0.getBalance(node53);
        int int58 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        AvlTree.AVLTree.Node node8 = aVLTree0.find((int) (short) -1);
        AvlTree.AVLTree.Node node10 = aVLTree0.find(1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        AvlTree.AVLTree.Node node8 = aVLTree0.find((int) (short) 0);
        AvlTree.AVLTree.Node node10 = aVLTree0.find((int) ' ');
        int int11 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int6 = aVLTree0.height();
        aVLTree0.insert(10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        int int5 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 1);
        AvlTree.AVLTree.Node node8 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node10 = aVLTree0.find((int) '#');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        AvlTree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        aVLTree0.insert((-1));
        AvlTree.AVLTree.Node node12 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        AvlTree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        AvlTree.AVLTree aVLTree11 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        AvlTree.AVLTree.Node node14 = aVLTree11.getRoot();
        aVLTree11.delete(100);
        aVLTree11.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node19 = aVLTree11.getRoot();
        int int20 = aVLTree0.getBalance(node19);
        AvlTree.AVLTree aVLTree21 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node23 = aVLTree21.find((int) '4');
        aVLTree21.delete((int) 'a');
        AvlTree.AVLTree.Node node26 = aVLTree21.getRoot();
        aVLTree21.delete(0);
        AvlTree.AVLTree.Node node29 = null;
        int int30 = aVLTree21.getBalance(node29);
        int int31 = aVLTree21.height();
        AvlTree.AVLTree aVLTree32 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node34 = aVLTree32.find((int) '4');
        AvlTree.AVLTree.Node node35 = aVLTree32.getRoot();
        aVLTree32.delete(100);
        aVLTree32.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node40 = aVLTree32.getRoot();
        int int41 = aVLTree21.getBalance(node40);
        int int42 = aVLTree0.getBalance(node40);
        aVLTree0.delete((int) (byte) 100);
        AvlTree.AVLTree.Node node45 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(node45);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree aVLTree5 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node7 = aVLTree5.find((int) '4');
        AvlTree.AVLTree.Node node8 = aVLTree5.getRoot();
        aVLTree5.insert((int) (byte) 100);
        AvlTree.AVLTree aVLTree11 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        AvlTree.AVLTree.Node node14 = null;
        int int15 = aVLTree11.getBalance(node14);
        aVLTree11.insert((int) (short) 100);
        AvlTree.AVLTree.Node node19 = aVLTree11.find((int) ' ');
        int int20 = aVLTree11.height();
        AvlTree.AVLTree.Node node21 = aVLTree11.getRoot();
        int int22 = aVLTree5.getBalance(node21);
        int int23 = aVLTree0.getBalance(node21);
        int int24 = aVLTree0.height();
        aVLTree0.delete((int) (short) -1);
        aVLTree0.insert((int) 'a');
        aVLTree0.delete((-1));
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.insert((int) (byte) -1);
        aVLTree0.insert(1);
        AvlTree.AVLTree aVLTree9 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        aVLTree9.insert((int) (short) 0);
        AvlTree.AVLTree.Node node15 = aVLTree9.find(100);
        AvlTree.AVLTree aVLTree16 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node18 = aVLTree16.find((int) '4');
        aVLTree16.delete((int) 'a');
        AvlTree.AVLTree.Node node21 = aVLTree16.getRoot();
        aVLTree16.delete(0);
        AvlTree.AVLTree.Node node24 = null;
        int int25 = aVLTree16.getBalance(node24);
        int int26 = aVLTree16.height();
        AvlTree.AVLTree aVLTree27 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node29 = aVLTree27.find((int) '4');
        AvlTree.AVLTree.Node node30 = aVLTree27.getRoot();
        aVLTree27.delete(100);
        aVLTree27.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node35 = aVLTree27.getRoot();
        int int36 = aVLTree16.getBalance(node35);
        AvlTree.AVLTree aVLTree37 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node39 = aVLTree37.find((int) '4');
        aVLTree37.delete((int) 'a');
        AvlTree.AVLTree.Node node42 = aVLTree37.getRoot();
        aVLTree37.delete(0);
        AvlTree.AVLTree.Node node45 = null;
        int int46 = aVLTree37.getBalance(node45);
        int int47 = aVLTree37.height();
        AvlTree.AVLTree aVLTree48 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node50 = aVLTree48.find((int) '4');
        AvlTree.AVLTree.Node node51 = aVLTree48.getRoot();
        aVLTree48.delete(100);
        aVLTree48.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node56 = aVLTree48.getRoot();
        int int57 = aVLTree37.getBalance(node56);
        int int58 = aVLTree16.getBalance(node56);
        int int59 = aVLTree9.getBalance(node56);
        int int60 = aVLTree0.getBalance(node56);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((int) 'a');
        AvlTree.AVLTree.Node node8 = aVLTree0.find((int) (byte) 100);
        AvlTree.AVLTree.Node node9 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree aVLTree5 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node7 = aVLTree5.find((int) '4');
        AvlTree.AVLTree.Node node8 = aVLTree5.getRoot();
        aVLTree5.insert((int) (byte) 100);
        AvlTree.AVLTree aVLTree11 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        AvlTree.AVLTree.Node node14 = null;
        int int15 = aVLTree11.getBalance(node14);
        aVLTree11.insert((int) (short) 100);
        AvlTree.AVLTree.Node node19 = aVLTree11.find((int) ' ');
        int int20 = aVLTree11.height();
        AvlTree.AVLTree.Node node21 = aVLTree11.getRoot();
        int int22 = aVLTree5.getBalance(node21);
        int int23 = aVLTree0.getBalance(node21);
        aVLTree0.delete((int) (short) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) (byte) -1);
        int int5 = aVLTree0.height();
        int int6 = aVLTree0.height();
        AvlTree.AVLTree.Node node7 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass8 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        aVLTree0.delete((int) (byte) -1);
        int int3 = aVLTree0.height();
        AvlTree.AVLTree.Node node5 = aVLTree0.find((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        aVLTree0.delete(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        AvlTree.AVLTree aVLTree3 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node5 = aVLTree3.find((int) '4');
        AvlTree.AVLTree.Node node6 = aVLTree3.getRoot();
        aVLTree3.insert((int) (byte) 100);
        AvlTree.AVLTree aVLTree9 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        AvlTree.AVLTree.Node node12 = null;
        int int13 = aVLTree9.getBalance(node12);
        aVLTree9.insert((int) (short) 100);
        AvlTree.AVLTree.Node node17 = aVLTree9.find((int) ' ');
        int int18 = aVLTree9.height();
        AvlTree.AVLTree.Node node19 = aVLTree9.getRoot();
        int int20 = aVLTree3.getBalance(node19);
        int int21 = aVLTree0.getBalance(node19);
        AvlTree.AVLTree.Node node23 = aVLTree0.find((int) 'a');
        AvlTree.AVLTree aVLTree24 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        AvlTree.AVLTree.Node node27 = aVLTree24.getRoot();
        aVLTree24.delete(100);
        int int30 = aVLTree24.height();
        AvlTree.AVLTree.Node node32 = aVLTree24.find((int) (short) -1);
        AvlTree.AVLTree.Node node33 = aVLTree24.getRoot();
        AvlTree.AVLTree aVLTree34 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node35 = null;
        int int36 = aVLTree34.getBalance(node35);
        aVLTree34.insert((int) (byte) 100);
        aVLTree34.insert((int) 'a');
        AvlTree.AVLTree.Node node42 = aVLTree34.find((int) (byte) 100);
        AvlTree.AVLTree aVLTree43 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node45 = aVLTree43.find((int) '4');
        aVLTree43.delete((int) 'a');
        AvlTree.AVLTree.Node node48 = aVLTree43.getRoot();
        aVLTree43.delete(0);
        AvlTree.AVLTree.Node node51 = null;
        int int52 = aVLTree43.getBalance(node51);
        int int53 = aVLTree43.height();
        AvlTree.AVLTree aVLTree54 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node56 = aVLTree54.find((int) '4');
        AvlTree.AVLTree.Node node57 = aVLTree54.getRoot();
        aVLTree54.delete(100);
        aVLTree54.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node62 = aVLTree54.getRoot();
        int int63 = aVLTree43.getBalance(node62);
        int int64 = aVLTree34.getBalance(node62);
        int int65 = aVLTree24.getBalance(node62);
        int int66 = aVLTree0.getBalance(node62);
        aVLTree0.insert((int) (byte) 1);
        int int69 = aVLTree0.height();
        AvlTree.AVLTree.Node node70 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(node70);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        AvlTree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        AvlTree.AVLTree aVLTree11 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        AvlTree.AVLTree.Node node14 = aVLTree11.getRoot();
        aVLTree11.delete(100);
        aVLTree11.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node19 = aVLTree11.getRoot();
        int int20 = aVLTree0.getBalance(node19);
        AvlTree.AVLTree aVLTree21 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node23 = aVLTree21.find((int) '4');
        aVLTree21.delete((int) 'a');
        AvlTree.AVLTree.Node node26 = aVLTree21.getRoot();
        aVLTree21.delete(0);
        AvlTree.AVLTree.Node node29 = null;
        int int30 = aVLTree21.getBalance(node29);
        int int31 = aVLTree21.height();
        AvlTree.AVLTree aVLTree32 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node34 = aVLTree32.find((int) '4');
        AvlTree.AVLTree.Node node35 = aVLTree32.getRoot();
        aVLTree32.delete(100);
        aVLTree32.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node40 = aVLTree32.getRoot();
        int int41 = aVLTree21.getBalance(node40);
        int int42 = aVLTree0.getBalance(node40);
        aVLTree0.delete((int) (byte) 100);
        aVLTree0.insert((int) ' ');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        AvlTree.AVLTree.Node node9 = aVLTree0.getRoot();
        AvlTree.AVLTree aVLTree10 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node11 = null;
        int int12 = aVLTree10.getBalance(node11);
        aVLTree10.insert((int) (byte) 100);
        aVLTree10.insert((int) 'a');
        AvlTree.AVLTree.Node node18 = aVLTree10.find((int) (byte) 100);
        AvlTree.AVLTree aVLTree19 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        aVLTree19.delete((int) 'a');
        AvlTree.AVLTree.Node node24 = aVLTree19.getRoot();
        aVLTree19.delete(0);
        AvlTree.AVLTree.Node node27 = null;
        int int28 = aVLTree19.getBalance(node27);
        int int29 = aVLTree19.height();
        AvlTree.AVLTree aVLTree30 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        AvlTree.AVLTree.Node node33 = aVLTree30.getRoot();
        aVLTree30.delete(100);
        aVLTree30.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node38 = aVLTree30.getRoot();
        int int39 = aVLTree19.getBalance(node38);
        int int40 = aVLTree10.getBalance(node38);
        int int41 = aVLTree0.getBalance(node38);
        AvlTree.AVLTree.Node node43 = aVLTree0.find((int) (byte) -1);
        AvlTree.AVLTree.Node node45 = aVLTree0.find((int) (byte) -1);
        aVLTree0.insert((int) '#');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node45);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        AvlTree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        aVLTree0.insert((-1));
        AvlTree.AVLTree.Node node12 = aVLTree0.getRoot();
        int int13 = aVLTree0.height();
        AvlTree.AVLTree.Node node15 = aVLTree0.find((int) (short) -1);
        aVLTree0.insert((int) ' ');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node5 = aVLTree0.find((int) (byte) 1);
        int int6 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert(1);
        AvlTree.AVLTree.Node node7 = aVLTree0.find((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        AvlTree.AVLTree.Node node9 = null;
        int int10 = aVLTree0.getBalance(node9);
        aVLTree0.insert((int) 'a');
        aVLTree0.delete(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.insert((int) (short) 1);
        aVLTree0.insert((int) '#');
        aVLTree0.delete(10);
        AvlTree.AVLTree.Node node11 = aVLTree0.getRoot();
        aVLTree0.insert(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        AvlTree.AVLTree aVLTree8 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node10 = aVLTree8.find((int) '4');
        AvlTree.AVLTree.Node node11 = aVLTree8.getRoot();
        aVLTree8.delete(100);
        aVLTree8.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node16 = aVLTree8.getRoot();
        int int17 = aVLTree0.getBalance(node16);
        int int18 = aVLTree0.height();
        AvlTree.AVLTree.Node node19 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node5 = aVLTree0.find((int) (short) -1);
        aVLTree0.insert((int) (short) 100);
        AvlTree.AVLTree.Node node9 = aVLTree0.find(10);
        aVLTree0.insert((int) '#');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        AvlTree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        AvlTree.AVLTree.Node node8 = aVLTree0.find(0);
        AvlTree.AVLTree aVLTree9 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        aVLTree9.delete((int) 'a');
        aVLTree9.delete(1);
        aVLTree9.delete((int) '#');
        aVLTree9.delete((int) (short) -1);
        AvlTree.AVLTree.Node node20 = aVLTree9.getRoot();
        AvlTree.AVLTree.Node node22 = aVLTree9.find((int) (byte) 100);
        int int23 = aVLTree9.height();
        AvlTree.AVLTree aVLTree24 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        AvlTree.AVLTree.Node node27 = aVLTree24.getRoot();
        aVLTree24.insert((int) (byte) 100);
        AvlTree.AVLTree aVLTree30 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        AvlTree.AVLTree.Node node34 = aVLTree30.find((int) 'a');
        aVLTree30.delete((int) (short) 10);
        AvlTree.AVLTree aVLTree37 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node38 = null;
        int int39 = aVLTree37.getBalance(node38);
        aVLTree37.insert((int) (byte) 100);
        aVLTree37.insert((int) 'a');
        AvlTree.AVLTree.Node node45 = aVLTree37.find((int) (byte) 100);
        int int46 = aVLTree30.getBalance(node45);
        int int47 = aVLTree24.getBalance(node45);
        int int48 = aVLTree9.getBalance(node45);
        int int49 = aVLTree0.getBalance(node45);
        AvlTree.AVLTree.Node node51 = aVLTree0.find(0);
        AvlTree.AVLTree.Node node53 = aVLTree0.find(1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNull(node53);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        AvlTree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        AvlTree.AVLTree.Node node10 = aVLTree0.getRoot();
        aVLTree0.insert((-1));
        java.lang.Class<?> wildcardClass13 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        aVLTree0.insert((int) (short) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((-1));
        aVLTree0.delete(100);
        aVLTree0.insert((int) (short) 1);
        AvlTree.AVLTree.Node node7 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node8 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node10 = aVLTree0.find((int) (byte) 0);
        aVLTree0.delete((int) '4');
        int int13 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int6 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 10);
        aVLTree0.delete((int) (byte) 1);
        AvlTree.AVLTree.Node node12 = aVLTree0.find((int) (short) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        AvlTree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        AvlTree.AVLTree.Node node8 = aVLTree0.find((int) (byte) 100);
        AvlTree.AVLTree aVLTree9 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node10 = aVLTree9.getRoot();
        AvlTree.AVLTree aVLTree11 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        AvlTree.AVLTree.Node node14 = aVLTree11.getRoot();
        AvlTree.AVLTree.Node node16 = aVLTree11.find((int) (short) -1);
        AvlTree.AVLTree aVLTree17 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        aVLTree17.delete((int) 'a');
        AvlTree.AVLTree.Node node22 = aVLTree17.getRoot();
        aVLTree17.delete(0);
        AvlTree.AVLTree.Node node25 = null;
        int int26 = aVLTree17.getBalance(node25);
        int int27 = aVLTree17.height();
        aVLTree17.delete(100);
        AvlTree.AVLTree aVLTree30 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        AvlTree.AVLTree.Node node33 = aVLTree30.getRoot();
        aVLTree30.delete(100);
        aVLTree30.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node38 = aVLTree30.getRoot();
        int int39 = aVLTree17.getBalance(node38);
        int int40 = aVLTree11.getBalance(node38);
        int int41 = aVLTree9.getBalance(node38);
        int int42 = aVLTree0.getBalance(node38);
        aVLTree0.delete(10);
        AvlTree.AVLTree aVLTree45 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node47 = aVLTree45.find((int) '4');
        AvlTree.AVLTree.Node node48 = null;
        int int49 = aVLTree45.getBalance(node48);
        aVLTree45.insert(0);
        aVLTree45.insert((int) (short) 10);
        AvlTree.AVLTree.Node node54 = aVLTree45.getRoot();
        AvlTree.AVLTree aVLTree55 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node56 = null;
        int int57 = aVLTree55.getBalance(node56);
        aVLTree55.insert((int) (byte) 100);
        aVLTree55.insert((int) 'a');
        AvlTree.AVLTree.Node node63 = aVLTree55.find((int) (byte) 100);
        AvlTree.AVLTree aVLTree64 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node66 = aVLTree64.find((int) '4');
        aVLTree64.delete((int) 'a');
        AvlTree.AVLTree.Node node69 = aVLTree64.getRoot();
        aVLTree64.delete(0);
        AvlTree.AVLTree.Node node72 = null;
        int int73 = aVLTree64.getBalance(node72);
        int int74 = aVLTree64.height();
        AvlTree.AVLTree aVLTree75 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node77 = aVLTree75.find((int) '4');
        AvlTree.AVLTree.Node node78 = aVLTree75.getRoot();
        aVLTree75.delete(100);
        aVLTree75.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node83 = aVLTree75.getRoot();
        int int84 = aVLTree64.getBalance(node83);
        int int85 = aVLTree55.getBalance(node83);
        int int86 = aVLTree45.getBalance(node83);
        int int87 = aVLTree0.getBalance(node83);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertNull(node69);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNull(node77);
        org.junit.Assert.assertNull(node78);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        AvlTree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        aVLTree0.delete(100);
        AvlTree.AVLTree aVLTree13 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        AvlTree.AVLTree.Node node16 = aVLTree13.getRoot();
        aVLTree13.delete(100);
        aVLTree13.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node21 = aVLTree13.getRoot();
        int int22 = aVLTree0.getBalance(node21);
        aVLTree0.delete((int) 'a');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        AvlTree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        AvlTree.AVLTree.Node node8 = aVLTree0.find(100);
        AvlTree.AVLTree.Node node9 = aVLTree0.getRoot();
        AvlTree.AVLTree aVLTree10 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node12 = aVLTree10.find((int) '4');
        aVLTree10.delete((int) 'a');
        AvlTree.AVLTree.Node node15 = aVLTree10.getRoot();
        aVLTree10.delete(0);
        AvlTree.AVLTree.Node node18 = null;
        int int19 = aVLTree10.getBalance(node18);
        int int20 = aVLTree10.height();
        AvlTree.AVLTree aVLTree21 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node23 = aVLTree21.find((int) '4');
        AvlTree.AVLTree.Node node24 = aVLTree21.getRoot();
        aVLTree21.delete(100);
        aVLTree21.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node29 = aVLTree21.getRoot();
        int int30 = aVLTree10.getBalance(node29);
        AvlTree.AVLTree aVLTree31 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node33 = aVLTree31.find((int) '4');
        aVLTree31.delete((int) 'a');
        AvlTree.AVLTree.Node node36 = aVLTree31.getRoot();
        aVLTree31.delete(0);
        AvlTree.AVLTree.Node node39 = null;
        int int40 = aVLTree31.getBalance(node39);
        int int41 = aVLTree31.height();
        AvlTree.AVLTree aVLTree42 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node44 = aVLTree42.find((int) '4');
        AvlTree.AVLTree.Node node45 = aVLTree42.getRoot();
        aVLTree42.delete(100);
        aVLTree42.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node50 = aVLTree42.getRoot();
        int int51 = aVLTree31.getBalance(node50);
        int int52 = aVLTree10.getBalance(node50);
        int int53 = aVLTree0.getBalance(node50);
        AvlTree.AVLTree.Node node54 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(node54);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AvlTree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        AvlTree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        AvlTree.AVLTree aVLTree11 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        AvlTree.AVLTree.Node node14 = aVLTree11.getRoot();
        aVLTree11.delete(100);
        aVLTree11.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node19 = aVLTree11.getRoot();
        int int20 = aVLTree0.getBalance(node19);
        AvlTree.AVLTree aVLTree21 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node23 = aVLTree21.find((int) '4');
        AvlTree.AVLTree.Node node24 = aVLTree21.getRoot();
        aVLTree21.delete(100);
        int int27 = aVLTree21.height();
        AvlTree.AVLTree aVLTree28 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node30 = aVLTree28.find((int) '4');
        aVLTree28.delete((int) 'a');
        AvlTree.AVLTree.Node node33 = aVLTree28.getRoot();
        aVLTree28.delete(0);
        AvlTree.AVLTree.Node node36 = null;
        int int37 = aVLTree28.getBalance(node36);
        int int38 = aVLTree28.height();
        AvlTree.AVLTree aVLTree39 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node41 = aVLTree39.find((int) '4');
        AvlTree.AVLTree.Node node42 = aVLTree39.getRoot();
        aVLTree39.delete(100);
        aVLTree39.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node47 = aVLTree39.getRoot();
        int int48 = aVLTree28.getBalance(node47);
        AvlTree.AVLTree aVLTree49 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node51 = aVLTree49.find((int) '4');
        aVLTree49.delete((int) 'a');
        AvlTree.AVLTree.Node node54 = aVLTree49.getRoot();
        aVLTree49.delete(0);
        AvlTree.AVLTree.Node node57 = null;
        int int58 = aVLTree49.getBalance(node57);
        int int59 = aVLTree49.height();
        AvlTree.AVLTree aVLTree60 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node62 = aVLTree60.find((int) '4');
        AvlTree.AVLTree.Node node63 = aVLTree60.getRoot();
        aVLTree60.delete(100);
        aVLTree60.insert((int) (byte) 10);
        AvlTree.AVLTree.Node node68 = aVLTree60.getRoot();
        int int69 = aVLTree49.getBalance(node68);
        int int70 = aVLTree28.getBalance(node68);
        int int71 = aVLTree21.getBalance(node68);
        int int72 = aVLTree0.getBalance(node68);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        AvlTree.AVLTree aVLTree0 = new AvlTree.AVLTree();
        AvlTree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        aVLTree0.delete((int) (short) -1);
        AvlTree.AVLTree.Node node11 = aVLTree0.getRoot();
        AvlTree.AVLTree.Node node13 = aVLTree0.find((int) (byte) 100);
        AvlTree.AVLTree.Node node15 = aVLTree0.find((int) ' ');
        aVLTree0.delete((int) 'a');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
    }
}

