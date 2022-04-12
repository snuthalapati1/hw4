/* $$ This file has been instrumented by Clover 4.1.2#20161011084623935 $$ */package AvlTree;

public class AVLTree {public static class __CLR4_1_200l1vryzfo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0048\u005c\u005c\u0053\u0070\u0072\u0069\u006e\u0067\u0032\u0030\u0032\u0032\u005c\u005c\u0050\u0041\u0054\u005c\u005c\u0063\u006c\u0061\u0073\u0073\u0077\u006f\u0072\u006b\u005c\u005c\u0061\u0073\u0073\u0069\u0067\u006e\u0034\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1649745661545L,8589935092L,122,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public class Node {
        int key;
        int height;
        Node left;
        Node right;

        Node(int key) {try{__CLR4_1_200l1vryzfo.R.inc(0);
            __CLR4_1_200l1vryzfo.R.inc(1);this.key = key;
        }finally{__CLR4_1_200l1vryzfo.R.flushNeeded();}}
    }

    private Node root;

    public Node find(int key) {try{__CLR4_1_200l1vryzfo.R.inc(2);
        __CLR4_1_200l1vryzfo.R.inc(3);Node current = root;
        __CLR4_1_200l1vryzfo.R.inc(4);while ((((current != null)&&(__CLR4_1_200l1vryzfo.R.iget(5)!=0|true))||(__CLR4_1_200l1vryzfo.R.iget(6)==0&false))) {{
            __CLR4_1_200l1vryzfo.R.inc(7);if ((((current.key == key)&&(__CLR4_1_200l1vryzfo.R.iget(8)!=0|true))||(__CLR4_1_200l1vryzfo.R.iget(9)==0&false))) {{
                __CLR4_1_200l1vryzfo.R.inc(10);break;
            }
            }__CLR4_1_200l1vryzfo.R.inc(11);current = (((current.key < key )&&(__CLR4_1_200l1vryzfo.R.iget(12)!=0|true))||(__CLR4_1_200l1vryzfo.R.iget(13)==0&false))? current.right : current.left;
        }
        }__CLR4_1_200l1vryzfo.R.inc(14);return current;
    }finally{__CLR4_1_200l1vryzfo.R.flushNeeded();}}

    public void insert(int key) {try{__CLR4_1_200l1vryzfo.R.inc(15);
        __CLR4_1_200l1vryzfo.R.inc(16);root = insert(root, key);
    }finally{__CLR4_1_200l1vryzfo.R.flushNeeded();}}

    public void delete(int key) {try{__CLR4_1_200l1vryzfo.R.inc(17);
        __CLR4_1_200l1vryzfo.R.inc(18);root = delete(root, key);
    }finally{__CLR4_1_200l1vryzfo.R.flushNeeded();}}

    public Node getRoot() {try{__CLR4_1_200l1vryzfo.R.inc(19);
        __CLR4_1_200l1vryzfo.R.inc(20);return root;
    }finally{__CLR4_1_200l1vryzfo.R.flushNeeded();}}

    public int height() {try{__CLR4_1_200l1vryzfo.R.inc(21);
        __CLR4_1_200l1vryzfo.R.inc(22);return (((root == null )&&(__CLR4_1_200l1vryzfo.R.iget(23)!=0|true))||(__CLR4_1_200l1vryzfo.R.iget(24)==0&false))? -1 : root.height;
    }finally{__CLR4_1_200l1vryzfo.R.flushNeeded();}}

    private Node insert(Node node, int key) {try{__CLR4_1_200l1vryzfo.R.inc(25);
        __CLR4_1_200l1vryzfo.R.inc(26);if ((((node == null)&&(__CLR4_1_200l1vryzfo.R.iget(27)!=0|true))||(__CLR4_1_200l1vryzfo.R.iget(28)==0&false))) {{
            __CLR4_1_200l1vryzfo.R.inc(29);return new Node(key);
        } }else {__CLR4_1_200l1vryzfo.R.inc(30);if ((((node.key > key)&&(__CLR4_1_200l1vryzfo.R.iget(31)!=0|true))||(__CLR4_1_200l1vryzfo.R.iget(32)==0&false))) {{
            __CLR4_1_200l1vryzfo.R.inc(33);node.left = insert(node.left, key);
        } }else {__CLR4_1_200l1vryzfo.R.inc(34);if ((((node.key < key)&&(__CLR4_1_200l1vryzfo.R.iget(35)!=0|true))||(__CLR4_1_200l1vryzfo.R.iget(36)==0&false))) {{
            __CLR4_1_200l1vryzfo.R.inc(37);node.right = insert(node.right, key);
        } }else {{
            __CLR4_1_200l1vryzfo.R.inc(38);throw new RuntimeException("duplicate Key!");
        }
        }}}__CLR4_1_200l1vryzfo.R.inc(39);return rebalance(node);
    }finally{__CLR4_1_200l1vryzfo.R.flushNeeded();}}

    private Node delete(Node node, int key) {try{__CLR4_1_200l1vryzfo.R.inc(40);
        __CLR4_1_200l1vryzfo.R.inc(41);if ((((node == null)&&(__CLR4_1_200l1vryzfo.R.iget(42)!=0|true))||(__CLR4_1_200l1vryzfo.R.iget(43)==0&false))) {{
            __CLR4_1_200l1vryzfo.R.inc(44);return node;
        } }else {__CLR4_1_200l1vryzfo.R.inc(45);if ((((node.key > key)&&(__CLR4_1_200l1vryzfo.R.iget(46)!=0|true))||(__CLR4_1_200l1vryzfo.R.iget(47)==0&false))) {{
            __CLR4_1_200l1vryzfo.R.inc(48);node.left = delete(node.left, key);
        } }else {__CLR4_1_200l1vryzfo.R.inc(49);if ((((node.key < key)&&(__CLR4_1_200l1vryzfo.R.iget(50)!=0|true))||(__CLR4_1_200l1vryzfo.R.iget(51)==0&false))) {{
            __CLR4_1_200l1vryzfo.R.inc(52);node.right = delete(node.right, key);
        } }else {{
            __CLR4_1_200l1vryzfo.R.inc(53);if ((((node.left == null)&&(__CLR4_1_200l1vryzfo.R.iget(54)!=0|true))||(__CLR4_1_200l1vryzfo.R.iget(55)==0&false))) {{
                __CLR4_1_200l1vryzfo.R.inc(56);node = ((((node.left == null) )&&(__CLR4_1_200l1vryzfo.R.iget(57)!=0|true))||(__CLR4_1_200l1vryzfo.R.iget(58)==0&false))? node.right : node.left;
            } }else {{
                __CLR4_1_200l1vryzfo.R.inc(59);Node mostLeftChild = mostLeftChild(node.right);
                __CLR4_1_200l1vryzfo.R.inc(60);node.key = mostLeftChild.key;
                __CLR4_1_200l1vryzfo.R.inc(61);node.right = delete(node.right, node.key);
            }
        }}
        }}}__CLR4_1_200l1vryzfo.R.inc(62);if ((((node != null)&&(__CLR4_1_200l1vryzfo.R.iget(63)!=0|true))||(__CLR4_1_200l1vryzfo.R.iget(64)==0&false))) {{
            __CLR4_1_200l1vryzfo.R.inc(65);node = rebalance(node);
        }
        }__CLR4_1_200l1vryzfo.R.inc(66);return node;
    }finally{__CLR4_1_200l1vryzfo.R.flushNeeded();}}

    private Node mostLeftChild(Node node) {try{__CLR4_1_200l1vryzfo.R.inc(67);
        __CLR4_1_200l1vryzfo.R.inc(68);Node current = node;
        /* loop down to find the leftmost leaf */
        __CLR4_1_200l1vryzfo.R.inc(69);while ((((current.left != null)&&(__CLR4_1_200l1vryzfo.R.iget(70)!=0|true))||(__CLR4_1_200l1vryzfo.R.iget(71)==0&false))) {{
            __CLR4_1_200l1vryzfo.R.inc(72);current = current.left;
        }
        }__CLR4_1_200l1vryzfo.R.inc(73);return current;
    }finally{__CLR4_1_200l1vryzfo.R.flushNeeded();}}

    private Node rebalance(Node z) {try{__CLR4_1_200l1vryzfo.R.inc(74);
        __CLR4_1_200l1vryzfo.R.inc(75);updateHeight(z);
        __CLR4_1_200l1vryzfo.R.inc(76);int balance = getBalance(z);
        __CLR4_1_200l1vryzfo.R.inc(77);if ((((balance > 1)&&(__CLR4_1_200l1vryzfo.R.iget(78)!=0|true))||(__CLR4_1_200l1vryzfo.R.iget(79)==0&false))) {{
            __CLR4_1_200l1vryzfo.R.inc(80);if ((((height(z.right.right) > height(z.right.left))&&(__CLR4_1_200l1vryzfo.R.iget(81)!=0|true))||(__CLR4_1_200l1vryzfo.R.iget(82)==0&false))) {{
                __CLR4_1_200l1vryzfo.R.inc(83);z = rotateLeft(z);
            } }else {{
                __CLR4_1_200l1vryzfo.R.inc(84);z.right = rotateRight(z.right);
                __CLR4_1_200l1vryzfo.R.inc(85);z = rotateLeft(z);
            }
        }} }else {__CLR4_1_200l1vryzfo.R.inc(86);if ((((balance < -1)&&(__CLR4_1_200l1vryzfo.R.iget(87)!=0|true))||(__CLR4_1_200l1vryzfo.R.iget(88)==0&false))) {{
            __CLR4_1_200l1vryzfo.R.inc(89);if ((((height(z.left.left) > height(z.left.right))&&(__CLR4_1_200l1vryzfo.R.iget(90)!=0|true))||(__CLR4_1_200l1vryzfo.R.iget(91)==0&false))) {{
                __CLR4_1_200l1vryzfo.R.inc(92);z = rotateRight(z);
            } }else {{
                __CLR4_1_200l1vryzfo.R.inc(93);z.left = rotateLeft(z.left);
                __CLR4_1_200l1vryzfo.R.inc(94);z = rotateRight(z);
            }
        }}
        }}__CLR4_1_200l1vryzfo.R.inc(95);return z;
    }finally{__CLR4_1_200l1vryzfo.R.flushNeeded();}}

    private Node rotateRight(Node y) {try{__CLR4_1_200l1vryzfo.R.inc(96);
        __CLR4_1_200l1vryzfo.R.inc(97);Node x = y.left;
        __CLR4_1_200l1vryzfo.R.inc(98);Node z = x.right;
        __CLR4_1_200l1vryzfo.R.inc(99);x.right = y;
        __CLR4_1_200l1vryzfo.R.inc(100);y.left = z;
        __CLR4_1_200l1vryzfo.R.inc(101);updateHeight(y);
        __CLR4_1_200l1vryzfo.R.inc(102);updateHeight(x);
        __CLR4_1_200l1vryzfo.R.inc(103);return x;
    }finally{__CLR4_1_200l1vryzfo.R.flushNeeded();}}

    private Node rotateLeft(Node y) {try{__CLR4_1_200l1vryzfo.R.inc(104);
        __CLR4_1_200l1vryzfo.R.inc(105);Node x = y.right;
        __CLR4_1_200l1vryzfo.R.inc(106);Node z = x.left;
        __CLR4_1_200l1vryzfo.R.inc(107);x.left = y;
        __CLR4_1_200l1vryzfo.R.inc(108);y.right = z;
        __CLR4_1_200l1vryzfo.R.inc(109);updateHeight(y);
        __CLR4_1_200l1vryzfo.R.inc(110);updateHeight(x);
        __CLR4_1_200l1vryzfo.R.inc(111);return x;
    }finally{__CLR4_1_200l1vryzfo.R.flushNeeded();}}

    private void updateHeight(Node n) {try{__CLR4_1_200l1vryzfo.R.inc(112);
        __CLR4_1_200l1vryzfo.R.inc(113);n.height = 1 + Math.max(height(n.left), height(n.right));
    }finally{__CLR4_1_200l1vryzfo.R.flushNeeded();}}

    private int height(Node n) {try{__CLR4_1_200l1vryzfo.R.inc(114);
        __CLR4_1_200l1vryzfo.R.inc(115);return (((n == null )&&(__CLR4_1_200l1vryzfo.R.iget(116)!=0|true))||(__CLR4_1_200l1vryzfo.R.iget(117)==0&false))? -1 : n.height;
    }finally{__CLR4_1_200l1vryzfo.R.flushNeeded();}}

    public int getBalance(Node n) {try{__CLR4_1_200l1vryzfo.R.inc(118);
        __CLR4_1_200l1vryzfo.R.inc(119);return ((((n == null) )&&(__CLR4_1_200l1vryzfo.R.iget(120)!=0|true))||(__CLR4_1_200l1vryzfo.R.iget(121)==0&false))? 0 : height(n.right) - height(n.left);
    }finally{__CLR4_1_200l1vryzfo.R.flushNeeded();}}
}
