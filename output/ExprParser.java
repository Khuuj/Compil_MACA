// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g 2017-02-28 19:42:43

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;

import org.antlr.runtime.tree.*;

public class ExprParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ROOT", "DEC_CLASS", "DEC_VAR", "AFFECT", "RETURN", "FOR", "IF", "BODY", "METHOD", "ARGS", "ID_CLASS", "ID_OTHERS", "STRING", "OPERCONDITION", "OPERPLUS", "OPERMULT", "INT", "COMMENTS", "NEWLINE", "WS", "'class'", "'inherit'", "'='", "'('", "')'", "'var'", "':'", "';'", "'int'", "'string'", "'method'", "'{'", "'}'", "','", "':='", "'if'", "'then'", "'else'", "'fi'", "'for'", "'in'", "'..'", "'do'", "'end'", "'nil'", "'write'", "'read'", "'return'", "'this'", "'super'", "'new'", "'-'", "'.'"
    };
    public static final int T__50=50;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int IF=10;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int NEWLINE=22;
    public static final int FOR=9;
    public static final int DEC_CLASS=5;
    public static final int OPERMULT=19;
    public static final int OPERCONDITION=17;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int METHOD=12;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int BODY=11;
    public static final int OPERPLUS=18;
    public static final int ARGS=13;
    public static final int ROOT=4;
    public static final int COMMENTS=21;
    public static final int INT=20;
    public static final int RETURN=8;
    public static final int T__37=37;
    public static final int ID_OTHERS=15;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int WS=23;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int DEC_VAR=6;
    public static final int AFFECT=7;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int ID_CLASS=14;
    public static final int STRING=16;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "var_decl", "read", "prog", "type", "e", "oper", 
        "exprmult", "class_item_decl", "expr", "i", "instr", "m", "method_args", 
        "exprplus", "atom", "class_decl", "print", "method_decl", "retourne"
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
    public String getGrammarFileName() { return "/home/clement/Documents/TP_Compil/Compil_MACA/Expr.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prog"
    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:21:1: prog : ( class_decl )* ( var_decl )* ( instr )+ -> ^( ROOT ( class_decl )* ( var_decl )* ( instr )+ ) ;
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
        dbg.location(21, 1);

        try {
            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:21:6: ( ( class_decl )* ( var_decl )* ( instr )+ -> ^( ROOT ( class_decl )* ( var_decl )* ( instr )+ ) )
            dbg.enterAlt(1);

            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:22:2: ( class_decl )* ( var_decl )* ( instr )+
            {
            dbg.location(22,2);
            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:22:2: ( class_decl )*
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==24) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:22:2: class_decl
            	    {
            	    dbg.location(22,2);
            	    pushFollow(FOLLOW_class_decl_in_prog67);
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

            dbg.location(22,14);
            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:22:14: ( var_decl )*
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=2;
                try { dbg.enterDecision(2);

                int LA2_0 = input.LA(1);

                if ( (LA2_0==29) ) {
                    alt2=1;
                }


                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:22:14: var_decl
            	    {
            	    dbg.location(22,14);
            	    pushFollow(FOLLOW_var_decl_in_prog70);
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

            dbg.location(22,24);
            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:22:24: ( instr )+
            int cnt3=0;
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=2;
                try { dbg.enterDecision(3);

                int LA3_0 = input.LA(1);

                if ( (LA3_0==ID_OTHERS||LA3_0==35||LA3_0==39||LA3_0==43||LA3_0==46||(LA3_0>=49 && LA3_0<=51)) ) {
                    alt3=1;
                }


                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:22:24: instr
            	    {
            	    dbg.location(22,24);
            	    pushFollow(FOLLOW_instr_in_prog73);
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
            // elements: instr, class_decl, var_decl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 22:31: -> ^( ROOT ( class_decl )* ( var_decl )* ( instr )+ )
            {
                dbg.location(22,34);
                // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:22:34: ^( ROOT ( class_decl )* ( var_decl )* ( instr )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(22,36);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ROOT, "ROOT"), root_1);

                dbg.location(22,41);
                // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:22:41: ( class_decl )*
                while ( stream_class_decl.hasNext() ) {
                    dbg.location(22,41);
                    adaptor.addChild(root_1, stream_class_decl.nextTree());

                }
                stream_class_decl.reset();
                dbg.location(22,53);
                // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:22:53: ( var_decl )*
                while ( stream_var_decl.hasNext() ) {
                    dbg.location(22,53);
                    adaptor.addChild(root_1, stream_var_decl.nextTree());

                }
                stream_var_decl.reset();
                dbg.location(22,63);
                if ( !(stream_instr.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_instr.hasNext() ) {
                    dbg.location(22,63);
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
        dbg.location(23, 2);

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
    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:26:1: class_decl : 'class' ID_CLASS ( 'inherit' ID_CLASS )? '=' '(' class_item_decl ')' -> ^( DEC_CLASS ( ID_CLASS )? class_item_decl ) ;
    public final ExprParser.class_decl_return class_decl() throws RecognitionException {
        ExprParser.class_decl_return retval = new ExprParser.class_decl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal4=null;
        Token ID_CLASS5=null;
        Token string_literal6=null;
        Token ID_CLASS7=null;
        Token char_literal8=null;
        Token char_literal9=null;
        Token char_literal11=null;
        ExprParser.class_item_decl_return class_item_decl10 = null;


        Object string_literal4_tree=null;
        Object ID_CLASS5_tree=null;
        Object string_literal6_tree=null;
        Object ID_CLASS7_tree=null;
        Object char_literal8_tree=null;
        Object char_literal9_tree=null;
        Object char_literal11_tree=null;
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleTokenStream stream_ID_CLASS=new RewriteRuleTokenStream(adaptor,"token ID_CLASS");
        RewriteRuleSubtreeStream stream_class_item_decl=new RewriteRuleSubtreeStream(adaptor,"rule class_item_decl");
        try { dbg.enterRule(getGrammarFileName(), "class_decl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(26, 1);

        try {
            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:26:12: ( 'class' ID_CLASS ( 'inherit' ID_CLASS )? '=' '(' class_item_decl ')' -> ^( DEC_CLASS ( ID_CLASS )? class_item_decl ) )
            dbg.enterAlt(1);

            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:27:3: 'class' ID_CLASS ( 'inherit' ID_CLASS )? '=' '(' class_item_decl ')'
            {
            dbg.location(27,3);
            string_literal4=(Token)match(input,24,FOLLOW_24_in_class_decl102);  
            stream_24.add(string_literal4);

            dbg.location(27,11);
            ID_CLASS5=(Token)match(input,ID_CLASS,FOLLOW_ID_CLASS_in_class_decl104);  
            stream_ID_CLASS.add(ID_CLASS5);

            dbg.location(27,20);
            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:27:20: ( 'inherit' ID_CLASS )?
            int alt4=2;
            try { dbg.enterSubRule(4);
            try { dbg.enterDecision(4);

            int LA4_0 = input.LA(1);

            if ( (LA4_0==25) ) {
                alt4=1;
            }
            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:27:21: 'inherit' ID_CLASS
                    {
                    dbg.location(27,21);
                    string_literal6=(Token)match(input,25,FOLLOW_25_in_class_decl107);  
                    stream_25.add(string_literal6);

                    dbg.location(27,31);
                    ID_CLASS7=(Token)match(input,ID_CLASS,FOLLOW_ID_CLASS_in_class_decl109);  
                    stream_ID_CLASS.add(ID_CLASS7);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(4);}

            dbg.location(27,42);
            char_literal8=(Token)match(input,26,FOLLOW_26_in_class_decl113);  
            stream_26.add(char_literal8);

            dbg.location(27,46);
            char_literal9=(Token)match(input,27,FOLLOW_27_in_class_decl115);  
            stream_27.add(char_literal9);

            dbg.location(27,50);
            pushFollow(FOLLOW_class_item_decl_in_class_decl117);
            class_item_decl10=class_item_decl();

            state._fsp--;

            stream_class_item_decl.add(class_item_decl10.getTree());
            dbg.location(27,66);
            char_literal11=(Token)match(input,28,FOLLOW_28_in_class_decl119);  
            stream_28.add(char_literal11);



            // AST REWRITE
            // elements: class_item_decl, ID_CLASS
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 27:70: -> ^( DEC_CLASS ( ID_CLASS )? class_item_decl )
            {
                dbg.location(27,72);
                // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:27:72: ^( DEC_CLASS ( ID_CLASS )? class_item_decl )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(27,74);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEC_CLASS, "DEC_CLASS"), root_1);

                dbg.location(27,84);
                // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:27:84: ( ID_CLASS )?
                if ( stream_ID_CLASS.hasNext() ) {
                    dbg.location(27,85);
                    adaptor.addChild(root_1, stream_ID_CLASS.nextNode());

                }
                stream_ID_CLASS.reset();
                dbg.location(27,97);
                adaptor.addChild(root_1, stream_class_item_decl.nextTree());

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
        dbg.location(28, 2);

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
    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:30:1: class_item_decl : ( var_decl )* ( method_decl )* ;
    public final ExprParser.class_item_decl_return class_item_decl() throws RecognitionException {
        ExprParser.class_item_decl_return retval = new ExprParser.class_item_decl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ExprParser.var_decl_return var_decl12 = null;

        ExprParser.method_decl_return method_decl13 = null;



        try { dbg.enterRule(getGrammarFileName(), "class_item_decl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(30, 1);

        try {
            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:30:17: ( ( var_decl )* ( method_decl )* )
            dbg.enterAlt(1);

            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:31:2: ( var_decl )* ( method_decl )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(31,2);
            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:31:2: ( var_decl )*
            try { dbg.enterSubRule(5);

            loop5:
            do {
                int alt5=2;
                try { dbg.enterDecision(5);

                int LA5_0 = input.LA(1);

                if ( (LA5_0==29) ) {
                    alt5=1;
                }


                } finally {dbg.exitDecision(5);}

                switch (alt5) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:31:2: var_decl
            	    {
            	    dbg.location(31,2);
            	    pushFollow(FOLLOW_var_decl_in_class_item_decl145);
            	    var_decl12=var_decl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, var_decl12.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);
            } finally {dbg.exitSubRule(5);}

            dbg.location(31,12);
            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:31:12: ( method_decl )*
            try { dbg.enterSubRule(6);

            loop6:
            do {
                int alt6=2;
                try { dbg.enterDecision(6);

                int LA6_0 = input.LA(1);

                if ( (LA6_0==34) ) {
                    alt6=1;
                }


                } finally {dbg.exitDecision(6);}

                switch (alt6) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:31:12: method_decl
            	    {
            	    dbg.location(31,12);
            	    pushFollow(FOLLOW_method_decl_in_class_item_decl148);
            	    method_decl13=method_decl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, method_decl13.getTree());

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
        dbg.location(32, 2);

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
    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:34:1: var_decl : 'var' ID_OTHERS ':' type ';' -> ^( DEC_VAR type ID_OTHERS ) ;
    public final ExprParser.var_decl_return var_decl() throws RecognitionException {
        ExprParser.var_decl_return retval = new ExprParser.var_decl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal14=null;
        Token ID_OTHERS15=null;
        Token char_literal16=null;
        Token char_literal18=null;
        ExprParser.type_return type17 = null;


        Object string_literal14_tree=null;
        Object ID_OTHERS15_tree=null;
        Object char_literal16_tree=null;
        Object char_literal18_tree=null;
        RewriteRuleTokenStream stream_ID_OTHERS=new RewriteRuleTokenStream(adaptor,"token ID_OTHERS");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try { dbg.enterRule(getGrammarFileName(), "var_decl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(34, 1);

        try {
            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:34:10: ( 'var' ID_OTHERS ':' type ';' -> ^( DEC_VAR type ID_OTHERS ) )
            dbg.enterAlt(1);

            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:35:2: 'var' ID_OTHERS ':' type ';'
            {
            dbg.location(35,2);
            string_literal14=(Token)match(input,29,FOLLOW_29_in_var_decl161);  
            stream_29.add(string_literal14);

            dbg.location(35,8);
            ID_OTHERS15=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_var_decl163);  
            stream_ID_OTHERS.add(ID_OTHERS15);

            dbg.location(35,18);
            char_literal16=(Token)match(input,30,FOLLOW_30_in_var_decl165);  
            stream_30.add(char_literal16);

            dbg.location(35,22);
            pushFollow(FOLLOW_type_in_var_decl167);
            type17=type();

            state._fsp--;

            stream_type.add(type17.getTree());
            dbg.location(35,27);
            char_literal18=(Token)match(input,31,FOLLOW_31_in_var_decl169);  
            stream_31.add(char_literal18);



            // AST REWRITE
            // elements: type, ID_OTHERS
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 36:2: -> ^( DEC_VAR type ID_OTHERS )
            {
                dbg.location(36,4);
                // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:36:4: ^( DEC_VAR type ID_OTHERS )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(36,6);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEC_VAR, "DEC_VAR"), root_1);

                dbg.location(36,14);
                adaptor.addChild(root_1, stream_type.nextTree());
                dbg.location(36,19);
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
        dbg.location(37, 2);

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
    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:40:1: type : ( ID_CLASS | 'int' | 'string' );
    public final ExprParser.type_return type() throws RecognitionException {
        ExprParser.type_return retval = new ExprParser.type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set19=null;

        Object set19_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "type");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(40, 1);

        try {
            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:40:6: ( ID_CLASS | 'int' | 'string' )
            dbg.enterAlt(1);

            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(40,6);
            set19=(Token)input.LT(1);
            if ( input.LA(1)==ID_CLASS||(input.LA(1)>=32 && input.LA(1)<=33) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set19));
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
        dbg.location(44, 2);

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
    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:46:1: method_decl : 'method' ID_OTHERS '(' ( method_args )? ')' m -> ^( METHOD ID_OTHERS ( method_args )? m ) ;
    public final ExprParser.method_decl_return method_decl() throws RecognitionException {
        ExprParser.method_decl_return retval = new ExprParser.method_decl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal20=null;
        Token ID_OTHERS21=null;
        Token char_literal22=null;
        Token char_literal24=null;
        ExprParser.method_args_return method_args23 = null;

        ExprParser.m_return m25 = null;


        Object string_literal20_tree=null;
        Object ID_OTHERS21_tree=null;
        Object char_literal22_tree=null;
        Object char_literal24_tree=null;
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleTokenStream stream_ID_OTHERS=new RewriteRuleTokenStream(adaptor,"token ID_OTHERS");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleSubtreeStream stream_method_args=new RewriteRuleSubtreeStream(adaptor,"rule method_args");
        RewriteRuleSubtreeStream stream_m=new RewriteRuleSubtreeStream(adaptor,"rule m");
        try { dbg.enterRule(getGrammarFileName(), "method_decl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(46, 1);

        try {
            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:46:13: ( 'method' ID_OTHERS '(' ( method_args )? ')' m -> ^( METHOD ID_OTHERS ( method_args )? m ) )
            dbg.enterAlt(1);

            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:47:2: 'method' ID_OTHERS '(' ( method_args )? ')' m
            {
            dbg.location(47,2);
            string_literal20=(Token)match(input,34,FOLLOW_34_in_method_decl215);  
            stream_34.add(string_literal20);

            dbg.location(47,11);
            ID_OTHERS21=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_method_decl217);  
            stream_ID_OTHERS.add(ID_OTHERS21);

            dbg.location(47,21);
            char_literal22=(Token)match(input,27,FOLLOW_27_in_method_decl219);  
            stream_27.add(char_literal22);

            dbg.location(47,26);
            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:47:26: ( method_args )?
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

                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:47:26: method_args
                    {
                    dbg.location(47,26);
                    pushFollow(FOLLOW_method_args_in_method_decl222);
                    method_args23=method_args();

                    state._fsp--;

                    stream_method_args.add(method_args23.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(7);}

            dbg.location(47,39);
            char_literal24=(Token)match(input,28,FOLLOW_28_in_method_decl225);  
            stream_28.add(char_literal24);

            dbg.location(47,43);
            pushFollow(FOLLOW_m_in_method_decl227);
            m25=m();

            state._fsp--;

            stream_m.add(m25.getTree());


            // AST REWRITE
            // elements: ID_OTHERS, method_args, m
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 47:45: -> ^( METHOD ID_OTHERS ( method_args )? m )
            {
                dbg.location(47,48);
                // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:47:48: ^( METHOD ID_OTHERS ( method_args )? m )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(47,50);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHOD, "METHOD"), root_1);

                dbg.location(47,57);
                adaptor.addChild(root_1, stream_ID_OTHERS.nextNode());
                dbg.location(47,69);
                // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:47:69: ( method_args )?
                if ( stream_method_args.hasNext() ) {
                    dbg.location(47,69);
                    adaptor.addChild(root_1, stream_method_args.nextTree());

                }
                stream_method_args.reset();
                dbg.location(47,83);
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
        dbg.location(48, 2);

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
    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:50:1: m : ( '{' ( var_decl )* ( instr )+ '}' -> ^( BODY ( var_decl )* ( instr )+ ) | ':' type '{' ( var_decl )* ( instr )+ '}' -> type ^( BODY ( var_decl )* ( instr )+ ) );
    public final ExprParser.m_return m() throws RecognitionException {
        ExprParser.m_return retval = new ExprParser.m_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal26=null;
        Token char_literal29=null;
        Token char_literal30=null;
        Token char_literal32=null;
        Token char_literal35=null;
        ExprParser.var_decl_return var_decl27 = null;

        ExprParser.instr_return instr28 = null;

        ExprParser.type_return type31 = null;

        ExprParser.var_decl_return var_decl33 = null;

        ExprParser.instr_return instr34 = null;


        Object char_literal26_tree=null;
        Object char_literal29_tree=null;
        Object char_literal30_tree=null;
        Object char_literal32_tree=null;
        Object char_literal35_tree=null;
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleSubtreeStream stream_instr=new RewriteRuleSubtreeStream(adaptor,"rule instr");
        RewriteRuleSubtreeStream stream_var_decl=new RewriteRuleSubtreeStream(adaptor,"rule var_decl");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try { dbg.enterRule(getGrammarFileName(), "m");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(50, 1);

        try {
            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:50:4: ( '{' ( var_decl )* ( instr )+ '}' -> ^( BODY ( var_decl )* ( instr )+ ) | ':' type '{' ( var_decl )* ( instr )+ '}' -> type ^( BODY ( var_decl )* ( instr )+ ) )
            int alt12=2;
            try { dbg.enterDecision(12);

            int LA12_0 = input.LA(1);

            if ( (LA12_0==35) ) {
                alt12=1;
            }
            else if ( (LA12_0==30) ) {
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

                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:51:2: '{' ( var_decl )* ( instr )+ '}'
                    {
                    dbg.location(51,2);
                    char_literal26=(Token)match(input,35,FOLLOW_35_in_m256);  
                    stream_35.add(char_literal26);

                    dbg.location(51,6);
                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:51:6: ( var_decl )*
                    try { dbg.enterSubRule(8);

                    loop8:
                    do {
                        int alt8=2;
                        try { dbg.enterDecision(8);

                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==29) ) {
                            alt8=1;
                        }


                        } finally {dbg.exitDecision(8);}

                        switch (alt8) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:51:6: var_decl
                    	    {
                    	    dbg.location(51,6);
                    	    pushFollow(FOLLOW_var_decl_in_m258);
                    	    var_decl27=var_decl();

                    	    state._fsp--;

                    	    stream_var_decl.add(var_decl27.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(8);}

                    dbg.location(51,16);
                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:51:16: ( instr )+
                    int cnt9=0;
                    try { dbg.enterSubRule(9);

                    loop9:
                    do {
                        int alt9=2;
                        try { dbg.enterDecision(9);

                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==ID_OTHERS||LA9_0==35||LA9_0==39||LA9_0==43||LA9_0==46||(LA9_0>=49 && LA9_0<=51)) ) {
                            alt9=1;
                        }


                        } finally {dbg.exitDecision(9);}

                        switch (alt9) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:51:16: instr
                    	    {
                    	    dbg.location(51,16);
                    	    pushFollow(FOLLOW_instr_in_m261);
                    	    instr28=instr();

                    	    state._fsp--;

                    	    stream_instr.add(instr28.getTree());

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

                    dbg.location(51,23);
                    char_literal29=(Token)match(input,36,FOLLOW_36_in_m264);  
                    stream_36.add(char_literal29);



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
                    // 51:27: -> ^( BODY ( var_decl )* ( instr )+ )
                    {
                        dbg.location(51,29);
                        // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:51:29: ^( BODY ( var_decl )* ( instr )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(51,31);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_1);

                        dbg.location(51,37);
                        // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:51:37: ( var_decl )*
                        while ( stream_var_decl.hasNext() ) {
                            dbg.location(51,37);
                            adaptor.addChild(root_1, stream_var_decl.nextTree());

                        }
                        stream_var_decl.reset();
                        dbg.location(51,47);
                        if ( !(stream_instr.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_instr.hasNext() ) {
                            dbg.location(51,47);
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

                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:52:4: ':' type '{' ( var_decl )* ( instr )+ '}'
                    {
                    dbg.location(52,4);
                    char_literal30=(Token)match(input,30,FOLLOW_30_in_m282);  
                    stream_30.add(char_literal30);

                    dbg.location(52,8);
                    pushFollow(FOLLOW_type_in_m284);
                    type31=type();

                    state._fsp--;

                    stream_type.add(type31.getTree());
                    dbg.location(52,13);
                    char_literal32=(Token)match(input,35,FOLLOW_35_in_m286);  
                    stream_35.add(char_literal32);

                    dbg.location(52,17);
                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:52:17: ( var_decl )*
                    try { dbg.enterSubRule(10);

                    loop10:
                    do {
                        int alt10=2;
                        try { dbg.enterDecision(10);

                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==29) ) {
                            alt10=1;
                        }


                        } finally {dbg.exitDecision(10);}

                        switch (alt10) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:52:17: var_decl
                    	    {
                    	    dbg.location(52,17);
                    	    pushFollow(FOLLOW_var_decl_in_m288);
                    	    var_decl33=var_decl();

                    	    state._fsp--;

                    	    stream_var_decl.add(var_decl33.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(10);}

                    dbg.location(52,27);
                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:52:27: ( instr )+
                    int cnt11=0;
                    try { dbg.enterSubRule(11);

                    loop11:
                    do {
                        int alt11=2;
                        try { dbg.enterDecision(11);

                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==ID_OTHERS||LA11_0==35||LA11_0==39||LA11_0==43||LA11_0==46||(LA11_0>=49 && LA11_0<=51)) ) {
                            alt11=1;
                        }


                        } finally {dbg.exitDecision(11);}

                        switch (alt11) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:52:27: instr
                    	    {
                    	    dbg.location(52,27);
                    	    pushFollow(FOLLOW_instr_in_m291);
                    	    instr34=instr();

                    	    state._fsp--;

                    	    stream_instr.add(instr34.getTree());

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

                    dbg.location(52,34);
                    char_literal35=(Token)match(input,36,FOLLOW_36_in_m294);  
                    stream_36.add(char_literal35);



                    // AST REWRITE
                    // elements: instr, type, var_decl
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 52:38: -> type ^( BODY ( var_decl )* ( instr )+ )
                    {
                        dbg.location(52,41);
                        adaptor.addChild(root_0, stream_type.nextTree());
                        dbg.location(52,46);
                        // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:52:46: ^( BODY ( var_decl )* ( instr )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(52,48);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_1);

                        dbg.location(52,54);
                        // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:52:54: ( var_decl )*
                        while ( stream_var_decl.hasNext() ) {
                            dbg.location(52,54);
                            adaptor.addChild(root_1, stream_var_decl.nextTree());

                        }
                        stream_var_decl.reset();
                        dbg.location(52,64);
                        if ( !(stream_instr.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_instr.hasNext() ) {
                            dbg.location(52,64);
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
        dbg.location(53, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "m");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "m"

    public static class method_args_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "method_args"
    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:56:1: method_args : ID_OTHERS ':' type ( ',' ID_OTHERS ':' type )* -> ^( ARGS ( ^( DEC_VAR ID_OTHERS type ) )* ) ;
    public final ExprParser.method_args_return method_args() throws RecognitionException {
        ExprParser.method_args_return retval = new ExprParser.method_args_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID_OTHERS36=null;
        Token char_literal37=null;
        Token char_literal39=null;
        Token ID_OTHERS40=null;
        Token char_literal41=null;
        ExprParser.type_return type38 = null;

        ExprParser.type_return type42 = null;


        Object ID_OTHERS36_tree=null;
        Object char_literal37_tree=null;
        Object char_literal39_tree=null;
        Object ID_OTHERS40_tree=null;
        Object char_literal41_tree=null;
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_ID_OTHERS=new RewriteRuleTokenStream(adaptor,"token ID_OTHERS");
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try { dbg.enterRule(getGrammarFileName(), "method_args");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(56, 1);

        try {
            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:56:13: ( ID_OTHERS ':' type ( ',' ID_OTHERS ':' type )* -> ^( ARGS ( ^( DEC_VAR ID_OTHERS type ) )* ) )
            dbg.enterAlt(1);

            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:57:2: ID_OTHERS ':' type ( ',' ID_OTHERS ':' type )*
            {
            dbg.location(57,2);
            ID_OTHERS36=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_method_args323);  
            stream_ID_OTHERS.add(ID_OTHERS36);

            dbg.location(57,12);
            char_literal37=(Token)match(input,30,FOLLOW_30_in_method_args325);  
            stream_30.add(char_literal37);

            dbg.location(57,16);
            pushFollow(FOLLOW_type_in_method_args327);
            type38=type();

            state._fsp--;

            stream_type.add(type38.getTree());
            dbg.location(57,21);
            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:57:21: ( ',' ID_OTHERS ':' type )*
            try { dbg.enterSubRule(13);

            loop13:
            do {
                int alt13=2;
                try { dbg.enterDecision(13);

                int LA13_0 = input.LA(1);

                if ( (LA13_0==37) ) {
                    alt13=1;
                }


                } finally {dbg.exitDecision(13);}

                switch (alt13) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:57:22: ',' ID_OTHERS ':' type
            	    {
            	    dbg.location(57,22);
            	    char_literal39=(Token)match(input,37,FOLLOW_37_in_method_args330);  
            	    stream_37.add(char_literal39);

            	    dbg.location(57,26);
            	    ID_OTHERS40=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_method_args332);  
            	    stream_ID_OTHERS.add(ID_OTHERS40);

            	    dbg.location(57,36);
            	    char_literal41=(Token)match(input,30,FOLLOW_30_in_method_args334);  
            	    stream_30.add(char_literal41);

            	    dbg.location(57,40);
            	    pushFollow(FOLLOW_type_in_method_args336);
            	    type42=type();

            	    state._fsp--;

            	    stream_type.add(type42.getTree());

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
            // 57:47: -> ^( ARGS ( ^( DEC_VAR ID_OTHERS type ) )* )
            {
                dbg.location(57,49);
                // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:57:49: ^( ARGS ( ^( DEC_VAR ID_OTHERS type ) )* )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(57,51);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGS, "ARGS"), root_1);

                dbg.location(57,57);
                // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:57:57: ( ^( DEC_VAR ID_OTHERS type ) )*
                while ( stream_ID_OTHERS.hasNext()||stream_type.hasNext() ) {
                    dbg.location(57,57);
                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:57:57: ^( DEC_VAR ID_OTHERS type )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    dbg.location(57,59);
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEC_VAR, "DEC_VAR"), root_2);

                    dbg.location(57,67);
                    adaptor.addChild(root_2, stream_ID_OTHERS.nextNode());
                    dbg.location(57,78);
                    adaptor.addChild(root_2, stream_type.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_ID_OTHERS.reset();
                stream_type.reset();

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
        dbg.location(58, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "method_args");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "method_args"

    public static class instr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instr"
    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:60:1: instr : ( ID_OTHERS ':=' i -> ^( AFFECT ID_OTHERS i ) | 'if' expr 'then' instr ( 'else' instr )? 'fi' -> ^( IF expr instr ( instr )? ) | 'for' ID_OTHERS 'in' expr '..' expr 'do' ( instr )+ 'end' -> ^( FOR ID_OTHERS expr expr ( instr )+ ) | '{' ( var_decl )* ( instr )+ '}' -> ^( BODY ( var_decl )* ( instr )+ ) | 'do' expr ';' -> ^( 'do' expr ) | print | read | retourne );
    public final ExprParser.instr_return instr() throws RecognitionException {
        ExprParser.instr_return retval = new ExprParser.instr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID_OTHERS43=null;
        Token string_literal44=null;
        Token string_literal46=null;
        Token string_literal48=null;
        Token string_literal50=null;
        Token string_literal52=null;
        Token string_literal53=null;
        Token ID_OTHERS54=null;
        Token string_literal55=null;
        Token string_literal57=null;
        Token string_literal59=null;
        Token string_literal61=null;
        Token char_literal62=null;
        Token char_literal65=null;
        Token string_literal66=null;
        Token char_literal68=null;
        ExprParser.i_return i45 = null;

        ExprParser.expr_return expr47 = null;

        ExprParser.instr_return instr49 = null;

        ExprParser.instr_return instr51 = null;

        ExprParser.expr_return expr56 = null;

        ExprParser.expr_return expr58 = null;

        ExprParser.instr_return instr60 = null;

        ExprParser.var_decl_return var_decl63 = null;

        ExprParser.instr_return instr64 = null;

        ExprParser.expr_return expr67 = null;

        ExprParser.print_return print69 = null;

        ExprParser.read_return read70 = null;

        ExprParser.retourne_return retourne71 = null;


        Object ID_OTHERS43_tree=null;
        Object string_literal44_tree=null;
        Object string_literal46_tree=null;
        Object string_literal48_tree=null;
        Object string_literal50_tree=null;
        Object string_literal52_tree=null;
        Object string_literal53_tree=null;
        Object ID_OTHERS54_tree=null;
        Object string_literal55_tree=null;
        Object string_literal57_tree=null;
        Object string_literal59_tree=null;
        Object string_literal61_tree=null;
        Object char_literal62_tree=null;
        Object char_literal65_tree=null;
        Object string_literal66_tree=null;
        Object char_literal68_tree=null;
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_ID_OTHERS=new RewriteRuleTokenStream(adaptor,"token ID_OTHERS");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleSubtreeStream stream_instr=new RewriteRuleSubtreeStream(adaptor,"rule instr");
        RewriteRuleSubtreeStream stream_i=new RewriteRuleSubtreeStream(adaptor,"rule i");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_var_decl=new RewriteRuleSubtreeStream(adaptor,"rule var_decl");
        try { dbg.enterRule(getGrammarFileName(), "instr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(60, 1);

        try {
            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:60:7: ( ID_OTHERS ':=' i -> ^( AFFECT ID_OTHERS i ) | 'if' expr 'then' instr ( 'else' instr )? 'fi' -> ^( IF expr instr ( instr )? ) | 'for' ID_OTHERS 'in' expr '..' expr 'do' ( instr )+ 'end' -> ^( FOR ID_OTHERS expr expr ( instr )+ ) | '{' ( var_decl )* ( instr )+ '}' -> ^( BODY ( var_decl )* ( instr )+ ) | 'do' expr ';' -> ^( 'do' expr ) | print | read | retourne )
            int alt18=8;
            try { dbg.enterDecision(18);

            switch ( input.LA(1) ) {
            case ID_OTHERS:
                {
                alt18=1;
                }
                break;
            case 39:
                {
                alt18=2;
                }
                break;
            case 43:
                {
                alt18=3;
                }
                break;
            case 35:
                {
                alt18=4;
                }
                break;
            case 46:
                {
                alt18=5;
                }
                break;
            case 49:
                {
                alt18=6;
                }
                break;
            case 50:
                {
                alt18=7;
                }
                break;
            case 51:
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

                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:61:2: ID_OTHERS ':=' i
                    {
                    dbg.location(61,2);
                    ID_OTHERS43=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_instr367);  
                    stream_ID_OTHERS.add(ID_OTHERS43);

                    dbg.location(61,12);
                    string_literal44=(Token)match(input,38,FOLLOW_38_in_instr369);  
                    stream_38.add(string_literal44);

                    dbg.location(61,17);
                    pushFollow(FOLLOW_i_in_instr371);
                    i45=i();

                    state._fsp--;

                    stream_i.add(i45.getTree());


                    // AST REWRITE
                    // elements: ID_OTHERS, i
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 61:19: -> ^( AFFECT ID_OTHERS i )
                    {
                        dbg.location(61,22);
                        // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:61:22: ^( AFFECT ID_OTHERS i )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(61,24);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AFFECT, "AFFECT"), root_1);

                        dbg.location(61,31);
                        adaptor.addChild(root_1, stream_ID_OTHERS.nextNode());
                        dbg.location(61,41);
                        adaptor.addChild(root_1, stream_i.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:62:3: 'if' expr 'then' instr ( 'else' instr )? 'fi'
                    {
                    dbg.location(62,3);
                    string_literal46=(Token)match(input,39,FOLLOW_39_in_instr385);  
                    stream_39.add(string_literal46);

                    dbg.location(62,8);
                    pushFollow(FOLLOW_expr_in_instr387);
                    expr47=expr();

                    state._fsp--;

                    stream_expr.add(expr47.getTree());
                    dbg.location(62,13);
                    string_literal48=(Token)match(input,40,FOLLOW_40_in_instr389);  
                    stream_40.add(string_literal48);

                    dbg.location(62,20);
                    pushFollow(FOLLOW_instr_in_instr391);
                    instr49=instr();

                    state._fsp--;

                    stream_instr.add(instr49.getTree());
                    dbg.location(62,26);
                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:62:26: ( 'else' instr )?
                    int alt14=2;
                    try { dbg.enterSubRule(14);
                    try { dbg.enterDecision(14);

                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==41) ) {
                        alt14=1;
                    }
                    } finally {dbg.exitDecision(14);}

                    switch (alt14) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:62:27: 'else' instr
                            {
                            dbg.location(62,27);
                            string_literal50=(Token)match(input,41,FOLLOW_41_in_instr394);  
                            stream_41.add(string_literal50);

                            dbg.location(62,34);
                            pushFollow(FOLLOW_instr_in_instr396);
                            instr51=instr();

                            state._fsp--;

                            stream_instr.add(instr51.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(14);}

                    dbg.location(62,42);
                    string_literal52=(Token)match(input,42,FOLLOW_42_in_instr400);  
                    stream_42.add(string_literal52);



                    // AST REWRITE
                    // elements: expr, instr, instr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 62:48: -> ^( IF expr instr ( instr )? )
                    {
                        dbg.location(62,51);
                        // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:62:51: ^( IF expr instr ( instr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(62,53);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);

                        dbg.location(62,56);
                        adaptor.addChild(root_1, stream_expr.nextTree());
                        dbg.location(62,61);
                        adaptor.addChild(root_1, stream_instr.nextTree());
                        dbg.location(62,67);
                        // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:62:67: ( instr )?
                        if ( stream_instr.hasNext() ) {
                            dbg.location(62,67);
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

                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:63:3: 'for' ID_OTHERS 'in' expr '..' expr 'do' ( instr )+ 'end'
                    {
                    dbg.location(63,3);
                    string_literal53=(Token)match(input,43,FOLLOW_43_in_instr418);  
                    stream_43.add(string_literal53);

                    dbg.location(63,9);
                    ID_OTHERS54=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_instr420);  
                    stream_ID_OTHERS.add(ID_OTHERS54);

                    dbg.location(63,19);
                    string_literal55=(Token)match(input,44,FOLLOW_44_in_instr422);  
                    stream_44.add(string_literal55);

                    dbg.location(63,24);
                    pushFollow(FOLLOW_expr_in_instr424);
                    expr56=expr();

                    state._fsp--;

                    stream_expr.add(expr56.getTree());
                    dbg.location(63,29);
                    string_literal57=(Token)match(input,45,FOLLOW_45_in_instr426);  
                    stream_45.add(string_literal57);

                    dbg.location(63,34);
                    pushFollow(FOLLOW_expr_in_instr428);
                    expr58=expr();

                    state._fsp--;

                    stream_expr.add(expr58.getTree());
                    dbg.location(63,39);
                    string_literal59=(Token)match(input,46,FOLLOW_46_in_instr430);  
                    stream_46.add(string_literal59);

                    dbg.location(63,44);
                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:63:44: ( instr )+
                    int cnt15=0;
                    try { dbg.enterSubRule(15);

                    loop15:
                    do {
                        int alt15=2;
                        try { dbg.enterDecision(15);

                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==ID_OTHERS||LA15_0==35||LA15_0==39||LA15_0==43||LA15_0==46||(LA15_0>=49 && LA15_0<=51)) ) {
                            alt15=1;
                        }


                        } finally {dbg.exitDecision(15);}

                        switch (alt15) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:63:44: instr
                    	    {
                    	    dbg.location(63,44);
                    	    pushFollow(FOLLOW_instr_in_instr432);
                    	    instr60=instr();

                    	    state._fsp--;

                    	    stream_instr.add(instr60.getTree());

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

                    dbg.location(63,51);
                    string_literal61=(Token)match(input,47,FOLLOW_47_in_instr435);  
                    stream_47.add(string_literal61);



                    // AST REWRITE
                    // elements: expr, ID_OTHERS, expr, instr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 63:57: -> ^( FOR ID_OTHERS expr expr ( instr )+ )
                    {
                        dbg.location(63,60);
                        // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:63:60: ^( FOR ID_OTHERS expr expr ( instr )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(63,62);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR, "FOR"), root_1);

                        dbg.location(63,66);
                        adaptor.addChild(root_1, stream_ID_OTHERS.nextNode());
                        dbg.location(63,76);
                        adaptor.addChild(root_1, stream_expr.nextTree());
                        dbg.location(63,81);
                        adaptor.addChild(root_1, stream_expr.nextTree());
                        dbg.location(63,86);
                        if ( !(stream_instr.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_instr.hasNext() ) {
                            dbg.location(63,86);
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

                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:64:3: '{' ( var_decl )* ( instr )+ '}'
                    {
                    dbg.location(64,3);
                    char_literal62=(Token)match(input,35,FOLLOW_35_in_instr454);  
                    stream_35.add(char_literal62);

                    dbg.location(64,7);
                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:64:7: ( var_decl )*
                    try { dbg.enterSubRule(16);

                    loop16:
                    do {
                        int alt16=2;
                        try { dbg.enterDecision(16);

                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==29) ) {
                            alt16=1;
                        }


                        } finally {dbg.exitDecision(16);}

                        switch (alt16) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:64:7: var_decl
                    	    {
                    	    dbg.location(64,7);
                    	    pushFollow(FOLLOW_var_decl_in_instr456);
                    	    var_decl63=var_decl();

                    	    state._fsp--;

                    	    stream_var_decl.add(var_decl63.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(16);}

                    dbg.location(64,17);
                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:64:17: ( instr )+
                    int cnt17=0;
                    try { dbg.enterSubRule(17);

                    loop17:
                    do {
                        int alt17=2;
                        try { dbg.enterDecision(17);

                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==ID_OTHERS||LA17_0==35||LA17_0==39||LA17_0==43||LA17_0==46||(LA17_0>=49 && LA17_0<=51)) ) {
                            alt17=1;
                        }


                        } finally {dbg.exitDecision(17);}

                        switch (alt17) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:64:17: instr
                    	    {
                    	    dbg.location(64,17);
                    	    pushFollow(FOLLOW_instr_in_instr459);
                    	    instr64=instr();

                    	    state._fsp--;

                    	    stream_instr.add(instr64.getTree());

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

                    dbg.location(64,24);
                    char_literal65=(Token)match(input,36,FOLLOW_36_in_instr462);  
                    stream_36.add(char_literal65);



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
                    // 64:28: -> ^( BODY ( var_decl )* ( instr )+ )
                    {
                        dbg.location(64,30);
                        // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:64:30: ^( BODY ( var_decl )* ( instr )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(64,32);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_1);

                        dbg.location(64,38);
                        // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:64:38: ( var_decl )*
                        while ( stream_var_decl.hasNext() ) {
                            dbg.location(64,38);
                            adaptor.addChild(root_1, stream_var_decl.nextTree());

                        }
                        stream_var_decl.reset();
                        dbg.location(64,48);
                        if ( !(stream_instr.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_instr.hasNext() ) {
                            dbg.location(64,48);
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

                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:65:3: 'do' expr ';'
                    {
                    dbg.location(65,3);
                    string_literal66=(Token)match(input,46,FOLLOW_46_in_instr479);  
                    stream_46.add(string_literal66);

                    dbg.location(65,8);
                    pushFollow(FOLLOW_expr_in_instr481);
                    expr67=expr();

                    state._fsp--;

                    stream_expr.add(expr67.getTree());
                    dbg.location(65,13);
                    char_literal68=(Token)match(input,31,FOLLOW_31_in_instr483);  
                    stream_31.add(char_literal68);



                    // AST REWRITE
                    // elements: expr, 46
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 65:18: -> ^( 'do' expr )
                    {
                        dbg.location(65,21);
                        // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:65:21: ^( 'do' expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(65,23);
                        root_1 = (Object)adaptor.becomeRoot(stream_46.nextNode(), root_1);

                        dbg.location(65,27);
                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:66:3: print
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(66,3);
                    pushFollow(FOLLOW_print_in_instr496);
                    print69=print();

                    state._fsp--;

                    adaptor.addChild(root_0, print69.getTree());

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:67:3: read
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(67,3);
                    pushFollow(FOLLOW_read_in_instr500);
                    read70=read();

                    state._fsp--;

                    adaptor.addChild(root_0, read70.getTree());

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:68:3: retourne
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(68,3);
                    pushFollow(FOLLOW_retourne_in_instr504);
                    retourne71=retourne();

                    state._fsp--;

                    adaptor.addChild(root_0, retourne71.getTree());

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
        dbg.location(69, 7);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "instr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "instr"

    public static class i_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "i"
    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:71:1: i : ( expr ';' -> expr | 'nil' ';' -> 'nil' );
    public final ExprParser.i_return i() throws RecognitionException {
        ExprParser.i_return retval = new ExprParser.i_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal73=null;
        Token string_literal74=null;
        Token char_literal75=null;
        ExprParser.expr_return expr72 = null;


        Object char_literal73_tree=null;
        Object string_literal74_tree=null;
        Object char_literal75_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try { dbg.enterRule(getGrammarFileName(), "i");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(71, 1);

        try {
            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:71:3: ( expr ';' -> expr | 'nil' ';' -> 'nil' )
            int alt19=2;
            try { dbg.enterDecision(19);

            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=ID_OTHERS && LA19_0<=STRING)||LA19_0==INT||LA19_0==27||(LA19_0>=52 && LA19_0<=55)) ) {
                alt19=1;
            }
            else if ( (LA19_0==48) ) {
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

                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:72:2: expr ';'
                    {
                    dbg.location(72,2);
                    pushFollow(FOLLOW_expr_in_i521);
                    expr72=expr();

                    state._fsp--;

                    stream_expr.add(expr72.getTree());
                    dbg.location(72,7);
                    char_literal73=(Token)match(input,31,FOLLOW_31_in_i523);  
                    stream_31.add(char_literal73);



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
                    // 72:11: -> expr
                    {
                        dbg.location(72,14);
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:73:4: 'nil' ';'
                    {
                    dbg.location(73,4);
                    string_literal74=(Token)match(input,48,FOLLOW_48_in_i532);  
                    stream_48.add(string_literal74);

                    dbg.location(73,10);
                    char_literal75=(Token)match(input,31,FOLLOW_31_in_i534);  
                    stream_31.add(char_literal75);



                    // AST REWRITE
                    // elements: 48
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 73:14: -> 'nil'
                    {
                        dbg.location(73,17);
                        adaptor.addChild(root_0, stream_48.nextNode());

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
        dbg.location(74, 2);

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
    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:76:1: print : 'write' expr ';' -> ^( 'write' expr ) ;
    public final ExprParser.print_return print() throws RecognitionException {
        ExprParser.print_return retval = new ExprParser.print_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal76=null;
        Token char_literal78=null;
        ExprParser.expr_return expr77 = null;


        Object string_literal76_tree=null;
        Object char_literal78_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try { dbg.enterRule(getGrammarFileName(), "print");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(76, 1);

        try {
            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:76:7: ( 'write' expr ';' -> ^( 'write' expr ) )
            dbg.enterAlt(1);

            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:77:3: 'write' expr ';'
            {
            dbg.location(77,3);
            string_literal76=(Token)match(input,49,FOLLOW_49_in_print551);  
            stream_49.add(string_literal76);

            dbg.location(77,11);
            pushFollow(FOLLOW_expr_in_print553);
            expr77=expr();

            state._fsp--;

            stream_expr.add(expr77.getTree());
            dbg.location(77,16);
            char_literal78=(Token)match(input,31,FOLLOW_31_in_print555);  
            stream_31.add(char_literal78);



            // AST REWRITE
            // elements: 49, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 77:20: -> ^( 'write' expr )
            {
                dbg.location(77,23);
                // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:77:23: ^( 'write' expr )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(77,25);
                root_1 = (Object)adaptor.becomeRoot(stream_49.nextNode(), root_1);

                dbg.location(77,33);
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
        dbg.location(78, 3);

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
    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:80:1: read : 'read' ID_OTHERS ';' -> ^( 'read' ID_OTHERS ) ;
    public final ExprParser.read_return read() throws RecognitionException {
        ExprParser.read_return retval = new ExprParser.read_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal79=null;
        Token ID_OTHERS80=null;
        Token char_literal81=null;

        Object string_literal79_tree=null;
        Object ID_OTHERS80_tree=null;
        Object char_literal81_tree=null;
        RewriteRuleTokenStream stream_ID_OTHERS=new RewriteRuleTokenStream(adaptor,"token ID_OTHERS");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");

        try { dbg.enterRule(getGrammarFileName(), "read");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(80, 1);

        try {
            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:80:6: ( 'read' ID_OTHERS ';' -> ^( 'read' ID_OTHERS ) )
            dbg.enterAlt(1);

            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:81:2: 'read' ID_OTHERS ';'
            {
            dbg.location(81,2);
            string_literal79=(Token)match(input,50,FOLLOW_50_in_read577);  
            stream_50.add(string_literal79);

            dbg.location(81,9);
            ID_OTHERS80=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_read579);  
            stream_ID_OTHERS.add(ID_OTHERS80);

            dbg.location(81,19);
            char_literal81=(Token)match(input,31,FOLLOW_31_in_read581);  
            stream_31.add(char_literal81);



            // AST REWRITE
            // elements: ID_OTHERS, 50
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 81:23: -> ^( 'read' ID_OTHERS )
            {
                dbg.location(81,26);
                // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:81:26: ^( 'read' ID_OTHERS )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(81,28);
                root_1 = (Object)adaptor.becomeRoot(stream_50.nextNode(), root_1);

                dbg.location(81,35);
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
        dbg.location(82, 2);

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
    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:84:1: retourne : 'return' '(' expr ')' ';' -> ^( RETURN expr ) ;
    public final ExprParser.retourne_return retourne() throws RecognitionException {
        ExprParser.retourne_return retval = new ExprParser.retourne_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal82=null;
        Token char_literal83=null;
        Token char_literal85=null;
        Token char_literal86=null;
        ExprParser.expr_return expr84 = null;


        Object string_literal82_tree=null;
        Object char_literal83_tree=null;
        Object char_literal85_tree=null;
        Object char_literal86_tree=null;
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try { dbg.enterRule(getGrammarFileName(), "retourne");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(84, 1);

        try {
            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:84:10: ( 'return' '(' expr ')' ';' -> ^( RETURN expr ) )
            dbg.enterAlt(1);

            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:85:2: 'return' '(' expr ')' ';'
            {
            dbg.location(85,2);
            string_literal82=(Token)match(input,51,FOLLOW_51_in_retourne600);  
            stream_51.add(string_literal82);

            dbg.location(85,11);
            char_literal83=(Token)match(input,27,FOLLOW_27_in_retourne602);  
            stream_27.add(char_literal83);

            dbg.location(85,15);
            pushFollow(FOLLOW_expr_in_retourne604);
            expr84=expr();

            state._fsp--;

            stream_expr.add(expr84.getTree());
            dbg.location(85,20);
            char_literal85=(Token)match(input,28,FOLLOW_28_in_retourne606);  
            stream_28.add(char_literal85);

            dbg.location(85,23);
            char_literal86=(Token)match(input,31,FOLLOW_31_in_retourne607);  
            stream_31.add(char_literal86);



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
            // 85:27: -> ^( RETURN expr )
            {
                dbg.location(85,30);
                // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:85:30: ^( RETURN expr )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(85,32);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RETURN, "RETURN"), root_1);

                dbg.location(85,39);
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
        dbg.location(86, 3);

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
    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:88:1: expr : ( oper e | 'this' e | 'super' e | STRING e | 'new' ID_CLASS e | '-' expr );
    public final ExprParser.expr_return expr() throws RecognitionException {
        ExprParser.expr_return retval = new ExprParser.expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal89=null;
        Token string_literal91=null;
        Token STRING93=null;
        Token string_literal95=null;
        Token ID_CLASS96=null;
        Token char_literal98=null;
        ExprParser.oper_return oper87 = null;

        ExprParser.e_return e88 = null;

        ExprParser.e_return e90 = null;

        ExprParser.e_return e92 = null;

        ExprParser.e_return e94 = null;

        ExprParser.e_return e97 = null;

        ExprParser.expr_return expr99 = null;


        Object string_literal89_tree=null;
        Object string_literal91_tree=null;
        Object STRING93_tree=null;
        Object string_literal95_tree=null;
        Object ID_CLASS96_tree=null;
        Object char_literal98_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(88, 1);

        try {
            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:88:5: ( oper e | 'this' e | 'super' e | STRING e | 'new' ID_CLASS e | '-' expr )
            int alt20=6;
            try { dbg.enterDecision(20);

            switch ( input.LA(1) ) {
            case ID_OTHERS:
            case INT:
            case 27:
                {
                alt20=1;
                }
                break;
            case 52:
                {
                alt20=2;
                }
                break;
            case 53:
                {
                alt20=3;
                }
                break;
            case STRING:
                {
                alt20=4;
                }
                break;
            case 54:
                {
                alt20=5;
                }
                break;
            case 55:
                {
                alt20=6;
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

                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:89:3: oper e
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(89,3);
                    pushFollow(FOLLOW_oper_in_expr627);
                    oper87=oper();

                    state._fsp--;

                    adaptor.addChild(root_0, oper87.getTree());
                    dbg.location(89,8);
                    pushFollow(FOLLOW_e_in_expr629);
                    e88=e();

                    state._fsp--;

                    adaptor.addChild(root_0, e88.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:90:4: 'this' e
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(90,4);
                    string_literal89=(Token)match(input,52,FOLLOW_52_in_expr634); 
                    string_literal89_tree = (Object)adaptor.create(string_literal89);
                    adaptor.addChild(root_0, string_literal89_tree);

                    dbg.location(90,11);
                    pushFollow(FOLLOW_e_in_expr636);
                    e90=e();

                    state._fsp--;

                    adaptor.addChild(root_0, e90.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:91:4: 'super' e
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(91,4);
                    string_literal91=(Token)match(input,53,FOLLOW_53_in_expr641); 
                    string_literal91_tree = (Object)adaptor.create(string_literal91);
                    adaptor.addChild(root_0, string_literal91_tree);

                    dbg.location(91,12);
                    pushFollow(FOLLOW_e_in_expr643);
                    e92=e();

                    state._fsp--;

                    adaptor.addChild(root_0, e92.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:93:4: STRING e
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(93,4);
                    STRING93=(Token)match(input,STRING,FOLLOW_STRING_in_expr650); 
                    STRING93_tree = (Object)adaptor.create(STRING93);
                    adaptor.addChild(root_0, STRING93_tree);

                    dbg.location(93,11);
                    pushFollow(FOLLOW_e_in_expr652);
                    e94=e();

                    state._fsp--;

                    adaptor.addChild(root_0, e94.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:94:4: 'new' ID_CLASS e
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(94,4);
                    string_literal95=(Token)match(input,54,FOLLOW_54_in_expr657); 
                    string_literal95_tree = (Object)adaptor.create(string_literal95);
                    adaptor.addChild(root_0, string_literal95_tree);

                    dbg.location(94,10);
                    ID_CLASS96=(Token)match(input,ID_CLASS,FOLLOW_ID_CLASS_in_expr659); 
                    ID_CLASS96_tree = (Object)adaptor.create(ID_CLASS96);
                    adaptor.addChild(root_0, ID_CLASS96_tree);

                    dbg.location(94,19);
                    pushFollow(FOLLOW_e_in_expr661);
                    e97=e();

                    state._fsp--;

                    adaptor.addChild(root_0, e97.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:96:4: '-' expr
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(96,4);
                    char_literal98=(Token)match(input,55,FOLLOW_55_in_expr668); 
                    char_literal98_tree = (Object)adaptor.create(char_literal98);
                    adaptor.addChild(root_0, char_literal98_tree);

                    dbg.location(96,8);
                    pushFollow(FOLLOW_expr_in_expr670);
                    expr99=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr99.getTree());

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
        dbg.location(97, 2);

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
    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:99:1: e : ( oper | '.' ID_OTHERS '(' ( expr ( ',' expr )* )? ')' e -> ^( ID_OTHERS ( expr )* ) ( e )? | );
    public final ExprParser.e_return e() throws RecognitionException {
        ExprParser.e_return retval = new ExprParser.e_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal101=null;
        Token ID_OTHERS102=null;
        Token char_literal103=null;
        Token char_literal105=null;
        Token char_literal107=null;
        ExprParser.oper_return oper100 = null;

        ExprParser.expr_return expr104 = null;

        ExprParser.expr_return expr106 = null;

        ExprParser.e_return e108 = null;


        Object char_literal101_tree=null;
        Object ID_OTHERS102_tree=null;
        Object char_literal103_tree=null;
        Object char_literal105_tree=null;
        Object char_literal107_tree=null;
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_ID_OTHERS=new RewriteRuleTokenStream(adaptor,"token ID_OTHERS");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try { dbg.enterRule(getGrammarFileName(), "e");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(99, 1);

        try {
            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:99:3: ( oper | '.' ID_OTHERS '(' ( expr ( ',' expr )* )? ')' e -> ^( ID_OTHERS ( expr )* ) ( e )? | )
            int alt23=3;
            try { dbg.enterDecision(23);

            switch ( input.LA(1) ) {
            case ID_OTHERS:
            case INT:
            case 27:
                {
                alt23=1;
                }
                break;
            case 56:
                {
                alt23=2;
                }
                break;
            case 28:
            case 31:
            case 37:
            case 40:
            case 45:
            case 46:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(23);}

            switch (alt23) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:100:3: oper
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(100,3);
                    pushFollow(FOLLOW_oper_in_e683);
                    oper100=oper();

                    state._fsp--;

                    adaptor.addChild(root_0, oper100.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:101:3: '.' ID_OTHERS '(' ( expr ( ',' expr )* )? ')' e
                    {
                    dbg.location(101,3);
                    char_literal101=(Token)match(input,56,FOLLOW_56_in_e687);  
                    stream_56.add(char_literal101);

                    dbg.location(101,7);
                    ID_OTHERS102=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_e689);  
                    stream_ID_OTHERS.add(ID_OTHERS102);

                    dbg.location(101,17);
                    char_literal103=(Token)match(input,27,FOLLOW_27_in_e691);  
                    stream_27.add(char_literal103);

                    dbg.location(101,21);
                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:101:21: ( expr ( ',' expr )* )?
                    int alt22=2;
                    try { dbg.enterSubRule(22);
                    try { dbg.enterDecision(22);

                    int LA22_0 = input.LA(1);

                    if ( ((LA22_0>=ID_OTHERS && LA22_0<=STRING)||LA22_0==INT||LA22_0==27||(LA22_0>=52 && LA22_0<=55)) ) {
                        alt22=1;
                    }
                    } finally {dbg.exitDecision(22);}

                    switch (alt22) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:101:22: expr ( ',' expr )*
                            {
                            dbg.location(101,22);
                            pushFollow(FOLLOW_expr_in_e694);
                            expr104=expr();

                            state._fsp--;

                            stream_expr.add(expr104.getTree());
                            dbg.location(101,27);
                            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:101:27: ( ',' expr )*
                            try { dbg.enterSubRule(21);

                            loop21:
                            do {
                                int alt21=2;
                                try { dbg.enterDecision(21);

                                int LA21_0 = input.LA(1);

                                if ( (LA21_0==37) ) {
                                    alt21=1;
                                }


                                } finally {dbg.exitDecision(21);}

                                switch (alt21) {
                            	case 1 :
                            	    dbg.enterAlt(1);

                            	    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:101:28: ',' expr
                            	    {
                            	    dbg.location(101,28);
                            	    char_literal105=(Token)match(input,37,FOLLOW_37_in_e697);  
                            	    stream_37.add(char_literal105);

                            	    dbg.location(101,32);
                            	    pushFollow(FOLLOW_expr_in_e699);
                            	    expr106=expr();

                            	    state._fsp--;

                            	    stream_expr.add(expr106.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop21;
                                }
                            } while (true);
                            } finally {dbg.exitSubRule(21);}


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(22);}

                    dbg.location(101,42);
                    char_literal107=(Token)match(input,28,FOLLOW_28_in_e706);  
                    stream_28.add(char_literal107);

                    dbg.location(101,46);
                    pushFollow(FOLLOW_e_in_e708);
                    e108=e();

                    state._fsp--;

                    stream_e.add(e108.getTree());


                    // AST REWRITE
                    // elements: e, expr, ID_OTHERS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 101:48: -> ^( ID_OTHERS ( expr )* ) ( e )?
                    {
                        dbg.location(101,51);
                        // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:101:51: ^( ID_OTHERS ( expr )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(101,53);
                        root_1 = (Object)adaptor.becomeRoot(stream_ID_OTHERS.nextNode(), root_1);

                        dbg.location(101,63);
                        // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:101:63: ( expr )*
                        while ( stream_expr.hasNext() ) {
                            dbg.location(101,63);
                            adaptor.addChild(root_1, stream_expr.nextTree());

                        }
                        stream_expr.reset();

                        adaptor.addChild(root_0, root_1);
                        }
                        dbg.location(101,71);
                        // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:101:71: ( e )?
                        if ( stream_e.hasNext() ) {
                            dbg.location(101,71);
                            adaptor.addChild(root_0, stream_e.nextTree());

                        }
                        stream_e.reset();

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:103:2: 
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
        dbg.location(103, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "e");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "e"

    public static class oper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "oper"
    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:105:1: oper : exprplus ( OPERCONDITION exprplus )? ;
    public final ExprParser.oper_return oper() throws RecognitionException {
        ExprParser.oper_return retval = new ExprParser.oper_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OPERCONDITION110=null;
        ExprParser.exprplus_return exprplus109 = null;

        ExprParser.exprplus_return exprplus111 = null;


        Object OPERCONDITION110_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "oper");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(105, 1);

        try {
            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:105:5: ( exprplus ( OPERCONDITION exprplus )? )
            dbg.enterAlt(1);

            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:106:3: exprplus ( OPERCONDITION exprplus )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(106,3);
            pushFollow(FOLLOW_exprplus_in_oper735);
            exprplus109=exprplus();

            state._fsp--;

            adaptor.addChild(root_0, exprplus109.getTree());
            dbg.location(106,11);
            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:106:11: ( OPERCONDITION exprplus )?
            int alt24=2;
            try { dbg.enterSubRule(24);
            try { dbg.enterDecision(24);

            int LA24_0 = input.LA(1);

            if ( (LA24_0==OPERCONDITION) ) {
                alt24=1;
            }
            } finally {dbg.exitDecision(24);}

            switch (alt24) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:106:13: OPERCONDITION exprplus
                    {
                    dbg.location(106,26);
                    OPERCONDITION110=(Token)match(input,OPERCONDITION,FOLLOW_OPERCONDITION_in_oper738); 
                    OPERCONDITION110_tree = (Object)adaptor.create(OPERCONDITION110);
                    root_0 = (Object)adaptor.becomeRoot(OPERCONDITION110_tree, root_0);

                    dbg.location(106,28);
                    pushFollow(FOLLOW_exprplus_in_oper741);
                    exprplus111=exprplus();

                    state._fsp--;

                    adaptor.addChild(root_0, exprplus111.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(24);}


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
        dbg.location(107, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "oper");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "oper"

    public static class exprplus_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprplus"
    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:109:1: exprplus : exprmult ( OPERPLUS exprmult )* ;
    public final ExprParser.exprplus_return exprplus() throws RecognitionException {
        ExprParser.exprplus_return retval = new ExprParser.exprplus_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OPERPLUS113=null;
        ExprParser.exprmult_return exprmult112 = null;

        ExprParser.exprmult_return exprmult114 = null;


        Object OPERPLUS113_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "exprplus");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(109, 1);

        try {
            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:109:9: ( exprmult ( OPERPLUS exprmult )* )
            dbg.enterAlt(1);

            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:110:2: exprmult ( OPERPLUS exprmult )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(110,2);
            pushFollow(FOLLOW_exprmult_in_exprplus755);
            exprmult112=exprmult();

            state._fsp--;

            adaptor.addChild(root_0, exprmult112.getTree());
            dbg.location(110,11);
            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:110:11: ( OPERPLUS exprmult )*
            try { dbg.enterSubRule(25);

            loop25:
            do {
                int alt25=2;
                try { dbg.enterDecision(25);

                int LA25_0 = input.LA(1);

                if ( (LA25_0==OPERPLUS) ) {
                    alt25=1;
                }


                } finally {dbg.exitDecision(25);}

                switch (alt25) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:110:13: OPERPLUS exprmult
            	    {
            	    dbg.location(110,21);
            	    OPERPLUS113=(Token)match(input,OPERPLUS,FOLLOW_OPERPLUS_in_exprplus759); 
            	    OPERPLUS113_tree = (Object)adaptor.create(OPERPLUS113);
            	    root_0 = (Object)adaptor.becomeRoot(OPERPLUS113_tree, root_0);

            	    dbg.location(110,23);
            	    pushFollow(FOLLOW_exprmult_in_exprplus762);
            	    exprmult114=exprmult();

            	    state._fsp--;

            	    adaptor.addChild(root_0, exprmult114.getTree());

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
        dbg.location(111, 2);

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
    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:113:1: exprmult : atom ( OPERMULT atom )* ;
    public final ExprParser.exprmult_return exprmult() throws RecognitionException {
        ExprParser.exprmult_return retval = new ExprParser.exprmult_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OPERMULT116=null;
        ExprParser.atom_return atom115 = null;

        ExprParser.atom_return atom117 = null;


        Object OPERMULT116_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "exprmult");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(113, 1);

        try {
            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:113:9: ( atom ( OPERMULT atom )* )
            dbg.enterAlt(1);

            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:114:3: atom ( OPERMULT atom )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(114,3);
            pushFollow(FOLLOW_atom_in_exprmult775);
            atom115=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom115.getTree());
            dbg.location(114,8);
            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:114:8: ( OPERMULT atom )*
            try { dbg.enterSubRule(26);

            loop26:
            do {
                int alt26=2;
                try { dbg.enterDecision(26);

                int LA26_0 = input.LA(1);

                if ( (LA26_0==OPERMULT) ) {
                    alt26=1;
                }


                } finally {dbg.exitDecision(26);}

                switch (alt26) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:114:9: OPERMULT atom
            	    {
            	    dbg.location(114,17);
            	    OPERMULT116=(Token)match(input,OPERMULT,FOLLOW_OPERMULT_in_exprmult778); 
            	    OPERMULT116_tree = (Object)adaptor.create(OPERMULT116);
            	    root_0 = (Object)adaptor.becomeRoot(OPERMULT116_tree, root_0);

            	    dbg.location(114,19);
            	    pushFollow(FOLLOW_atom_in_exprmult781);
            	    atom117=atom();

            	    state._fsp--;

            	    adaptor.addChild(root_0, atom117.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);
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
        dbg.location(115, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "exprmult");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "exprmult"

    public static class atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom"
    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:117:1: atom : ( ID_OTHERS | INT | '(' oper ')' );
    public final ExprParser.atom_return atom() throws RecognitionException {
        ExprParser.atom_return retval = new ExprParser.atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID_OTHERS118=null;
        Token INT119=null;
        Token char_literal120=null;
        Token char_literal122=null;
        ExprParser.oper_return oper121 = null;


        Object ID_OTHERS118_tree=null;
        Object INT119_tree=null;
        Object char_literal120_tree=null;
        Object char_literal122_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "atom");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(117, 1);

        try {
            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:117:5: ( ID_OTHERS | INT | '(' oper ')' )
            int alt27=3;
            try { dbg.enterDecision(27);

            switch ( input.LA(1) ) {
            case ID_OTHERS:
                {
                alt27=1;
                }
                break;
            case INT:
                {
                alt27=2;
                }
                break;
            case 27:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(27);}

            switch (alt27) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:118:2: ID_OTHERS
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(118,2);
                    ID_OTHERS118=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_atom794); 
                    ID_OTHERS118_tree = (Object)adaptor.create(ID_OTHERS118);
                    adaptor.addChild(root_0, ID_OTHERS118_tree);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:119:4: INT
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(119,4);
                    INT119=(Token)match(input,INT,FOLLOW_INT_in_atom799); 
                    INT119_tree = (Object)adaptor.create(INT119);
                    adaptor.addChild(root_0, INT119_tree);


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:120:4: '(' oper ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(120,4);
                    char_literal120=(Token)match(input,27,FOLLOW_27_in_atom804); 
                    char_literal120_tree = (Object)adaptor.create(char_literal120);
                    adaptor.addChild(root_0, char_literal120_tree);

                    dbg.location(120,7);
                    pushFollow(FOLLOW_oper_in_atom805);
                    oper121=oper();

                    state._fsp--;

                    adaptor.addChild(root_0, oper121.getTree());
                    dbg.location(120,11);
                    char_literal122=(Token)match(input,28,FOLLOW_28_in_atom806); 
                    char_literal122_tree = (Object)adaptor.create(char_literal122);
                    adaptor.addChild(root_0, char_literal122_tree);


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
        dbg.location(121, 2);

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


 

    public static final BitSet FOLLOW_class_decl_in_prog67 = new BitSet(new long[]{0x000E488821008000L});
    public static final BitSet FOLLOW_var_decl_in_prog70 = new BitSet(new long[]{0x000E488820008000L});
    public static final BitSet FOLLOW_instr_in_prog73 = new BitSet(new long[]{0x000E488820008002L});
    public static final BitSet FOLLOW_24_in_class_decl102 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_CLASS_in_class_decl104 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_25_in_class_decl107 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_CLASS_in_class_decl109 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_class_decl113 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_class_decl115 = new BitSet(new long[]{0x0000000430000000L});
    public static final BitSet FOLLOW_class_item_decl_in_class_decl117 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_class_decl119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_decl_in_class_item_decl145 = new BitSet(new long[]{0x0000000420000002L});
    public static final BitSet FOLLOW_method_decl_in_class_item_decl148 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_29_in_var_decl161 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_OTHERS_in_var_decl163 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_var_decl165 = new BitSet(new long[]{0x0000000300004000L});
    public static final BitSet FOLLOW_type_in_var_decl167 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_var_decl169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_type0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_method_decl215 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_OTHERS_in_method_decl217 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_method_decl219 = new BitSet(new long[]{0x0000000010008000L});
    public static final BitSet FOLLOW_method_args_in_method_decl222 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_method_decl225 = new BitSet(new long[]{0x0000000840000000L});
    public static final BitSet FOLLOW_m_in_method_decl227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_m256 = new BitSet(new long[]{0x000E488820008000L});
    public static final BitSet FOLLOW_var_decl_in_m258 = new BitSet(new long[]{0x000E488820008000L});
    public static final BitSet FOLLOW_instr_in_m261 = new BitSet(new long[]{0x000E489820008000L});
    public static final BitSet FOLLOW_36_in_m264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_m282 = new BitSet(new long[]{0x0000000300004000L});
    public static final BitSet FOLLOW_type_in_m284 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_m286 = new BitSet(new long[]{0x000E488820008000L});
    public static final BitSet FOLLOW_var_decl_in_m288 = new BitSet(new long[]{0x000E488820008000L});
    public static final BitSet FOLLOW_instr_in_m291 = new BitSet(new long[]{0x000E489820008000L});
    public static final BitSet FOLLOW_36_in_m294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_OTHERS_in_method_args323 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_method_args325 = new BitSet(new long[]{0x0000000300004000L});
    public static final BitSet FOLLOW_type_in_method_args327 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_method_args330 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_OTHERS_in_method_args332 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_method_args334 = new BitSet(new long[]{0x0000000300004000L});
    public static final BitSet FOLLOW_type_in_method_args336 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_ID_OTHERS_in_instr367 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_instr369 = new BitSet(new long[]{0x00F1000008118000L});
    public static final BitSet FOLLOW_i_in_instr371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_instr385 = new BitSet(new long[]{0x00F0000008118000L});
    public static final BitSet FOLLOW_expr_in_instr387 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_instr389 = new BitSet(new long[]{0x000E488820008000L});
    public static final BitSet FOLLOW_instr_in_instr391 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_41_in_instr394 = new BitSet(new long[]{0x000E488820008000L});
    public static final BitSet FOLLOW_instr_in_instr396 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_instr400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_instr418 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_OTHERS_in_instr420 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_instr422 = new BitSet(new long[]{0x00F0000008118000L});
    public static final BitSet FOLLOW_expr_in_instr424 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_instr426 = new BitSet(new long[]{0x00F0000008118000L});
    public static final BitSet FOLLOW_expr_in_instr428 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_instr430 = new BitSet(new long[]{0x000E488820008000L});
    public static final BitSet FOLLOW_instr_in_instr432 = new BitSet(new long[]{0x000EC88820008000L});
    public static final BitSet FOLLOW_47_in_instr435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_instr454 = new BitSet(new long[]{0x000E488820008000L});
    public static final BitSet FOLLOW_var_decl_in_instr456 = new BitSet(new long[]{0x000E488820008000L});
    public static final BitSet FOLLOW_instr_in_instr459 = new BitSet(new long[]{0x000E489820008000L});
    public static final BitSet FOLLOW_36_in_instr462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_instr479 = new BitSet(new long[]{0x00F0000008118000L});
    public static final BitSet FOLLOW_expr_in_instr481 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_instr483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_in_instr496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_instr500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_retourne_in_instr504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_i521 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_i523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_i532 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_i534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_print551 = new BitSet(new long[]{0x00F0000008118000L});
    public static final BitSet FOLLOW_expr_in_print553 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_print555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_read577 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_OTHERS_in_read579 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_read581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_retourne600 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_retourne602 = new BitSet(new long[]{0x00F0000008118000L});
    public static final BitSet FOLLOW_expr_in_retourne604 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_retourne606 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_retourne607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oper_in_expr627 = new BitSet(new long[]{0x0100000008108000L});
    public static final BitSet FOLLOW_e_in_expr629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_expr634 = new BitSet(new long[]{0x0100000008108000L});
    public static final BitSet FOLLOW_e_in_expr636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_expr641 = new BitSet(new long[]{0x0100000008108000L});
    public static final BitSet FOLLOW_e_in_expr643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_expr650 = new BitSet(new long[]{0x0100000008108000L});
    public static final BitSet FOLLOW_e_in_expr652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_expr657 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_CLASS_in_expr659 = new BitSet(new long[]{0x0100000008108000L});
    public static final BitSet FOLLOW_e_in_expr661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_expr668 = new BitSet(new long[]{0x00F0000008118000L});
    public static final BitSet FOLLOW_expr_in_expr670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oper_in_e683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_e687 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_OTHERS_in_e689 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_e691 = new BitSet(new long[]{0x00F0000018118000L});
    public static final BitSet FOLLOW_expr_in_e694 = new BitSet(new long[]{0x0000002010000000L});
    public static final BitSet FOLLOW_37_in_e697 = new BitSet(new long[]{0x00F0000008118000L});
    public static final BitSet FOLLOW_expr_in_e699 = new BitSet(new long[]{0x0000002010000000L});
    public static final BitSet FOLLOW_28_in_e706 = new BitSet(new long[]{0x0100000008108000L});
    public static final BitSet FOLLOW_e_in_e708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprplus_in_oper735 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_OPERCONDITION_in_oper738 = new BitSet(new long[]{0x0000000008108000L});
    public static final BitSet FOLLOW_exprplus_in_oper741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprmult_in_exprplus755 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_OPERPLUS_in_exprplus759 = new BitSet(new long[]{0x0000000008108000L});
    public static final BitSet FOLLOW_exprmult_in_exprplus762 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_atom_in_exprmult775 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_OPERMULT_in_exprmult778 = new BitSet(new long[]{0x0000000008108000L});
    public static final BitSet FOLLOW_atom_in_exprmult781 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ID_OTHERS_in_atom794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_atom804 = new BitSet(new long[]{0x0000000008108000L});
    public static final BitSet FOLLOW_oper_in_atom805 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_atom806 = new BitSet(new long[]{0x0000000000000002L});

}