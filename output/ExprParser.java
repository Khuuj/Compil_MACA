// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g 2017-02-22 15:59:17

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
        "invalidRule", "condition", "oper", "atom", "e", "method_args", 
        "type", "method_decl", "class_decl", "print", "i", "var_decl", "class_item_decl", 
        "exprplus", "read", "expr", "exprmult", "instr", "retourne", "m", 
        "prog"
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

            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:21:10: ( class_decl )* ( var_decl )* ( instr )+
            {
            dbg.location(21,10);
            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:21:10: ( class_decl )*
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

            	    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:21:10: class_decl
            	    {
            	    dbg.location(21,10);
            	    pushFollow(FOLLOW_class_decl_in_prog65);
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

            dbg.location(21,22);
            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:21:22: ( var_decl )*
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

            	    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:21:22: var_decl
            	    {
            	    dbg.location(21,22);
            	    pushFollow(FOLLOW_var_decl_in_prog68);
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

            dbg.location(21,32);
            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:21:32: ( instr )+
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

            	    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:21:32: instr
            	    {
            	    dbg.location(21,32);
            	    pushFollow(FOLLOW_instr_in_prog71);
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
            // 22:2: -> ^( ROOT ( class_decl )* ( var_decl )* ( instr )+ )
            {
                dbg.location(22,5);
                // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:22:5: ^( ROOT ( class_decl )* ( var_decl )* ( instr )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(22,7);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ROOT, "ROOT"), root_1);

                dbg.location(22,12);
                // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:22:12: ( class_decl )*
                while ( stream_class_decl.hasNext() ) {
                    dbg.location(22,12);
                    adaptor.addChild(root_1, stream_class_decl.nextTree());

                }
                stream_class_decl.reset();
                dbg.location(22,24);
                // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:22:24: ( var_decl )*
                while ( stream_var_decl.hasNext() ) {
                    dbg.location(22,24);
                    adaptor.addChild(root_1, stream_var_decl.nextTree());

                }
                stream_var_decl.reset();
                dbg.location(22,34);
                if ( !(stream_instr.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_instr.hasNext() ) {
                    dbg.location(22,34);
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

            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:26:14: 'class' ID_CLASS ( 'inherit' ID_CLASS )? '=' '(' class_item_decl ')'
            {
            dbg.location(26,14);
            string_literal4=(Token)match(input,24,FOLLOW_24_in_class_decl100);  
            stream_24.add(string_literal4);

            dbg.location(26,22);
            ID_CLASS5=(Token)match(input,ID_CLASS,FOLLOW_ID_CLASS_in_class_decl102);  
            stream_ID_CLASS.add(ID_CLASS5);

            dbg.location(26,31);
            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:26:31: ( 'inherit' ID_CLASS )?
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

                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:26:32: 'inherit' ID_CLASS
                    {
                    dbg.location(26,32);
                    string_literal6=(Token)match(input,25,FOLLOW_25_in_class_decl105);  
                    stream_25.add(string_literal6);

                    dbg.location(26,42);
                    ID_CLASS7=(Token)match(input,ID_CLASS,FOLLOW_ID_CLASS_in_class_decl107);  
                    stream_ID_CLASS.add(ID_CLASS7);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(4);}

            dbg.location(26,53);
            char_literal8=(Token)match(input,26,FOLLOW_26_in_class_decl111);  
            stream_26.add(char_literal8);

            dbg.location(26,57);
            char_literal9=(Token)match(input,27,FOLLOW_27_in_class_decl113);  
            stream_27.add(char_literal9);

            dbg.location(26,61);
            pushFollow(FOLLOW_class_item_decl_in_class_decl115);
            class_item_decl10=class_item_decl();

            state._fsp--;

            stream_class_item_decl.add(class_item_decl10.getTree());
            dbg.location(26,77);
            char_literal11=(Token)match(input,28,FOLLOW_28_in_class_decl117);  
            stream_28.add(char_literal11);



            // AST REWRITE
            // elements: ID_CLASS, class_item_decl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 27:2: -> ^( DEC_CLASS ( ID_CLASS )? class_item_decl )
            {
                dbg.location(27,4);
                // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:27:4: ^( DEC_CLASS ( ID_CLASS )? class_item_decl )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(27,6);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEC_CLASS, "DEC_CLASS"), root_1);

                dbg.location(27,16);
                // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:27:16: ( ID_CLASS )?
                if ( stream_ID_CLASS.hasNext() ) {
                    dbg.location(27,17);
                    adaptor.addChild(root_1, stream_ID_CLASS.nextNode());

                }
                stream_ID_CLASS.reset();
                dbg.location(27,29);
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
    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:30:1: class_item_decl : ( var_decl )* ( method_decl )* -> ^( BODY ( var_decl )* ( method_decl )* ) ;
    public final ExprParser.class_item_decl_return class_item_decl() throws RecognitionException {
        ExprParser.class_item_decl_return retval = new ExprParser.class_item_decl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ExprParser.var_decl_return var_decl12 = null;

        ExprParser.method_decl_return method_decl13 = null;


        RewriteRuleSubtreeStream stream_method_decl=new RewriteRuleSubtreeStream(adaptor,"rule method_decl");
        RewriteRuleSubtreeStream stream_var_decl=new RewriteRuleSubtreeStream(adaptor,"rule var_decl");
        try { dbg.enterRule(getGrammarFileName(), "class_item_decl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(30, 1);

        try {
            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:30:17: ( ( var_decl )* ( method_decl )* -> ^( BODY ( var_decl )* ( method_decl )* ) )
            dbg.enterAlt(1);

            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:30:19: ( var_decl )* ( method_decl )*
            {
            dbg.location(30,19);
            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:30:19: ( var_decl )*
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

            	    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:30:19: var_decl
            	    {
            	    dbg.location(30,19);
            	    pushFollow(FOLLOW_var_decl_in_class_item_decl142);
            	    var_decl12=var_decl();

            	    state._fsp--;

            	    stream_var_decl.add(var_decl12.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);
            } finally {dbg.exitSubRule(5);}

            dbg.location(30,29);
            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:30:29: ( method_decl )*
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

            	    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:30:29: method_decl
            	    {
            	    dbg.location(30,29);
            	    pushFollow(FOLLOW_method_decl_in_class_item_decl145);
            	    method_decl13=method_decl();

            	    state._fsp--;

            	    stream_method_decl.add(method_decl13.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);
            } finally {dbg.exitSubRule(6);}



            // AST REWRITE
            // elements: var_decl, method_decl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 31:2: -> ^( BODY ( var_decl )* ( method_decl )* )
            {
                dbg.location(31,4);
                // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:31:4: ^( BODY ( var_decl )* ( method_decl )* )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(31,6);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_1);

                dbg.location(31,11);
                // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:31:11: ( var_decl )*
                while ( stream_var_decl.hasNext() ) {
                    dbg.location(31,11);
                    adaptor.addChild(root_1, stream_var_decl.nextTree());

                }
                stream_var_decl.reset();
                dbg.location(31,21);
                // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:31:21: ( method_decl )*
                while ( stream_method_decl.hasNext() ) {
                    dbg.location(31,21);
                    adaptor.addChild(root_1, stream_method_decl.nextTree());

                }
                stream_method_decl.reset();

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
            string_literal14=(Token)match(input,29,FOLLOW_29_in_var_decl170);  
            stream_29.add(string_literal14);

            dbg.location(35,8);
            ID_OTHERS15=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_var_decl172);  
            stream_ID_OTHERS.add(ID_OTHERS15);

            dbg.location(35,18);
            char_literal16=(Token)match(input,30,FOLLOW_30_in_var_decl174);  
            stream_30.add(char_literal16);

            dbg.location(35,22);
            pushFollow(FOLLOW_type_in_var_decl176);
            type17=type();

            state._fsp--;

            stream_type.add(type17.getTree());
            dbg.location(35,27);
            char_literal18=(Token)match(input,31,FOLLOW_31_in_var_decl178);  
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
    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:46:1: method_decl : 'method' ID_OTHERS '(' method_args ')' m -> ^( METHOD ID_OTHERS method_args m ) ;
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
            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:46:13: ( 'method' ID_OTHERS '(' method_args ')' m -> ^( METHOD ID_OTHERS method_args m ) )
            dbg.enterAlt(1);

            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:47:2: 'method' ID_OTHERS '(' method_args ')' m
            {
            dbg.location(47,2);
            string_literal20=(Token)match(input,34,FOLLOW_34_in_method_decl224);  
            stream_34.add(string_literal20);

            dbg.location(47,11);
            ID_OTHERS21=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_method_decl226);  
            stream_ID_OTHERS.add(ID_OTHERS21);

            dbg.location(47,21);
            char_literal22=(Token)match(input,27,FOLLOW_27_in_method_decl228);  
            stream_27.add(char_literal22);

            dbg.location(47,26);
            pushFollow(FOLLOW_method_args_in_method_decl231);
            method_args23=method_args();

            state._fsp--;

            stream_method_args.add(method_args23.getTree());
            dbg.location(47,38);
            char_literal24=(Token)match(input,28,FOLLOW_28_in_method_decl233);  
            stream_28.add(char_literal24);

            dbg.location(47,42);
            pushFollow(FOLLOW_m_in_method_decl235);
            m25=m();

            state._fsp--;

            stream_m.add(m25.getTree());


            // AST REWRITE
            // elements: ID_OTHERS, m, method_args
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 48:2: -> ^( METHOD ID_OTHERS method_args m )
            {
                dbg.location(48,4);
                // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:48:4: ^( METHOD ID_OTHERS method_args m )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(48,6);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHOD, "METHOD"), root_1);

                dbg.location(48,13);
                adaptor.addChild(root_1, stream_ID_OTHERS.nextNode());
                dbg.location(48,25);
                adaptor.addChild(root_1, stream_method_args.nextTree());
                dbg.location(48,38);
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
        dbg.location(49, 2);

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
    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:51:1: m : ( '{' ( var_decl )* ( instr )+ '}' -> ^( BODY ( var_decl )* ( instr )+ ) | ':' type '{' ( var_decl )* ( instr )+ '}' -> type ^( BODY ( var_decl )* ( instr )+ ) );
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
        dbg.location(51, 1);

        try {
            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:51:4: ( '{' ( var_decl )* ( instr )+ '}' -> ^( BODY ( var_decl )* ( instr )+ ) | ':' type '{' ( var_decl )* ( instr )+ '}' -> type ^( BODY ( var_decl )* ( instr )+ ) )
            int alt11=2;
            try { dbg.enterDecision(11);

            int LA11_0 = input.LA(1);

            if ( (LA11_0==35) ) {
                alt11=1;
            }
            else if ( (LA11_0==30) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(11);}

            switch (alt11) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:52:2: '{' ( var_decl )* ( instr )+ '}'
                    {
                    dbg.location(52,2);
                    char_literal26=(Token)match(input,35,FOLLOW_35_in_m263);  
                    stream_35.add(char_literal26);

                    dbg.location(52,6);
                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:52:6: ( var_decl )*
                    try { dbg.enterSubRule(7);

                    loop7:
                    do {
                        int alt7=2;
                        try { dbg.enterDecision(7);

                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==29) ) {
                            alt7=1;
                        }


                        } finally {dbg.exitDecision(7);}

                        switch (alt7) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:52:6: var_decl
                    	    {
                    	    dbg.location(52,6);
                    	    pushFollow(FOLLOW_var_decl_in_m265);
                    	    var_decl27=var_decl();

                    	    state._fsp--;

                    	    stream_var_decl.add(var_decl27.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(7);}

                    dbg.location(52,16);
                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:52:16: ( instr )+
                    int cnt8=0;
                    try { dbg.enterSubRule(8);

                    loop8:
                    do {
                        int alt8=2;
                        try { dbg.enterDecision(8);

                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==ID_OTHERS||LA8_0==35||LA8_0==39||LA8_0==43||LA8_0==46||(LA8_0>=49 && LA8_0<=51)) ) {
                            alt8=1;
                        }


                        } finally {dbg.exitDecision(8);}

                        switch (alt8) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:52:16: instr
                    	    {
                    	    dbg.location(52,16);
                    	    pushFollow(FOLLOW_instr_in_m268);
                    	    instr28=instr();

                    	    state._fsp--;

                    	    stream_instr.add(instr28.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt8++;
                    } while (true);
                    } finally {dbg.exitSubRule(8);}

                    dbg.location(52,23);
                    char_literal29=(Token)match(input,36,FOLLOW_36_in_m271);  
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
                    // 52:27: -> ^( BODY ( var_decl )* ( instr )+ )
                    {
                        dbg.location(52,29);
                        // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:52:29: ^( BODY ( var_decl )* ( instr )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(52,31);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_1);

                        dbg.location(52,37);
                        // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:52:37: ( var_decl )*
                        while ( stream_var_decl.hasNext() ) {
                            dbg.location(52,37);
                            adaptor.addChild(root_1, stream_var_decl.nextTree());

                        }
                        stream_var_decl.reset();
                        dbg.location(52,47);
                        if ( !(stream_instr.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_instr.hasNext() ) {
                            dbg.location(52,47);
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

                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:53:4: ':' type '{' ( var_decl )* ( instr )+ '}'
                    {
                    dbg.location(53,4);
                    char_literal30=(Token)match(input,30,FOLLOW_30_in_m289);  
                    stream_30.add(char_literal30);

                    dbg.location(53,8);
                    pushFollow(FOLLOW_type_in_m291);
                    type31=type();

                    state._fsp--;

                    stream_type.add(type31.getTree());
                    dbg.location(53,13);
                    char_literal32=(Token)match(input,35,FOLLOW_35_in_m293);  
                    stream_35.add(char_literal32);

                    dbg.location(53,17);
                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:53:17: ( var_decl )*
                    try { dbg.enterSubRule(9);

                    loop9:
                    do {
                        int alt9=2;
                        try { dbg.enterDecision(9);

                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==29) ) {
                            alt9=1;
                        }


                        } finally {dbg.exitDecision(9);}

                        switch (alt9) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:53:17: var_decl
                    	    {
                    	    dbg.location(53,17);
                    	    pushFollow(FOLLOW_var_decl_in_m295);
                    	    var_decl33=var_decl();

                    	    state._fsp--;

                    	    stream_var_decl.add(var_decl33.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(9);}

                    dbg.location(53,27);
                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:53:27: ( instr )+
                    int cnt10=0;
                    try { dbg.enterSubRule(10);

                    loop10:
                    do {
                        int alt10=2;
                        try { dbg.enterDecision(10);

                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==ID_OTHERS||LA10_0==35||LA10_0==39||LA10_0==43||LA10_0==46||(LA10_0>=49 && LA10_0<=51)) ) {
                            alt10=1;
                        }


                        } finally {dbg.exitDecision(10);}

                        switch (alt10) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:53:27: instr
                    	    {
                    	    dbg.location(53,27);
                    	    pushFollow(FOLLOW_instr_in_m298);
                    	    instr34=instr();

                    	    state._fsp--;

                    	    stream_instr.add(instr34.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt10++;
                    } while (true);
                    } finally {dbg.exitSubRule(10);}

                    dbg.location(53,34);
                    char_literal35=(Token)match(input,36,FOLLOW_36_in_m301);  
                    stream_36.add(char_literal35);



                    // AST REWRITE
                    // elements: type, instr, var_decl
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 53:38: -> type ^( BODY ( var_decl )* ( instr )+ )
                    {
                        dbg.location(53,41);
                        adaptor.addChild(root_0, stream_type.nextTree());
                        dbg.location(53,46);
                        // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:53:46: ^( BODY ( var_decl )* ( instr )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(53,48);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_1);

                        dbg.location(53,54);
                        // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:53:54: ( var_decl )*
                        while ( stream_var_decl.hasNext() ) {
                            dbg.location(53,54);
                            adaptor.addChild(root_1, stream_var_decl.nextTree());

                        }
                        stream_var_decl.reset();
                        dbg.location(53,64);
                        if ( !(stream_instr.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_instr.hasNext() ) {
                            dbg.location(53,64);
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
        dbg.location(54, 2);

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
    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:57:1: method_args : ID_OTHERS ':' type ( ',' ID_OTHERS ':' type )* -> ^( ARGS ( ^( DEC_VAR ID_OTHERS type ) )* ) ;
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
        dbg.location(57, 1);

        try {
            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:57:13: ( ID_OTHERS ':' type ( ',' ID_OTHERS ':' type )* -> ^( ARGS ( ^( DEC_VAR ID_OTHERS type ) )* ) )
            dbg.enterAlt(1);

            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:57:15: ID_OTHERS ':' type ( ',' ID_OTHERS ':' type )*
            {
            dbg.location(57,15);
            ID_OTHERS36=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_method_args328);  
            stream_ID_OTHERS.add(ID_OTHERS36);

            dbg.location(57,25);
            char_literal37=(Token)match(input,30,FOLLOW_30_in_method_args330);  
            stream_30.add(char_literal37);

            dbg.location(57,29);
            pushFollow(FOLLOW_type_in_method_args332);
            type38=type();

            state._fsp--;

            stream_type.add(type38.getTree());
            dbg.location(57,34);
            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:57:34: ( ',' ID_OTHERS ':' type )*
            try { dbg.enterSubRule(12);

            loop12:
            do {
                int alt12=2;
                try { dbg.enterDecision(12);

                int LA12_0 = input.LA(1);

                if ( (LA12_0==37) ) {
                    alt12=1;
                }


                } finally {dbg.exitDecision(12);}

                switch (alt12) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:57:35: ',' ID_OTHERS ':' type
            	    {
            	    dbg.location(57,35);
            	    char_literal39=(Token)match(input,37,FOLLOW_37_in_method_args335);  
            	    stream_37.add(char_literal39);

            	    dbg.location(57,39);
            	    ID_OTHERS40=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_method_args337);  
            	    stream_ID_OTHERS.add(ID_OTHERS40);

            	    dbg.location(57,49);
            	    char_literal41=(Token)match(input,30,FOLLOW_30_in_method_args339);  
            	    stream_30.add(char_literal41);

            	    dbg.location(57,53);
            	    pushFollow(FOLLOW_type_in_method_args341);
            	    type42=type();

            	    state._fsp--;

            	    stream_type.add(type42.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);
            } finally {dbg.exitSubRule(12);}



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
            // 58:2: -> ^( ARGS ( ^( DEC_VAR ID_OTHERS type ) )* )
            {
                dbg.location(58,4);
                // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:58:4: ^( ARGS ( ^( DEC_VAR ID_OTHERS type ) )* )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(58,6);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGS, "ARGS"), root_1);

                dbg.location(58,12);
                // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:58:12: ( ^( DEC_VAR ID_OTHERS type ) )*
                while ( stream_type.hasNext()||stream_ID_OTHERS.hasNext() ) {
                    dbg.location(58,12);
                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:58:12: ^( DEC_VAR ID_OTHERS type )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    dbg.location(58,14);
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEC_VAR, "DEC_VAR"), root_2);

                    dbg.location(58,22);
                    adaptor.addChild(root_2, stream_ID_OTHERS.nextNode());
                    dbg.location(58,33);
                    adaptor.addChild(root_2, stream_type.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_type.reset();
                stream_ID_OTHERS.reset();

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
        dbg.location(59, 2);

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
    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:61:1: instr : ( ID_OTHERS ':=' i -> ^( AFFECT ID_OTHERS i ) | 'if' expr 'then' instr ( 'else' instr )? 'fi' -> ^( IF expr instr ( instr )? ) | 'for' ID_OTHERS 'in' expr '..' expr 'do' ( instr )+ 'end' -> ^( FOR ID_OTHERS expr expr ( instr )+ ) | '{' ( var_decl )* ( instr )+ '}' -> ^( BODY ( var_decl )* ( instr )+ ) | 'do' expr ';' | print | read | retourne );
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
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleSubtreeStream stream_instr=new RewriteRuleSubtreeStream(adaptor,"rule instr");
        RewriteRuleSubtreeStream stream_i=new RewriteRuleSubtreeStream(adaptor,"rule i");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_var_decl=new RewriteRuleSubtreeStream(adaptor,"rule var_decl");
        try { dbg.enterRule(getGrammarFileName(), "instr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(61, 1);

        try {
            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:61:7: ( ID_OTHERS ':=' i -> ^( AFFECT ID_OTHERS i ) | 'if' expr 'then' instr ( 'else' instr )? 'fi' -> ^( IF expr instr ( instr )? ) | 'for' ID_OTHERS 'in' expr '..' expr 'do' ( instr )+ 'end' -> ^( FOR ID_OTHERS expr expr ( instr )+ ) | '{' ( var_decl )* ( instr )+ '}' -> ^( BODY ( var_decl )* ( instr )+ ) | 'do' expr ';' | print | read | retourne )
            int alt17=8;
            try { dbg.enterDecision(17);

            switch ( input.LA(1) ) {
            case ID_OTHERS:
                {
                alt17=1;
                }
                break;
            case 39:
                {
                alt17=2;
                }
                break;
            case 43:
                {
                alt17=3;
                }
                break;
            case 35:
                {
                alt17=4;
                }
                break;
            case 46:
                {
                alt17=5;
                }
                break;
            case 49:
                {
                alt17=6;
                }
                break;
            case 50:
                {
                alt17=7;
                }
                break;
            case 51:
                {
                alt17=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(17);}

            switch (alt17) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:62:2: ID_OTHERS ':=' i
                    {
                    dbg.location(62,2);
                    ID_OTHERS43=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_instr373);  
                    stream_ID_OTHERS.add(ID_OTHERS43);

                    dbg.location(62,12);
                    string_literal44=(Token)match(input,38,FOLLOW_38_in_instr375);  
                    stream_38.add(string_literal44);

                    dbg.location(62,17);
                    pushFollow(FOLLOW_i_in_instr377);
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
                    // 62:19: -> ^( AFFECT ID_OTHERS i )
                    {
                        dbg.location(62,22);
                        // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:62:22: ^( AFFECT ID_OTHERS i )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(62,24);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AFFECT, "AFFECT"), root_1);

                        dbg.location(62,31);
                        adaptor.addChild(root_1, stream_ID_OTHERS.nextNode());
                        dbg.location(62,41);
                        adaptor.addChild(root_1, stream_i.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:63:3: 'if' expr 'then' instr ( 'else' instr )? 'fi'
                    {
                    dbg.location(63,3);
                    string_literal46=(Token)match(input,39,FOLLOW_39_in_instr391);  
                    stream_39.add(string_literal46);

                    dbg.location(63,8);
                    pushFollow(FOLLOW_expr_in_instr393);
                    expr47=expr();

                    state._fsp--;

                    stream_expr.add(expr47.getTree());
                    dbg.location(63,13);
                    string_literal48=(Token)match(input,40,FOLLOW_40_in_instr395);  
                    stream_40.add(string_literal48);

                    dbg.location(63,20);
                    pushFollow(FOLLOW_instr_in_instr397);
                    instr49=instr();

                    state._fsp--;

                    stream_instr.add(instr49.getTree());
                    dbg.location(63,26);
                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:63:26: ( 'else' instr )?
                    int alt13=2;
                    try { dbg.enterSubRule(13);
                    try { dbg.enterDecision(13);

                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==41) ) {
                        alt13=1;
                    }
                    } finally {dbg.exitDecision(13);}

                    switch (alt13) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:63:27: 'else' instr
                            {
                            dbg.location(63,27);
                            string_literal50=(Token)match(input,41,FOLLOW_41_in_instr400);  
                            stream_41.add(string_literal50);

                            dbg.location(63,34);
                            pushFollow(FOLLOW_instr_in_instr402);
                            instr51=instr();

                            state._fsp--;

                            stream_instr.add(instr51.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(13);}

                    dbg.location(63,42);
                    string_literal52=(Token)match(input,42,FOLLOW_42_in_instr406);  
                    stream_42.add(string_literal52);



                    // AST REWRITE
                    // elements: instr, instr, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 63:48: -> ^( IF expr instr ( instr )? )
                    {
                        dbg.location(63,51);
                        // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:63:51: ^( IF expr instr ( instr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(63,53);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);

                        dbg.location(63,56);
                        adaptor.addChild(root_1, stream_expr.nextTree());
                        dbg.location(63,61);
                        adaptor.addChild(root_1, stream_instr.nextTree());
                        dbg.location(63,67);
                        // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:63:67: ( instr )?
                        if ( stream_instr.hasNext() ) {
                            dbg.location(63,67);
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

                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:64:3: 'for' ID_OTHERS 'in' expr '..' expr 'do' ( instr )+ 'end'
                    {
                    dbg.location(64,3);
                    string_literal53=(Token)match(input,43,FOLLOW_43_in_instr424);  
                    stream_43.add(string_literal53);

                    dbg.location(64,9);
                    ID_OTHERS54=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_instr426);  
                    stream_ID_OTHERS.add(ID_OTHERS54);

                    dbg.location(64,19);
                    string_literal55=(Token)match(input,44,FOLLOW_44_in_instr428);  
                    stream_44.add(string_literal55);

                    dbg.location(64,24);
                    pushFollow(FOLLOW_expr_in_instr430);
                    expr56=expr();

                    state._fsp--;

                    stream_expr.add(expr56.getTree());
                    dbg.location(64,29);
                    string_literal57=(Token)match(input,45,FOLLOW_45_in_instr432);  
                    stream_45.add(string_literal57);

                    dbg.location(64,34);
                    pushFollow(FOLLOW_expr_in_instr434);
                    expr58=expr();

                    state._fsp--;

                    stream_expr.add(expr58.getTree());
                    dbg.location(64,39);
                    string_literal59=(Token)match(input,46,FOLLOW_46_in_instr436);  
                    stream_46.add(string_literal59);

                    dbg.location(64,44);
                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:64:44: ( instr )+
                    int cnt14=0;
                    try { dbg.enterSubRule(14);

                    loop14:
                    do {
                        int alt14=2;
                        try { dbg.enterDecision(14);

                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==ID_OTHERS||LA14_0==35||LA14_0==39||LA14_0==43||LA14_0==46||(LA14_0>=49 && LA14_0<=51)) ) {
                            alt14=1;
                        }


                        } finally {dbg.exitDecision(14);}

                        switch (alt14) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:64:44: instr
                    	    {
                    	    dbg.location(64,44);
                    	    pushFollow(FOLLOW_instr_in_instr438);
                    	    instr60=instr();

                    	    state._fsp--;

                    	    stream_instr.add(instr60.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt14++;
                    } while (true);
                    } finally {dbg.exitSubRule(14);}

                    dbg.location(64,51);
                    string_literal61=(Token)match(input,47,FOLLOW_47_in_instr441);  
                    stream_47.add(string_literal61);



                    // AST REWRITE
                    // elements: expr, ID_OTHERS, instr, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 64:57: -> ^( FOR ID_OTHERS expr expr ( instr )+ )
                    {
                        dbg.location(64,60);
                        // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:64:60: ^( FOR ID_OTHERS expr expr ( instr )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(64,62);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR, "FOR"), root_1);

                        dbg.location(64,66);
                        adaptor.addChild(root_1, stream_ID_OTHERS.nextNode());
                        dbg.location(64,76);
                        adaptor.addChild(root_1, stream_expr.nextTree());
                        dbg.location(64,81);
                        adaptor.addChild(root_1, stream_expr.nextTree());
                        dbg.location(64,86);
                        if ( !(stream_instr.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_instr.hasNext() ) {
                            dbg.location(64,86);
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

                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:65:3: '{' ( var_decl )* ( instr )+ '}'
                    {
                    dbg.location(65,3);
                    char_literal62=(Token)match(input,35,FOLLOW_35_in_instr460);  
                    stream_35.add(char_literal62);

                    dbg.location(65,7);
                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:65:7: ( var_decl )*
                    try { dbg.enterSubRule(15);

                    loop15:
                    do {
                        int alt15=2;
                        try { dbg.enterDecision(15);

                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==29) ) {
                            alt15=1;
                        }


                        } finally {dbg.exitDecision(15);}

                        switch (alt15) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:65:7: var_decl
                    	    {
                    	    dbg.location(65,7);
                    	    pushFollow(FOLLOW_var_decl_in_instr462);
                    	    var_decl63=var_decl();

                    	    state._fsp--;

                    	    stream_var_decl.add(var_decl63.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(15);}

                    dbg.location(65,17);
                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:65:17: ( instr )+
                    int cnt16=0;
                    try { dbg.enterSubRule(16);

                    loop16:
                    do {
                        int alt16=2;
                        try { dbg.enterDecision(16);

                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==ID_OTHERS||LA16_0==35||LA16_0==39||LA16_0==43||LA16_0==46||(LA16_0>=49 && LA16_0<=51)) ) {
                            alt16=1;
                        }


                        } finally {dbg.exitDecision(16);}

                        switch (alt16) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:65:17: instr
                    	    {
                    	    dbg.location(65,17);
                    	    pushFollow(FOLLOW_instr_in_instr465);
                    	    instr64=instr();

                    	    state._fsp--;

                    	    stream_instr.add(instr64.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt16 >= 1 ) break loop16;
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt16++;
                    } while (true);
                    } finally {dbg.exitSubRule(16);}

                    dbg.location(65,24);
                    char_literal65=(Token)match(input,36,FOLLOW_36_in_instr468);  
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
                    // 65:28: -> ^( BODY ( var_decl )* ( instr )+ )
                    {
                        dbg.location(65,30);
                        // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:65:30: ^( BODY ( var_decl )* ( instr )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(65,32);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_1);

                        dbg.location(65,38);
                        // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:65:38: ( var_decl )*
                        while ( stream_var_decl.hasNext() ) {
                            dbg.location(65,38);
                            adaptor.addChild(root_1, stream_var_decl.nextTree());

                        }
                        stream_var_decl.reset();
                        dbg.location(65,48);
                        if ( !(stream_instr.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_instr.hasNext() ) {
                            dbg.location(65,48);
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

                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:66:3: 'do' expr ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(66,3);
                    string_literal66=(Token)match(input,46,FOLLOW_46_in_instr485); 
                    string_literal66_tree = (Object)adaptor.create(string_literal66);
                    adaptor.addChild(root_0, string_literal66_tree);

                    dbg.location(66,8);
                    pushFollow(FOLLOW_expr_in_instr487);
                    expr67=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr67.getTree());
                    dbg.location(66,13);
                    char_literal68=(Token)match(input,31,FOLLOW_31_in_instr489); 
                    char_literal68_tree = (Object)adaptor.create(char_literal68);
                    adaptor.addChild(root_0, char_literal68_tree);


                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:67:3: print
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(67,3);
                    pushFollow(FOLLOW_print_in_instr493);
                    print69=print();

                    state._fsp--;

                    adaptor.addChild(root_0, print69.getTree());

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:68:3: read
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(68,3);
                    pushFollow(FOLLOW_read_in_instr497);
                    read70=read();

                    state._fsp--;

                    adaptor.addChild(root_0, read70.getTree());

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:69:3: retourne
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(69,3);
                    pushFollow(FOLLOW_retourne_in_instr501);
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
        dbg.location(70, 7);

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
    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:72:1: i : ( expr ';' -> expr | 'nil' ';' -> 'nil' );
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
        dbg.location(72, 1);

        try {
            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:72:3: ( expr ';' -> expr | 'nil' ';' -> 'nil' )
            int alt18=2;
            try { dbg.enterDecision(18);

            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=ID_OTHERS && LA18_0<=STRING)||LA18_0==INT||LA18_0==27||(LA18_0>=52 && LA18_0<=55)) ) {
                alt18=1;
            }
            else if ( (LA18_0==48) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(18);}

            switch (alt18) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:73:2: expr ';'
                    {
                    dbg.location(73,2);
                    pushFollow(FOLLOW_expr_in_i518);
                    expr72=expr();

                    state._fsp--;

                    stream_expr.add(expr72.getTree());
                    dbg.location(73,7);
                    char_literal73=(Token)match(input,31,FOLLOW_31_in_i520);  
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
                    // 73:11: -> expr
                    {
                        dbg.location(73,14);
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:74:4: 'nil' ';'
                    {
                    dbg.location(74,4);
                    string_literal74=(Token)match(input,48,FOLLOW_48_in_i529);  
                    stream_48.add(string_literal74);

                    dbg.location(74,10);
                    char_literal75=(Token)match(input,31,FOLLOW_31_in_i531);  
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
                    // 74:14: -> 'nil'
                    {
                        dbg.location(74,17);
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
        dbg.location(75, 2);

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
    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:77:1: print : 'write' expr ';' -> ^( 'write' expr ) ;
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
        dbg.location(77, 1);

        try {
            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:77:7: ( 'write' expr ';' -> ^( 'write' expr ) )
            dbg.enterAlt(1);

            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:77:9: 'write' expr ';'
            {
            dbg.location(77,9);
            string_literal76=(Token)match(input,49,FOLLOW_49_in_print546);  
            stream_49.add(string_literal76);

            dbg.location(77,17);
            pushFollow(FOLLOW_expr_in_print548);
            expr77=expr();

            state._fsp--;

            stream_expr.add(expr77.getTree());
            dbg.location(77,22);
            char_literal78=(Token)match(input,31,FOLLOW_31_in_print550);  
            stream_31.add(char_literal78);



            // AST REWRITE
            // elements: expr, 49
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 77:26: -> ^( 'write' expr )
            {
                dbg.location(77,29);
                // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:77:29: ^( 'write' expr )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(77,31);
                root_1 = (Object)adaptor.becomeRoot(stream_49.nextNode(), root_1);

                dbg.location(77,39);
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
        dbg.location(77, 45);

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
    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:79:1: read : 'read' ID_OTHERS ';' -> ^( 'read' ID_OTHERS ) ;
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
        dbg.location(79, 1);

        try {
            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:79:6: ( 'read' ID_OTHERS ';' -> ^( 'read' ID_OTHERS ) )
            dbg.enterAlt(1);

            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:79:8: 'read' ID_OTHERS ';'
            {
            dbg.location(79,8);
            string_literal79=(Token)match(input,50,FOLLOW_50_in_read567);  
            stream_50.add(string_literal79);

            dbg.location(79,15);
            ID_OTHERS80=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_read569);  
            stream_ID_OTHERS.add(ID_OTHERS80);

            dbg.location(79,25);
            char_literal81=(Token)match(input,31,FOLLOW_31_in_read571);  
            stream_31.add(char_literal81);



            // AST REWRITE
            // elements: 50, ID_OTHERS
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 79:29: -> ^( 'read' ID_OTHERS )
            {
                dbg.location(79,32);
                // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:79:32: ^( 'read' ID_OTHERS )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(79,34);
                root_1 = (Object)adaptor.becomeRoot(stream_50.nextNode(), root_1);

                dbg.location(79,41);
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
        dbg.location(79, 51);

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
    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:81:1: retourne : 'return' '(' expr ')' ';' -> ^( RETURN expr ) ;
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
        dbg.location(81, 1);

        try {
            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:81:10: ( 'return' '(' expr ')' ';' -> ^( RETURN expr ) )
            dbg.enterAlt(1);

            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:82:2: 'return' '(' expr ')' ';'
            {
            dbg.location(82,2);
            string_literal82=(Token)match(input,51,FOLLOW_51_in_retourne588);  
            stream_51.add(string_literal82);

            dbg.location(82,11);
            char_literal83=(Token)match(input,27,FOLLOW_27_in_retourne590);  
            stream_27.add(char_literal83);

            dbg.location(82,15);
            pushFollow(FOLLOW_expr_in_retourne592);
            expr84=expr();

            state._fsp--;

            stream_expr.add(expr84.getTree());
            dbg.location(82,20);
            char_literal85=(Token)match(input,28,FOLLOW_28_in_retourne594);  
            stream_28.add(char_literal85);

            dbg.location(82,23);
            char_literal86=(Token)match(input,31,FOLLOW_31_in_retourne595);  
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
            // 83:3: -> ^( RETURN expr )
            {
                dbg.location(83,6);
                // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:83:6: ^( RETURN expr )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(83,8);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RETURN, "RETURN"), root_1);

                dbg.location(83,15);
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
        dbg.location(84, 3);

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
    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:86:1: expr : ( oper e | 'this' e | 'super' e | STRING e | 'new' ID_CLASS e | '-' expr );
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
        dbg.location(86, 1);

        try {
            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:87:2: ( oper e | 'this' e | 'super' e | STRING e | 'new' ID_CLASS e | '-' expr )
            int alt19=6;
            try { dbg.enterDecision(19);

            switch ( input.LA(1) ) {
            case ID_OTHERS:
            case INT:
            case 27:
                {
                alt19=1;
                }
                break;
            case 52:
                {
                alt19=2;
                }
                break;
            case 53:
                {
                alt19=3;
                }
                break;
            case STRING:
                {
                alt19=4;
                }
                break;
            case 54:
                {
                alt19=5;
                }
                break;
            case 55:
                {
                alt19=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(19);}

            switch (alt19) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:87:4: oper e
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(87,4);
                    pushFollow(FOLLOW_oper_in_expr617);
                    oper87=oper();

                    state._fsp--;

                    adaptor.addChild(root_0, oper87.getTree());
                    dbg.location(87,9);
                    pushFollow(FOLLOW_e_in_expr619);
                    e88=e();

                    state._fsp--;

                    adaptor.addChild(root_0, e88.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:88:4: 'this' e
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(88,4);
                    string_literal89=(Token)match(input,52,FOLLOW_52_in_expr624); 
                    string_literal89_tree = (Object)adaptor.create(string_literal89);
                    adaptor.addChild(root_0, string_literal89_tree);

                    dbg.location(88,11);
                    pushFollow(FOLLOW_e_in_expr626);
                    e90=e();

                    state._fsp--;

                    adaptor.addChild(root_0, e90.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:89:4: 'super' e
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(89,4);
                    string_literal91=(Token)match(input,53,FOLLOW_53_in_expr631); 
                    string_literal91_tree = (Object)adaptor.create(string_literal91);
                    adaptor.addChild(root_0, string_literal91_tree);

                    dbg.location(89,12);
                    pushFollow(FOLLOW_e_in_expr633);
                    e92=e();

                    state._fsp--;

                    adaptor.addChild(root_0, e92.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:91:4: STRING e
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(91,4);
                    STRING93=(Token)match(input,STRING,FOLLOW_STRING_in_expr640); 
                    STRING93_tree = (Object)adaptor.create(STRING93);
                    adaptor.addChild(root_0, STRING93_tree);

                    dbg.location(91,11);
                    pushFollow(FOLLOW_e_in_expr642);
                    e94=e();

                    state._fsp--;

                    adaptor.addChild(root_0, e94.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:92:4: 'new' ID_CLASS e
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(92,4);
                    string_literal95=(Token)match(input,54,FOLLOW_54_in_expr647); 
                    string_literal95_tree = (Object)adaptor.create(string_literal95);
                    adaptor.addChild(root_0, string_literal95_tree);

                    dbg.location(92,10);
                    ID_CLASS96=(Token)match(input,ID_CLASS,FOLLOW_ID_CLASS_in_expr649); 
                    ID_CLASS96_tree = (Object)adaptor.create(ID_CLASS96);
                    adaptor.addChild(root_0, ID_CLASS96_tree);

                    dbg.location(92,19);
                    pushFollow(FOLLOW_e_in_expr651);
                    e97=e();

                    state._fsp--;

                    adaptor.addChild(root_0, e97.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:94:4: '-' expr
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(94,4);
                    char_literal98=(Token)match(input,55,FOLLOW_55_in_expr658); 
                    char_literal98_tree = (Object)adaptor.create(char_literal98);
                    adaptor.addChild(root_0, char_literal98_tree);

                    dbg.location(94,8);
                    pushFollow(FOLLOW_expr_in_expr660);
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
        dbg.location(95, 2);

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
    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:97:1: e : ( oper | '.' ID_OTHERS '(' ( expr ( ',' expr )* )? ')' e -> ^( ID_OTHERS ( expr ( expr )* )? ) | );
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
        dbg.location(97, 1);

        try {
            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:97:4: ( oper | '.' ID_OTHERS '(' ( expr ( ',' expr )* )? ')' e -> ^( ID_OTHERS ( expr ( expr )* )? ) | )
            int alt22=3;
            try { dbg.enterDecision(22);

            switch ( input.LA(1) ) {
            case ID_OTHERS:
            case INT:
            case 27:
                {
                alt22=1;
                }
                break;
            case 56:
                {
                alt22=2;
                }
                break;
            case 28:
            case 31:
            case 37:
            case 40:
            case 45:
            case 46:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(22);}

            switch (alt22) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:97:6: oper
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(97,6);
                    pushFollow(FOLLOW_oper_in_e672);
                    oper100=oper();

                    state._fsp--;

                    adaptor.addChild(root_0, oper100.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:98:3: '.' ID_OTHERS '(' ( expr ( ',' expr )* )? ')' e
                    {
                    dbg.location(98,3);
                    char_literal101=(Token)match(input,56,FOLLOW_56_in_e676);  
                    stream_56.add(char_literal101);

                    dbg.location(98,7);
                    ID_OTHERS102=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_e678);  
                    stream_ID_OTHERS.add(ID_OTHERS102);

                    dbg.location(98,17);
                    char_literal103=(Token)match(input,27,FOLLOW_27_in_e680);  
                    stream_27.add(char_literal103);

                    dbg.location(98,21);
                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:98:21: ( expr ( ',' expr )* )?
                    int alt21=2;
                    try { dbg.enterSubRule(21);
                    try { dbg.enterDecision(21);

                    int LA21_0 = input.LA(1);

                    if ( ((LA21_0>=ID_OTHERS && LA21_0<=STRING)||LA21_0==INT||LA21_0==27||(LA21_0>=52 && LA21_0<=55)) ) {
                        alt21=1;
                    }
                    } finally {dbg.exitDecision(21);}

                    switch (alt21) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:98:22: expr ( ',' expr )*
                            {
                            dbg.location(98,22);
                            pushFollow(FOLLOW_expr_in_e683);
                            expr104=expr();

                            state._fsp--;

                            stream_expr.add(expr104.getTree());
                            dbg.location(98,27);
                            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:98:27: ( ',' expr )*
                            try { dbg.enterSubRule(20);

                            loop20:
                            do {
                                int alt20=2;
                                try { dbg.enterDecision(20);

                                int LA20_0 = input.LA(1);

                                if ( (LA20_0==37) ) {
                                    alt20=1;
                                }


                                } finally {dbg.exitDecision(20);}

                                switch (alt20) {
                            	case 1 :
                            	    dbg.enterAlt(1);

                            	    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:98:28: ',' expr
                            	    {
                            	    dbg.location(98,28);
                            	    char_literal105=(Token)match(input,37,FOLLOW_37_in_e686);  
                            	    stream_37.add(char_literal105);

                            	    dbg.location(98,32);
                            	    pushFollow(FOLLOW_expr_in_e688);
                            	    expr106=expr();

                            	    state._fsp--;

                            	    stream_expr.add(expr106.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop20;
                                }
                            } while (true);
                            } finally {dbg.exitSubRule(20);}


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(21);}

                    dbg.location(98,42);
                    char_literal107=(Token)match(input,28,FOLLOW_28_in_e695);  
                    stream_28.add(char_literal107);

                    dbg.location(98,46);
                    pushFollow(FOLLOW_e_in_e697);
                    e108=e();

                    state._fsp--;

                    stream_e.add(e108.getTree());


                    // AST REWRITE
                    // elements: expr, ID_OTHERS, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 98:48: -> ^( ID_OTHERS ( expr ( expr )* )? )
                    {
                        dbg.location(98,51);
                        // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:98:51: ^( ID_OTHERS ( expr ( expr )* )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(98,53);
                        root_1 = (Object)adaptor.becomeRoot(stream_ID_OTHERS.nextNode(), root_1);

                        dbg.location(98,63);
                        // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:98:63: ( expr ( expr )* )?
                        if ( stream_expr.hasNext()||stream_expr.hasNext() ) {
                            dbg.location(98,64);
                            adaptor.addChild(root_1, stream_expr.nextTree());
                            dbg.location(98,69);
                            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:98:69: ( expr )*
                            while ( stream_expr.hasNext() ) {
                                dbg.location(98,69);
                                adaptor.addChild(root_1, stream_expr.nextTree());

                            }
                            stream_expr.reset();

                        }
                        stream_expr.reset();
                        stream_expr.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:100:2: 
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
        dbg.location(100, 2);

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
    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:102:1: oper : condition ;
    public final ExprParser.oper_return oper() throws RecognitionException {
        ExprParser.oper_return retval = new ExprParser.oper_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ExprParser.condition_return condition109 = null;



        try { dbg.enterRule(getGrammarFileName(), "oper");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(102, 1);

        try {
            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:103:2: ( condition )
            dbg.enterAlt(1);

            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:103:3: condition
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(103,3);
            pushFollow(FOLLOW_condition_in_oper724);
            condition109=condition();

            state._fsp--;

            adaptor.addChild(root_0, condition109.getTree());

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
        dbg.location(104, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "oper");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "oper"

    public static class condition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condition"
    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:106:1: condition : exprplus ( OPERCONDITION exprplus )? ;
    public final ExprParser.condition_return condition() throws RecognitionException {
        ExprParser.condition_return retval = new ExprParser.condition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OPERCONDITION111=null;
        ExprParser.exprplus_return exprplus110 = null;

        ExprParser.exprplus_return exprplus112 = null;


        Object OPERCONDITION111_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "condition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(106, 1);

        try {
            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:107:2: ( exprplus ( OPERCONDITION exprplus )? )
            dbg.enterAlt(1);

            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:107:4: exprplus ( OPERCONDITION exprplus )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(107,4);
            pushFollow(FOLLOW_exprplus_in_condition735);
            exprplus110=exprplus();

            state._fsp--;

            adaptor.addChild(root_0, exprplus110.getTree());
            dbg.location(107,12);
            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:107:12: ( OPERCONDITION exprplus )?
            int alt23=2;
            try { dbg.enterSubRule(23);
            try { dbg.enterDecision(23);

            int LA23_0 = input.LA(1);

            if ( (LA23_0==OPERCONDITION) ) {
                alt23=1;
            }
            } finally {dbg.exitDecision(23);}

            switch (alt23) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:107:14: OPERCONDITION exprplus
                    {
                    dbg.location(107,27);
                    OPERCONDITION111=(Token)match(input,OPERCONDITION,FOLLOW_OPERCONDITION_in_condition738); 
                    OPERCONDITION111_tree = (Object)adaptor.create(OPERCONDITION111);
                    root_0 = (Object)adaptor.becomeRoot(OPERCONDITION111_tree, root_0);

                    dbg.location(107,29);
                    pushFollow(FOLLOW_exprplus_in_condition741);
                    exprplus112=exprplus();

                    state._fsp--;

                    adaptor.addChild(root_0, exprplus112.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(23);}


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
        dbg.location(108, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "condition");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "condition"

    public static class exprplus_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprplus"
    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:110:1: exprplus : exprmult ( OPERPLUS exprmult )* ;
    public final ExprParser.exprplus_return exprplus() throws RecognitionException {
        ExprParser.exprplus_return retval = new ExprParser.exprplus_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OPERPLUS114=null;
        ExprParser.exprmult_return exprmult113 = null;

        ExprParser.exprmult_return exprmult115 = null;


        Object OPERPLUS114_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "exprplus");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(110, 1);

        try {
            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:111:2: ( exprmult ( OPERPLUS exprmult )* )
            dbg.enterAlt(1);

            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:111:4: exprmult ( OPERPLUS exprmult )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(111,4);
            pushFollow(FOLLOW_exprmult_in_exprplus755);
            exprmult113=exprmult();

            state._fsp--;

            adaptor.addChild(root_0, exprmult113.getTree());
            dbg.location(111,13);
            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:111:13: ( OPERPLUS exprmult )*
            try { dbg.enterSubRule(24);

            loop24:
            do {
                int alt24=2;
                try { dbg.enterDecision(24);

                int LA24_0 = input.LA(1);

                if ( (LA24_0==OPERPLUS) ) {
                    alt24=1;
                }


                } finally {dbg.exitDecision(24);}

                switch (alt24) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:111:15: OPERPLUS exprmult
            	    {
            	    dbg.location(111,23);
            	    OPERPLUS114=(Token)match(input,OPERPLUS,FOLLOW_OPERPLUS_in_exprplus759); 
            	    OPERPLUS114_tree = (Object)adaptor.create(OPERPLUS114);
            	    root_0 = (Object)adaptor.becomeRoot(OPERPLUS114_tree, root_0);

            	    dbg.location(111,25);
            	    pushFollow(FOLLOW_exprmult_in_exprplus762);
            	    exprmult115=exprmult();

            	    state._fsp--;

            	    adaptor.addChild(root_0, exprmult115.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);
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
        dbg.location(112, 2);

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
    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:114:1: exprmult : atom ( OPERMULT atom )* ;
    public final ExprParser.exprmult_return exprmult() throws RecognitionException {
        ExprParser.exprmult_return retval = new ExprParser.exprmult_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OPERMULT117=null;
        ExprParser.atom_return atom116 = null;

        ExprParser.atom_return atom118 = null;


        Object OPERMULT117_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "exprmult");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(114, 1);

        try {
            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:115:2: ( atom ( OPERMULT atom )* )
            dbg.enterAlt(1);

            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:115:4: atom ( OPERMULT atom )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(115,4);
            pushFollow(FOLLOW_atom_in_exprmult775);
            atom116=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom116.getTree());
            dbg.location(115,9);
            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:115:9: ( OPERMULT atom )*
            try { dbg.enterSubRule(25);

            loop25:
            do {
                int alt25=2;
                try { dbg.enterDecision(25);

                int LA25_0 = input.LA(1);

                if ( (LA25_0==OPERMULT) ) {
                    alt25=1;
                }


                } finally {dbg.exitDecision(25);}

                switch (alt25) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:115:10: OPERMULT atom
            	    {
            	    dbg.location(115,18);
            	    OPERMULT117=(Token)match(input,OPERMULT,FOLLOW_OPERMULT_in_exprmult778); 
            	    OPERMULT117_tree = (Object)adaptor.create(OPERMULT117);
            	    root_0 = (Object)adaptor.becomeRoot(OPERMULT117_tree, root_0);

            	    dbg.location(115,20);
            	    pushFollow(FOLLOW_atom_in_exprmult781);
            	    atom118=atom();

            	    state._fsp--;

            	    adaptor.addChild(root_0, atom118.getTree());

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
        dbg.location(116, 2);

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
    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:118:1: atom : ( ID_OTHERS | INT | '(' oper ')' );
    public final ExprParser.atom_return atom() throws RecognitionException {
        ExprParser.atom_return retval = new ExprParser.atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID_OTHERS119=null;
        Token INT120=null;
        Token char_literal121=null;
        Token char_literal123=null;
        ExprParser.oper_return oper122 = null;


        Object ID_OTHERS119_tree=null;
        Object INT120_tree=null;
        Object char_literal121_tree=null;
        Object char_literal123_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "atom");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(118, 1);

        try {
            // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:118:5: ( ID_OTHERS | INT | '(' oper ')' )
            int alt26=3;
            try { dbg.enterDecision(26);

            switch ( input.LA(1) ) {
            case ID_OTHERS:
                {
                alt26=1;
                }
                break;
            case INT:
                {
                alt26=2;
                }
                break;
            case 27:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(26);}

            switch (alt26) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:119:2: ID_OTHERS
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(119,2);
                    ID_OTHERS119=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_atom794); 
                    ID_OTHERS119_tree = (Object)adaptor.create(ID_OTHERS119);
                    adaptor.addChild(root_0, ID_OTHERS119_tree);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:120:4: INT
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(120,4);
                    INT120=(Token)match(input,INT,FOLLOW_INT_in_atom799); 
                    INT120_tree = (Object)adaptor.create(INT120);
                    adaptor.addChild(root_0, INT120_tree);


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/clement/Documents/TP_Compil/Compil_MACA/Expr.g:121:4: '(' oper ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(121,4);
                    char_literal121=(Token)match(input,27,FOLLOW_27_in_atom804); 
                    char_literal121_tree = (Object)adaptor.create(char_literal121);
                    adaptor.addChild(root_0, char_literal121_tree);

                    dbg.location(121,7);
                    pushFollow(FOLLOW_oper_in_atom805);
                    oper122=oper();

                    state._fsp--;

                    adaptor.addChild(root_0, oper122.getTree());
                    dbg.location(121,11);
                    char_literal123=(Token)match(input,28,FOLLOW_28_in_atom806); 
                    char_literal123_tree = (Object)adaptor.create(char_literal123);
                    adaptor.addChild(root_0, char_literal123_tree);


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
        dbg.location(122, 2);

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


 

    public static final BitSet FOLLOW_class_decl_in_prog65 = new BitSet(new long[]{0x000E488821008000L});
    public static final BitSet FOLLOW_var_decl_in_prog68 = new BitSet(new long[]{0x000E488820008000L});
    public static final BitSet FOLLOW_instr_in_prog71 = new BitSet(new long[]{0x000E488820008002L});
    public static final BitSet FOLLOW_24_in_class_decl100 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_CLASS_in_class_decl102 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_25_in_class_decl105 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_CLASS_in_class_decl107 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_class_decl111 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_class_decl113 = new BitSet(new long[]{0x0000000430000000L});
    public static final BitSet FOLLOW_class_item_decl_in_class_decl115 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_class_decl117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_decl_in_class_item_decl142 = new BitSet(new long[]{0x0000000420000002L});
    public static final BitSet FOLLOW_method_decl_in_class_item_decl145 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_29_in_var_decl170 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_OTHERS_in_var_decl172 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_var_decl174 = new BitSet(new long[]{0x0000000300004000L});
    public static final BitSet FOLLOW_type_in_var_decl176 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_var_decl178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_type0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_method_decl224 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_OTHERS_in_method_decl226 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_method_decl228 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_method_args_in_method_decl231 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_method_decl233 = new BitSet(new long[]{0x0000000840000000L});
    public static final BitSet FOLLOW_m_in_method_decl235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_m263 = new BitSet(new long[]{0x000E488820008000L});
    public static final BitSet FOLLOW_var_decl_in_m265 = new BitSet(new long[]{0x000E488820008000L});
    public static final BitSet FOLLOW_instr_in_m268 = new BitSet(new long[]{0x000E489820008000L});
    public static final BitSet FOLLOW_36_in_m271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_m289 = new BitSet(new long[]{0x0000000300004000L});
    public static final BitSet FOLLOW_type_in_m291 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_m293 = new BitSet(new long[]{0x000E488820008000L});
    public static final BitSet FOLLOW_var_decl_in_m295 = new BitSet(new long[]{0x000E488820008000L});
    public static final BitSet FOLLOW_instr_in_m298 = new BitSet(new long[]{0x000E489820008000L});
    public static final BitSet FOLLOW_36_in_m301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_OTHERS_in_method_args328 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_method_args330 = new BitSet(new long[]{0x0000000300004000L});
    public static final BitSet FOLLOW_type_in_method_args332 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_method_args335 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_OTHERS_in_method_args337 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_method_args339 = new BitSet(new long[]{0x0000000300004000L});
    public static final BitSet FOLLOW_type_in_method_args341 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_ID_OTHERS_in_instr373 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_instr375 = new BitSet(new long[]{0x00F1000008118000L});
    public static final BitSet FOLLOW_i_in_instr377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_instr391 = new BitSet(new long[]{0x00F0000008118000L});
    public static final BitSet FOLLOW_expr_in_instr393 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_instr395 = new BitSet(new long[]{0x000E488820008000L});
    public static final BitSet FOLLOW_instr_in_instr397 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_41_in_instr400 = new BitSet(new long[]{0x000E488820008000L});
    public static final BitSet FOLLOW_instr_in_instr402 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_instr406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_instr424 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_OTHERS_in_instr426 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_instr428 = new BitSet(new long[]{0x00F0000008118000L});
    public static final BitSet FOLLOW_expr_in_instr430 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_instr432 = new BitSet(new long[]{0x00F0000008118000L});
    public static final BitSet FOLLOW_expr_in_instr434 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_instr436 = new BitSet(new long[]{0x000E488820008000L});
    public static final BitSet FOLLOW_instr_in_instr438 = new BitSet(new long[]{0x000EC88820008000L});
    public static final BitSet FOLLOW_47_in_instr441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_instr460 = new BitSet(new long[]{0x000E488820008000L});
    public static final BitSet FOLLOW_var_decl_in_instr462 = new BitSet(new long[]{0x000E488820008000L});
    public static final BitSet FOLLOW_instr_in_instr465 = new BitSet(new long[]{0x000E489820008000L});
    public static final BitSet FOLLOW_36_in_instr468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_instr485 = new BitSet(new long[]{0x00F0000008118000L});
    public static final BitSet FOLLOW_expr_in_instr487 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_instr489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_in_instr493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_instr497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_retourne_in_instr501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_i518 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_i520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_i529 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_i531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_print546 = new BitSet(new long[]{0x00F0000008118000L});
    public static final BitSet FOLLOW_expr_in_print548 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_print550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_read567 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_OTHERS_in_read569 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_read571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_retourne588 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_retourne590 = new BitSet(new long[]{0x00F0000008118000L});
    public static final BitSet FOLLOW_expr_in_retourne592 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_retourne594 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_retourne595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oper_in_expr617 = new BitSet(new long[]{0x0100000008108000L});
    public static final BitSet FOLLOW_e_in_expr619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_expr624 = new BitSet(new long[]{0x0100000008108000L});
    public static final BitSet FOLLOW_e_in_expr626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_expr631 = new BitSet(new long[]{0x0100000008108000L});
    public static final BitSet FOLLOW_e_in_expr633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_expr640 = new BitSet(new long[]{0x0100000008108000L});
    public static final BitSet FOLLOW_e_in_expr642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_expr647 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_CLASS_in_expr649 = new BitSet(new long[]{0x0100000008108000L});
    public static final BitSet FOLLOW_e_in_expr651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_expr658 = new BitSet(new long[]{0x00F0000008118000L});
    public static final BitSet FOLLOW_expr_in_expr660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oper_in_e672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_e676 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_OTHERS_in_e678 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_e680 = new BitSet(new long[]{0x00F0000018118000L});
    public static final BitSet FOLLOW_expr_in_e683 = new BitSet(new long[]{0x0000002010000000L});
    public static final BitSet FOLLOW_37_in_e686 = new BitSet(new long[]{0x00F0000008118000L});
    public static final BitSet FOLLOW_expr_in_e688 = new BitSet(new long[]{0x0000002010000000L});
    public static final BitSet FOLLOW_28_in_e695 = new BitSet(new long[]{0x0100000008108000L});
    public static final BitSet FOLLOW_e_in_e697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_in_oper724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprplus_in_condition735 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_OPERCONDITION_in_condition738 = new BitSet(new long[]{0x0000000008108000L});
    public static final BitSet FOLLOW_exprplus_in_condition741 = new BitSet(new long[]{0x0000000000000002L});
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