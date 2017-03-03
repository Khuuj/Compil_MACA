// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g 2017-03-03 16:03:27

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;

import org.antlr.runtime.tree.*;

public class ExprParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ROOT", "DEC_CLASS", "DEC_VAR", "AFFECT", "RETURN", "FOR", "IF", "BLOC", "BODY", "METHOD", "ARGS", "PARAMS", "OPPOSE", "APPELMETHODE", "PARAM", "NEW", "ID_CLASS", "ID_OTHERS", "STRING", "OPERMULT", "OPERCONDITION", "INT", "COMMENTS", "NEWLINE", "WS", "'class'", "'inherit'", "'='", "'('", "')'", "'var'", "':'", "';'", "'int'", "'string'", "'method'", "'{'", "'}'", "','", "':='", "'if'", "'then'", "'else'", "'fi'", "'for'", "'in'", "'do'", "'end'", "'..'", "'nil'", "'write'", "'read'", "'return'", "'this'", "'super'", "'new'", "'.'", "'+'", "'-'"
    };
    public static final int BLOC=11;
    public static final int NEW=19;
    public static final int T__50=50;
    public static final int APPELMETHODE=17;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int IF=10;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int NEWLINE=27;
    public static final int FOR=9;
    public static final int OPPOSE=16;
    public static final int DEC_CLASS=5;
    public static final int OPERMULT=23;
    public static final int OPERCONDITION=24;
    public static final int T__29=29;
    public static final int METHOD=13;
    public static final int PARAMS=15;
    public static final int T__62=62;
    public static final int BODY=12;
    public static final int ARGS=14;
    public static final int ROOT=4;
    public static final int COMMENTS=26;
    public static final int INT=25;
    public static final int RETURN=8;
    public static final int T__37=37;
    public static final int ID_OTHERS=21;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int WS=28;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int DEC_VAR=6;
    public static final int PARAM=18;
    public static final int AFFECT=7;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int ID_CLASS=20;
    public static final int STRING=22;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "instr", "boundaries", "read", "atom", "type", "moinsunaire", 
        "class_decl", "exprplus", "print", "exprmult", "m", "class_item_decl", 
        "method_decl", "retourne", "e", "method_params", "f", "var_decl", 
        "i", "oper", "prog", "params", "expr"
    };
     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public ExprParser(TokenStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public ExprParser(TokenStream input, int port, RecognizerSharedState state) {
            super(input, state);
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this,port,adaptor);
            setDebugListener(proxy);
            setTokenStream(new DebugTokenStream(input,proxy));
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }
            TreeAdaptor adap = new CommonTreeAdaptor();
            setTreeAdaptor(adap);
            proxy.setTreeAdaptor(adap);
        }
    public ExprParser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg);

         
        TreeAdaptor adap = new CommonTreeAdaptor();
        setTreeAdaptor(adap);

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }

    protected DebugTreeAdaptor adaptor;
    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = new DebugTreeAdaptor(dbg,adaptor);

    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }


    public String[] getTokenNames() { return ExprParser.tokenNames; }
    public String getGrammarFileName() { return "/home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prog"
    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:27:1: prog : ( class_decl )* ( var_decl )* ( instr )+ -> ^( ROOT ( class_decl )* ( var_decl )* ( instr )+ ) ;
    public final ExprParser.prog_return prog() throws RecognitionException {
        ExprParser.prog_return retval = new ExprParser.prog_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ExprParser.class_decl_return class_decl1 = null;

        ExprParser.var_decl_return var_decl2 = null;

        ExprParser.instr_return instr3 = null;


        RewriteRuleSubtreeStream stream_instr=new RewriteRuleSubtreeStream(adaptor,"rule instr");
        RewriteRuleSubtreeStream stream_class_decl=new RewriteRuleSubtreeStream(adaptor,"rule class_decl");
        RewriteRuleSubtreeStream stream_var_decl=new RewriteRuleSubtreeStream(adaptor,"rule var_decl");
        try { dbg.enterRule(getGrammarFileName(), "prog");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(27, 1);

        try {
            // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:27:6: ( ( class_decl )* ( var_decl )* ( instr )+ -> ^( ROOT ( class_decl )* ( var_decl )* ( instr )+ ) )
            dbg.enterAlt(1);

            // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:28:2: ( class_decl )* ( var_decl )* ( instr )+
            {
            dbg.location(28,2);
            // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:28:2: ( class_decl )*
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==29) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:28:2: class_decl
            	    {
            	    dbg.location(28,2);
            	    pushFollow(FOLLOW_class_decl_in_prog85);
            	    class_decl1=class_decl();

            	    state._fsp--;

            	    stream_class_decl.add(class_decl1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);
            } finally {dbg.exitSubRule(1);}

            dbg.location(28,14);
            // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:28:14: ( var_decl )*
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=2;
                try { dbg.enterDecision(2);

                int LA2_0 = input.LA(1);

                if ( (LA2_0==34) ) {
                    alt2=1;
                }


                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:28:14: var_decl
            	    {
            	    dbg.location(28,14);
            	    pushFollow(FOLLOW_var_decl_in_prog88);
            	    var_decl2=var_decl();

            	    state._fsp--;

            	    stream_var_decl.add(var_decl2.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);
            } finally {dbg.exitSubRule(2);}

            dbg.location(28,24);
            // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:28:24: ( instr )+
            int cnt3=0;
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=2;
                try { dbg.enterDecision(3);

                int LA3_0 = input.LA(1);

                if ( (LA3_0==ID_OTHERS||LA3_0==40||LA3_0==44||LA3_0==48||LA3_0==50||(LA3_0>=54 && LA3_0<=56)) ) {
                    alt3=1;
                }


                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:28:24: instr
            	    {
            	    dbg.location(28,24);
            	    pushFollow(FOLLOW_instr_in_prog91);
            	    instr3=instr();

            	    state._fsp--;

            	    stream_instr.add(instr3.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt3++;
            } while (true);
            } finally {dbg.exitSubRule(3);}



            // AST REWRITE
            // elements: class_decl, var_decl, instr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 28:31: -> ^( ROOT ( class_decl )* ( var_decl )* ( instr )+ )
            {
                dbg.location(28,34);
                // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:28:34: ^( ROOT ( class_decl )* ( var_decl )* ( instr )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(28,36);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ROOT, "ROOT"), root_1);

                dbg.location(28,41);
                // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:28:41: ( class_decl )*
                while ( stream_class_decl.hasNext() ) {
                    dbg.location(28,41);
                    adaptor.addChild(root_1, stream_class_decl.nextTree());

                }
                stream_class_decl.reset();
                dbg.location(28,53);
                // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:28:53: ( var_decl )*
                while ( stream_var_decl.hasNext() ) {
                    dbg.location(28,53);
                    adaptor.addChild(root_1, stream_var_decl.nextTree());

                }
                stream_var_decl.reset();
                dbg.location(28,63);
                if ( !(stream_instr.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_instr.hasNext() ) {
                    dbg.location(28,63);
                    adaptor.addChild(root_1, stream_instr.nextTree());

                }
                stream_instr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(29, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "prog");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "prog"

    public static class class_decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "class_decl"
    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:32:1: class_decl : 'class' a= ID_CLASS ( 'inherit' b= ID_CLASS )? '=' '(' class_item_decl ')' -> ^( DEC_CLASS $a ( $b)? ( class_item_decl )? ) ;
    public final ExprParser.class_decl_return class_decl() throws RecognitionException {
        ExprParser.class_decl_return retval = new ExprParser.class_decl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token a=null;
        Token b=null;
        Token string_literal4=null;
        Token string_literal5=null;
        Token char_literal6=null;
        Token char_literal7=null;
        Token char_literal9=null;
        ExprParser.class_item_decl_return class_item_decl8 = null;


        Object a_tree=null;
        Object b_tree=null;
        Object string_literal4_tree=null;
        Object string_literal5_tree=null;
        Object char_literal6_tree=null;
        Object char_literal7_tree=null;
        Object char_literal9_tree=null;
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleTokenStream stream_ID_CLASS=new RewriteRuleTokenStream(adaptor,"token ID_CLASS");
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleSubtreeStream stream_class_item_decl=new RewriteRuleSubtreeStream(adaptor,"rule class_item_decl");
        try { dbg.enterRule(getGrammarFileName(), "class_decl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(32, 1);

        try {
            // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:32:12: ( 'class' a= ID_CLASS ( 'inherit' b= ID_CLASS )? '=' '(' class_item_decl ')' -> ^( DEC_CLASS $a ( $b)? ( class_item_decl )? ) )
            dbg.enterAlt(1);

            // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:33:3: 'class' a= ID_CLASS ( 'inherit' b= ID_CLASS )? '=' '(' class_item_decl ')'
            {
            dbg.location(33,3);
            string_literal4=(Token)match(input,29,FOLLOW_29_in_class_decl120);  
            stream_29.add(string_literal4);

            dbg.location(33,12);
            a=(Token)match(input,ID_CLASS,FOLLOW_ID_CLASS_in_class_decl124);  
            stream_ID_CLASS.add(a);

            dbg.location(33,22);
            // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:33:22: ( 'inherit' b= ID_CLASS )?
            int alt4=2;
            try { dbg.enterSubRule(4);
            try { dbg.enterDecision(4);

            int LA4_0 = input.LA(1);

            if ( (LA4_0==30) ) {
                alt4=1;
            }
            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:33:23: 'inherit' b= ID_CLASS
                    {
                    dbg.location(33,23);
                    string_literal5=(Token)match(input,30,FOLLOW_30_in_class_decl127);  
                    stream_30.add(string_literal5);

                    dbg.location(33,34);
                    b=(Token)match(input,ID_CLASS,FOLLOW_ID_CLASS_in_class_decl131);  
                    stream_ID_CLASS.add(b);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(4);}

            dbg.location(33,46);
            char_literal6=(Token)match(input,31,FOLLOW_31_in_class_decl135);  
            stream_31.add(char_literal6);

            dbg.location(33,50);
            char_literal7=(Token)match(input,32,FOLLOW_32_in_class_decl137);  
            stream_32.add(char_literal7);

            dbg.location(33,54);
            pushFollow(FOLLOW_class_item_decl_in_class_decl139);
            class_item_decl8=class_item_decl();

            state._fsp--;

            stream_class_item_decl.add(class_item_decl8.getTree());
            dbg.location(33,70);
            char_literal9=(Token)match(input,33,FOLLOW_33_in_class_decl141);  
            stream_33.add(char_literal9);



            // AST REWRITE
            // elements: a, b, class_item_decl
            // token labels: a, b
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_a=new RewriteRuleTokenStream(adaptor,"token a",a);
            RewriteRuleTokenStream stream_b=new RewriteRuleTokenStream(adaptor,"token b",b);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 33:74: -> ^( DEC_CLASS $a ( $b)? ( class_item_decl )? )
            {
                dbg.location(33,76);
                // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:33:76: ^( DEC_CLASS $a ( $b)? ( class_item_decl )? )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(33,78);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEC_CLASS, "DEC_CLASS"), root_1);

                dbg.location(33,88);
                adaptor.addChild(root_1, stream_a.nextNode());
                dbg.location(33,91);
                // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:33:91: ( $b)?
                if ( stream_b.hasNext() ) {
                    dbg.location(33,92);
                    adaptor.addChild(root_1, stream_b.nextNode());

                }
                stream_b.reset();
                dbg.location(33,97);
                // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:33:97: ( class_item_decl )?
                if ( stream_class_item_decl.hasNext() ) {
                    dbg.location(33,97);
                    adaptor.addChild(root_1, stream_class_item_decl.nextTree());

                }
                stream_class_item_decl.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(34, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "class_decl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "class_decl"

    public static class class_item_decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "class_item_decl"
    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:36:1: class_item_decl : ( var_decl )* ( method_decl )* ;
    public final ExprParser.class_item_decl_return class_item_decl() throws RecognitionException {
        ExprParser.class_item_decl_return retval = new ExprParser.class_item_decl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ExprParser.var_decl_return var_decl10 = null;

        ExprParser.method_decl_return method_decl11 = null;



        try { dbg.enterRule(getGrammarFileName(), "class_item_decl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(36, 1);

        try {
            // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:36:17: ( ( var_decl )* ( method_decl )* )
            dbg.enterAlt(1);

            // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:37:2: ( var_decl )* ( method_decl )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(37,2);
            // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:37:2: ( var_decl )*
            try { dbg.enterSubRule(5);

            loop5:
            do {
                int alt5=2;
                try { dbg.enterDecision(5);

                int LA5_0 = input.LA(1);

                if ( (LA5_0==34) ) {
                    alt5=1;
                }


                } finally {dbg.exitDecision(5);}

                switch (alt5) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:37:2: var_decl
            	    {
            	    dbg.location(37,2);
            	    pushFollow(FOLLOW_var_decl_in_class_item_decl171);
            	    var_decl10=var_decl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, var_decl10.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);
            } finally {dbg.exitSubRule(5);}

            dbg.location(37,12);
            // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:37:12: ( method_decl )*
            try { dbg.enterSubRule(6);

            loop6:
            do {
                int alt6=2;
                try { dbg.enterDecision(6);

                int LA6_0 = input.LA(1);

                if ( (LA6_0==39) ) {
                    alt6=1;
                }


                } finally {dbg.exitDecision(6);}

                switch (alt6) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:37:12: method_decl
            	    {
            	    dbg.location(37,12);
            	    pushFollow(FOLLOW_method_decl_in_class_item_decl174);
            	    method_decl11=method_decl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, method_decl11.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);
            } finally {dbg.exitSubRule(6);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(38, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "class_item_decl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "class_item_decl"

    public static class var_decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "var_decl"
    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:40:1: var_decl : 'var' ID_OTHERS ':' type ';' -> ^( DEC_VAR ID_OTHERS type ) ;
    public final ExprParser.var_decl_return var_decl() throws RecognitionException {
        ExprParser.var_decl_return retval = new ExprParser.var_decl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal12=null;
        Token ID_OTHERS13=null;
        Token char_literal14=null;
        Token char_literal16=null;
        ExprParser.type_return type15 = null;


        Object string_literal12_tree=null;
        Object ID_OTHERS13_tree=null;
        Object char_literal14_tree=null;
        Object char_literal16_tree=null;
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_ID_OTHERS=new RewriteRuleTokenStream(adaptor,"token ID_OTHERS");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try { dbg.enterRule(getGrammarFileName(), "var_decl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(40, 1);

        try {
            // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:40:10: ( 'var' ID_OTHERS ':' type ';' -> ^( DEC_VAR ID_OTHERS type ) )
            dbg.enterAlt(1);

            // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:41:2: 'var' ID_OTHERS ':' type ';'
            {
            dbg.location(41,2);
            string_literal12=(Token)match(input,34,FOLLOW_34_in_var_decl187);  
            stream_34.add(string_literal12);

            dbg.location(41,8);
            ID_OTHERS13=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_var_decl189);  
            stream_ID_OTHERS.add(ID_OTHERS13);

            dbg.location(41,18);
            char_literal14=(Token)match(input,35,FOLLOW_35_in_var_decl191);  
            stream_35.add(char_literal14);

            dbg.location(41,22);
            pushFollow(FOLLOW_type_in_var_decl193);
            type15=type();

            state._fsp--;

            stream_type.add(type15.getTree());
            dbg.location(41,27);
            char_literal16=(Token)match(input,36,FOLLOW_36_in_var_decl195);  
            stream_36.add(char_literal16);



            // AST REWRITE
            // elements: ID_OTHERS, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 41:31: -> ^( DEC_VAR ID_OTHERS type )
            {
                dbg.location(41,33);
                // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:41:33: ^( DEC_VAR ID_OTHERS type )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(41,35);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEC_VAR, "DEC_VAR"), root_1);

                dbg.location(41,43);
                adaptor.addChild(root_1, stream_ID_OTHERS.nextNode());
                dbg.location(41,53);
                adaptor.addChild(root_1, stream_type.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(42, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "var_decl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "var_decl"

    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:45:1: type : ( ID_CLASS | 'int' | 'string' );
    public final ExprParser.type_return type() throws RecognitionException {
        ExprParser.type_return retval = new ExprParser.type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set17=null;

        Object set17_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "type");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(45, 1);

        try {
            // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:45:6: ( ID_CLASS | 'int' | 'string' )
            dbg.enterAlt(1);

            // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(45,6);
            set17=(Token)input.LT(1);
            if ( input.LA(1)==ID_CLASS||(input.LA(1)>=37 && input.LA(1)<=38) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set17));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(49, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "type");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "type"

    public static class method_decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "method_decl"
    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:51:1: method_decl : 'method' ID_OTHERS '(' ( method_params )? ')' m -> ^( METHOD ID_OTHERS ( method_params )? m ) ;
    public final ExprParser.method_decl_return method_decl() throws RecognitionException {
        ExprParser.method_decl_return retval = new ExprParser.method_decl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal18=null;
        Token ID_OTHERS19=null;
        Token char_literal20=null;
        Token char_literal22=null;
        ExprParser.method_params_return method_params21 = null;

        ExprParser.m_return m23 = null;


        Object string_literal18_tree=null;
        Object ID_OTHERS19_tree=null;
        Object char_literal20_tree=null;
        Object char_literal22_tree=null;
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_ID_OTHERS=new RewriteRuleTokenStream(adaptor,"token ID_OTHERS");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleSubtreeStream stream_method_params=new RewriteRuleSubtreeStream(adaptor,"rule method_params");
        RewriteRuleSubtreeStream stream_m=new RewriteRuleSubtreeStream(adaptor,"rule m");
        try { dbg.enterRule(getGrammarFileName(), "method_decl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(51, 1);

        try {
            // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:51:13: ( 'method' ID_OTHERS '(' ( method_params )? ')' m -> ^( METHOD ID_OTHERS ( method_params )? m ) )
            dbg.enterAlt(1);

            // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:52:2: 'method' ID_OTHERS '(' ( method_params )? ')' m
            {
            dbg.location(52,2);
            string_literal18=(Token)match(input,39,FOLLOW_39_in_method_decl239);  
            stream_39.add(string_literal18);

            dbg.location(52,11);
            ID_OTHERS19=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_method_decl241);  
            stream_ID_OTHERS.add(ID_OTHERS19);

            dbg.location(52,21);
            char_literal20=(Token)match(input,32,FOLLOW_32_in_method_decl243);  
            stream_32.add(char_literal20);

            dbg.location(52,26);
            // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:52:26: ( method_params )?
            int alt7=2;
            try { dbg.enterSubRule(7);
            try { dbg.enterDecision(7);

            int LA7_0 = input.LA(1);

            if ( (LA7_0==ID_OTHERS) ) {
                alt7=1;
            }
            } finally {dbg.exitDecision(7);}

            switch (alt7) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:52:26: method_params
                    {
                    dbg.location(52,26);
                    pushFollow(FOLLOW_method_params_in_method_decl246);
                    method_params21=method_params();

                    state._fsp--;

                    stream_method_params.add(method_params21.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(7);}

            dbg.location(52,41);
            char_literal22=(Token)match(input,33,FOLLOW_33_in_method_decl249);  
            stream_33.add(char_literal22);

            dbg.location(52,45);
            pushFollow(FOLLOW_m_in_method_decl251);
            m23=m();

            state._fsp--;

            stream_m.add(m23.getTree());


            // AST REWRITE
            // elements: m, ID_OTHERS, method_params
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 52:47: -> ^( METHOD ID_OTHERS ( method_params )? m )
            {
                dbg.location(52,50);
                // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:52:50: ^( METHOD ID_OTHERS ( method_params )? m )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(52,52);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHOD, "METHOD"), root_1);

                dbg.location(52,59);
                adaptor.addChild(root_1, stream_ID_OTHERS.nextNode());
                dbg.location(52,71);
                // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:52:71: ( method_params )?
                if ( stream_method_params.hasNext() ) {
                    dbg.location(52,71);
                    adaptor.addChild(root_1, stream_method_params.nextTree());

                }
                stream_method_params.reset();
                dbg.location(52,87);
                adaptor.addChild(root_1, stream_m.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(53, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "method_decl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "method_decl"

    public static class m_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "m"
    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:55:1: m : ( '{' ( var_decl )* ( instr )+ '}' -> ^( BODY ( var_decl )* ( instr )+ ) | ':' type '{' ( var_decl )* ( instr )+ '}' -> type ^( BODY ( var_decl )* ( instr )+ ) );
    public final ExprParser.m_return m() throws RecognitionException {
        ExprParser.m_return retval = new ExprParser.m_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal24=null;
        Token char_literal27=null;
        Token char_literal28=null;
        Token char_literal30=null;
        Token char_literal33=null;
        ExprParser.var_decl_return var_decl25 = null;

        ExprParser.instr_return instr26 = null;

        ExprParser.type_return type29 = null;

        ExprParser.var_decl_return var_decl31 = null;

        ExprParser.instr_return instr32 = null;


        Object char_literal24_tree=null;
        Object char_literal27_tree=null;
        Object char_literal28_tree=null;
        Object char_literal30_tree=null;
        Object char_literal33_tree=null;
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleSubtreeStream stream_instr=new RewriteRuleSubtreeStream(adaptor,"rule instr");
        RewriteRuleSubtreeStream stream_var_decl=new RewriteRuleSubtreeStream(adaptor,"rule var_decl");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try { dbg.enterRule(getGrammarFileName(), "m");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(55, 1);

        try {
            // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:55:4: ( '{' ( var_decl )* ( instr )+ '}' -> ^( BODY ( var_decl )* ( instr )+ ) | ':' type '{' ( var_decl )* ( instr )+ '}' -> type ^( BODY ( var_decl )* ( instr )+ ) )
            int alt12=2;
            try { dbg.enterDecision(12);

            int LA12_0 = input.LA(1);

            if ( (LA12_0==40) ) {
                alt12=1;
            }
            else if ( (LA12_0==35) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(12);}

            switch (alt12) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:56:2: '{' ( var_decl )* ( instr )+ '}'
                    {
                    dbg.location(56,2);
                    char_literal24=(Token)match(input,40,FOLLOW_40_in_m280);  
                    stream_40.add(char_literal24);

                    dbg.location(56,6);
                    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:56:6: ( var_decl )*
                    try { dbg.enterSubRule(8);

                    loop8:
                    do {
                        int alt8=2;
                        try { dbg.enterDecision(8);

                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==34) ) {
                            alt8=1;
                        }


                        } finally {dbg.exitDecision(8);}

                        switch (alt8) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:56:6: var_decl
                    	    {
                    	    dbg.location(56,6);
                    	    pushFollow(FOLLOW_var_decl_in_m282);
                    	    var_decl25=var_decl();

                    	    state._fsp--;

                    	    stream_var_decl.add(var_decl25.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(8);}

                    dbg.location(56,16);
                    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:56:16: ( instr )+
                    int cnt9=0;
                    try { dbg.enterSubRule(9);

                    loop9:
                    do {
                        int alt9=2;
                        try { dbg.enterDecision(9);

                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==ID_OTHERS||LA9_0==40||LA9_0==44||LA9_0==48||LA9_0==50||(LA9_0>=54 && LA9_0<=56)) ) {
                            alt9=1;
                        }


                        } finally {dbg.exitDecision(9);}

                        switch (alt9) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:56:16: instr
                    	    {
                    	    dbg.location(56,16);
                    	    pushFollow(FOLLOW_instr_in_m285);
                    	    instr26=instr();

                    	    state._fsp--;

                    	    stream_instr.add(instr26.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt9++;
                    } while (true);
                    } finally {dbg.exitSubRule(9);}

                    dbg.location(56,23);
                    char_literal27=(Token)match(input,41,FOLLOW_41_in_m288);  
                    stream_41.add(char_literal27);



                    // AST REWRITE
                    // elements: instr, var_decl
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 56:27: -> ^( BODY ( var_decl )* ( instr )+ )
                    {
                        dbg.location(56,29);
                        // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:56:29: ^( BODY ( var_decl )* ( instr )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(56,31);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_1);

                        dbg.location(56,37);
                        // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:56:37: ( var_decl )*
                        while ( stream_var_decl.hasNext() ) {
                            dbg.location(56,37);
                            adaptor.addChild(root_1, stream_var_decl.nextTree());

                        }
                        stream_var_decl.reset();
                        dbg.location(56,47);
                        if ( !(stream_instr.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_instr.hasNext() ) {
                            dbg.location(56,47);
                            adaptor.addChild(root_1, stream_instr.nextTree());

                        }
                        stream_instr.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:57:4: ':' type '{' ( var_decl )* ( instr )+ '}'
                    {
                    dbg.location(57,4);
                    char_literal28=(Token)match(input,35,FOLLOW_35_in_m306);  
                    stream_35.add(char_literal28);

                    dbg.location(57,8);
                    pushFollow(FOLLOW_type_in_m308);
                    type29=type();

                    state._fsp--;

                    stream_type.add(type29.getTree());
                    dbg.location(57,13);
                    char_literal30=(Token)match(input,40,FOLLOW_40_in_m310);  
                    stream_40.add(char_literal30);

                    dbg.location(57,17);
                    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:57:17: ( var_decl )*
                    try { dbg.enterSubRule(10);

                    loop10:
                    do {
                        int alt10=2;
                        try { dbg.enterDecision(10);

                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==34) ) {
                            alt10=1;
                        }


                        } finally {dbg.exitDecision(10);}

                        switch (alt10) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:57:17: var_decl
                    	    {
                    	    dbg.location(57,17);
                    	    pushFollow(FOLLOW_var_decl_in_m312);
                    	    var_decl31=var_decl();

                    	    state._fsp--;

                    	    stream_var_decl.add(var_decl31.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(10);}

                    dbg.location(57,27);
                    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:57:27: ( instr )+
                    int cnt11=0;
                    try { dbg.enterSubRule(11);

                    loop11:
                    do {
                        int alt11=2;
                        try { dbg.enterDecision(11);

                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==ID_OTHERS||LA11_0==40||LA11_0==44||LA11_0==48||LA11_0==50||(LA11_0>=54 && LA11_0<=56)) ) {
                            alt11=1;
                        }


                        } finally {dbg.exitDecision(11);}

                        switch (alt11) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:57:27: instr
                    	    {
                    	    dbg.location(57,27);
                    	    pushFollow(FOLLOW_instr_in_m315);
                    	    instr32=instr();

                    	    state._fsp--;

                    	    stream_instr.add(instr32.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt11++;
                    } while (true);
                    } finally {dbg.exitSubRule(11);}

                    dbg.location(57,34);
                    char_literal33=(Token)match(input,41,FOLLOW_41_in_m318);  
                    stream_41.add(char_literal33);



                    // AST REWRITE
                    // elements: type, var_decl, instr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 57:38: -> type ^( BODY ( var_decl )* ( instr )+ )
                    {
                        dbg.location(57,41);
                        adaptor.addChild(root_0, stream_type.nextTree());
                        dbg.location(57,46);
                        // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:57:46: ^( BODY ( var_decl )* ( instr )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(57,48);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_1);

                        dbg.location(57,54);
                        // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:57:54: ( var_decl )*
                        while ( stream_var_decl.hasNext() ) {
                            dbg.location(57,54);
                            adaptor.addChild(root_1, stream_var_decl.nextTree());

                        }
                        stream_var_decl.reset();
                        dbg.location(57,64);
                        if ( !(stream_instr.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_instr.hasNext() ) {
                            dbg.location(57,64);
                            adaptor.addChild(root_1, stream_instr.nextTree());

                        }
                        stream_instr.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(58, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "m");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "m"

    public static class method_params_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "method_params"
    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:61:1: method_params : params -> ^( PARAMS params ) ;
    public final ExprParser.method_params_return method_params() throws RecognitionException {
        ExprParser.method_params_return retval = new ExprParser.method_params_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ExprParser.params_return params34 = null;


        RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
        try { dbg.enterRule(getGrammarFileName(), "method_params");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(61, 1);

        try {
            // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:61:15: ( params -> ^( PARAMS params ) )
            dbg.enterAlt(1);

            // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:62:2: params
            {
            dbg.location(62,2);
            pushFollow(FOLLOW_params_in_method_params347);
            params34=params();

            state._fsp--;

            stream_params.add(params34.getTree());


            // AST REWRITE
            // elements: params
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 62:9: -> ^( PARAMS params )
            {
                dbg.location(62,12);
                // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:62:12: ^( PARAMS params )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(62,14);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMS, "PARAMS"), root_1);

                dbg.location(62,21);
                adaptor.addChild(root_1, stream_params.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(63, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "method_params");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "method_params"

    public static class params_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "params"
    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:65:1: params : ID_OTHERS ':' type ( ',' ID_OTHERS ':' type )* -> ( ^( PARAM ID_OTHERS type ) )* ;
    public final ExprParser.params_return params() throws RecognitionException {
        ExprParser.params_return retval = new ExprParser.params_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID_OTHERS35=null;
        Token char_literal36=null;
        Token char_literal38=null;
        Token ID_OTHERS39=null;
        Token char_literal40=null;
        ExprParser.type_return type37 = null;

        ExprParser.type_return type41 = null;


        Object ID_OTHERS35_tree=null;
        Object char_literal36_tree=null;
        Object char_literal38_tree=null;
        Object ID_OTHERS39_tree=null;
        Object char_literal40_tree=null;
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_ID_OTHERS=new RewriteRuleTokenStream(adaptor,"token ID_OTHERS");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try { dbg.enterRule(getGrammarFileName(), "params");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(65, 1);

        try {
            // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:65:8: ( ID_OTHERS ':' type ( ',' ID_OTHERS ':' type )* -> ( ^( PARAM ID_OTHERS type ) )* )
            dbg.enterAlt(1);

            // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:66:2: ID_OTHERS ':' type ( ',' ID_OTHERS ':' type )*
            {
            dbg.location(66,2);
            ID_OTHERS35=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_params367);  
            stream_ID_OTHERS.add(ID_OTHERS35);

            dbg.location(66,12);
            char_literal36=(Token)match(input,35,FOLLOW_35_in_params369);  
            stream_35.add(char_literal36);

            dbg.location(66,17);
            pushFollow(FOLLOW_type_in_params372);
            type37=type();

            state._fsp--;

            stream_type.add(type37.getTree());
            dbg.location(66,22);
            // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:66:22: ( ',' ID_OTHERS ':' type )*
            try { dbg.enterSubRule(13);

            loop13:
            do {
                int alt13=2;
                try { dbg.enterDecision(13);

                int LA13_0 = input.LA(1);

                if ( (LA13_0==42) ) {
                    alt13=1;
                }


                } finally {dbg.exitDecision(13);}

                switch (alt13) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:66:23: ',' ID_OTHERS ':' type
            	    {
            	    dbg.location(66,23);
            	    char_literal38=(Token)match(input,42,FOLLOW_42_in_params375);  
            	    stream_42.add(char_literal38);

            	    dbg.location(66,27);
            	    ID_OTHERS39=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_params377);  
            	    stream_ID_OTHERS.add(ID_OTHERS39);

            	    dbg.location(66,37);
            	    char_literal40=(Token)match(input,35,FOLLOW_35_in_params379);  
            	    stream_35.add(char_literal40);

            	    dbg.location(66,41);
            	    pushFollow(FOLLOW_type_in_params381);
            	    type41=type();

            	    state._fsp--;

            	    stream_type.add(type41.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);
            } finally {dbg.exitSubRule(13);}



            // AST REWRITE
            // elements: ID_OTHERS, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 66:48: -> ( ^( PARAM ID_OTHERS type ) )*
            {
                dbg.location(66,51);
                // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:66:51: ( ^( PARAM ID_OTHERS type ) )*
                while ( stream_ID_OTHERS.hasNext()||stream_type.hasNext() ) {
                    dbg.location(66,51);
                    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:66:51: ^( PARAM ID_OTHERS type )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    dbg.location(66,53);
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAM, "PARAM"), root_1);

                    dbg.location(66,59);
                    adaptor.addChild(root_1, stream_ID_OTHERS.nextNode());
                    dbg.location(66,70);
                    adaptor.addChild(root_1, stream_type.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_ID_OTHERS.reset();
                stream_type.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(67, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "params");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "params"

    public static class instr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instr"
    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:70:1: instr : ( ID_OTHERS ':=' i | 'if' expr 'then' instr ( 'else' instr )? 'fi' -> ^( IF expr instr ( instr )? ) | 'for' ID_OTHERS 'in' boundaries 'do' ( instr )+ 'end' -> ^( FOR ID_OTHERS boundaries ( instr )+ ) | '{' ( var_decl )* ( instr )+ '}' -> ^( BLOC ( var_decl )* ( instr )+ ) | 'do' expr ';' -> ^( 'do' expr ) | print | read | retourne );
    public final ExprParser.instr_return instr() throws RecognitionException {
        ExprParser.instr_return retval = new ExprParser.instr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID_OTHERS42=null;
        Token string_literal43=null;
        Token string_literal45=null;
        Token string_literal47=null;
        Token string_literal49=null;
        Token string_literal51=null;
        Token string_literal52=null;
        Token ID_OTHERS53=null;
        Token string_literal54=null;
        Token string_literal56=null;
        Token string_literal58=null;
        Token char_literal59=null;
        Token char_literal62=null;
        Token string_literal63=null;
        Token char_literal65=null;
        ExprParser.i_return i44 = null;

        ExprParser.expr_return expr46 = null;

        ExprParser.instr_return instr48 = null;

        ExprParser.instr_return instr50 = null;

        ExprParser.boundaries_return boundaries55 = null;

        ExprParser.instr_return instr57 = null;

        ExprParser.var_decl_return var_decl60 = null;

        ExprParser.instr_return instr61 = null;

        ExprParser.expr_return expr64 = null;

        ExprParser.print_return print66 = null;

        ExprParser.read_return read67 = null;

        ExprParser.retourne_return retourne68 = null;


        Object ID_OTHERS42_tree=null;
        Object string_literal43_tree=null;
        Object string_literal45_tree=null;
        Object string_literal47_tree=null;
        Object string_literal49_tree=null;
        Object string_literal51_tree=null;
        Object string_literal52_tree=null;
        Object ID_OTHERS53_tree=null;
        Object string_literal54_tree=null;
        Object string_literal56_tree=null;
        Object string_literal58_tree=null;
        Object char_literal59_tree=null;
        Object char_literal62_tree=null;
        Object string_literal63_tree=null;
        Object char_literal65_tree=null;
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_ID_OTHERS=new RewriteRuleTokenStream(adaptor,"token ID_OTHERS");
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleSubtreeStream stream_instr=new RewriteRuleSubtreeStream(adaptor,"rule instr");
        RewriteRuleSubtreeStream stream_boundaries=new RewriteRuleSubtreeStream(adaptor,"rule boundaries");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_var_decl=new RewriteRuleSubtreeStream(adaptor,"rule var_decl");
        try { dbg.enterRule(getGrammarFileName(), "instr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(70, 1);

        try {
            // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:70:7: ( ID_OTHERS ':=' i | 'if' expr 'then' instr ( 'else' instr )? 'fi' -> ^( IF expr instr ( instr )? ) | 'for' ID_OTHERS 'in' boundaries 'do' ( instr )+ 'end' -> ^( FOR ID_OTHERS boundaries ( instr )+ ) | '{' ( var_decl )* ( instr )+ '}' -> ^( BLOC ( var_decl )* ( instr )+ ) | 'do' expr ';' -> ^( 'do' expr ) | print | read | retourne )
            int alt18=8;
            try { dbg.enterDecision(18);

            switch ( input.LA(1) ) {
            case ID_OTHERS:
                {
                alt18=1;
                }
                break;
            case 44:
                {
                alt18=2;
                }
                break;
            case 48:
                {
                alt18=3;
                }
                break;
            case 40:
                {
                alt18=4;
                }
                break;
            case 50:
                {
                alt18=5;
                }
                break;
            case 54:
                {
                alt18=6;
                }
                break;
            case 55:
                {
                alt18=7;
                }
                break;
            case 56:
                {
                alt18=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(18);}

            switch (alt18) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:71:2: ID_OTHERS ':=' i
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(71,2);
                    ID_OTHERS42=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_instr409); 
                    ID_OTHERS42_tree = (Object)adaptor.create(ID_OTHERS42);
                    adaptor.addChild(root_0, ID_OTHERS42_tree);

                    dbg.location(71,16);
                    string_literal43=(Token)match(input,43,FOLLOW_43_in_instr411); 
                    string_literal43_tree = (Object)adaptor.create(string_literal43);
                    root_0 = (Object)adaptor.becomeRoot(string_literal43_tree, root_0);

                    dbg.location(71,18);
                    pushFollow(FOLLOW_i_in_instr414);
                    i44=i();

                    state._fsp--;

                    adaptor.addChild(root_0, i44.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:72:3: 'if' expr 'then' instr ( 'else' instr )? 'fi'
                    {
                    dbg.location(72,3);
                    string_literal45=(Token)match(input,44,FOLLOW_44_in_instr419);  
                    stream_44.add(string_literal45);

                    dbg.location(72,8);
                    pushFollow(FOLLOW_expr_in_instr421);
                    expr46=expr();

                    state._fsp--;

                    stream_expr.add(expr46.getTree());
                    dbg.location(72,13);
                    string_literal47=(Token)match(input,45,FOLLOW_45_in_instr423);  
                    stream_45.add(string_literal47);

                    dbg.location(72,20);
                    pushFollow(FOLLOW_instr_in_instr425);
                    instr48=instr();

                    state._fsp--;

                    stream_instr.add(instr48.getTree());
                    dbg.location(72,26);
                    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:72:26: ( 'else' instr )?
                    int alt14=2;
                    try { dbg.enterSubRule(14);
                    try { dbg.enterDecision(14);

                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==46) ) {
                        alt14=1;
                    }
                    } finally {dbg.exitDecision(14);}

                    switch (alt14) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:72:27: 'else' instr
                            {
                            dbg.location(72,27);
                            string_literal49=(Token)match(input,46,FOLLOW_46_in_instr428);  
                            stream_46.add(string_literal49);

                            dbg.location(72,34);
                            pushFollow(FOLLOW_instr_in_instr430);
                            instr50=instr();

                            state._fsp--;

                            stream_instr.add(instr50.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(14);}

                    dbg.location(72,42);
                    string_literal51=(Token)match(input,47,FOLLOW_47_in_instr434);  
                    stream_47.add(string_literal51);



                    // AST REWRITE
                    // elements: instr, expr, instr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 72:48: -> ^( IF expr instr ( instr )? )
                    {
                        dbg.location(72,51);
                        // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:72:51: ^( IF expr instr ( instr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(72,53);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);

                        dbg.location(72,56);
                        adaptor.addChild(root_1, stream_expr.nextTree());
                        dbg.location(72,61);
                        adaptor.addChild(root_1, stream_instr.nextTree());
                        dbg.location(72,67);
                        // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:72:67: ( instr )?
                        if ( stream_instr.hasNext() ) {
                            dbg.location(72,67);
                            adaptor.addChild(root_1, stream_instr.nextTree());

                        }
                        stream_instr.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:73:3: 'for' ID_OTHERS 'in' boundaries 'do' ( instr )+ 'end'
                    {
                    dbg.location(73,3);
                    string_literal52=(Token)match(input,48,FOLLOW_48_in_instr452);  
                    stream_48.add(string_literal52);

                    dbg.location(73,9);
                    ID_OTHERS53=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_instr454);  
                    stream_ID_OTHERS.add(ID_OTHERS53);

                    dbg.location(73,19);
                    string_literal54=(Token)match(input,49,FOLLOW_49_in_instr456);  
                    stream_49.add(string_literal54);

                    dbg.location(73,24);
                    pushFollow(FOLLOW_boundaries_in_instr458);
                    boundaries55=boundaries();

                    state._fsp--;

                    stream_boundaries.add(boundaries55.getTree());
                    dbg.location(73,35);
                    string_literal56=(Token)match(input,50,FOLLOW_50_in_instr460);  
                    stream_50.add(string_literal56);

                    dbg.location(73,40);
                    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:73:40: ( instr )+
                    int cnt15=0;
                    try { dbg.enterSubRule(15);

                    loop15:
                    do {
                        int alt15=2;
                        try { dbg.enterDecision(15);

                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==ID_OTHERS||LA15_0==40||LA15_0==44||LA15_0==48||LA15_0==50||(LA15_0>=54 && LA15_0<=56)) ) {
                            alt15=1;
                        }


                        } finally {dbg.exitDecision(15);}

                        switch (alt15) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:73:40: instr
                    	    {
                    	    dbg.location(73,40);
                    	    pushFollow(FOLLOW_instr_in_instr462);
                    	    instr57=instr();

                    	    state._fsp--;

                    	    stream_instr.add(instr57.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt15++;
                    } while (true);
                    } finally {dbg.exitSubRule(15);}

                    dbg.location(73,47);
                    string_literal58=(Token)match(input,51,FOLLOW_51_in_instr465);  
                    stream_51.add(string_literal58);



                    // AST REWRITE
                    // elements: boundaries, ID_OTHERS, instr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 73:53: -> ^( FOR ID_OTHERS boundaries ( instr )+ )
                    {
                        dbg.location(73,56);
                        // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:73:56: ^( FOR ID_OTHERS boundaries ( instr )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(73,58);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR, "FOR"), root_1);

                        dbg.location(73,62);
                        adaptor.addChild(root_1, stream_ID_OTHERS.nextNode());
                        dbg.location(73,72);
                        adaptor.addChild(root_1, stream_boundaries.nextTree());
                        dbg.location(73,83);
                        if ( !(stream_instr.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_instr.hasNext() ) {
                            dbg.location(73,83);
                            adaptor.addChild(root_1, stream_instr.nextTree());

                        }
                        stream_instr.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:74:3: '{' ( var_decl )* ( instr )+ '}'
                    {
                    dbg.location(74,3);
                    char_literal59=(Token)match(input,40,FOLLOW_40_in_instr482);  
                    stream_40.add(char_literal59);

                    dbg.location(74,7);
                    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:74:7: ( var_decl )*
                    try { dbg.enterSubRule(16);

                    loop16:
                    do {
                        int alt16=2;
                        try { dbg.enterDecision(16);

                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==34) ) {
                            alt16=1;
                        }


                        } finally {dbg.exitDecision(16);}

                        switch (alt16) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:74:7: var_decl
                    	    {
                    	    dbg.location(74,7);
                    	    pushFollow(FOLLOW_var_decl_in_instr484);
                    	    var_decl60=var_decl();

                    	    state._fsp--;

                    	    stream_var_decl.add(var_decl60.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(16);}

                    dbg.location(74,17);
                    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:74:17: ( instr )+
                    int cnt17=0;
                    try { dbg.enterSubRule(17);

                    loop17:
                    do {
                        int alt17=2;
                        try { dbg.enterDecision(17);

                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==ID_OTHERS||LA17_0==40||LA17_0==44||LA17_0==48||LA17_0==50||(LA17_0>=54 && LA17_0<=56)) ) {
                            alt17=1;
                        }


                        } finally {dbg.exitDecision(17);}

                        switch (alt17) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:74:17: instr
                    	    {
                    	    dbg.location(74,17);
                    	    pushFollow(FOLLOW_instr_in_instr487);
                    	    instr61=instr();

                    	    state._fsp--;

                    	    stream_instr.add(instr61.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt17++;
                    } while (true);
                    } finally {dbg.exitSubRule(17);}

                    dbg.location(74,24);
                    char_literal62=(Token)match(input,41,FOLLOW_41_in_instr490);  
                    stream_41.add(char_literal62);



                    // AST REWRITE
                    // elements: var_decl, instr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 74:28: -> ^( BLOC ( var_decl )* ( instr )+ )
                    {
                        dbg.location(74,30);
                        // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:74:30: ^( BLOC ( var_decl )* ( instr )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(74,32);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOC, "BLOC"), root_1);

                        dbg.location(74,38);
                        // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:74:38: ( var_decl )*
                        while ( stream_var_decl.hasNext() ) {
                            dbg.location(74,38);
                            adaptor.addChild(root_1, stream_var_decl.nextTree());

                        }
                        stream_var_decl.reset();
                        dbg.location(74,48);
                        if ( !(stream_instr.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_instr.hasNext() ) {
                            dbg.location(74,48);
                            adaptor.addChild(root_1, stream_instr.nextTree());

                        }
                        stream_instr.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:75:3: 'do' expr ';'
                    {
                    dbg.location(75,3);
                    string_literal63=(Token)match(input,50,FOLLOW_50_in_instr507);  
                    stream_50.add(string_literal63);

                    dbg.location(75,8);
                    pushFollow(FOLLOW_expr_in_instr509);
                    expr64=expr();

                    state._fsp--;

                    stream_expr.add(expr64.getTree());
                    dbg.location(75,13);
                    char_literal65=(Token)match(input,36,FOLLOW_36_in_instr511);  
                    stream_36.add(char_literal65);



                    // AST REWRITE
                    // elements: 50, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 75:18: -> ^( 'do' expr )
                    {
                        dbg.location(75,21);
                        // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:75:21: ^( 'do' expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(75,23);
                        root_1 = (Object)adaptor.becomeRoot(stream_50.nextNode(), root_1);

                        dbg.location(75,27);
                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:76:3: print
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(76,3);
                    pushFollow(FOLLOW_print_in_instr524);
                    print66=print();

                    state._fsp--;

                    adaptor.addChild(root_0, print66.getTree());

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:77:3: read
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(77,3);
                    pushFollow(FOLLOW_read_in_instr528);
                    read67=read();

                    state._fsp--;

                    adaptor.addChild(root_0, read67.getTree());

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:78:3: retourne
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(78,3);
                    pushFollow(FOLLOW_retourne_in_instr532);
                    retourne68=retourne();

                    state._fsp--;

                    adaptor.addChild(root_0, retourne68.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(79, 7);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "instr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "instr"

    public static class boundaries_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "boundaries"
    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:81:1: boundaries : a= expr '..' b= expr -> ^( '..' $a $b) ;
    public final ExprParser.boundaries_return boundaries() throws RecognitionException {
        ExprParser.boundaries_return retval = new ExprParser.boundaries_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal69=null;
        ExprParser.expr_return a = null;

        ExprParser.expr_return b = null;


        Object string_literal69_tree=null;
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try { dbg.enterRule(getGrammarFileName(), "boundaries");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(81, 1);

        try {
            // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:81:12: (a= expr '..' b= expr -> ^( '..' $a $b) )
            dbg.enterAlt(1);

            // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:82:3: a= expr '..' b= expr
            {
            dbg.location(82,4);
            pushFollow(FOLLOW_expr_in_boundaries551);
            a=expr();

            state._fsp--;

            stream_expr.add(a.getTree());
            dbg.location(82,10);
            string_literal69=(Token)match(input,52,FOLLOW_52_in_boundaries553);  
            stream_52.add(string_literal69);

            dbg.location(82,16);
            pushFollow(FOLLOW_expr_in_boundaries557);
            b=expr();

            state._fsp--;

            stream_expr.add(b.getTree());


            // AST REWRITE
            // elements: 52, b, a
            // token labels: 
            // rule labels: a, b, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);
            RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 82:23: -> ^( '..' $a $b)
            {
                dbg.location(82,26);
                // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:82:26: ^( '..' $a $b)
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(82,28);
                root_1 = (Object)adaptor.becomeRoot(stream_52.nextNode(), root_1);

                dbg.location(82,33);
                adaptor.addChild(root_1, stream_a.nextTree());
                dbg.location(82,36);
                adaptor.addChild(root_1, stream_b.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(83, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "boundaries");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "boundaries"

    public static class i_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "i"
    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:86:1: i : ( expr ';' -> expr | 'nil' ';' -> 'nil' );
    public final ExprParser.i_return i() throws RecognitionException {
        ExprParser.i_return retval = new ExprParser.i_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal71=null;
        Token string_literal72=null;
        Token char_literal73=null;
        ExprParser.expr_return expr70 = null;


        Object char_literal71_tree=null;
        Object string_literal72_tree=null;
        Object char_literal73_tree=null;
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try { dbg.enterRule(getGrammarFileName(), "i");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(86, 1);

        try {
            // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:86:3: ( expr ';' -> expr | 'nil' ';' -> 'nil' )
            int alt19=2;
            try { dbg.enterDecision(19);

            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=ID_OTHERS && LA19_0<=STRING)||LA19_0==INT||LA19_0==32||(LA19_0>=57 && LA19_0<=59)||LA19_0==62) ) {
                alt19=1;
            }
            else if ( (LA19_0==53) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(19);}

            switch (alt19) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:87:2: expr ';'
                    {
                    dbg.location(87,2);
                    pushFollow(FOLLOW_expr_in_i585);
                    expr70=expr();

                    state._fsp--;

                    stream_expr.add(expr70.getTree());
                    dbg.location(87,7);
                    char_literal71=(Token)match(input,36,FOLLOW_36_in_i587);  
                    stream_36.add(char_literal71);



                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 87:11: -> expr
                    {
                        dbg.location(87,14);
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:88:4: 'nil' ';'
                    {
                    dbg.location(88,4);
                    string_literal72=(Token)match(input,53,FOLLOW_53_in_i596);  
                    stream_53.add(string_literal72);

                    dbg.location(88,10);
                    char_literal73=(Token)match(input,36,FOLLOW_36_in_i598);  
                    stream_36.add(char_literal73);



                    // AST REWRITE
                    // elements: 53
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 88:14: -> 'nil'
                    {
                        dbg.location(88,17);
                        adaptor.addChild(root_0, stream_53.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(89, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "i");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "i"

    public static class print_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "print"
    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:91:1: print : 'write' expr ';' -> ^( 'write' expr ) ;
    public final ExprParser.print_return print() throws RecognitionException {
        ExprParser.print_return retval = new ExprParser.print_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal74=null;
        Token char_literal76=null;
        ExprParser.expr_return expr75 = null;


        Object string_literal74_tree=null;
        Object char_literal76_tree=null;
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try { dbg.enterRule(getGrammarFileName(), "print");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(91, 1);

        try {
            // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:91:7: ( 'write' expr ';' -> ^( 'write' expr ) )
            dbg.enterAlt(1);

            // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:92:3: 'write' expr ';'
            {
            dbg.location(92,3);
            string_literal74=(Token)match(input,54,FOLLOW_54_in_print615);  
            stream_54.add(string_literal74);

            dbg.location(92,11);
            pushFollow(FOLLOW_expr_in_print617);
            expr75=expr();

            state._fsp--;

            stream_expr.add(expr75.getTree());
            dbg.location(92,16);
            char_literal76=(Token)match(input,36,FOLLOW_36_in_print619);  
            stream_36.add(char_literal76);



            // AST REWRITE
            // elements: 54, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 92:20: -> ^( 'write' expr )
            {
                dbg.location(92,23);
                // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:92:23: ^( 'write' expr )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(92,25);
                root_1 = (Object)adaptor.becomeRoot(stream_54.nextNode(), root_1);

                dbg.location(92,33);
                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(93, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "print");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "print"

    public static class read_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "read"
    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:95:1: read : 'read' ID_OTHERS ';' -> ^( 'read' ID_OTHERS ) ;
    public final ExprParser.read_return read() throws RecognitionException {
        ExprParser.read_return retval = new ExprParser.read_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal77=null;
        Token ID_OTHERS78=null;
        Token char_literal79=null;

        Object string_literal77_tree=null;
        Object ID_OTHERS78_tree=null;
        Object char_literal79_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_ID_OTHERS=new RewriteRuleTokenStream(adaptor,"token ID_OTHERS");

        try { dbg.enterRule(getGrammarFileName(), "read");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(95, 1);

        try {
            // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:95:6: ( 'read' ID_OTHERS ';' -> ^( 'read' ID_OTHERS ) )
            dbg.enterAlt(1);

            // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:96:2: 'read' ID_OTHERS ';'
            {
            dbg.location(96,2);
            string_literal77=(Token)match(input,55,FOLLOW_55_in_read641);  
            stream_55.add(string_literal77);

            dbg.location(96,9);
            ID_OTHERS78=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_read643);  
            stream_ID_OTHERS.add(ID_OTHERS78);

            dbg.location(96,19);
            char_literal79=(Token)match(input,36,FOLLOW_36_in_read645);  
            stream_36.add(char_literal79);



            // AST REWRITE
            // elements: ID_OTHERS, 55
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 96:23: -> ^( 'read' ID_OTHERS )
            {
                dbg.location(96,26);
                // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:96:26: ^( 'read' ID_OTHERS )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(96,28);
                root_1 = (Object)adaptor.becomeRoot(stream_55.nextNode(), root_1);

                dbg.location(96,35);
                adaptor.addChild(root_1, stream_ID_OTHERS.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(97, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "read");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "read"

    public static class retourne_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "retourne"
    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:99:1: retourne : 'return' '(' expr ')' ';' -> ^( RETURN expr ) ;
    public final ExprParser.retourne_return retourne() throws RecognitionException {
        ExprParser.retourne_return retval = new ExprParser.retourne_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal80=null;
        Token char_literal81=null;
        Token char_literal83=null;
        Token char_literal84=null;
        ExprParser.expr_return expr82 = null;


        Object string_literal80_tree=null;
        Object char_literal81_tree=null;
        Object char_literal83_tree=null;
        Object char_literal84_tree=null;
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try { dbg.enterRule(getGrammarFileName(), "retourne");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(99, 1);

        try {
            // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:99:10: ( 'return' '(' expr ')' ';' -> ^( RETURN expr ) )
            dbg.enterAlt(1);

            // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:100:2: 'return' '(' expr ')' ';'
            {
            dbg.location(100,2);
            string_literal80=(Token)match(input,56,FOLLOW_56_in_retourne664);  
            stream_56.add(string_literal80);

            dbg.location(100,11);
            char_literal81=(Token)match(input,32,FOLLOW_32_in_retourne666);  
            stream_32.add(char_literal81);

            dbg.location(100,15);
            pushFollow(FOLLOW_expr_in_retourne668);
            expr82=expr();

            state._fsp--;

            stream_expr.add(expr82.getTree());
            dbg.location(100,20);
            char_literal83=(Token)match(input,33,FOLLOW_33_in_retourne670);  
            stream_33.add(char_literal83);

            dbg.location(100,23);
            char_literal84=(Token)match(input,36,FOLLOW_36_in_retourne671);  
            stream_36.add(char_literal84);



            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 100:27: -> ^( RETURN expr )
            {
                dbg.location(100,30);
                // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:100:30: ^( RETURN expr )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(100,32);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RETURN, "RETURN"), root_1);

                dbg.location(100,39);
                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(101, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "retourne");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "retourne"

    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:103:1: expr : ( exprplus e | 'this' e | 'super' e | STRING | 'new' ID_CLASS e -> ^( NEW ID_CLASS ( e )? ) );
    public final ExprParser.expr_return expr() throws RecognitionException {
        ExprParser.expr_return retval = new ExprParser.expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal87=null;
        Token string_literal89=null;
        Token STRING91=null;
        Token string_literal92=null;
        Token ID_CLASS93=null;
        ExprParser.exprplus_return exprplus85 = null;

        ExprParser.e_return e86 = null;

        ExprParser.e_return e88 = null;

        ExprParser.e_return e90 = null;

        ExprParser.e_return e94 = null;


        Object string_literal87_tree=null;
        Object string_literal89_tree=null;
        Object STRING91_tree=null;
        Object string_literal92_tree=null;
        Object ID_CLASS93_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_ID_CLASS=new RewriteRuleTokenStream(adaptor,"token ID_CLASS");
        RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e");
        try { dbg.enterRule(getGrammarFileName(), "expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(103, 1);

        try {
            // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:103:5: ( exprplus e | 'this' e | 'super' e | STRING | 'new' ID_CLASS e -> ^( NEW ID_CLASS ( e )? ) )
            int alt20=5;
            try { dbg.enterDecision(20);

            switch ( input.LA(1) ) {
            case ID_OTHERS:
            case INT:
            case 32:
            case 62:
                {
                alt20=1;
                }
                break;
            case 57:
                {
                alt20=2;
                }
                break;
            case 58:
                {
                alt20=3;
                }
                break;
            case STRING:
                {
                alt20=4;
                }
                break;
            case 59:
                {
                alt20=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(20);}

            switch (alt20) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:104:3: exprplus e
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(104,3);
                    pushFollow(FOLLOW_exprplus_in_expr691);
                    exprplus85=exprplus();

                    state._fsp--;

                    adaptor.addChild(root_0, exprplus85.getTree());
                    dbg.location(104,12);
                    pushFollow(FOLLOW_e_in_expr693);
                    e86=e();

                    state._fsp--;

                    adaptor.addChild(root_0, e86.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:105:4: 'this' e
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(105,4);
                    string_literal87=(Token)match(input,57,FOLLOW_57_in_expr699); 
                    string_literal87_tree = (Object)adaptor.create(string_literal87);
                    adaptor.addChild(root_0, string_literal87_tree);

                    dbg.location(105,11);
                    pushFollow(FOLLOW_e_in_expr701);
                    e88=e();

                    state._fsp--;

                    adaptor.addChild(root_0, e88.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:106:4: 'super' e
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(106,4);
                    string_literal89=(Token)match(input,58,FOLLOW_58_in_expr706); 
                    string_literal89_tree = (Object)adaptor.create(string_literal89);
                    adaptor.addChild(root_0, string_literal89_tree);

                    dbg.location(106,12);
                    pushFollow(FOLLOW_e_in_expr708);
                    e90=e();

                    state._fsp--;

                    adaptor.addChild(root_0, e90.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:108:4: STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(108,4);
                    STRING91=(Token)match(input,STRING,FOLLOW_STRING_in_expr715); 
                    STRING91_tree = (Object)adaptor.create(STRING91);
                    adaptor.addChild(root_0, STRING91_tree);


                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:109:4: 'new' ID_CLASS e
                    {
                    dbg.location(109,4);
                    string_literal92=(Token)match(input,59,FOLLOW_59_in_expr720);  
                    stream_59.add(string_literal92);

                    dbg.location(109,10);
                    ID_CLASS93=(Token)match(input,ID_CLASS,FOLLOW_ID_CLASS_in_expr722);  
                    stream_ID_CLASS.add(ID_CLASS93);

                    dbg.location(109,19);
                    pushFollow(FOLLOW_e_in_expr724);
                    e94=e();

                    state._fsp--;

                    stream_e.add(e94.getTree());


                    // AST REWRITE
                    // elements: e, ID_CLASS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 109:21: -> ^( NEW ID_CLASS ( e )? )
                    {
                        dbg.location(109,24);
                        // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:109:24: ^( NEW ID_CLASS ( e )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(109,26);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NEW, "NEW"), root_1);

                        dbg.location(109,30);
                        adaptor.addChild(root_1, stream_ID_CLASS.nextNode());
                        dbg.location(109,39);
                        // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:109:39: ( e )?
                        if ( stream_e.hasNext() ) {
                            dbg.location(109,39);
                            adaptor.addChild(root_1, stream_e.nextTree());

                        }
                        stream_e.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(112, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "expr"

    public static class e_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "e"
    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:113:1: e : ( '.' ID_OTHERS '(' ( f )? ')' e -> ^( APPELMETHODE ID_OTHERS ( f )? ( e )? ) | );
    public final ExprParser.e_return e() throws RecognitionException {
        ExprParser.e_return retval = new ExprParser.e_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal95=null;
        Token ID_OTHERS96=null;
        Token char_literal97=null;
        Token char_literal99=null;
        ExprParser.f_return f98 = null;

        ExprParser.e_return e100 = null;


        Object char_literal95_tree=null;
        Object ID_OTHERS96_tree=null;
        Object char_literal97_tree=null;
        Object char_literal99_tree=null;
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_ID_OTHERS=new RewriteRuleTokenStream(adaptor,"token ID_OTHERS");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e");
        RewriteRuleSubtreeStream stream_f=new RewriteRuleSubtreeStream(adaptor,"rule f");
        try { dbg.enterRule(getGrammarFileName(), "e");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(113, 1);

        try {
            // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:113:3: ( '.' ID_OTHERS '(' ( f )? ')' e -> ^( APPELMETHODE ID_OTHERS ( f )? ( e )? ) | )
            int alt22=2;
            try { dbg.enterDecision(22);

            int LA22_0 = input.LA(1);

            if ( (LA22_0==60) ) {
                alt22=1;
            }
            else if ( (LA22_0==33||LA22_0==36||LA22_0==42||LA22_0==45||LA22_0==50||LA22_0==52) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(22);}

            switch (alt22) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:115:2: '.' ID_OTHERS '(' ( f )? ')' e
                    {
                    dbg.location(115,2);
                    char_literal95=(Token)match(input,60,FOLLOW_60_in_e751);  
                    stream_60.add(char_literal95);

                    dbg.location(115,6);
                    ID_OTHERS96=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_e753);  
                    stream_ID_OTHERS.add(ID_OTHERS96);

                    dbg.location(115,16);
                    char_literal97=(Token)match(input,32,FOLLOW_32_in_e755);  
                    stream_32.add(char_literal97);

                    dbg.location(115,20);
                    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:115:20: ( f )?
                    int alt21=2;
                    try { dbg.enterSubRule(21);
                    try { dbg.enterDecision(21);

                    int LA21_0 = input.LA(1);

                    if ( ((LA21_0>=ID_OTHERS && LA21_0<=STRING)||LA21_0==INT||LA21_0==32||(LA21_0>=57 && LA21_0<=59)||LA21_0==62) ) {
                        alt21=1;
                    }
                    } finally {dbg.exitDecision(21);}

                    switch (alt21) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:115:20: f
                            {
                            dbg.location(115,20);
                            pushFollow(FOLLOW_f_in_e757);
                            f98=f();

                            state._fsp--;

                            stream_f.add(f98.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(21);}

                    dbg.location(115,23);
                    char_literal99=(Token)match(input,33,FOLLOW_33_in_e760);  
                    stream_33.add(char_literal99);

                    dbg.location(115,27);
                    pushFollow(FOLLOW_e_in_e762);
                    e100=e();

                    state._fsp--;

                    stream_e.add(e100.getTree());


                    // AST REWRITE
                    // elements: e, f, ID_OTHERS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 115:29: -> ^( APPELMETHODE ID_OTHERS ( f )? ( e )? )
                    {
                        dbg.location(115,32);
                        // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:115:32: ^( APPELMETHODE ID_OTHERS ( f )? ( e )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(115,34);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(APPELMETHODE, "APPELMETHODE"), root_1);

                        dbg.location(115,47);
                        adaptor.addChild(root_1, stream_ID_OTHERS.nextNode());
                        dbg.location(115,57);
                        // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:115:57: ( f )?
                        if ( stream_f.hasNext() ) {
                            dbg.location(115,57);
                            adaptor.addChild(root_1, stream_f.nextTree());

                        }
                        stream_f.reset();
                        dbg.location(115,60);
                        // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:115:60: ( e )?
                        if ( stream_e.hasNext() ) {
                            dbg.location(115,60);
                            adaptor.addChild(root_1, stream_e.nextTree());

                        }
                        stream_e.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:117:2: 
                    {
                    root_0 = (Object)adaptor.nil();

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(117, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "e");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "e"

    public static class f_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "f"
    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:119:1: f : expr ( ',' expr )* -> ^( ARGS ( expr )* ) ;
    public final ExprParser.f_return f() throws RecognitionException {
        ExprParser.f_return retval = new ExprParser.f_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal102=null;
        ExprParser.expr_return expr101 = null;

        ExprParser.expr_return expr103 = null;


        Object char_literal102_tree=null;
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try { dbg.enterRule(getGrammarFileName(), "f");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(119, 1);

        try {
            // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:119:5: ( expr ( ',' expr )* -> ^( ARGS ( expr )* ) )
            dbg.enterAlt(1);

            // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:119:8: expr ( ',' expr )*
            {
            dbg.location(119,8);
            pushFollow(FOLLOW_expr_in_f793);
            expr101=expr();

            state._fsp--;

            stream_expr.add(expr101.getTree());
            dbg.location(119,13);
            // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:119:13: ( ',' expr )*
            try { dbg.enterSubRule(23);

            loop23:
            do {
                int alt23=2;
                try { dbg.enterDecision(23);

                int LA23_0 = input.LA(1);

                if ( (LA23_0==42) ) {
                    alt23=1;
                }


                } finally {dbg.exitDecision(23);}

                switch (alt23) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:119:14: ',' expr
            	    {
            	    dbg.location(119,14);
            	    char_literal102=(Token)match(input,42,FOLLOW_42_in_f796);  
            	    stream_42.add(char_literal102);

            	    dbg.location(119,18);
            	    pushFollow(FOLLOW_expr_in_f798);
            	    expr103=expr();

            	    state._fsp--;

            	    stream_expr.add(expr103.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);
            } finally {dbg.exitSubRule(23);}



            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 119:26: -> ^( ARGS ( expr )* )
            {
                dbg.location(119,29);
                // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:119:29: ^( ARGS ( expr )* )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(119,31);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGS, "ARGS"), root_1);

                dbg.location(119,36);
                // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:119:36: ( expr )*
                while ( stream_expr.hasNext() ) {
                    dbg.location(119,36);
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(120, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "f");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "f"

    public static class exprplus_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprplus"
    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:130:1: exprplus : exprmult ( ( '+' | '-' ) exprmult )* ;
    public final ExprParser.exprplus_return exprplus() throws RecognitionException {
        ExprParser.exprplus_return retval = new ExprParser.exprplus_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal105=null;
        Token char_literal106=null;
        ExprParser.exprmult_return exprmult104 = null;

        ExprParser.exprmult_return exprmult107 = null;


        Object char_literal105_tree=null;
        Object char_literal106_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "exprplus");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(130, 1);

        try {
            // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:130:9: ( exprmult ( ( '+' | '-' ) exprmult )* )
            dbg.enterAlt(1);

            // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:131:2: exprmult ( ( '+' | '-' ) exprmult )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(131,2);
            pushFollow(FOLLOW_exprmult_in_exprplus827);
            exprmult104=exprmult();

            state._fsp--;

            adaptor.addChild(root_0, exprmult104.getTree());
            dbg.location(131,11);
            // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:131:11: ( ( '+' | '-' ) exprmult )*
            try { dbg.enterSubRule(25);

            loop25:
            do {
                int alt25=2;
                try { dbg.enterDecision(25);

                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=61 && LA25_0<=62)) ) {
                    alt25=1;
                }


                } finally {dbg.exitDecision(25);}

                switch (alt25) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:131:13: ( '+' | '-' ) exprmult
            	    {
            	    dbg.location(131,13);
            	    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:131:13: ( '+' | '-' )
            	    int alt24=2;
            	    try { dbg.enterSubRule(24);
            	    try { dbg.enterDecision(24);

            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==61) ) {
            	        alt24=1;
            	    }
            	    else if ( (LA24_0==62) ) {
            	        alt24=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        dbg.recognitionException(nvae);
            	        throw nvae;
            	    }
            	    } finally {dbg.exitDecision(24);}

            	    switch (alt24) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:131:14: '+'
            	            {
            	            dbg.location(131,17);
            	            char_literal105=(Token)match(input,61,FOLLOW_61_in_exprplus832); 
            	            char_literal105_tree = (Object)adaptor.create(char_literal105);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal105_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            dbg.enterAlt(2);

            	            // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:131:19: '-'
            	            {
            	            dbg.location(131,22);
            	            char_literal106=(Token)match(input,62,FOLLOW_62_in_exprplus835); 
            	            char_literal106_tree = (Object)adaptor.create(char_literal106);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal106_tree, root_0);


            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(24);}

            	    dbg.location(131,25);
            	    pushFollow(FOLLOW_exprmult_in_exprplus839);
            	    exprmult107=exprmult();

            	    state._fsp--;

            	    adaptor.addChild(root_0, exprmult107.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);
            } finally {dbg.exitSubRule(25);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(132, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "exprplus");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "exprplus"

    public static class exprmult_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprmult"
    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:135:1: exprmult : oper ( OPERMULT oper )? ;
    public final ExprParser.exprmult_return exprmult() throws RecognitionException {
        ExprParser.exprmult_return retval = new ExprParser.exprmult_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OPERMULT109=null;
        ExprParser.oper_return oper108 = null;

        ExprParser.oper_return oper110 = null;


        Object OPERMULT109_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "exprmult");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(135, 1);

        try {
            // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:135:9: ( oper ( OPERMULT oper )? )
            dbg.enterAlt(1);

            // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:137:3: oper ( OPERMULT oper )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(137,3);
            pushFollow(FOLLOW_oper_in_exprmult854);
            oper108=oper();

            state._fsp--;

            adaptor.addChild(root_0, oper108.getTree());
            dbg.location(137,7);
            // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:137:7: ( OPERMULT oper )?
            int alt26=2;
            try { dbg.enterSubRule(26);
            try { dbg.enterDecision(26);

            int LA26_0 = input.LA(1);

            if ( (LA26_0==OPERMULT) ) {
                alt26=1;
            }
            } finally {dbg.exitDecision(26);}

            switch (alt26) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:137:9: OPERMULT oper
                    {
                    dbg.location(137,17);
                    OPERMULT109=(Token)match(input,OPERMULT,FOLLOW_OPERMULT_in_exprmult857); 
                    OPERMULT109_tree = (Object)adaptor.create(OPERMULT109);
                    root_0 = (Object)adaptor.becomeRoot(OPERMULT109_tree, root_0);

                    dbg.location(137,19);
                    pushFollow(FOLLOW_oper_in_exprmult860);
                    oper110=oper();

                    state._fsp--;

                    adaptor.addChild(root_0, oper110.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(26);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(139, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "exprmult");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "exprmult"

    public static class oper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "oper"
    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:141:1: oper : moinsunaire ( OPERCONDITION moinsunaire )* ;
    public final ExprParser.oper_return oper() throws RecognitionException {
        ExprParser.oper_return retval = new ExprParser.oper_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OPERCONDITION112=null;
        ExprParser.moinsunaire_return moinsunaire111 = null;

        ExprParser.moinsunaire_return moinsunaire113 = null;


        Object OPERCONDITION112_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "oper");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(141, 1);

        try {
            // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:141:5: ( moinsunaire ( OPERCONDITION moinsunaire )* )
            dbg.enterAlt(1);

            // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:142:2: moinsunaire ( OPERCONDITION moinsunaire )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(142,2);
            pushFollow(FOLLOW_moinsunaire_in_oper874);
            moinsunaire111=moinsunaire();

            state._fsp--;

            adaptor.addChild(root_0, moinsunaire111.getTree());
            dbg.location(142,14);
            // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:142:14: ( OPERCONDITION moinsunaire )*
            try { dbg.enterSubRule(27);

            loop27:
            do {
                int alt27=2;
                try { dbg.enterDecision(27);

                int LA27_0 = input.LA(1);

                if ( (LA27_0==OPERCONDITION) ) {
                    alt27=1;
                }


                } finally {dbg.exitDecision(27);}

                switch (alt27) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:142:15: OPERCONDITION moinsunaire
            	    {
            	    dbg.location(142,28);
            	    OPERCONDITION112=(Token)match(input,OPERCONDITION,FOLLOW_OPERCONDITION_in_oper877); 
            	    OPERCONDITION112_tree = (Object)adaptor.create(OPERCONDITION112);
            	    root_0 = (Object)adaptor.becomeRoot(OPERCONDITION112_tree, root_0);

            	    dbg.location(142,30);
            	    pushFollow(FOLLOW_moinsunaire_in_oper880);
            	    moinsunaire113=moinsunaire();

            	    state._fsp--;

            	    adaptor.addChild(root_0, moinsunaire113.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);
            } finally {dbg.exitSubRule(27);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(143, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "oper");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "oper"

    public static class moinsunaire_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "moinsunaire"
    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:145:1: moinsunaire : ( '-' atom -> ^( OPPOSE atom ) | atom );
    public final ExprParser.moinsunaire_return moinsunaire() throws RecognitionException {
        ExprParser.moinsunaire_return retval = new ExprParser.moinsunaire_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal114=null;
        ExprParser.atom_return atom115 = null;

        ExprParser.atom_return atom116 = null;


        Object char_literal114_tree=null;
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        try { dbg.enterRule(getGrammarFileName(), "moinsunaire");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(145, 1);

        try {
            // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:145:12: ( '-' atom -> ^( OPPOSE atom ) | atom )
            int alt28=2;
            try { dbg.enterDecision(28);

            int LA28_0 = input.LA(1);

            if ( (LA28_0==62) ) {
                alt28=1;
            }
            else if ( (LA28_0==ID_OTHERS||LA28_0==INT||LA28_0==32) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(28);}

            switch (alt28) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:146:2: '-' atom
                    {
                    dbg.location(146,2);
                    char_literal114=(Token)match(input,62,FOLLOW_62_in_moinsunaire893);  
                    stream_62.add(char_literal114);

                    dbg.location(146,6);
                    pushFollow(FOLLOW_atom_in_moinsunaire895);
                    atom115=atom();

                    state._fsp--;

                    stream_atom.add(atom115.getTree());


                    // AST REWRITE
                    // elements: atom
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 146:11: -> ^( OPPOSE atom )
                    {
                        dbg.location(146,14);
                        // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:146:14: ^( OPPOSE atom )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(146,16);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPPOSE, "OPPOSE"), root_1);

                        dbg.location(146,23);
                        adaptor.addChild(root_1, stream_atom.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:147:4: atom
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(147,4);
                    pushFollow(FOLLOW_atom_in_moinsunaire908);
                    atom116=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom116.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(148, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "moinsunaire");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "moinsunaire"

    public static class atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom"
    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:149:1: atom : ( ID_OTHERS | INT | '(' expr ')' );
    public final ExprParser.atom_return atom() throws RecognitionException {
        ExprParser.atom_return retval = new ExprParser.atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID_OTHERS117=null;
        Token INT118=null;
        Token char_literal119=null;
        Token char_literal121=null;
        ExprParser.expr_return expr120 = null;


        Object ID_OTHERS117_tree=null;
        Object INT118_tree=null;
        Object char_literal119_tree=null;
        Object char_literal121_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "atom");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(149, 1);

        try {
            // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:149:5: ( ID_OTHERS | INT | '(' expr ')' )
            int alt29=3;
            try { dbg.enterDecision(29);

            switch ( input.LA(1) ) {
            case ID_OTHERS:
                {
                alt29=1;
                }
                break;
            case INT:
                {
                alt29=2;
                }
                break;
            case 32:
                {
                alt29=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(29);}

            switch (alt29) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:150:3: ID_OTHERS
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(150,3);
                    ID_OTHERS117=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_atom919); 
                    ID_OTHERS117_tree = (Object)adaptor.create(ID_OTHERS117);
                    adaptor.addChild(root_0, ID_OTHERS117_tree);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:151:5: INT
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(151,5);
                    INT118=(Token)match(input,INT,FOLLOW_INT_in_atom925); 
                    INT118_tree = (Object)adaptor.create(INT118);
                    adaptor.addChild(root_0, INT118_tree);


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/clement/Documents/TP_Compil/Compil_MACA-master/Expr.g:152:4: '(' expr ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(152,4);
                    char_literal119=(Token)match(input,32,FOLLOW_32_in_atom930); 
                    char_literal119_tree = (Object)adaptor.create(char_literal119);
                    adaptor.addChild(root_0, char_literal119_tree);

                    dbg.location(152,7);
                    pushFollow(FOLLOW_expr_in_atom931);
                    expr120=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr120.getTree());
                    dbg.location(152,11);
                    char_literal121=(Token)match(input,33,FOLLOW_33_in_atom932); 
                    char_literal121_tree = (Object)adaptor.create(char_literal121);
                    adaptor.addChild(root_0, char_literal121_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(154, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "atom");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "atom"

    // Delegated rules


 

    public static final BitSet FOLLOW_class_decl_in_prog85 = new BitSet(new long[]{0x01C5110420200000L});
    public static final BitSet FOLLOW_var_decl_in_prog88 = new BitSet(new long[]{0x01C5110400200000L});
    public static final BitSet FOLLOW_instr_in_prog91 = new BitSet(new long[]{0x01C5110400200002L});
    public static final BitSet FOLLOW_29_in_class_decl120 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_CLASS_in_class_decl124 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_30_in_class_decl127 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_CLASS_in_class_decl131 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_class_decl135 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_class_decl137 = new BitSet(new long[]{0x0000008600000000L});
    public static final BitSet FOLLOW_class_item_decl_in_class_decl139 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_class_decl141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_decl_in_class_item_decl171 = new BitSet(new long[]{0x0000008400000002L});
    public static final BitSet FOLLOW_method_decl_in_class_item_decl174 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_34_in_var_decl187 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ID_OTHERS_in_var_decl189 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_var_decl191 = new BitSet(new long[]{0x0000006000100000L});
    public static final BitSet FOLLOW_type_in_var_decl193 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_var_decl195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_type0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_method_decl239 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ID_OTHERS_in_method_decl241 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_method_decl243 = new BitSet(new long[]{0x0000000200200000L});
    public static final BitSet FOLLOW_method_params_in_method_decl246 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_method_decl249 = new BitSet(new long[]{0x0000010800000000L});
    public static final BitSet FOLLOW_m_in_method_decl251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_m280 = new BitSet(new long[]{0x01C5110400200000L});
    public static final BitSet FOLLOW_var_decl_in_m282 = new BitSet(new long[]{0x01C5110400200000L});
    public static final BitSet FOLLOW_instr_in_m285 = new BitSet(new long[]{0x01C5130400200000L});
    public static final BitSet FOLLOW_41_in_m288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_m306 = new BitSet(new long[]{0x0000006000100000L});
    public static final BitSet FOLLOW_type_in_m308 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_m310 = new BitSet(new long[]{0x01C5110400200000L});
    public static final BitSet FOLLOW_var_decl_in_m312 = new BitSet(new long[]{0x01C5110400200000L});
    public static final BitSet FOLLOW_instr_in_m315 = new BitSet(new long[]{0x01C5130400200000L});
    public static final BitSet FOLLOW_41_in_m318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_params_in_method_params347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_OTHERS_in_params367 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_params369 = new BitSet(new long[]{0x0000006000100000L});
    public static final BitSet FOLLOW_type_in_params372 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_params375 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ID_OTHERS_in_params377 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_params379 = new BitSet(new long[]{0x0000006000100000L});
    public static final BitSet FOLLOW_type_in_params381 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ID_OTHERS_in_instr409 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_instr411 = new BitSet(new long[]{0x4E20000102600000L});
    public static final BitSet FOLLOW_i_in_instr414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_instr419 = new BitSet(new long[]{0x4E00000102600000L});
    public static final BitSet FOLLOW_expr_in_instr421 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_instr423 = new BitSet(new long[]{0x01C5110400200000L});
    public static final BitSet FOLLOW_instr_in_instr425 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_46_in_instr428 = new BitSet(new long[]{0x01C5110400200000L});
    public static final BitSet FOLLOW_instr_in_instr430 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_instr434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_instr452 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ID_OTHERS_in_instr454 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_instr456 = new BitSet(new long[]{0x4E00000102600000L});
    public static final BitSet FOLLOW_boundaries_in_instr458 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_instr460 = new BitSet(new long[]{0x01C5110400200000L});
    public static final BitSet FOLLOW_instr_in_instr462 = new BitSet(new long[]{0x01CD110400200000L});
    public static final BitSet FOLLOW_51_in_instr465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_instr482 = new BitSet(new long[]{0x01C5110400200000L});
    public static final BitSet FOLLOW_var_decl_in_instr484 = new BitSet(new long[]{0x01C5110400200000L});
    public static final BitSet FOLLOW_instr_in_instr487 = new BitSet(new long[]{0x01C5130400200000L});
    public static final BitSet FOLLOW_41_in_instr490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_instr507 = new BitSet(new long[]{0x4E00000102600000L});
    public static final BitSet FOLLOW_expr_in_instr509 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_instr511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_in_instr524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_instr528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_retourne_in_instr532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_boundaries551 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_boundaries553 = new BitSet(new long[]{0x4E00000102600000L});
    public static final BitSet FOLLOW_expr_in_boundaries557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_i585 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_i587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_i596 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_i598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_print615 = new BitSet(new long[]{0x4E00000102600000L});
    public static final BitSet FOLLOW_expr_in_print617 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_print619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_read641 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ID_OTHERS_in_read643 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_read645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_retourne664 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_retourne666 = new BitSet(new long[]{0x4E00000102600000L});
    public static final BitSet FOLLOW_expr_in_retourne668 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_retourne670 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_retourne671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprplus_in_expr691 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_e_in_expr693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_expr699 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_e_in_expr701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_expr706 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_e_in_expr708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_expr715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_expr720 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_CLASS_in_expr722 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_e_in_expr724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_e751 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ID_OTHERS_in_e753 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_e755 = new BitSet(new long[]{0x4E00000302600000L});
    public static final BitSet FOLLOW_f_in_e757 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_e760 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_e_in_e762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_f793 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_f796 = new BitSet(new long[]{0x4E00000102600000L});
    public static final BitSet FOLLOW_expr_in_f798 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_exprmult_in_exprplus827 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_61_in_exprplus832 = new BitSet(new long[]{0x4000000102200000L});
    public static final BitSet FOLLOW_62_in_exprplus835 = new BitSet(new long[]{0x4000000102200000L});
    public static final BitSet FOLLOW_exprmult_in_exprplus839 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_oper_in_exprmult854 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_OPERMULT_in_exprmult857 = new BitSet(new long[]{0x4000000102200000L});
    public static final BitSet FOLLOW_oper_in_exprmult860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moinsunaire_in_oper874 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_OPERCONDITION_in_oper877 = new BitSet(new long[]{0x4000000102200000L});
    public static final BitSet FOLLOW_moinsunaire_in_oper880 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_62_in_moinsunaire893 = new BitSet(new long[]{0x4000000102200000L});
    public static final BitSet FOLLOW_atom_in_moinsunaire895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_moinsunaire908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_OTHERS_in_atom919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_atom930 = new BitSet(new long[]{0x4E00000102600000L});
    public static final BitSet FOLLOW_expr_in_atom931 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_atom932 = new BitSet(new long[]{0x0000000000000002L});

}