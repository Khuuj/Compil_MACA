<<<<<<< HEAD
// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/adam/workspace/Compil_MACA/Fichiers/Expr.g 2017-04-06 17:45:23
=======
// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/clement/workspace/Compil_MACA/Fichiers/Expr.g 2017-04-06 17:09:16
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;

import org.antlr.runtime.tree.*;

public class ExprParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
<<<<<<< HEAD
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ROOT", "DEC_CLASS", "DEC_VAR", "AFFECT", "RETURN", "FOR", "IF", "BLOC", "BODY", "METHOD", "DEC_METHOD", "ARGS", "PARAMS", "OPPOSE", "APPEL_METHODE", "PARAM", "NEW", "BODY_CLASS", "ID_CLASS", "ID_OTHERS", "OPERCONDITION", "INT", "STRING", "COMMENTS", "NEWLINE", "WS", "'class'", "'inherit'", "'='", "'('", "')'", "'var'", "':'", "';'", "'int'", "'string'", "'method'", "'{'", "'}'", "','", "':='", "'if'", "'then'", "'else'", "'fi'", "'for'", "'in'", "'do'", "'end'", "'..'", "'nil'", "'write'", "'read'", "'return'", "'this'", "'super'", "'new'", "'.'", "'+'", "'-'", "'*'"
=======
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ROOT", "DEC_CLASS", "DEC_VAR", "AFFECT", "RETURN", "FOR", "IF", "BLOC", "BODY", "METHOD", "ARGS", "PARAMS", "OPPOSE", "APPELMETHODE", "PARAM", "NEW", "BODY_CLASS", "ID_CLASS", "ID_OTHERS", "OPERCONDITION", "STRING", "INT", "COMMENTS", "NEWLINE", "WS", "'class'", "'inherit'", "'='", "'('", "')'", "'var'", "':'", "';'", "'int'", "'string'", "'method'", "'{'", "'}'", "','", "':='", "'if'", "'then'", "'else'", "'fi'", "'for'", "'in'", "'do'", "'end'", "'..'", "'nil'", "'write'", "'read'", "'return'", "'this'", "'super'", "'new'", "'.'", "'+'", "'-'", "'*'"
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
    };
    public static final int BLOC=11;
    public static final int APPEL_METHODE=18;
    public static final int NEW=20;
    public static final int T__50=50;
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
    public static final int BODY_CLASS=21;
    public static final int NEWLINE=28;
    public static final int FOR=9;
    public static final int OPPOSE=17;
    public static final int DEC_CLASS=5;
<<<<<<< HEAD
    public static final int OPERCONDITION=24;
=======
    public static final int OPERCONDITION=23;
    public static final int T__29=29;
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
    public static final int METHOD=13;
    public static final int PARAMS=16;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int BODY=12;
    public static final int T__64=64;
    public static final int ARGS=15;
    public static final int ROOT=4;
    public static final int COMMENTS=27;
    public static final int INT=25;
    public static final int RETURN=8;
    public static final int T__37=37;
    public static final int ID_OTHERS=23;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int WS=29;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int DEC_VAR=6;
    public static final int PARAM=19;
    public static final int AFFECT=7;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int DEC_METHOD=14;
    public static final int T__44=44;
    public static final int T__45=45;
<<<<<<< HEAD
    public static final int ID_CLASS=22;
    public static final int STRING=26;
=======
    public static final int ID_CLASS=21;
    public static final int STRING=24;
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
<<<<<<< HEAD
        "invalidRule", "m", "exprplus", "var_decl", "print", "read", "class_decl", 
        "e", "boundaries", "class_item_decl", "method_decl", "i", "method_params", 
        "params", "atom", "instr", "exprmult", "f", "moinsunaire", "oper", 
        "prog", "type", "expr", "retourne"
=======
        "invalidRule", "atom", "f", "var_decl", "method_decl", "class_item_decl", 
        "retourne", "i", "class_decl", "e", "print", "expr", "prog", "type", 
        "oper", "exprmult", "exprplus", "method_params", "params", "instr", 
        "m", "moinsunaire", "read", "boundaries"
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
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
    public String getGrammarFileName() { return "/home/adam/workspace/Compil_MACA/Fichiers/Expr.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prog"
    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:29:1: prog : ( class_decl )* ( var_decl )* ( instr )+ -> ^( ROOT ( class_decl )* ( var_decl )* ( instr )+ ) ;
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
        dbg.location(29, 1);

        try {
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:29:6: ( ( class_decl )* ( var_decl )* ( instr )+ -> ^( ROOT ( class_decl )* ( var_decl )* ( instr )+ ) )
            dbg.enterAlt(1);

            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:30:2: ( class_decl )* ( var_decl )* ( instr )+
            {
            dbg.location(30,2);
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:30:2: ( class_decl )*
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==30) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:30:2: class_decl
            	    {
            	    dbg.location(30,2);
            	    pushFollow(FOLLOW_class_decl_in_prog91);
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

            dbg.location(30,14);
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:30:14: ( var_decl )*
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=2;
                try { dbg.enterDecision(2);

                int LA2_0 = input.LA(1);

                if ( (LA2_0==35) ) {
                    alt2=1;
                }


                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:30:14: var_decl
            	    {
            	    dbg.location(30,14);
            	    pushFollow(FOLLOW_var_decl_in_prog94);
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

            dbg.location(30,24);
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:30:24: ( instr )+
            int cnt3=0;
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=2;
                try { dbg.enterDecision(3);

                int LA3_0 = input.LA(1);

                if ( (LA3_0==ID_OTHERS||LA3_0==41||LA3_0==45||LA3_0==49||LA3_0==51||(LA3_0>=55 && LA3_0<=57)) ) {
                    alt3=1;
                }


                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:30:24: instr
            	    {
            	    dbg.location(30,24);
            	    pushFollow(FOLLOW_instr_in_prog97);
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
            // elements: var_decl, class_decl, instr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 30:31: -> ^( ROOT ( class_decl )* ( var_decl )* ( instr )+ )
            {
                dbg.location(30,34);
                // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:30:34: ^( ROOT ( class_decl )* ( var_decl )* ( instr )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(30,36);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ROOT, "ROOT"), root_1);

                dbg.location(30,41);
                // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:30:41: ( class_decl )*
                while ( stream_class_decl.hasNext() ) {
                    dbg.location(30,41);
                    adaptor.addChild(root_1, stream_class_decl.nextTree());

                }
                stream_class_decl.reset();
                dbg.location(30,53);
                // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:30:53: ( var_decl )*
                while ( stream_var_decl.hasNext() ) {
                    dbg.location(30,53);
                    adaptor.addChild(root_1, stream_var_decl.nextTree());

                }
                stream_var_decl.reset();
                dbg.location(30,63);
                if ( !(stream_instr.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_instr.hasNext() ) {
                    dbg.location(30,63);
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
        dbg.location(31, 2);

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
    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:34:1: class_decl : 'class' a= ID_CLASS ( 'inherit' b= ID_CLASS )? '=' '(' class_item_decl ')' -> ^( DEC_CLASS $a ( $b)? ( class_item_decl )? ) ;
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
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleTokenStream stream_ID_CLASS=new RewriteRuleTokenStream(adaptor,"token ID_CLASS");
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleSubtreeStream stream_class_item_decl=new RewriteRuleSubtreeStream(adaptor,"rule class_item_decl");
        try { dbg.enterRule(getGrammarFileName(), "class_decl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(34, 1);

        try {
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:34:12: ( 'class' a= ID_CLASS ( 'inherit' b= ID_CLASS )? '=' '(' class_item_decl ')' -> ^( DEC_CLASS $a ( $b)? ( class_item_decl )? ) )
            dbg.enterAlt(1);

            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:35:3: 'class' a= ID_CLASS ( 'inherit' b= ID_CLASS )? '=' '(' class_item_decl ')'
            {
            dbg.location(35,3);
            string_literal4=(Token)match(input,30,FOLLOW_30_in_class_decl126);  
            stream_30.add(string_literal4);

            dbg.location(35,12);
            a=(Token)match(input,ID_CLASS,FOLLOW_ID_CLASS_in_class_decl130);  
            stream_ID_CLASS.add(a);

            dbg.location(35,22);
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:35:22: ( 'inherit' b= ID_CLASS )?
            int alt4=2;
            try { dbg.enterSubRule(4);
            try { dbg.enterDecision(4);

            int LA4_0 = input.LA(1);

            if ( (LA4_0==31) ) {
                alt4=1;
            }
            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:35:23: 'inherit' b= ID_CLASS
                    {
                    dbg.location(35,23);
                    string_literal5=(Token)match(input,31,FOLLOW_31_in_class_decl133);  
                    stream_31.add(string_literal5);

                    dbg.location(35,34);
                    b=(Token)match(input,ID_CLASS,FOLLOW_ID_CLASS_in_class_decl137);  
                    stream_ID_CLASS.add(b);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(4);}

            dbg.location(35,46);
            char_literal6=(Token)match(input,32,FOLLOW_32_in_class_decl141);  
            stream_32.add(char_literal6);

            dbg.location(35,50);
            char_literal7=(Token)match(input,33,FOLLOW_33_in_class_decl143);  
            stream_33.add(char_literal7);

            dbg.location(35,54);
            pushFollow(FOLLOW_class_item_decl_in_class_decl145);
            class_item_decl8=class_item_decl();

            state._fsp--;

            stream_class_item_decl.add(class_item_decl8.getTree());
            dbg.location(35,70);
            char_literal9=(Token)match(input,34,FOLLOW_34_in_class_decl147);  
            stream_34.add(char_literal9);



            // AST REWRITE
            // elements: class_item_decl, b, a
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
            // 35:74: -> ^( DEC_CLASS $a ( $b)? ( class_item_decl )? )
            {
                dbg.location(35,76);
                // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:35:76: ^( DEC_CLASS $a ( $b)? ( class_item_decl )? )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(35,78);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEC_CLASS, "DEC_CLASS"), root_1);

                dbg.location(35,88);
                adaptor.addChild(root_1, stream_a.nextNode());
                dbg.location(35,91);
                // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:35:91: ( $b)?
                if ( stream_b.hasNext() ) {
                    dbg.location(35,92);
                    adaptor.addChild(root_1, stream_b.nextNode());

                }
                stream_b.reset();
                dbg.location(35,97);
                // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:35:97: ( class_item_decl )?
                if ( stream_class_item_decl.hasNext() ) {
                    dbg.location(35,97);
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
        dbg.location(36, 2);

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
    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:38:1: class_item_decl : ( var_decl )* ( method_decl )* -> ^( BODY_CLASS ( var_decl )* ( method_decl )* ) ;
    public final ExprParser.class_item_decl_return class_item_decl() throws RecognitionException {
        ExprParser.class_item_decl_return retval = new ExprParser.class_item_decl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ExprParser.var_decl_return var_decl10 = null;

        ExprParser.method_decl_return method_decl11 = null;


        RewriteRuleSubtreeStream stream_method_decl=new RewriteRuleSubtreeStream(adaptor,"rule method_decl");
        RewriteRuleSubtreeStream stream_var_decl=new RewriteRuleSubtreeStream(adaptor,"rule var_decl");
        try { dbg.enterRule(getGrammarFileName(), "class_item_decl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(38, 1);

        try {
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:38:17: ( ( var_decl )* ( method_decl )* -> ^( BODY_CLASS ( var_decl )* ( method_decl )* ) )
            dbg.enterAlt(1);

            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:39:2: ( var_decl )* ( method_decl )*
            {
            dbg.location(39,2);
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:39:2: ( var_decl )*
            try { dbg.enterSubRule(5);

            loop5:
            do {
                int alt5=2;
                try { dbg.enterDecision(5);

                int LA5_0 = input.LA(1);

                if ( (LA5_0==35) ) {
                    alt5=1;
                }


                } finally {dbg.exitDecision(5);}

                switch (alt5) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:39:2: var_decl
            	    {
            	    dbg.location(39,2);
            	    pushFollow(FOLLOW_var_decl_in_class_item_decl177);
            	    var_decl10=var_decl();

            	    state._fsp--;

            	    stream_var_decl.add(var_decl10.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);
            } finally {dbg.exitSubRule(5);}

            dbg.location(39,12);
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:39:12: ( method_decl )*
            try { dbg.enterSubRule(6);

            loop6:
            do {
                int alt6=2;
                try { dbg.enterDecision(6);

                int LA6_0 = input.LA(1);

                if ( (LA6_0==40) ) {
                    alt6=1;
                }


                } finally {dbg.exitDecision(6);}

                switch (alt6) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:39:12: method_decl
            	    {
            	    dbg.location(39,12);
            	    pushFollow(FOLLOW_method_decl_in_class_item_decl180);
            	    method_decl11=method_decl();

            	    state._fsp--;

            	    stream_method_decl.add(method_decl11.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);
            } finally {dbg.exitSubRule(6);}



            // AST REWRITE
            // elements: method_decl, var_decl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 39:25: -> ^( BODY_CLASS ( var_decl )* ( method_decl )* )
            {
                dbg.location(39,27);
                // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:39:27: ^( BODY_CLASS ( var_decl )* ( method_decl )* )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(39,29);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY_CLASS, "BODY_CLASS"), root_1);

                dbg.location(39,40);
                // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:39:40: ( var_decl )*
                while ( stream_var_decl.hasNext() ) {
                    dbg.location(39,40);
                    adaptor.addChild(root_1, stream_var_decl.nextTree());

                }
                stream_var_decl.reset();
                dbg.location(39,50);
                // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:39:50: ( method_decl )*
                while ( stream_method_decl.hasNext() ) {
                    dbg.location(39,50);
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
        dbg.location(40, 2);

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
    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:42:1: var_decl : 'var' ID_OTHERS ':' type ';' -> ^( DEC_VAR ID_OTHERS type ) ;
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
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_ID_OTHERS=new RewriteRuleTokenStream(adaptor,"token ID_OTHERS");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try { dbg.enterRule(getGrammarFileName(), "var_decl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(42, 1);

        try {
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:42:10: ( 'var' ID_OTHERS ':' type ';' -> ^( DEC_VAR ID_OTHERS type ) )
            dbg.enterAlt(1);

            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:43:2: 'var' ID_OTHERS ':' type ';'
            {
            dbg.location(43,2);
            string_literal12=(Token)match(input,35,FOLLOW_35_in_var_decl204);  
            stream_35.add(string_literal12);

            dbg.location(43,8);
            ID_OTHERS13=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_var_decl206);  
            stream_ID_OTHERS.add(ID_OTHERS13);

            dbg.location(43,18);
            char_literal14=(Token)match(input,36,FOLLOW_36_in_var_decl208);  
            stream_36.add(char_literal14);

            dbg.location(43,22);
            pushFollow(FOLLOW_type_in_var_decl210);
            type15=type();

            state._fsp--;

            stream_type.add(type15.getTree());
            dbg.location(43,27);
            char_literal16=(Token)match(input,37,FOLLOW_37_in_var_decl212);  
            stream_37.add(char_literal16);



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
            // 43:31: -> ^( DEC_VAR ID_OTHERS type )
            {
                dbg.location(43,33);
                // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:43:33: ^( DEC_VAR ID_OTHERS type )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(43,35);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEC_VAR, "DEC_VAR"), root_1);

                dbg.location(43,43);
                adaptor.addChild(root_1, stream_ID_OTHERS.nextNode());
                dbg.location(43,53);
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
        dbg.location(44, 2);

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
    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:46:1: type : ( ID_CLASS | 'int' | 'string' );
    public final ExprParser.type_return type() throws RecognitionException {
        ExprParser.type_return retval = new ExprParser.type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set17=null;

        Object set17_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "type");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(46, 1);

        try {
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:46:6: ( ID_CLASS | 'int' | 'string' )
            dbg.enterAlt(1);

            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(46,6);
            set17=(Token)input.LT(1);
            if ( input.LA(1)==ID_CLASS||(input.LA(1)>=38 && input.LA(1)<=39) ) {
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
        dbg.location(50, 2);

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
    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:52:1: method_decl : 'method' ID_OTHERS '(' ( method_params )? ')' m -> ^( DEC_METHOD ID_OTHERS ( method_params )? m ) ;
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
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleTokenStream stream_ID_OTHERS=new RewriteRuleTokenStream(adaptor,"token ID_OTHERS");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleSubtreeStream stream_method_params=new RewriteRuleSubtreeStream(adaptor,"rule method_params");
        RewriteRuleSubtreeStream stream_m=new RewriteRuleSubtreeStream(adaptor,"rule m");
        try { dbg.enterRule(getGrammarFileName(), "method_decl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(52, 1);

        try {
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:52:13: ( 'method' ID_OTHERS '(' ( method_params )? ')' m -> ^( DEC_METHOD ID_OTHERS ( method_params )? m ) )
            dbg.enterAlt(1);

            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:53:2: 'method' ID_OTHERS '(' ( method_params )? ')' m
            {
            dbg.location(53,2);
            string_literal18=(Token)match(input,40,FOLLOW_40_in_method_decl255);  
            stream_40.add(string_literal18);

            dbg.location(53,11);
            ID_OTHERS19=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_method_decl257);  
            stream_ID_OTHERS.add(ID_OTHERS19);

            dbg.location(53,21);
            char_literal20=(Token)match(input,33,FOLLOW_33_in_method_decl259);  
            stream_33.add(char_literal20);

            dbg.location(53,26);
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:53:26: ( method_params )?
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

                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:53:26: method_params
                    {
                    dbg.location(53,26);
                    pushFollow(FOLLOW_method_params_in_method_decl262);
                    method_params21=method_params();

                    state._fsp--;

                    stream_method_params.add(method_params21.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(7);}

            dbg.location(53,41);
            char_literal22=(Token)match(input,34,FOLLOW_34_in_method_decl265);  
            stream_34.add(char_literal22);

            dbg.location(53,45);
            pushFollow(FOLLOW_m_in_method_decl267);
            m23=m();

            state._fsp--;

            stream_m.add(m23.getTree());


            // AST REWRITE
            // elements: method_params, m, ID_OTHERS
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 53:47: -> ^( DEC_METHOD ID_OTHERS ( method_params )? m )
            {
                dbg.location(53,50);
                // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:53:50: ^( DEC_METHOD ID_OTHERS ( method_params )? m )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(53,52);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEC_METHOD, "DEC_METHOD"), root_1);

                dbg.location(53,63);
                adaptor.addChild(root_1, stream_ID_OTHERS.nextNode());
                dbg.location(53,75);
                // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:53:75: ( method_params )?
                if ( stream_method_params.hasNext() ) {
                    dbg.location(53,75);
                    adaptor.addChild(root_1, stream_method_params.nextTree());

                }
                stream_method_params.reset();
                dbg.location(53,91);
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
        dbg.location(54, 2);

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
    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:56:1: m : ( '{' ( var_decl )* ( instr )+ '}' -> ^( BODY ( var_decl )* ( instr )+ ) | ':' type '{' ( var_decl )* ( instr )+ '}' -> type ^( BODY ( var_decl )* ( instr )+ ) );
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
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleSubtreeStream stream_instr=new RewriteRuleSubtreeStream(adaptor,"rule instr");
        RewriteRuleSubtreeStream stream_var_decl=new RewriteRuleSubtreeStream(adaptor,"rule var_decl");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try { dbg.enterRule(getGrammarFileName(), "m");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(56, 1);

        try {
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:56:4: ( '{' ( var_decl )* ( instr )+ '}' -> ^( BODY ( var_decl )* ( instr )+ ) | ':' type '{' ( var_decl )* ( instr )+ '}' -> type ^( BODY ( var_decl )* ( instr )+ ) )
            int alt12=2;
            try { dbg.enterDecision(12);

            int LA12_0 = input.LA(1);

            if ( (LA12_0==41) ) {
                alt12=1;
            }
            else if ( (LA12_0==36) ) {
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

                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:57:2: '{' ( var_decl )* ( instr )+ '}'
                    {
                    dbg.location(57,2);
                    char_literal24=(Token)match(input,41,FOLLOW_41_in_m296);  
                    stream_41.add(char_literal24);

                    dbg.location(57,6);
                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:57:6: ( var_decl )*
                    try { dbg.enterSubRule(8);

                    loop8:
                    do {
                        int alt8=2;
                        try { dbg.enterDecision(8);

                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==35) ) {
                            alt8=1;
                        }


                        } finally {dbg.exitDecision(8);}

                        switch (alt8) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:57:6: var_decl
                    	    {
                    	    dbg.location(57,6);
                    	    pushFollow(FOLLOW_var_decl_in_m298);
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

                    dbg.location(57,16);
                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:57:16: ( instr )+
                    int cnt9=0;
                    try { dbg.enterSubRule(9);

                    loop9:
                    do {
                        int alt9=2;
                        try { dbg.enterDecision(9);

                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==ID_OTHERS||LA9_0==41||LA9_0==45||LA9_0==49||LA9_0==51||(LA9_0>=55 && LA9_0<=57)) ) {
                            alt9=1;
                        }


                        } finally {dbg.exitDecision(9);}

                        switch (alt9) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:57:16: instr
                    	    {
                    	    dbg.location(57,16);
                    	    pushFollow(FOLLOW_instr_in_m301);
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

                    dbg.location(57,23);
                    char_literal27=(Token)match(input,42,FOLLOW_42_in_m304);  
                    stream_42.add(char_literal27);



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
                    // 57:27: -> ^( BODY ( var_decl )* ( instr )+ )
                    {
                        dbg.location(57,29);
                        // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:57:29: ^( BODY ( var_decl )* ( instr )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(57,31);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_1);

                        dbg.location(57,37);
                        // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:57:37: ( var_decl )*
                        while ( stream_var_decl.hasNext() ) {
                            dbg.location(57,37);
                            adaptor.addChild(root_1, stream_var_decl.nextTree());

                        }
                        stream_var_decl.reset();
                        dbg.location(57,47);
                        if ( !(stream_instr.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_instr.hasNext() ) {
                            dbg.location(57,47);
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

                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:58:4: ':' type '{' ( var_decl )* ( instr )+ '}'
                    {
                    dbg.location(58,4);
                    char_literal28=(Token)match(input,36,FOLLOW_36_in_m322);  
                    stream_36.add(char_literal28);

                    dbg.location(58,8);
                    pushFollow(FOLLOW_type_in_m324);
                    type29=type();

                    state._fsp--;

                    stream_type.add(type29.getTree());
                    dbg.location(58,13);
                    char_literal30=(Token)match(input,41,FOLLOW_41_in_m326);  
                    stream_41.add(char_literal30);

                    dbg.location(58,17);
                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:58:17: ( var_decl )*
                    try { dbg.enterSubRule(10);

                    loop10:
                    do {
                        int alt10=2;
                        try { dbg.enterDecision(10);

                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==35) ) {
                            alt10=1;
                        }


                        } finally {dbg.exitDecision(10);}

                        switch (alt10) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:58:17: var_decl
                    	    {
                    	    dbg.location(58,17);
                    	    pushFollow(FOLLOW_var_decl_in_m328);
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

                    dbg.location(58,27);
                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:58:27: ( instr )+
                    int cnt11=0;
                    try { dbg.enterSubRule(11);

                    loop11:
                    do {
                        int alt11=2;
                        try { dbg.enterDecision(11);

                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==ID_OTHERS||LA11_0==41||LA11_0==45||LA11_0==49||LA11_0==51||(LA11_0>=55 && LA11_0<=57)) ) {
                            alt11=1;
                        }


                        } finally {dbg.exitDecision(11);}

                        switch (alt11) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:58:27: instr
                    	    {
                    	    dbg.location(58,27);
                    	    pushFollow(FOLLOW_instr_in_m331);
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

                    dbg.location(58,34);
                    char_literal33=(Token)match(input,42,FOLLOW_42_in_m334);  
                    stream_42.add(char_literal33);



                    // AST REWRITE
<<<<<<< HEAD
                    // elements: instr, var_decl, type
=======
                    // elements: instr, type, var_decl
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 58:38: -> type ^( BODY ( var_decl )* ( instr )+ )
                    {
                        dbg.location(58,41);
                        adaptor.addChild(root_0, stream_type.nextTree());
                        dbg.location(58,46);
                        // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:58:46: ^( BODY ( var_decl )* ( instr )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(58,48);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_1);

                        dbg.location(58,54);
                        // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:58:54: ( var_decl )*
                        while ( stream_var_decl.hasNext() ) {
                            dbg.location(58,54);
                            adaptor.addChild(root_1, stream_var_decl.nextTree());

                        }
                        stream_var_decl.reset();
                        dbg.location(58,64);
                        if ( !(stream_instr.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_instr.hasNext() ) {
                            dbg.location(58,64);
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
        dbg.location(59, 2);

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
    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:62:1: method_params : params -> ^( PARAMS params ) ;
    public final ExprParser.method_params_return method_params() throws RecognitionException {
        ExprParser.method_params_return retval = new ExprParser.method_params_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ExprParser.params_return params34 = null;


        RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
        try { dbg.enterRule(getGrammarFileName(), "method_params");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(62, 1);

        try {
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:62:15: ( params -> ^( PARAMS params ) )
            dbg.enterAlt(1);

            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:63:2: params
            {
            dbg.location(63,2);
            pushFollow(FOLLOW_params_in_method_params363);
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
            // 63:9: -> ^( PARAMS params )
            {
                dbg.location(63,12);
                // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:63:12: ^( PARAMS params )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(63,14);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMS, "PARAMS"), root_1);

                dbg.location(63,21);
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
        dbg.location(64, 2);

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
    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:66:1: params : ID_OTHERS ':' type ( ',' ID_OTHERS ':' type )* -> ( ^( PARAM ID_OTHERS type ) )* ;
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
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_ID_OTHERS=new RewriteRuleTokenStream(adaptor,"token ID_OTHERS");
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try { dbg.enterRule(getGrammarFileName(), "params");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(66, 1);

        try {
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:66:8: ( ID_OTHERS ':' type ( ',' ID_OTHERS ':' type )* -> ( ^( PARAM ID_OTHERS type ) )* )
            dbg.enterAlt(1);

            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:67:2: ID_OTHERS ':' type ( ',' ID_OTHERS ':' type )*
            {
            dbg.location(67,2);
            ID_OTHERS35=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_params383);  
            stream_ID_OTHERS.add(ID_OTHERS35);

            dbg.location(67,12);
            char_literal36=(Token)match(input,36,FOLLOW_36_in_params385);  
            stream_36.add(char_literal36);

            dbg.location(67,17);
            pushFollow(FOLLOW_type_in_params388);
            type37=type();

            state._fsp--;

            stream_type.add(type37.getTree());
            dbg.location(67,22);
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:67:22: ( ',' ID_OTHERS ':' type )*
            try { dbg.enterSubRule(13);

            loop13:
            do {
                int alt13=2;
                try { dbg.enterDecision(13);

                int LA13_0 = input.LA(1);

                if ( (LA13_0==43) ) {
                    alt13=1;
                }


                } finally {dbg.exitDecision(13);}

                switch (alt13) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:67:23: ',' ID_OTHERS ':' type
            	    {
            	    dbg.location(67,23);
            	    char_literal38=(Token)match(input,43,FOLLOW_43_in_params391);  
            	    stream_43.add(char_literal38);

            	    dbg.location(67,27);
            	    ID_OTHERS39=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_params393);  
            	    stream_ID_OTHERS.add(ID_OTHERS39);

            	    dbg.location(67,37);
            	    char_literal40=(Token)match(input,36,FOLLOW_36_in_params395);  
            	    stream_36.add(char_literal40);

            	    dbg.location(67,41);
            	    pushFollow(FOLLOW_type_in_params397);
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
            // elements: type, ID_OTHERS
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 67:48: -> ( ^( PARAM ID_OTHERS type ) )*
            {
<<<<<<< HEAD
                dbg.location(67,51);
                // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:67:51: ( ^( PARAM ID_OTHERS type ) )*
                while ( stream_ID_OTHERS.hasNext()||stream_type.hasNext() ) {
                    dbg.location(67,51);
                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:67:51: ^( PARAM ID_OTHERS type )
=======
                dbg.location(66,51);
                // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:66:51: ( ^( PARAM ID_OTHERS type ) )*
                while ( stream_type.hasNext()||stream_ID_OTHERS.hasNext() ) {
                    dbg.location(66,51);
                    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:66:51: ^( PARAM ID_OTHERS type )
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
                    {
                    Object root_1 = (Object)adaptor.nil();
                    dbg.location(67,53);
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAM, "PARAM"), root_1);

                    dbg.location(67,59);
                    adaptor.addChild(root_1, stream_ID_OTHERS.nextNode());
                    dbg.location(67,70);
                    adaptor.addChild(root_1, stream_type.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_type.reset();
                stream_ID_OTHERS.reset();

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
        dbg.location(68, 2);

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
    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:71:1: instr : ( ID_OTHERS ':=' i -> ^( AFFECT ID_OTHERS i ) | 'if' expr 'then' instr ( 'else' instr )? 'fi' -> ^( IF expr instr ( instr )? ) | 'for' ID_OTHERS 'in' boundaries 'do' ( instr )+ 'end' -> ^( FOR ID_OTHERS boundaries ( instr )+ ) | '{' ( var_decl )* ( instr )+ '}' -> ^( BLOC ( var_decl )* ( instr )+ ) | 'do' expr ';' -> ^( 'do' expr ) | print | read | retourne );
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
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_ID_OTHERS=new RewriteRuleTokenStream(adaptor,"token ID_OTHERS");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleSubtreeStream stream_instr=new RewriteRuleSubtreeStream(adaptor,"rule instr");
        RewriteRuleSubtreeStream stream_i=new RewriteRuleSubtreeStream(adaptor,"rule i");
        RewriteRuleSubtreeStream stream_boundaries=new RewriteRuleSubtreeStream(adaptor,"rule boundaries");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_var_decl=new RewriteRuleSubtreeStream(adaptor,"rule var_decl");
        try { dbg.enterRule(getGrammarFileName(), "instr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(71, 1);

        try {
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:71:7: ( ID_OTHERS ':=' i -> ^( AFFECT ID_OTHERS i ) | 'if' expr 'then' instr ( 'else' instr )? 'fi' -> ^( IF expr instr ( instr )? ) | 'for' ID_OTHERS 'in' boundaries 'do' ( instr )+ 'end' -> ^( FOR ID_OTHERS boundaries ( instr )+ ) | '{' ( var_decl )* ( instr )+ '}' -> ^( BLOC ( var_decl )* ( instr )+ ) | 'do' expr ';' -> ^( 'do' expr ) | print | read | retourne )
            int alt18=8;
            try { dbg.enterDecision(18);

            switch ( input.LA(1) ) {
            case ID_OTHERS:
                {
                alt18=1;
                }
                break;
            case 45:
                {
                alt18=2;
                }
                break;
            case 49:
                {
                alt18=3;
                }
                break;
            case 41:
                {
                alt18=4;
                }
                break;
            case 51:
                {
                alt18=5;
                }
                break;
            case 55:
                {
                alt18=6;
                }
                break;
            case 56:
                {
                alt18=7;
                }
                break;
            case 57:
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

                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:72:2: ID_OTHERS ':=' i
                    {
                    dbg.location(72,2);
                    ID_OTHERS42=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_instr425);  
                    stream_ID_OTHERS.add(ID_OTHERS42);

                    dbg.location(72,12);
                    string_literal43=(Token)match(input,44,FOLLOW_44_in_instr427);  
                    stream_44.add(string_literal43);

                    dbg.location(72,17);
                    pushFollow(FOLLOW_i_in_instr429);
                    i44=i();

                    state._fsp--;

                    stream_i.add(i44.getTree());


                    // AST REWRITE
                    // elements: i, ID_OTHERS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 72:19: -> ^( AFFECT ID_OTHERS i )
                    {
                        dbg.location(72,22);
                        // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:72:22: ^( AFFECT ID_OTHERS i )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(72,24);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AFFECT, "AFFECT"), root_1);

                        dbg.location(72,31);
                        adaptor.addChild(root_1, stream_ID_OTHERS.nextNode());
                        dbg.location(72,41);
                        adaptor.addChild(root_1, stream_i.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:73:3: 'if' expr 'then' instr ( 'else' instr )? 'fi'
                    {
                    dbg.location(73,3);
                    string_literal45=(Token)match(input,45,FOLLOW_45_in_instr443);  
                    stream_45.add(string_literal45);

                    dbg.location(73,8);
                    pushFollow(FOLLOW_expr_in_instr445);
                    expr46=expr();

                    state._fsp--;

                    stream_expr.add(expr46.getTree());
                    dbg.location(73,13);
                    string_literal47=(Token)match(input,46,FOLLOW_46_in_instr447);  
                    stream_46.add(string_literal47);

                    dbg.location(73,20);
                    pushFollow(FOLLOW_instr_in_instr449);
                    instr48=instr();

                    state._fsp--;

                    stream_instr.add(instr48.getTree());
                    dbg.location(73,26);
                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:73:26: ( 'else' instr )?
                    int alt14=2;
                    try { dbg.enterSubRule(14);
                    try { dbg.enterDecision(14);

                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==47) ) {
                        alt14=1;
                    }
                    } finally {dbg.exitDecision(14);}

                    switch (alt14) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:73:27: 'else' instr
                            {
                            dbg.location(73,27);
                            string_literal49=(Token)match(input,47,FOLLOW_47_in_instr452);  
                            stream_47.add(string_literal49);

                            dbg.location(73,34);
                            pushFollow(FOLLOW_instr_in_instr454);
                            instr50=instr();

                            state._fsp--;

                            stream_instr.add(instr50.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(14);}

                    dbg.location(73,42);
                    string_literal51=(Token)match(input,48,FOLLOW_48_in_instr458);  
                    stream_48.add(string_literal51);



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
                    // 73:48: -> ^( IF expr instr ( instr )? )
                    {
                        dbg.location(73,51);
                        // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:73:51: ^( IF expr instr ( instr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(73,53);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);

                        dbg.location(73,56);
                        adaptor.addChild(root_1, stream_expr.nextTree());
                        dbg.location(73,61);
                        adaptor.addChild(root_1, stream_instr.nextTree());
                        dbg.location(73,67);
                        // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:73:67: ( instr )?
                        if ( stream_instr.hasNext() ) {
                            dbg.location(73,67);
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

                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:74:3: 'for' ID_OTHERS 'in' boundaries 'do' ( instr )+ 'end'
                    {
                    dbg.location(74,3);
                    string_literal52=(Token)match(input,49,FOLLOW_49_in_instr476);  
                    stream_49.add(string_literal52);

                    dbg.location(74,9);
                    ID_OTHERS53=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_instr478);  
                    stream_ID_OTHERS.add(ID_OTHERS53);

                    dbg.location(74,19);
                    string_literal54=(Token)match(input,50,FOLLOW_50_in_instr480);  
                    stream_50.add(string_literal54);

                    dbg.location(74,24);
                    pushFollow(FOLLOW_boundaries_in_instr482);
                    boundaries55=boundaries();

                    state._fsp--;

                    stream_boundaries.add(boundaries55.getTree());
                    dbg.location(74,35);
                    string_literal56=(Token)match(input,51,FOLLOW_51_in_instr484);  
                    stream_51.add(string_literal56);

                    dbg.location(74,40);
                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:74:40: ( instr )+
                    int cnt15=0;
                    try { dbg.enterSubRule(15);

                    loop15:
                    do {
                        int alt15=2;
                        try { dbg.enterDecision(15);

                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==ID_OTHERS||LA15_0==41||LA15_0==45||LA15_0==49||LA15_0==51||(LA15_0>=55 && LA15_0<=57)) ) {
                            alt15=1;
                        }


                        } finally {dbg.exitDecision(15);}

                        switch (alt15) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:74:40: instr
                    	    {
                    	    dbg.location(74,40);
                    	    pushFollow(FOLLOW_instr_in_instr486);
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

                    dbg.location(74,47);
                    string_literal58=(Token)match(input,52,FOLLOW_52_in_instr489);  
                    stream_52.add(string_literal58);



                    // AST REWRITE
<<<<<<< HEAD
                    // elements: boundaries, ID_OTHERS, instr
=======
                    // elements: boundaries, instr, ID_OTHERS
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 74:53: -> ^( FOR ID_OTHERS boundaries ( instr )+ )
                    {
                        dbg.location(74,56);
                        // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:74:56: ^( FOR ID_OTHERS boundaries ( instr )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(74,58);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR, "FOR"), root_1);

                        dbg.location(74,62);
                        adaptor.addChild(root_1, stream_ID_OTHERS.nextNode());
                        dbg.location(74,72);
                        adaptor.addChild(root_1, stream_boundaries.nextTree());
                        dbg.location(74,83);
                        if ( !(stream_instr.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_instr.hasNext() ) {
                            dbg.location(74,83);
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

                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:75:3: '{' ( var_decl )* ( instr )+ '}'
                    {
                    dbg.location(75,3);
                    char_literal59=(Token)match(input,41,FOLLOW_41_in_instr506);  
                    stream_41.add(char_literal59);

                    dbg.location(75,7);
                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:75:7: ( var_decl )*
                    try { dbg.enterSubRule(16);

                    loop16:
                    do {
                        int alt16=2;
                        try { dbg.enterDecision(16);

                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==35) ) {
                            alt16=1;
                        }


                        } finally {dbg.exitDecision(16);}

                        switch (alt16) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:75:7: var_decl
                    	    {
                    	    dbg.location(75,7);
                    	    pushFollow(FOLLOW_var_decl_in_instr508);
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

                    dbg.location(75,17);
                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:75:17: ( instr )+
                    int cnt17=0;
                    try { dbg.enterSubRule(17);

                    loop17:
                    do {
                        int alt17=2;
                        try { dbg.enterDecision(17);

                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==ID_OTHERS||LA17_0==41||LA17_0==45||LA17_0==49||LA17_0==51||(LA17_0>=55 && LA17_0<=57)) ) {
                            alt17=1;
                        }


                        } finally {dbg.exitDecision(17);}

                        switch (alt17) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:75:17: instr
                    	    {
                    	    dbg.location(75,17);
                    	    pushFollow(FOLLOW_instr_in_instr511);
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

                    dbg.location(75,24);
                    char_literal62=(Token)match(input,42,FOLLOW_42_in_instr514);  
                    stream_42.add(char_literal62);



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
                    // 75:28: -> ^( BLOC ( var_decl )* ( instr )+ )
                    {
                        dbg.location(75,30);
                        // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:75:30: ^( BLOC ( var_decl )* ( instr )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(75,32);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOC, "BLOC"), root_1);

                        dbg.location(75,38);
                        // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:75:38: ( var_decl )*
                        while ( stream_var_decl.hasNext() ) {
                            dbg.location(75,38);
                            adaptor.addChild(root_1, stream_var_decl.nextTree());

                        }
                        stream_var_decl.reset();
                        dbg.location(75,48);
                        if ( !(stream_instr.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_instr.hasNext() ) {
                            dbg.location(75,48);
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

                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:76:3: 'do' expr ';'
                    {
                    dbg.location(76,3);
                    string_literal63=(Token)match(input,51,FOLLOW_51_in_instr531);  
                    stream_51.add(string_literal63);

                    dbg.location(76,8);
                    pushFollow(FOLLOW_expr_in_instr533);
                    expr64=expr();

                    state._fsp--;

                    stream_expr.add(expr64.getTree());
                    dbg.location(76,13);
                    char_literal65=(Token)match(input,37,FOLLOW_37_in_instr535);  
                    stream_37.add(char_literal65);



                    // AST REWRITE
                    // elements: expr, 51
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 76:18: -> ^( 'do' expr )
                    {
                        dbg.location(76,21);
                        // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:76:21: ^( 'do' expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(76,23);
                        root_1 = (Object)adaptor.becomeRoot(stream_51.nextNode(), root_1);

                        dbg.location(76,27);
                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:77:3: print
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(77,3);
                    pushFollow(FOLLOW_print_in_instr548);
                    print66=print();

                    state._fsp--;

                    adaptor.addChild(root_0, print66.getTree());

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:78:3: read
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(78,3);
                    pushFollow(FOLLOW_read_in_instr552);
                    read67=read();

                    state._fsp--;

                    adaptor.addChild(root_0, read67.getTree());

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:79:3: retourne
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(79,3);
                    pushFollow(FOLLOW_retourne_in_instr556);
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
        dbg.location(80, 7);

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
    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:82:1: boundaries : a= expr '..' b= expr -> ^( '..' $a $b) ;
    public final ExprParser.boundaries_return boundaries() throws RecognitionException {
        ExprParser.boundaries_return retval = new ExprParser.boundaries_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal69=null;
        ExprParser.expr_return a = null;

        ExprParser.expr_return b = null;


        Object string_literal69_tree=null;
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try { dbg.enterRule(getGrammarFileName(), "boundaries");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(82, 1);

        try {
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:82:12: (a= expr '..' b= expr -> ^( '..' $a $b) )
            dbg.enterAlt(1);

            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:83:3: a= expr '..' b= expr
            {
            dbg.location(83,4);
            pushFollow(FOLLOW_expr_in_boundaries575);
            a=expr();

            state._fsp--;

            stream_expr.add(a.getTree());
            dbg.location(83,10);
            string_literal69=(Token)match(input,53,FOLLOW_53_in_boundaries577);  
            stream_53.add(string_literal69);

            dbg.location(83,16);
            pushFollow(FOLLOW_expr_in_boundaries581);
            b=expr();

            state._fsp--;

            stream_expr.add(b.getTree());


            // AST REWRITE
            // elements: a, 53, b
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
            // 83:23: -> ^( '..' $a $b)
            {
                dbg.location(83,26);
                // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:83:26: ^( '..' $a $b)
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(83,28);
                root_1 = (Object)adaptor.becomeRoot(stream_53.nextNode(), root_1);

                dbg.location(83,33);
                adaptor.addChild(root_1, stream_a.nextTree());
                dbg.location(83,36);
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
        dbg.location(84, 3);

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
    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:86:1: i : ( expr ';' -> expr | 'nil' ';' -> 'nil' );
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
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try { dbg.enterRule(getGrammarFileName(), "i");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(86, 1);

        try {
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:86:3: ( expr ';' -> expr | 'nil' ';' -> 'nil' )
            int alt19=2;
            try { dbg.enterDecision(19);

            int LA19_0 = input.LA(1);

<<<<<<< HEAD
            if ( (LA19_0==ID_OTHERS||(LA19_0>=INT && LA19_0<=STRING)||LA19_0==33||(LA19_0>=58 && LA19_0<=60)||LA19_0==63) ) {
=======
            if ( (LA19_0==ID_OTHERS||(LA19_0>=STRING && LA19_0<=INT)||LA19_0==32||(LA19_0>=57 && LA19_0<=59)||LA19_0==62) ) {
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
                alt19=1;
            }
            else if ( (LA19_0==54) ) {
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

                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:87:2: expr ';'
                    {
                    dbg.location(87,2);
                    pushFollow(FOLLOW_expr_in_i607);
                    expr70=expr();

                    state._fsp--;

                    stream_expr.add(expr70.getTree());
                    dbg.location(87,7);
                    char_literal71=(Token)match(input,37,FOLLOW_37_in_i609);  
                    stream_37.add(char_literal71);



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

                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:88:4: 'nil' ';'
                    {
                    dbg.location(88,4);
                    string_literal72=(Token)match(input,54,FOLLOW_54_in_i618);  
                    stream_54.add(string_literal72);

                    dbg.location(88,10);
                    char_literal73=(Token)match(input,37,FOLLOW_37_in_i620);  
                    stream_37.add(char_literal73);



                    // AST REWRITE
                    // elements: 54
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
                        adaptor.addChild(root_0, stream_54.nextNode());

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
    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:91:1: print : 'write' expr ';' -> ^( 'write' expr ) ;
    public final ExprParser.print_return print() throws RecognitionException {
        ExprParser.print_return retval = new ExprParser.print_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal74=null;
        Token char_literal76=null;
        ExprParser.expr_return expr75 = null;


        Object string_literal74_tree=null;
        Object char_literal76_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try { dbg.enterRule(getGrammarFileName(), "print");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(91, 1);

        try {
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:91:7: ( 'write' expr ';' -> ^( 'write' expr ) )
            dbg.enterAlt(1);

            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:92:3: 'write' expr ';'
            {
            dbg.location(92,3);
            string_literal74=(Token)match(input,55,FOLLOW_55_in_print637);  
            stream_55.add(string_literal74);

            dbg.location(92,11);
            pushFollow(FOLLOW_expr_in_print639);
            expr75=expr();

            state._fsp--;

            stream_expr.add(expr75.getTree());
            dbg.location(92,16);
            char_literal76=(Token)match(input,37,FOLLOW_37_in_print641);  
            stream_37.add(char_literal76);



            // AST REWRITE
            // elements: 55, expr
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
                // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:92:23: ^( 'write' expr )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(92,25);
                root_1 = (Object)adaptor.becomeRoot(stream_55.nextNode(), root_1);

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
    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:95:1: read : 'read' ID_OTHERS ';' -> ^( 'read' ID_OTHERS ) ;
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
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_ID_OTHERS=new RewriteRuleTokenStream(adaptor,"token ID_OTHERS");

        try { dbg.enterRule(getGrammarFileName(), "read");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(95, 1);

        try {
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:95:6: ( 'read' ID_OTHERS ';' -> ^( 'read' ID_OTHERS ) )
            dbg.enterAlt(1);

            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:96:2: 'read' ID_OTHERS ';'
            {
            dbg.location(96,2);
            string_literal77=(Token)match(input,56,FOLLOW_56_in_read663);  
            stream_56.add(string_literal77);

            dbg.location(96,9);
            ID_OTHERS78=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_read665);  
            stream_ID_OTHERS.add(ID_OTHERS78);

            dbg.location(96,19);
            char_literal79=(Token)match(input,37,FOLLOW_37_in_read667);  
            stream_37.add(char_literal79);



            // AST REWRITE
            // elements: ID_OTHERS, 56
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
                // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:96:26: ^( 'read' ID_OTHERS )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(96,28);
                root_1 = (Object)adaptor.becomeRoot(stream_56.nextNode(), root_1);

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
    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:99:1: retourne : 'return' '(' expr ')' ';' -> ^( RETURN expr ) ;
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
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try { dbg.enterRule(getGrammarFileName(), "retourne");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(99, 1);

        try {
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:99:10: ( 'return' '(' expr ')' ';' -> ^( RETURN expr ) )
            dbg.enterAlt(1);

            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:100:2: 'return' '(' expr ')' ';'
            {
            dbg.location(100,2);
            string_literal80=(Token)match(input,57,FOLLOW_57_in_retourne686);  
            stream_57.add(string_literal80);

            dbg.location(100,11);
            char_literal81=(Token)match(input,33,FOLLOW_33_in_retourne688);  
            stream_33.add(char_literal81);

            dbg.location(100,15);
            pushFollow(FOLLOW_expr_in_retourne690);
            expr82=expr();

            state._fsp--;

            stream_expr.add(expr82.getTree());
            dbg.location(100,20);
            char_literal83=(Token)match(input,34,FOLLOW_34_in_retourne692);  
            stream_34.add(char_literal83);

            dbg.location(100,23);
            char_literal84=(Token)match(input,37,FOLLOW_37_in_retourne693);  
            stream_37.add(char_literal84);



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
                // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:100:30: ^( RETURN expr )
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
<<<<<<< HEAD
    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:103:1: expr : ( exprplus e | 'this' e | 'super' e | 'new' ID_CLASS -> ^( NEW ID_CLASS ) );
=======
    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:102:1: expr : ( exprplus | 'this' e | 'super' e | 'new' ID_CLASS -> ^( NEW ID_CLASS ) );
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
    public final ExprParser.expr_return expr() throws RecognitionException {
        ExprParser.expr_return retval = new ExprParser.expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

<<<<<<< HEAD
        Token string_literal87=null;
        Token string_literal89=null;
        Token string_literal91=null;
        Token ID_CLASS92=null;
=======
        Token string_literal86=null;
        Token string_literal88=null;
        Token string_literal90=null;
        Token ID_CLASS91=null;
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
        ExprParser.exprplus_return exprplus85 = null;

        ExprParser.e_return e87 = null;

        ExprParser.e_return e89 = null;


<<<<<<< HEAD
        Object string_literal87_tree=null;
        Object string_literal89_tree=null;
        Object string_literal91_tree=null;
        Object ID_CLASS92_tree=null;
        RewriteRuleTokenStream stream_ID_CLASS=new RewriteRuleTokenStream(adaptor,"token ID_CLASS");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
=======
        Object string_literal86_tree=null;
        Object string_literal88_tree=null;
        Object string_literal90_tree=null;
        Object ID_CLASS91_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_ID_CLASS=new RewriteRuleTokenStream(adaptor,"token ID_CLASS");
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes

        try { dbg.enterRule(getGrammarFileName(), "expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(103, 1);

        try {
<<<<<<< HEAD
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:103:5: ( exprplus e | 'this' e | 'super' e | 'new' ID_CLASS -> ^( NEW ID_CLASS ) )
=======
            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:102:5: ( exprplus | 'this' e | 'super' e | 'new' ID_CLASS -> ^( NEW ID_CLASS ) )
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
            int alt20=4;
            try { dbg.enterDecision(20);

            switch ( input.LA(1) ) {
            case ID_OTHERS:
            case STRING:
            case INT:
            case STRING:
            case 33:
            case 63:
                {
                alt20=1;
                }
                break;
            case 58:
                {
                alt20=2;
                }
                break;
            case 59:
                {
                alt20=3;
                }
                break;
<<<<<<< HEAD
            case 60:
=======
            case 59:
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
                {
                alt20=4;
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

<<<<<<< HEAD
                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:104:3: exprplus e
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(104,3);
                    pushFollow(FOLLOW_exprplus_in_expr713);
=======
                    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:104:2: exprplus
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(104,2);
                    pushFollow(FOLLOW_exprplus_in_expr711);
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
                    exprplus85=exprplus();

                    state._fsp--;

                    adaptor.addChild(root_0, exprplus85.getTree());
<<<<<<< HEAD
                    dbg.location(104,12);
                    pushFollow(FOLLOW_e_in_expr715);
                    e86=e();

                    state._fsp--;

                    adaptor.addChild(root_0, e86.getTree());
=======
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

<<<<<<< HEAD
                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:105:4: 'this' e
=======
                    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:105:4: 'this' e
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(105,4);
<<<<<<< HEAD
                    string_literal87=(Token)match(input,58,FOLLOW_58_in_expr720); 
                    string_literal87_tree = (Object)adaptor.create(string_literal87);
                    adaptor.addChild(root_0, string_literal87_tree);

                    dbg.location(105,11);
                    pushFollow(FOLLOW_e_in_expr722);
                    e88=e();
=======
                    string_literal86=(Token)match(input,57,FOLLOW_57_in_expr716); 
                    string_literal86_tree = (Object)adaptor.create(string_literal86);
                    adaptor.addChild(root_0, string_literal86_tree);

                    dbg.location(105,11);
                    pushFollow(FOLLOW_e_in_expr718);
                    e87=e();
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes

                    state._fsp--;

                    adaptor.addChild(root_0, e87.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

<<<<<<< HEAD
                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:106:4: 'super' e
=======
                    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:106:4: 'super' e
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(106,4);
<<<<<<< HEAD
                    string_literal89=(Token)match(input,59,FOLLOW_59_in_expr727); 
                    string_literal89_tree = (Object)adaptor.create(string_literal89);
                    adaptor.addChild(root_0, string_literal89_tree);

                    dbg.location(106,12);
                    pushFollow(FOLLOW_e_in_expr729);
                    e90=e();
=======
                    string_literal88=(Token)match(input,58,FOLLOW_58_in_expr723); 
                    string_literal88_tree = (Object)adaptor.create(string_literal88);
                    adaptor.addChild(root_0, string_literal88_tree);

                    dbg.location(106,12);
                    pushFollow(FOLLOW_e_in_expr725);
                    e89=e();
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes

                    state._fsp--;

                    adaptor.addChild(root_0, e89.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

<<<<<<< HEAD
                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:107:4: 'new' ID_CLASS
                    {
                    dbg.location(107,4);
                    string_literal91=(Token)match(input,60,FOLLOW_60_in_expr734);  
                    stream_60.add(string_literal91);

                    dbg.location(107,10);
                    ID_CLASS92=(Token)match(input,ID_CLASS,FOLLOW_ID_CLASS_in_expr736);  
                    stream_ID_CLASS.add(ID_CLASS92);
=======
                    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:108:4: 'new' ID_CLASS
                    {
                    dbg.location(108,4);
                    string_literal90=(Token)match(input,59,FOLLOW_59_in_expr732);  
                    stream_59.add(string_literal90);

                    dbg.location(108,10);
                    ID_CLASS91=(Token)match(input,ID_CLASS,FOLLOW_ID_CLASS_in_expr734);  
                    stream_ID_CLASS.add(ID_CLASS91);
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes



                    // AST REWRITE
                    // elements: ID_CLASS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
                    // 107:19: -> ^( NEW ID_CLASS )
                    {
                        dbg.location(107,22);
                        // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:107:22: ^( NEW ID_CLASS )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(107,24);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NEW, "NEW"), root_1);

                        dbg.location(107,28);
=======
                    // 108:20: -> ^( NEW ID_CLASS )
                    {
                        dbg.location(108,23);
                        // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:108:23: ^( NEW ID_CLASS )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(108,25);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NEW, "NEW"), root_1);

                        dbg.location(108,29);
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
                        adaptor.addChild(root_1, stream_ID_CLASS.nextNode());

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
        dbg.location(109, 2);

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
<<<<<<< HEAD
    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:109:1: e : ( '.' ID_OTHERS '(' ( f )? ')' e -> ^( APPEL_METHODE ID_OTHERS ( f )? ( e )? ) | );
=======
    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:110:1: e : ( '.' ID_OTHERS '(' ( f )? ')' e -> ^( APPELMETHODE ID_OTHERS ( f )? ( e )? ) | );
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
    public final ExprParser.e_return e() throws RecognitionException {
        ExprParser.e_return retval = new ExprParser.e_return();
        retval.start = input.LT(1);

        Object root_0 = null;

<<<<<<< HEAD
        Token char_literal93=null;
        Token ID_OTHERS94=null;
        Token char_literal95=null;
        Token char_literal97=null;
        ExprParser.f_return f96 = null;

        ExprParser.e_return e98 = null;


        Object char_literal93_tree=null;
        Object ID_OTHERS94_tree=null;
        Object char_literal95_tree=null;
        Object char_literal97_tree=null;
=======
        Token char_literal92=null;
        Token ID_OTHERS93=null;
        Token char_literal94=null;
        Token char_literal96=null;
        ExprParser.f_return f95 = null;

        ExprParser.e_return e97 = null;


        Object char_literal92_tree=null;
        Object ID_OTHERS93_tree=null;
        Object char_literal94_tree=null;
        Object char_literal96_tree=null;
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleTokenStream stream_ID_OTHERS=new RewriteRuleTokenStream(adaptor,"token ID_OTHERS");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e");
        RewriteRuleSubtreeStream stream_f=new RewriteRuleSubtreeStream(adaptor,"rule f");
        try { dbg.enterRule(getGrammarFileName(), "e");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(110, 1);

        try {
<<<<<<< HEAD
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:109:3: ( '.' ID_OTHERS '(' ( f )? ')' e -> ^( APPEL_METHODE ID_OTHERS ( f )? ( e )? ) | )
            int alt22=2;
            try { dbg.enterDecision(22);

            int LA22_0 = input.LA(1);

            if ( (LA22_0==61) ) {
                alt22=1;
            }
            else if ( (LA22_0==34||LA22_0==37||LA22_0==43||LA22_0==46||LA22_0==51||LA22_0==53) ) {
                alt22=2;
=======
            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:110:3: ( '.' ID_OTHERS '(' ( f )? ')' e -> ^( APPELMETHODE ID_OTHERS ( f )? ( e )? ) | )
            int alt22=2;
            try { dbg.enterDecision(22);

            try {
                isCyclicDecision = true;
                alt22 = dfa22.predict(input);
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(22);}

            switch (alt22) {
                case 1 :
                    dbg.enterAlt(1);

<<<<<<< HEAD
                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:110:2: '.' ID_OTHERS '(' ( f )? ')' e
                    {
                    dbg.location(110,2);
                    char_literal93=(Token)match(input,61,FOLLOW_61_in_e754);  
                    stream_61.add(char_literal93);

                    dbg.location(110,6);
                    ID_OTHERS94=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_e756);  
                    stream_ID_OTHERS.add(ID_OTHERS94);

                    dbg.location(110,16);
                    char_literal95=(Token)match(input,33,FOLLOW_33_in_e758);  
                    stream_33.add(char_literal95);

                    dbg.location(110,20);
                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:110:20: ( f )?
=======
                    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:111:2: '.' ID_OTHERS '(' ( f )? ')' e
                    {
                    dbg.location(111,2);
                    char_literal92=(Token)match(input,60,FOLLOW_60_in_e754);  
                    stream_60.add(char_literal92);

                    dbg.location(111,6);
                    ID_OTHERS93=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_e756);  
                    stream_ID_OTHERS.add(ID_OTHERS93);

                    dbg.location(111,16);
                    char_literal94=(Token)match(input,32,FOLLOW_32_in_e758);  
                    stream_32.add(char_literal94);

                    dbg.location(111,20);
                    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:111:20: ( f )?
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
                    int alt21=2;
                    try { dbg.enterSubRule(21);
                    try { dbg.enterDecision(21);

                    int LA21_0 = input.LA(1);

<<<<<<< HEAD
                    if ( (LA21_0==ID_OTHERS||(LA21_0>=INT && LA21_0<=STRING)||LA21_0==33||(LA21_0>=58 && LA21_0<=60)||LA21_0==63) ) {
=======
                    if ( (LA21_0==ID_OTHERS||(LA21_0>=STRING && LA21_0<=INT)||LA21_0==32||(LA21_0>=57 && LA21_0<=59)||LA21_0==62) ) {
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
                        alt21=1;
                    }
                    } finally {dbg.exitDecision(21);}

                    switch (alt21) {
                        case 1 :
                            dbg.enterAlt(1);

<<<<<<< HEAD
                            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:110:20: f
                            {
                            dbg.location(110,20);
                            pushFollow(FOLLOW_f_in_e760);
                            f96=f();

                            state._fsp--;

                            stream_f.add(f96.getTree());
=======
                            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:111:20: f
                            {
                            dbg.location(111,20);
                            pushFollow(FOLLOW_f_in_e760);
                            f95=f();

                            state._fsp--;

                            stream_f.add(f95.getTree());
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(21);}

<<<<<<< HEAD
                    dbg.location(110,23);
                    char_literal97=(Token)match(input,34,FOLLOW_34_in_e763);  
                    stream_34.add(char_literal97);

                    dbg.location(110,27);
                    pushFollow(FOLLOW_e_in_e765);
                    e98=e();

                    state._fsp--;

                    stream_e.add(e98.getTree());


                    // AST REWRITE
                    // elements: f, ID_OTHERS, e
=======
                    dbg.location(111,23);
                    char_literal96=(Token)match(input,33,FOLLOW_33_in_e763);  
                    stream_33.add(char_literal96);

                    dbg.location(111,27);
                    pushFollow(FOLLOW_e_in_e765);
                    e97=e();

                    state._fsp--;

                    stream_e.add(e97.getTree());


                    // AST REWRITE
                    // elements: f, e, ID_OTHERS
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
                    // 110:29: -> ^( APPEL_METHODE ID_OTHERS ( f )? ( e )? )
                    {
                        dbg.location(110,32);
                        // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:110:32: ^( APPEL_METHODE ID_OTHERS ( f )? ( e )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(110,34);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(APPEL_METHODE, "APPEL_METHODE"), root_1);

                        dbg.location(110,48);
                        adaptor.addChild(root_1, stream_ID_OTHERS.nextNode());
                        dbg.location(110,58);
                        // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:110:58: ( f )?
                        if ( stream_f.hasNext() ) {
                            dbg.location(110,58);
=======
                    // 111:29: -> ^( APPELMETHODE ID_OTHERS ( f )? ( e )? )
                    {
                        dbg.location(111,32);
                        // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:111:32: ^( APPELMETHODE ID_OTHERS ( f )? ( e )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(111,34);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(APPELMETHODE, "APPELMETHODE"), root_1);

                        dbg.location(111,47);
                        adaptor.addChild(root_1, stream_ID_OTHERS.nextNode());
                        dbg.location(111,57);
                        // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:111:57: ( f )?
                        if ( stream_f.hasNext() ) {
                            dbg.location(111,57);
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
                            adaptor.addChild(root_1, stream_f.nextTree());

                        }
                        stream_f.reset();
<<<<<<< HEAD
                        dbg.location(110,61);
                        // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:110:61: ( e )?
                        if ( stream_e.hasNext() ) {
                            dbg.location(110,61);
=======
                        dbg.location(111,60);
                        // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:111:60: ( e )?
                        if ( stream_e.hasNext() ) {
                            dbg.location(111,60);
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
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

<<<<<<< HEAD
                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:112:2: 
=======
                    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:113:2: 
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
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
        dbg.location(113, 2);

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
<<<<<<< HEAD
    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:114:1: f : expr ( ',' expr )* -> ^( ARGS ( expr )* ) ;
=======
    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:115:1: f : expr ( ',' expr )* -> ^( ARGS ( expr )* ) ;
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
    public final ExprParser.f_return f() throws RecognitionException {
        ExprParser.f_return retval = new ExprParser.f_return();
        retval.start = input.LT(1);

        Object root_0 = null;

<<<<<<< HEAD
        Token char_literal100=null;
        ExprParser.expr_return expr99 = null;

        ExprParser.expr_return expr101 = null;


        Object char_literal100_tree=null;
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
=======
        Token char_literal99=null;
        ExprParser.expr_return expr98 = null;

        ExprParser.expr_return expr100 = null;


        Object char_literal99_tree=null;
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try { dbg.enterRule(getGrammarFileName(), "f");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(115, 1);

        try {
<<<<<<< HEAD
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:114:5: ( expr ( ',' expr )* -> ^( ARGS ( expr )* ) )
            dbg.enterAlt(1);

            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:114:8: expr ( ',' expr )*
            {
            dbg.location(114,8);
            pushFollow(FOLLOW_expr_in_f796);
            expr99=expr();

            state._fsp--;

            stream_expr.add(expr99.getTree());
            dbg.location(114,13);
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:114:13: ( ',' expr )*
=======
            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:115:5: ( expr ( ',' expr )* -> ^( ARGS ( expr )* ) )
            dbg.enterAlt(1);

            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:115:8: expr ( ',' expr )*
            {
            dbg.location(115,8);
            pushFollow(FOLLOW_expr_in_f796);
            expr98=expr();

            state._fsp--;

            stream_expr.add(expr98.getTree());
            dbg.location(115,13);
            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:115:13: ( ',' expr )*
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
            try { dbg.enterSubRule(23);

            loop23:
            do {
                int alt23=2;
                try { dbg.enterDecision(23);

                int LA23_0 = input.LA(1);

                if ( (LA23_0==43) ) {
                    alt23=1;
                }


                } finally {dbg.exitDecision(23);}

                switch (alt23) {
            	case 1 :
            	    dbg.enterAlt(1);

<<<<<<< HEAD
            	    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:114:14: ',' expr
            	    {
            	    dbg.location(114,14);
            	    char_literal100=(Token)match(input,43,FOLLOW_43_in_f799);  
            	    stream_43.add(char_literal100);

            	    dbg.location(114,18);
            	    pushFollow(FOLLOW_expr_in_f801);
            	    expr101=expr();

            	    state._fsp--;

            	    stream_expr.add(expr101.getTree());
=======
            	    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:115:14: ',' expr
            	    {
            	    dbg.location(115,14);
            	    char_literal99=(Token)match(input,42,FOLLOW_42_in_f799);  
            	    stream_42.add(char_literal99);

            	    dbg.location(115,18);
            	    pushFollow(FOLLOW_expr_in_f801);
            	    expr100=expr();

            	    state._fsp--;

            	    stream_expr.add(expr100.getTree());
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes

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
            // 115:26: -> ^( ARGS ( expr )* )
            {
<<<<<<< HEAD
                dbg.location(114,29);
                // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:114:29: ^( ARGS ( expr )* )
=======
                dbg.location(115,29);
                // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:115:29: ^( ARGS ( expr )* )
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(115,31);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGS, "ARGS"), root_1);

<<<<<<< HEAD
                dbg.location(114,36);
                // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:114:36: ( expr )*
=======
                dbg.location(115,36);
                // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:115:36: ( expr )*
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
                while ( stream_expr.hasNext() ) {
                    dbg.location(115,36);
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
        dbg.location(116, 2);

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
<<<<<<< HEAD
    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:118:1: exprplus : exprmult ( ( '+' | '-' ) exprmult )* ;
=======
    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:119:1: exprplus : exprmult e ( ( '+' | '-' ) exprmult e )* ;
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
    public final ExprParser.exprplus_return exprplus() throws RecognitionException {
        ExprParser.exprplus_return retval = new ExprParser.exprplus_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal103=null;
        Token char_literal104=null;
<<<<<<< HEAD
        ExprParser.exprmult_return exprmult102 = null;
=======
        ExprParser.exprmult_return exprmult101 = null;

        ExprParser.e_return e102 = null;
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes

        ExprParser.exprmult_return exprmult105 = null;

        ExprParser.e_return e106 = null;

<<<<<<< HEAD
=======

<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
        Object char_literal103_tree=null;
        Object char_literal104_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "exprplus");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(119, 1);

        try {
<<<<<<< HEAD
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:118:9: ( exprmult ( ( '+' | '-' ) exprmult )* )
            dbg.enterAlt(1);

            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:119:2: exprmult ( ( '+' | '-' ) exprmult )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(119,2);
            pushFollow(FOLLOW_exprmult_in_exprplus825);
            exprmult102=exprmult();

            state._fsp--;

            adaptor.addChild(root_0, exprmult102.getTree());
            dbg.location(119,11);
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:119:11: ( ( '+' | '-' ) exprmult )*
=======
            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:119:9: ( exprmult e ( ( '+' | '-' ) exprmult e )* )
            dbg.enterAlt(1);

            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:120:2: exprmult e ( ( '+' | '-' ) exprmult e )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(120,2);
            pushFollow(FOLLOW_exprmult_in_exprplus825);
            exprmult101=exprmult();

            state._fsp--;

            adaptor.addChild(root_0, exprmult101.getTree());
            dbg.location(120,11);
            pushFollow(FOLLOW_e_in_exprplus827);
            e102=e();

            state._fsp--;

            adaptor.addChild(root_0, e102.getTree());
            dbg.location(120,13);
            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:120:13: ( ( '+' | '-' ) exprmult e )*
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
            try { dbg.enterSubRule(25);

            loop25:
            do {
                int alt25=2;
                try { dbg.enterDecision(25);

                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=62 && LA25_0<=63)) ) {
                    alt25=1;
                }


                } finally {dbg.exitDecision(25);}

                switch (alt25) {
            	case 1 :
            	    dbg.enterAlt(1);

<<<<<<< HEAD
            	    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:119:13: ( '+' | '-' ) exprmult
            	    {
            	    dbg.location(119,13);
            	    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:119:13: ( '+' | '-' )
=======
            	    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:120:15: ( '+' | '-' ) exprmult e
            	    {
            	    dbg.location(120,15);
            	    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:120:15: ( '+' | '-' )
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
            	    int alt24=2;
            	    try { dbg.enterSubRule(24);
            	    try { dbg.enterDecision(24);

            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==62) ) {
            	        alt24=1;
            	    }
            	    else if ( (LA24_0==63) ) {
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

<<<<<<< HEAD
            	            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:119:14: '+'
            	            {
            	            dbg.location(119,17);
            	            char_literal103=(Token)match(input,62,FOLLOW_62_in_exprplus830); 
=======
            	            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:120:16: '+'
            	            {
            	            dbg.location(120,19);
            	            char_literal103=(Token)match(input,61,FOLLOW_61_in_exprplus832); 
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
            	            char_literal103_tree = (Object)adaptor.create(char_literal103);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal103_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            dbg.enterAlt(2);

<<<<<<< HEAD
            	            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:119:19: '-'
            	            {
            	            dbg.location(119,22);
            	            char_literal104=(Token)match(input,63,FOLLOW_63_in_exprplus833); 
=======
            	            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:120:21: '-'
            	            {
            	            dbg.location(120,24);
            	            char_literal104=(Token)match(input,62,FOLLOW_62_in_exprplus835); 
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
            	            char_literal104_tree = (Object)adaptor.create(char_literal104);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal104_tree, root_0);


            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(24);}

<<<<<<< HEAD
            	    dbg.location(119,25);
            	    pushFollow(FOLLOW_exprmult_in_exprplus837);
=======
            	    dbg.location(120,27);
            	    pushFollow(FOLLOW_exprmult_in_exprplus839);
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
            	    exprmult105=exprmult();

            	    state._fsp--;

            	    adaptor.addChild(root_0, exprmult105.getTree());
<<<<<<< HEAD
=======
            	    dbg.location(120,36);
            	    pushFollow(FOLLOW_e_in_exprplus841);
            	    e106=e();

            	    state._fsp--;

            	    adaptor.addChild(root_0, e106.getTree());
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes

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
        dbg.location(121, 2);

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
<<<<<<< HEAD
    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:123:1: exprmult : oper ( '*' oper )? ;
=======
    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:124:1: exprmult : oper ( '*' oper )? ;
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
    public final ExprParser.exprmult_return exprmult() throws RecognitionException {
        ExprParser.exprmult_return retval = new ExprParser.exprmult_return();
        retval.start = input.LT(1);

        Object root_0 = null;

<<<<<<< HEAD
        Token char_literal107=null;
        ExprParser.oper_return oper106 = null;

        ExprParser.oper_return oper108 = null;


        Object char_literal107_tree=null;
=======
        Token char_literal108=null;
        ExprParser.oper_return oper107 = null;

        ExprParser.oper_return oper109 = null;


        Object char_literal108_tree=null;
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes

        try { dbg.enterRule(getGrammarFileName(), "exprmult");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(124, 1);

        try {
<<<<<<< HEAD
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:123:9: ( oper ( '*' oper )? )
            dbg.enterAlt(1);

            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:124:3: oper ( '*' oper )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(124,3);
            pushFollow(FOLLOW_oper_in_exprmult851);
            oper106=oper();

            state._fsp--;

            adaptor.addChild(root_0, oper106.getTree());
            dbg.location(124,7);
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:124:7: ( '*' oper )?
=======
            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:124:9: ( oper ( '*' oper )? )
            dbg.enterAlt(1);

            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:125:3: oper ( '*' oper )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(125,3);
            pushFollow(FOLLOW_oper_in_exprmult855);
            oper107=oper();

            state._fsp--;

            adaptor.addChild(root_0, oper107.getTree());
            dbg.location(125,7);
            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:125:7: ( '*' oper )?
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
            int alt26=2;
            try { dbg.enterSubRule(26);
            try { dbg.enterDecision(26);

<<<<<<< HEAD
            int LA26_0 = input.LA(1);

            if ( (LA26_0==64) ) {
                alt26=1;
=======
            try {
                isCyclicDecision = true;
                alt26 = dfa26.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
            }
            } finally {dbg.exitDecision(26);}

            switch (alt26) {
                case 1 :
                    dbg.enterAlt(1);

<<<<<<< HEAD
                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:124:9: '*' oper
                    {
                    dbg.location(124,12);
                    char_literal107=(Token)match(input,64,FOLLOW_64_in_exprmult854); 
                    char_literal107_tree = (Object)adaptor.create(char_literal107);
                    root_0 = (Object)adaptor.becomeRoot(char_literal107_tree, root_0);

                    dbg.location(124,14);
                    pushFollow(FOLLOW_oper_in_exprmult857);
                    oper108=oper();

                    state._fsp--;

                    adaptor.addChild(root_0, oper108.getTree());
=======
                    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:125:9: '*' oper
                    {
                    dbg.location(125,12);
                    char_literal108=(Token)match(input,63,FOLLOW_63_in_exprmult858); 
                    char_literal108_tree = (Object)adaptor.create(char_literal108);
                    root_0 = (Object)adaptor.becomeRoot(char_literal108_tree, root_0);

                    dbg.location(125,14);
                    pushFollow(FOLLOW_oper_in_exprmult861);
                    oper109=oper();

                    state._fsp--;

                    adaptor.addChild(root_0, oper109.getTree());
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes

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
        dbg.location(126, 2);

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
<<<<<<< HEAD
    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:127:1: oper : moinsunaire ( OPERCONDITION moinsunaire )* ;
=======
    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:128:1: oper : moinsunaire ( OPERCONDITION moinsunaire )* ;
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
    public final ExprParser.oper_return oper() throws RecognitionException {
        ExprParser.oper_return retval = new ExprParser.oper_return();
        retval.start = input.LT(1);

        Object root_0 = null;

<<<<<<< HEAD
        Token OPERCONDITION110=null;
        ExprParser.moinsunaire_return moinsunaire109 = null;

        ExprParser.moinsunaire_return moinsunaire111 = null;


        Object OPERCONDITION110_tree=null;
=======
        Token OPERCONDITION111=null;
        ExprParser.moinsunaire_return moinsunaire110 = null;

        ExprParser.moinsunaire_return moinsunaire112 = null;


        Object OPERCONDITION111_tree=null;
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes

        try { dbg.enterRule(getGrammarFileName(), "oper");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(128, 1);

        try {
<<<<<<< HEAD
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:127:5: ( moinsunaire ( OPERCONDITION moinsunaire )* )
            dbg.enterAlt(1);

            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:128:2: moinsunaire ( OPERCONDITION moinsunaire )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(128,2);
            pushFollow(FOLLOW_moinsunaire_in_oper870);
            moinsunaire109=moinsunaire();

            state._fsp--;

            adaptor.addChild(root_0, moinsunaire109.getTree());
            dbg.location(128,14);
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:128:14: ( OPERCONDITION moinsunaire )*
=======
            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:128:5: ( moinsunaire ( OPERCONDITION moinsunaire )* )
            dbg.enterAlt(1);

            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:129:2: moinsunaire ( OPERCONDITION moinsunaire )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(129,2);
            pushFollow(FOLLOW_moinsunaire_in_oper874);
            moinsunaire110=moinsunaire();

            state._fsp--;

            adaptor.addChild(root_0, moinsunaire110.getTree());
            dbg.location(129,14);
            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:129:14: ( OPERCONDITION moinsunaire )*
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
            try { dbg.enterSubRule(27);

            loop27:
            do {
                int alt27=2;
                try { dbg.enterDecision(27);

                try {
                    isCyclicDecision = true;
                    alt27 = dfa27.predict(input);
                }
                catch (NoViableAltException nvae) {
                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                } finally {dbg.exitDecision(27);}

                switch (alt27) {
            	case 1 :
            	    dbg.enterAlt(1);

<<<<<<< HEAD
            	    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:128:15: OPERCONDITION moinsunaire
            	    {
            	    dbg.location(128,28);
            	    OPERCONDITION110=(Token)match(input,OPERCONDITION,FOLLOW_OPERCONDITION_in_oper873); 
            	    OPERCONDITION110_tree = (Object)adaptor.create(OPERCONDITION110);
            	    root_0 = (Object)adaptor.becomeRoot(OPERCONDITION110_tree, root_0);

            	    dbg.location(128,30);
            	    pushFollow(FOLLOW_moinsunaire_in_oper876);
            	    moinsunaire111=moinsunaire();

            	    state._fsp--;

            	    adaptor.addChild(root_0, moinsunaire111.getTree());
=======
            	    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:129:15: OPERCONDITION moinsunaire
            	    {
            	    dbg.location(129,28);
            	    OPERCONDITION111=(Token)match(input,OPERCONDITION,FOLLOW_OPERCONDITION_in_oper877); 
            	    OPERCONDITION111_tree = (Object)adaptor.create(OPERCONDITION111);
            	    root_0 = (Object)adaptor.becomeRoot(OPERCONDITION111_tree, root_0);

            	    dbg.location(129,30);
            	    pushFollow(FOLLOW_moinsunaire_in_oper880);
            	    moinsunaire112=moinsunaire();

            	    state._fsp--;

            	    adaptor.addChild(root_0, moinsunaire112.getTree());
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes

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
        dbg.location(130, 2);

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
<<<<<<< HEAD
    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:131:1: moinsunaire : ( '-' atom -> ^( OPPOSE atom ) | atom );
=======
    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:132:1: moinsunaire : ( '-' atom -> ^( OPPOSE atom ) | atom );
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
    public final ExprParser.moinsunaire_return moinsunaire() throws RecognitionException {
        ExprParser.moinsunaire_return retval = new ExprParser.moinsunaire_return();
        retval.start = input.LT(1);

        Object root_0 = null;

<<<<<<< HEAD
        Token char_literal112=null;
        ExprParser.atom_return atom113 = null;

        ExprParser.atom_return atom114 = null;


        Object char_literal112_tree=null;
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
=======
        Token char_literal113=null;
        ExprParser.atom_return atom114 = null;

        ExprParser.atom_return atom115 = null;


        Object char_literal113_tree=null;
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        try { dbg.enterRule(getGrammarFileName(), "moinsunaire");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(132, 1);

        try {
<<<<<<< HEAD
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:131:12: ( '-' atom -> ^( OPPOSE atom ) | atom )
=======
            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:132:12: ( '-' atom -> ^( OPPOSE atom ) | atom )
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
            int alt28=2;
            try { dbg.enterDecision(28);

            int LA28_0 = input.LA(1);

            if ( (LA28_0==63) ) {
                alt28=1;
            }
<<<<<<< HEAD
            else if ( (LA28_0==ID_OTHERS||(LA28_0>=INT && LA28_0<=STRING)||LA28_0==33) ) {
=======
            else if ( (LA28_0==ID_OTHERS||(LA28_0>=STRING && LA28_0<=INT)||LA28_0==32) ) {
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
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

<<<<<<< HEAD
                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:132:2: '-' atom
                    {
                    dbg.location(132,2);
                    char_literal112=(Token)match(input,63,FOLLOW_63_in_moinsunaire889);  
                    stream_63.add(char_literal112);

                    dbg.location(132,6);
                    pushFollow(FOLLOW_atom_in_moinsunaire891);
                    atom113=atom();

                    state._fsp--;

                    stream_atom.add(atom113.getTree());
=======
                    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:133:2: '-' atom
                    {
                    dbg.location(133,2);
                    char_literal113=(Token)match(input,62,FOLLOW_62_in_moinsunaire893);  
                    stream_62.add(char_literal113);

                    dbg.location(133,6);
                    pushFollow(FOLLOW_atom_in_moinsunaire895);
                    atom114=atom();

                    state._fsp--;

                    stream_atom.add(atom114.getTree());
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes


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
                    // 133:11: -> ^( OPPOSE atom )
                    {
<<<<<<< HEAD
                        dbg.location(132,14);
                        // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:132:14: ^( OPPOSE atom )
=======
                        dbg.location(133,14);
                        // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:133:14: ^( OPPOSE atom )
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(133,16);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPPOSE, "OPPOSE"), root_1);

                        dbg.location(133,23);
                        adaptor.addChild(root_1, stream_atom.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

<<<<<<< HEAD
                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:133:4: atom
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(133,4);
                    pushFollow(FOLLOW_atom_in_moinsunaire904);
                    atom114=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom114.getTree());
=======
                    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:134:4: atom
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(134,4);
                    pushFollow(FOLLOW_atom_in_moinsunaire908);
                    atom115=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom115.getTree());
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes

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
        dbg.location(135, 2);

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
<<<<<<< HEAD
    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:135:1: atom : ( ID_OTHERS | INT | STRING | '(' expr ')' );
=======
    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:136:1: atom : ( ID_OTHERS e | STRING | INT | '(' expr ')' );
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
    public final ExprParser.atom_return atom() throws RecognitionException {
        ExprParser.atom_return retval = new ExprParser.atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

<<<<<<< HEAD
        Token ID_OTHERS115=null;
        Token INT116=null;
        Token STRING117=null;
        Token char_literal118=null;
        Token char_literal120=null;
        ExprParser.expr_return expr119 = null;


        Object ID_OTHERS115_tree=null;
        Object INT116_tree=null;
        Object STRING117_tree=null;
        Object char_literal118_tree=null;
        Object char_literal120_tree=null;
=======
        Token ID_OTHERS116=null;
        Token STRING118=null;
        Token INT119=null;
        Token char_literal120=null;
        Token char_literal122=null;
        ExprParser.e_return e117 = null;

        ExprParser.expr_return expr121 = null;


        Object ID_OTHERS116_tree=null;
        Object STRING118_tree=null;
        Object INT119_tree=null;
        Object char_literal120_tree=null;
        Object char_literal122_tree=null;
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes

        try { dbg.enterRule(getGrammarFileName(), "atom");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(136, 1);

        try {
<<<<<<< HEAD
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:135:5: ( ID_OTHERS | INT | STRING | '(' expr ')' )
=======
            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:136:5: ( ID_OTHERS e | STRING | INT | '(' expr ')' )
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
            int alt29=4;
            try { dbg.enterDecision(29);

            switch ( input.LA(1) ) {
            case ID_OTHERS:
                {
                alt29=1;
                }
                break;
            case STRING:
                {
                alt29=2;
                }
                break;
<<<<<<< HEAD
            case STRING:
=======
            case INT:
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
                {
                alt29=3;
                }
                break;
<<<<<<< HEAD
            case 33:
=======
            case 32:
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
                {
                alt29=4;
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

<<<<<<< HEAD
                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:136:3: ID_OTHERS
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(136,3);
                    ID_OTHERS115=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_atom915); 
                    ID_OTHERS115_tree = (Object)adaptor.create(ID_OTHERS115);
                    adaptor.addChild(root_0, ID_OTHERS115_tree);
=======
                    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:137:3: ID_OTHERS e
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(137,3);
                    ID_OTHERS116=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_atom919); 
                    ID_OTHERS116_tree = (Object)adaptor.create(ID_OTHERS116);
                    adaptor.addChild(root_0, ID_OTHERS116_tree);

                    dbg.location(137,13);
                    pushFollow(FOLLOW_e_in_atom921);
                    e117=e();
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes

                    state._fsp--;

                    adaptor.addChild(root_0, e117.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

<<<<<<< HEAD
                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:137:4: INT
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(137,4);
                    INT116=(Token)match(input,INT,FOLLOW_INT_in_atom920); 
                    INT116_tree = (Object)adaptor.create(INT116);
                    adaptor.addChild(root_0, INT116_tree);
=======
                    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:138:4: STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(138,4);
                    STRING118=(Token)match(input,STRING,FOLLOW_STRING_in_atom926); 
                    STRING118_tree = (Object)adaptor.create(STRING118);
                    adaptor.addChild(root_0, STRING118_tree);
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

<<<<<<< HEAD
                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:138:4: STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(138,4);
                    STRING117=(Token)match(input,STRING,FOLLOW_STRING_in_atom925); 
                    STRING117_tree = (Object)adaptor.create(STRING117);
                    adaptor.addChild(root_0, STRING117_tree);
=======
                    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:139:5: INT
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(139,5);
                    INT119=(Token)match(input,INT,FOLLOW_INT_in_atom932); 
                    INT119_tree = (Object)adaptor.create(INT119);
                    adaptor.addChild(root_0, INT119_tree);
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

<<<<<<< HEAD
                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:139:4: '(' expr ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(139,4);
                    char_literal118=(Token)match(input,33,FOLLOW_33_in_atom930); 
                    char_literal118_tree = (Object)adaptor.create(char_literal118);
                    adaptor.addChild(root_0, char_literal118_tree);

                    dbg.location(139,7);
                    pushFollow(FOLLOW_expr_in_atom931);
                    expr119=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr119.getTree());
                    dbg.location(139,11);
                    char_literal120=(Token)match(input,34,FOLLOW_34_in_atom932); 
                    char_literal120_tree = (Object)adaptor.create(char_literal120);
                    adaptor.addChild(root_0, char_literal120_tree);
=======
                    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:140:4: '(' expr ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(140,4);
                    char_literal120=(Token)match(input,32,FOLLOW_32_in_atom938); 
                    char_literal120_tree = (Object)adaptor.create(char_literal120);
                    adaptor.addChild(root_0, char_literal120_tree);

                    dbg.location(140,7);
                    pushFollow(FOLLOW_expr_in_atom939);
                    expr121=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr121.getTree());
                    dbg.location(140,11);
                    char_literal122=(Token)match(input,33,FOLLOW_33_in_atom940); 
                    char_literal122_tree = (Object)adaptor.create(char_literal122);
                    adaptor.addChild(root_0, char_literal122_tree);
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes


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
<<<<<<< HEAD
        dbg.location(140, 2);
=======
        dbg.location(141, 2);
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes

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


    protected DFA22 dfa22 = new DFA22(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA27 dfa27 = new DFA27(this);
    static final String DFA22_eotS =
        "\14\uffff";
    static final String DFA22_eofS =
        "\14\uffff";
    static final String DFA22_minS =
        "\1\27\13\uffff";
    static final String DFA22_maxS =
        "\1\77\13\uffff";
    static final String DFA22_acceptS =
        "\1\uffff\1\1\1\2\11\uffff";
    static final String DFA22_specialS =
        "\14\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\2\11\uffff\1\2\2\uffff\1\2\5\uffff\1\2\2\uffff\1\2\4\uffff"+
            "\1\2\1\uffff\1\2\7\uffff\1\1\3\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "110:1: e : ( '.' ID_OTHERS '(' ( f )? ')' e -> ^( APPELMETHODE ID_OTHERS ( f )? ( e )? ) | );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA26_eotS =
        "\13\uffff";
    static final String DFA26_eofS =
        "\13\uffff";
    static final String DFA26_minS =
        "\1\41\12\uffff";
    static final String DFA26_maxS =
        "\1\77\12\uffff";
    static final String DFA26_acceptS =
        "\1\uffff\1\1\1\2\10\uffff";
    static final String DFA26_specialS =
        "\13\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\2\2\uffff\1\2\5\uffff\1\2\2\uffff\1\2\4\uffff\1\2\1\uffff"+
            "\1\2\7\uffff\3\2\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "125:7: ( '*' oper )?";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA27_eotS =
        "\14\uffff";
    static final String DFA27_eofS =
        "\14\uffff";
    static final String DFA27_minS =
        "\1\27\13\uffff";
    static final String DFA27_maxS =
        "\1\77\13\uffff";
    static final String DFA27_acceptS =
        "\1\uffff\1\2\11\uffff\1\1";
    static final String DFA27_specialS =
        "\14\uffff}>";
    static final String[] DFA27_transitionS = {
            "\1\13\11\uffff\1\1\2\uffff\1\1\5\uffff\1\1\2\uffff\1\1\4\uffff"+
            "\1\1\1\uffff\1\1\7\uffff\4\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "()* loopback of 129:14: ( OPERCONDITION moinsunaire )*";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
 

    public static final BitSet FOLLOW_class_decl_in_prog91 = new BitSet(new long[]{0x038A220840800000L});
    public static final BitSet FOLLOW_var_decl_in_prog94 = new BitSet(new long[]{0x038A220800800000L});
    public static final BitSet FOLLOW_instr_in_prog97 = new BitSet(new long[]{0x038A220800800002L});
    public static final BitSet FOLLOW_30_in_class_decl126 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ID_CLASS_in_class_decl130 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_31_in_class_decl133 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ID_CLASS_in_class_decl137 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_class_decl141 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_class_decl143 = new BitSet(new long[]{0x0000010C00000000L});
    public static final BitSet FOLLOW_class_item_decl_in_class_decl145 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_class_decl147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_decl_in_class_item_decl177 = new BitSet(new long[]{0x0000010800000002L});
    public static final BitSet FOLLOW_method_decl_in_class_item_decl180 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_35_in_var_decl204 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ID_OTHERS_in_var_decl206 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_var_decl208 = new BitSet(new long[]{0x000000C000400000L});
    public static final BitSet FOLLOW_type_in_var_decl210 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_var_decl212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_type0 = new BitSet(new long[]{0x0000000000000002L});
<<<<<<< HEAD
    public static final BitSet FOLLOW_40_in_method_decl255 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ID_OTHERS_in_method_decl257 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_method_decl259 = new BitSet(new long[]{0x0000000400800000L});
    public static final BitSet FOLLOW_method_params_in_method_decl262 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_method_decl265 = new BitSet(new long[]{0x0000021000000000L});
    public static final BitSet FOLLOW_m_in_method_decl267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_m296 = new BitSet(new long[]{0x038A220800800000L});
    public static final BitSet FOLLOW_var_decl_in_m298 = new BitSet(new long[]{0x038A220800800000L});
    public static final BitSet FOLLOW_instr_in_m301 = new BitSet(new long[]{0x038A260800800000L});
    public static final BitSet FOLLOW_42_in_m304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_m322 = new BitSet(new long[]{0x000000C000400000L});
    public static final BitSet FOLLOW_type_in_m324 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_m326 = new BitSet(new long[]{0x038A220800800000L});
    public static final BitSet FOLLOW_var_decl_in_m328 = new BitSet(new long[]{0x038A220800800000L});
    public static final BitSet FOLLOW_instr_in_m331 = new BitSet(new long[]{0x038A260800800000L});
    public static final BitSet FOLLOW_42_in_m334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_params_in_method_params363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_OTHERS_in_params383 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_params385 = new BitSet(new long[]{0x000000C000400000L});
    public static final BitSet FOLLOW_type_in_params388 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_params391 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ID_OTHERS_in_params393 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_params395 = new BitSet(new long[]{0x000000C000400000L});
    public static final BitSet FOLLOW_type_in_params397 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ID_OTHERS_in_instr425 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_instr427 = new BitSet(new long[]{0x9C40000206800000L});
    public static final BitSet FOLLOW_i_in_instr429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_instr443 = new BitSet(new long[]{0x9C00000206800000L});
    public static final BitSet FOLLOW_expr_in_instr445 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_instr447 = new BitSet(new long[]{0x038A220800800000L});
    public static final BitSet FOLLOW_instr_in_instr449 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_47_in_instr452 = new BitSet(new long[]{0x038A220800800000L});
    public static final BitSet FOLLOW_instr_in_instr454 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_instr458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_instr476 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ID_OTHERS_in_instr478 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_instr480 = new BitSet(new long[]{0x9C00000206800000L});
    public static final BitSet FOLLOW_boundaries_in_instr482 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_instr484 = new BitSet(new long[]{0x038A220800800000L});
    public static final BitSet FOLLOW_instr_in_instr486 = new BitSet(new long[]{0x039A220800800000L});
    public static final BitSet FOLLOW_52_in_instr489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_instr506 = new BitSet(new long[]{0x038A220800800000L});
    public static final BitSet FOLLOW_var_decl_in_instr508 = new BitSet(new long[]{0x038A220800800000L});
    public static final BitSet FOLLOW_instr_in_instr511 = new BitSet(new long[]{0x038A260800800000L});
    public static final BitSet FOLLOW_42_in_instr514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_instr531 = new BitSet(new long[]{0x9C00000206800000L});
    public static final BitSet FOLLOW_expr_in_instr533 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_instr535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_in_instr548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_instr552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_retourne_in_instr556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_boundaries575 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_boundaries577 = new BitSet(new long[]{0x9C00000206800000L});
    public static final BitSet FOLLOW_expr_in_boundaries581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_i607 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_i609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_i618 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_i620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_print637 = new BitSet(new long[]{0x9C00000206800000L});
    public static final BitSet FOLLOW_expr_in_print639 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_print641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_read663 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ID_OTHERS_in_read665 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_read667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_retourne686 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_retourne688 = new BitSet(new long[]{0x9C00000206800000L});
    public static final BitSet FOLLOW_expr_in_retourne690 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_retourne692 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_retourne693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprplus_in_expr713 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_e_in_expr715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_expr720 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_e_in_expr722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_expr727 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_e_in_expr729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_expr734 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ID_CLASS_in_expr736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_e754 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ID_OTHERS_in_e756 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_e758 = new BitSet(new long[]{0x9C00000606800000L});
    public static final BitSet FOLLOW_f_in_e760 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_e763 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_e_in_e765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_f796 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_f799 = new BitSet(new long[]{0x9C00000206800000L});
    public static final BitSet FOLLOW_expr_in_f801 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_exprmult_in_exprplus825 = new BitSet(new long[]{0xC000000000000002L});
    public static final BitSet FOLLOW_62_in_exprplus830 = new BitSet(new long[]{0x8000000206800000L});
    public static final BitSet FOLLOW_63_in_exprplus833 = new BitSet(new long[]{0x8000000206800000L});
    public static final BitSet FOLLOW_exprmult_in_exprplus837 = new BitSet(new long[]{0xC000000000000002L});
    public static final BitSet FOLLOW_oper_in_exprmult851 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_exprmult854 = new BitSet(new long[]{0x8000000206800000L});
    public static final BitSet FOLLOW_oper_in_exprmult857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moinsunaire_in_oper870 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_OPERCONDITION_in_oper873 = new BitSet(new long[]{0x8000000206800000L});
    public static final BitSet FOLLOW_moinsunaire_in_oper876 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_63_in_moinsunaire889 = new BitSet(new long[]{0x8000000206800000L});
    public static final BitSet FOLLOW_atom_in_moinsunaire891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_moinsunaire904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_OTHERS_in_atom915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_atom925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_atom930 = new BitSet(new long[]{0x9C00000206800000L});
    public static final BitSet FOLLOW_expr_in_atom931 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_atom932 = new BitSet(new long[]{0x0000000000000002L});
=======
    public static final BitSet FOLLOW_39_in_method_decl252 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ID_OTHERS_in_method_decl254 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_method_decl256 = new BitSet(new long[]{0x0000000200400000L});
    public static final BitSet FOLLOW_method_params_in_method_decl259 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_method_decl262 = new BitSet(new long[]{0x0000010800000000L});
    public static final BitSet FOLLOW_m_in_method_decl264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_m293 = new BitSet(new long[]{0x01C5110400400000L});
    public static final BitSet FOLLOW_var_decl_in_m295 = new BitSet(new long[]{0x01C5110400400000L});
    public static final BitSet FOLLOW_instr_in_m298 = new BitSet(new long[]{0x01C5130400400000L});
    public static final BitSet FOLLOW_41_in_m301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_m319 = new BitSet(new long[]{0x0000006000200000L});
    public static final BitSet FOLLOW_type_in_m321 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_m323 = new BitSet(new long[]{0x01C5110400400000L});
    public static final BitSet FOLLOW_var_decl_in_m325 = new BitSet(new long[]{0x01C5110400400000L});
    public static final BitSet FOLLOW_instr_in_m328 = new BitSet(new long[]{0x01C5130400400000L});
    public static final BitSet FOLLOW_41_in_m331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_params_in_method_params360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_OTHERS_in_params380 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_params382 = new BitSet(new long[]{0x0000006000200000L});
    public static final BitSet FOLLOW_type_in_params385 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_params388 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ID_OTHERS_in_params390 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_params392 = new BitSet(new long[]{0x0000006000200000L});
    public static final BitSet FOLLOW_type_in_params394 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ID_OTHERS_in_instr422 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_instr424 = new BitSet(new long[]{0x4E20000103400000L});
    public static final BitSet FOLLOW_i_in_instr426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_instr440 = new BitSet(new long[]{0x4E00000103400000L});
    public static final BitSet FOLLOW_expr_in_instr442 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_instr444 = new BitSet(new long[]{0x01C5110400400000L});
    public static final BitSet FOLLOW_instr_in_instr446 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_46_in_instr449 = new BitSet(new long[]{0x01C5110400400000L});
    public static final BitSet FOLLOW_instr_in_instr451 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_instr455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_instr473 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ID_OTHERS_in_instr475 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_instr477 = new BitSet(new long[]{0x4E00000103400000L});
    public static final BitSet FOLLOW_boundaries_in_instr479 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_instr481 = new BitSet(new long[]{0x01C5110400400000L});
    public static final BitSet FOLLOW_instr_in_instr483 = new BitSet(new long[]{0x01CD110400400000L});
    public static final BitSet FOLLOW_51_in_instr486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_instr503 = new BitSet(new long[]{0x01C5110400400000L});
    public static final BitSet FOLLOW_var_decl_in_instr505 = new BitSet(new long[]{0x01C5110400400000L});
    public static final BitSet FOLLOW_instr_in_instr508 = new BitSet(new long[]{0x01C5130400400000L});
    public static final BitSet FOLLOW_41_in_instr511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_instr528 = new BitSet(new long[]{0x4E00000103400000L});
    public static final BitSet FOLLOW_expr_in_instr530 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_instr532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_in_instr545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_instr549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_retourne_in_instr553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_boundaries572 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_boundaries574 = new BitSet(new long[]{0x4E00000103400000L});
    public static final BitSet FOLLOW_expr_in_boundaries578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_i604 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_i606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_i615 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_i617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_print634 = new BitSet(new long[]{0x4E00000103400000L});
    public static final BitSet FOLLOW_expr_in_print636 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_print638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_read660 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ID_OTHERS_in_read662 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_read664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_retourne683 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_retourne685 = new BitSet(new long[]{0x4E00000103400000L});
    public static final BitSet FOLLOW_expr_in_retourne687 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_retourne689 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_retourne690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprplus_in_expr711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_expr716 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_e_in_expr718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_expr723 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_e_in_expr725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_expr732 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ID_CLASS_in_expr734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_e754 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ID_OTHERS_in_e756 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_e758 = new BitSet(new long[]{0x4E00000303400000L});
    public static final BitSet FOLLOW_f_in_e760 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_e763 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_e_in_e765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_f796 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_f799 = new BitSet(new long[]{0x4E00000103400000L});
    public static final BitSet FOLLOW_expr_in_f801 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_exprmult_in_exprplus825 = new BitSet(new long[]{0x7000000000000000L});
    public static final BitSet FOLLOW_e_in_exprplus827 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_61_in_exprplus832 = new BitSet(new long[]{0x4000000103400000L});
    public static final BitSet FOLLOW_62_in_exprplus835 = new BitSet(new long[]{0x4000000103400000L});
    public static final BitSet FOLLOW_exprmult_in_exprplus839 = new BitSet(new long[]{0x7000000000000000L});
    public static final BitSet FOLLOW_e_in_exprplus841 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_oper_in_exprmult855 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_exprmult858 = new BitSet(new long[]{0x4000000103400000L});
    public static final BitSet FOLLOW_oper_in_exprmult861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moinsunaire_in_oper874 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_OPERCONDITION_in_oper877 = new BitSet(new long[]{0x4000000103400000L});
    public static final BitSet FOLLOW_moinsunaire_in_oper880 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_62_in_moinsunaire893 = new BitSet(new long[]{0x4000000103400000L});
    public static final BitSet FOLLOW_atom_in_moinsunaire895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_moinsunaire908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_OTHERS_in_atom919 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_e_in_atom921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_atom926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_atom938 = new BitSet(new long[]{0x4E00000103400000L});
    public static final BitSet FOLLOW_expr_in_atom939 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_atom940 = new BitSet(new long[]{0x0000000000000002L});
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes

}