<<<<<<< HEAD
// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/clement/workspace/Compil_MACA/Fichiers/Expr.g 2017-04-06 17:42:06
=======
// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/adam/workspace/Compil_MACA/Fichiers/Expr.g 2017-04-06 23:47:49
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ROOT", "DEC_CLASS", "DEC_VAR", "AFFECT", "RETURN", "FOR", "IF", "BLOC", "BODY", "METHOD", "ARGS", "PARAMS", "OPPOSE", "APPELMETHODE", "PARAM", "NEW", "BODY_CLASS", "ID_CLASS", "ID_OTHERS", "OPERCONDITION", "STRING", "INT", "COMMENTS", "NEWLINE", "WS", "'class'", "'inherit'", "'='", "'('", "')'", "'var'", "':'", "';'", "'int'", "'string'", "'method'", "'{'", "'}'", "','", "':='", "'if'", "'then'", "'else'", "'fi'", "'for'", "'in'", "'do'", "'end'", "'..'", "'nil'", "'write'", "'read'", "'return'", "'this'", "'super'", "'new'", "'.'", "'+'", "'-'", "'*'"
=======
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ROOT", "DEC_CLASS", "DEC_VAR", "AFFECT", "RETURN", "FOR", "IF", "BLOC", "BODY", "METHOD", "ARGS", "PARAMS", "OPPOSE", "APPELMETHODE", "PARAM", "NEW", "BODY_CLASS", "VOID", "ID_CLASS", "ID_OTHERS", "OPERCONDITION", "STRING", "INT", "COMMENTS", "NEWLINE", "WS", "'class'", "'inherit'", "'='", "'('", "')'", "'var'", "':'", "';'", "'int'", "'string'", "'method'", "'{'", "'}'", "','", "':='", "'if'", "'then'", "'else'", "'fi'", "'for'", "'in'", "'do'", "'end'", "'..'", "'nil'", "'write'", "'read'", "'return'", "'this'", "'super'", "'new'", "'.'", "'+'", "'-'", "'*'"
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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
    public static final int BODY_CLASS=20;
<<<<<<< HEAD
    public static final int NEWLINE=27;
    public static final int FOR=9;
    public static final int OPPOSE=16;
    public static final int DEC_CLASS=5;
    public static final int OPERCONDITION=23;
    public static final int T__29=29;
    public static final int METHOD=13;
    public static final int PARAMS=15;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int BODY=12;
    public static final int ARGS=14;
    public static final int ROOT=4;
    public static final int COMMENTS=26;
    public static final int INT=25;
    public static final int RETURN=8;
    public static final int T__37=37;
    public static final int ID_OTHERS=22;
=======
    public static final int NEWLINE=28;
    public static final int FOR=9;
    public static final int OPPOSE=16;
    public static final int DEC_CLASS=5;
    public static final int OPERCONDITION=24;
    public static final int METHOD=13;
    public static final int PARAMS=15;
    public static final int T__62=62;
    public static final int VOID=21;
    public static final int T__63=63;
    public static final int BODY=12;
    public static final int T__64=64;
    public static final int ARGS=14;
    public static final int ROOT=4;
    public static final int COMMENTS=27;
    public static final int INT=26;
    public static final int RETURN=8;
    public static final int T__37=37;
    public static final int ID_OTHERS=23;
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
<<<<<<< HEAD
    public static final int WS=28;
=======
    public static final int WS=29;
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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
<<<<<<< HEAD
    public static final int ID_CLASS=21;
    public static final int STRING=24;
=======
    public static final int ID_CLASS=22;
    public static final int STRING=25;
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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
        "invalidRule", "exprplus", "exprmult", "prog", "expr", "params", 
        "f", "type", "method_params", "oper", "e", "retourne", "class_decl", 
        "boundaries", "instr", "moinsunaire", "class_item_decl", "i", "var_decl", 
        "m", "atom", "method_decl", "print", "read"
=======
        "invalidRule", "m", "retourne", "expr", "oper", "f", "atom", "print", 
        "class_item_decl", "var_decl", "exprmult", "read", "params", "prog", 
        "moinsunaire", "exprplus", "e", "type", "method_decl", "method_params", 
        "i", "boundaries", "class_decl", "instr"
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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
<<<<<<< HEAD
    public String getGrammarFileName() { return "/home/clement/workspace/Compil_MACA/Fichiers/Expr.g"; }
=======
    public String getGrammarFileName() { return "/home/adam/workspace/Compil_MACA/Fichiers/Expr.g"; }
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b


    public static class prog_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prog"
<<<<<<< HEAD
    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:28:1: prog : ( class_decl )* ( var_decl )* ( instr )+ -> ^( ROOT ( class_decl )* ( var_decl )* ( instr )+ ) ;
=======
    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:29:1: prog : ( class_decl )* ( var_decl )* ( instr )+ -> ^( ROOT ( class_decl )* ( var_decl )* ( instr )+ ) ;
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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
<<<<<<< HEAD
        dbg.location(28, 1);

        try {
            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:28:6: ( ( class_decl )* ( var_decl )* ( instr )+ -> ^( ROOT ( class_decl )* ( var_decl )* ( instr )+ ) )
            dbg.enterAlt(1);

            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:29:2: ( class_decl )* ( var_decl )* ( instr )+
            {
            dbg.location(29,2);
            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:29:2: ( class_decl )*
=======
        dbg.location(29, 1);

        try {
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:29:6: ( ( class_decl )* ( var_decl )* ( instr )+ -> ^( ROOT ( class_decl )* ( var_decl )* ( instr )+ ) )
            dbg.enterAlt(1);

            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:30:2: ( class_decl )* ( var_decl )* ( instr )+
            {
            dbg.location(30,2);
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:30:2: ( class_decl )*
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1);

                int LA1_0 = input.LA(1);

<<<<<<< HEAD
                if ( (LA1_0==29) ) {
=======
                if ( (LA1_0==30) ) {
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

<<<<<<< HEAD
            	    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:29:2: class_decl
            	    {
            	    dbg.location(29,2);
            	    pushFollow(FOLLOW_class_decl_in_prog88);
=======
            	    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:30:2: class_decl
            	    {
            	    dbg.location(30,2);
            	    pushFollow(FOLLOW_class_decl_in_prog91);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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

<<<<<<< HEAD
            dbg.location(29,14);
            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:29:14: ( var_decl )*
=======
            dbg.location(30,14);
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:30:14: ( var_decl )*
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=2;
                try { dbg.enterDecision(2);

                int LA2_0 = input.LA(1);

<<<<<<< HEAD
                if ( (LA2_0==34) ) {
=======
                if ( (LA2_0==35) ) {
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                    alt2=1;
                }


                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

<<<<<<< HEAD
            	    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:29:14: var_decl
            	    {
            	    dbg.location(29,14);
            	    pushFollow(FOLLOW_var_decl_in_prog91);
=======
            	    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:30:14: var_decl
            	    {
            	    dbg.location(30,14);
            	    pushFollow(FOLLOW_var_decl_in_prog94);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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

<<<<<<< HEAD
            dbg.location(29,24);
            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:29:24: ( instr )+
=======
            dbg.location(30,24);
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:30:24: ( instr )+
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
            int cnt3=0;
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=2;
                try { dbg.enterDecision(3);

                int LA3_0 = input.LA(1);

<<<<<<< HEAD
                if ( (LA3_0==ID_OTHERS||LA3_0==40||LA3_0==44||LA3_0==48||LA3_0==50||(LA3_0>=54 && LA3_0<=56)) ) {
=======
                if ( (LA3_0==ID_OTHERS||LA3_0==41||LA3_0==45||LA3_0==49||LA3_0==51||(LA3_0>=55 && LA3_0<=57)) ) {
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                    alt3=1;
                }


                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

<<<<<<< HEAD
            	    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:29:24: instr
            	    {
            	    dbg.location(29,24);
            	    pushFollow(FOLLOW_instr_in_prog94);
=======
            	    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:30:24: instr
            	    {
            	    dbg.location(30,24);
            	    pushFollow(FOLLOW_instr_in_prog97);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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
<<<<<<< HEAD
            // elements: class_decl, var_decl, instr
=======
            // elements: class_decl, instr, var_decl
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
            // 29:31: -> ^( ROOT ( class_decl )* ( var_decl )* ( instr )+ )
            {
                dbg.location(29,34);
                // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:29:34: ^( ROOT ( class_decl )* ( var_decl )* ( instr )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(29,36);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ROOT, "ROOT"), root_1);

                dbg.location(29,41);
                // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:29:41: ( class_decl )*
                while ( stream_class_decl.hasNext() ) {
                    dbg.location(29,41);
=======
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
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                    adaptor.addChild(root_1, stream_class_decl.nextTree());

                }
                stream_class_decl.reset();
<<<<<<< HEAD
                dbg.location(29,53);
                // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:29:53: ( var_decl )*
                while ( stream_var_decl.hasNext() ) {
                    dbg.location(29,53);
=======
                dbg.location(30,53);
                // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:30:53: ( var_decl )*
                while ( stream_var_decl.hasNext() ) {
                    dbg.location(30,53);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                    adaptor.addChild(root_1, stream_var_decl.nextTree());

                }
                stream_var_decl.reset();
<<<<<<< HEAD
                dbg.location(29,63);
=======
                dbg.location(30,63);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                if ( !(stream_instr.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_instr.hasNext() ) {
<<<<<<< HEAD
                    dbg.location(29,63);
=======
                    dbg.location(30,63);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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
<<<<<<< HEAD
        dbg.location(30, 2);
=======
        dbg.location(31, 2);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b

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
<<<<<<< HEAD
    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:33:1: class_decl : 'class' a= ID_CLASS ( 'inherit' b= ID_CLASS )? '=' '(' class_item_decl ')' -> ^( DEC_CLASS $a ( $b)? ( class_item_decl )? ) ;
=======
    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:34:1: class_decl : 'class' a= ID_CLASS ( 'inherit' b= ID_CLASS )? '=' '(' class_item_decl ')' -> ^( DEC_CLASS $a ( $b)? ( class_item_decl )? ) ;
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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
<<<<<<< HEAD
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
=======
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
        RewriteRuleTokenStream stream_ID_CLASS=new RewriteRuleTokenStream(adaptor,"token ID_CLASS");
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleSubtreeStream stream_class_item_decl=new RewriteRuleSubtreeStream(adaptor,"rule class_item_decl");
        try { dbg.enterRule(getGrammarFileName(), "class_decl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
<<<<<<< HEAD
        dbg.location(33, 1);

        try {
            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:33:12: ( 'class' a= ID_CLASS ( 'inherit' b= ID_CLASS )? '=' '(' class_item_decl ')' -> ^( DEC_CLASS $a ( $b)? ( class_item_decl )? ) )
            dbg.enterAlt(1);

            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:34:3: 'class' a= ID_CLASS ( 'inherit' b= ID_CLASS )? '=' '(' class_item_decl ')'
            {
            dbg.location(34,3);
            string_literal4=(Token)match(input,29,FOLLOW_29_in_class_decl123);  
            stream_29.add(string_literal4);

            dbg.location(34,12);
            a=(Token)match(input,ID_CLASS,FOLLOW_ID_CLASS_in_class_decl127);  
            stream_ID_CLASS.add(a);

            dbg.location(34,22);
            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:34:22: ( 'inherit' b= ID_CLASS )?
=======
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
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
            int alt4=2;
            try { dbg.enterSubRule(4);
            try { dbg.enterDecision(4);

            int LA4_0 = input.LA(1);

<<<<<<< HEAD
            if ( (LA4_0==30) ) {
=======
            if ( (LA4_0==31) ) {
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                alt4=1;
            }
            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

<<<<<<< HEAD
                    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:34:23: 'inherit' b= ID_CLASS
                    {
                    dbg.location(34,23);
                    string_literal5=(Token)match(input,30,FOLLOW_30_in_class_decl130);  
                    stream_30.add(string_literal5);

                    dbg.location(34,34);
                    b=(Token)match(input,ID_CLASS,FOLLOW_ID_CLASS_in_class_decl134);  
=======
                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:35:23: 'inherit' b= ID_CLASS
                    {
                    dbg.location(35,23);
                    string_literal5=(Token)match(input,31,FOLLOW_31_in_class_decl133);  
                    stream_31.add(string_literal5);

                    dbg.location(35,34);
                    b=(Token)match(input,ID_CLASS,FOLLOW_ID_CLASS_in_class_decl137);  
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                    stream_ID_CLASS.add(b);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(4);}

<<<<<<< HEAD
            dbg.location(34,46);
            char_literal6=(Token)match(input,31,FOLLOW_31_in_class_decl138);  
            stream_31.add(char_literal6);

            dbg.location(34,50);
            char_literal7=(Token)match(input,32,FOLLOW_32_in_class_decl140);  
            stream_32.add(char_literal7);

            dbg.location(34,54);
            pushFollow(FOLLOW_class_item_decl_in_class_decl142);
=======
            dbg.location(35,46);
            char_literal6=(Token)match(input,32,FOLLOW_32_in_class_decl141);  
            stream_32.add(char_literal6);

            dbg.location(35,50);
            char_literal7=(Token)match(input,33,FOLLOW_33_in_class_decl143);  
            stream_33.add(char_literal7);

            dbg.location(35,54);
            pushFollow(FOLLOW_class_item_decl_in_class_decl145);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
            class_item_decl8=class_item_decl();

            state._fsp--;

            stream_class_item_decl.add(class_item_decl8.getTree());
<<<<<<< HEAD
            dbg.location(34,70);
            char_literal9=(Token)match(input,33,FOLLOW_33_in_class_decl144);  
            stream_33.add(char_literal9);
=======
            dbg.location(35,70);
            char_literal9=(Token)match(input,34,FOLLOW_34_in_class_decl147);  
            stream_34.add(char_literal9);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b



            // AST REWRITE
<<<<<<< HEAD
            // elements: b, a, class_item_decl
=======
            // elements: a, class_item_decl, b
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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
<<<<<<< HEAD
            // 34:74: -> ^( DEC_CLASS $a ( $b)? ( class_item_decl )? )
            {
                dbg.location(34,76);
                // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:34:76: ^( DEC_CLASS $a ( $b)? ( class_item_decl )? )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(34,78);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEC_CLASS, "DEC_CLASS"), root_1);

                dbg.location(34,88);
                adaptor.addChild(root_1, stream_a.nextNode());
                dbg.location(34,91);
                // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:34:91: ( $b)?
                if ( stream_b.hasNext() ) {
                    dbg.location(34,92);
=======
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
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                    adaptor.addChild(root_1, stream_b.nextNode());

                }
                stream_b.reset();
<<<<<<< HEAD
                dbg.location(34,97);
                // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:34:97: ( class_item_decl )?
                if ( stream_class_item_decl.hasNext() ) {
                    dbg.location(34,97);
=======
                dbg.location(35,97);
                // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:35:97: ( class_item_decl )?
                if ( stream_class_item_decl.hasNext() ) {
                    dbg.location(35,97);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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
<<<<<<< HEAD
        dbg.location(35, 2);
=======
        dbg.location(36, 2);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b

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
<<<<<<< HEAD
    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:37:1: class_item_decl : ( var_decl )* ( method_decl )* -> ^( BODY_CLASS ( var_decl )* ( method_decl )* ) ;
=======
    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:38:1: class_item_decl : ( var_decl )* ( method_decl )* -> ^( BODY_CLASS ( var_decl )* ( method_decl )* ) ;
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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
<<<<<<< HEAD
        dbg.location(37, 1);

        try {
            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:37:17: ( ( var_decl )* ( method_decl )* -> ^( BODY_CLASS ( var_decl )* ( method_decl )* ) )
            dbg.enterAlt(1);

            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:38:2: ( var_decl )* ( method_decl )*
            {
            dbg.location(38,2);
            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:38:2: ( var_decl )*
=======
        dbg.location(38, 1);

        try {
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:38:17: ( ( var_decl )* ( method_decl )* -> ^( BODY_CLASS ( var_decl )* ( method_decl )* ) )
            dbg.enterAlt(1);

            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:39:2: ( var_decl )* ( method_decl )*
            {
            dbg.location(39,2);
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:39:2: ( var_decl )*
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
            try { dbg.enterSubRule(5);

            loop5:
            do {
                int alt5=2;
                try { dbg.enterDecision(5);

                int LA5_0 = input.LA(1);

<<<<<<< HEAD
                if ( (LA5_0==34) ) {
=======
                if ( (LA5_0==35) ) {
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                    alt5=1;
                }


                } finally {dbg.exitDecision(5);}

                switch (alt5) {
            	case 1 :
            	    dbg.enterAlt(1);

<<<<<<< HEAD
            	    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:38:2: var_decl
            	    {
            	    dbg.location(38,2);
            	    pushFollow(FOLLOW_var_decl_in_class_item_decl174);
=======
            	    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:39:2: var_decl
            	    {
            	    dbg.location(39,2);
            	    pushFollow(FOLLOW_var_decl_in_class_item_decl177);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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

<<<<<<< HEAD
            dbg.location(38,12);
            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:38:12: ( method_decl )*
=======
            dbg.location(39,12);
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:39:12: ( method_decl )*
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
            try { dbg.enterSubRule(6);

            loop6:
            do {
                int alt6=2;
                try { dbg.enterDecision(6);

                int LA6_0 = input.LA(1);

<<<<<<< HEAD
                if ( (LA6_0==39) ) {
=======
                if ( (LA6_0==40) ) {
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                    alt6=1;
                }


                } finally {dbg.exitDecision(6);}

                switch (alt6) {
            	case 1 :
            	    dbg.enterAlt(1);

<<<<<<< HEAD
            	    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:38:12: method_decl
            	    {
            	    dbg.location(38,12);
            	    pushFollow(FOLLOW_method_decl_in_class_item_decl177);
=======
            	    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:39:12: method_decl
            	    {
            	    dbg.location(39,12);
            	    pushFollow(FOLLOW_method_decl_in_class_item_decl180);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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
            // elements: var_decl, method_decl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
            // 38:25: -> ^( BODY_CLASS ( var_decl )* ( method_decl )* )
            {
                dbg.location(38,27);
                // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:38:27: ^( BODY_CLASS ( var_decl )* ( method_decl )* )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(38,29);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY_CLASS, "BODY_CLASS"), root_1);

                dbg.location(38,40);
                // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:38:40: ( var_decl )*
                while ( stream_var_decl.hasNext() ) {
                    dbg.location(38,40);
=======
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
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                    adaptor.addChild(root_1, stream_var_decl.nextTree());

                }
                stream_var_decl.reset();
<<<<<<< HEAD
                dbg.location(38,50);
                // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:38:50: ( method_decl )*
                while ( stream_method_decl.hasNext() ) {
                    dbg.location(38,50);
=======
                dbg.location(39,50);
                // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:39:50: ( method_decl )*
                while ( stream_method_decl.hasNext() ) {
                    dbg.location(39,50);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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
<<<<<<< HEAD
        dbg.location(39, 2);
=======
        dbg.location(40, 2);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b

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
<<<<<<< HEAD
    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:41:1: var_decl : 'var' ID_OTHERS ':' type ';' -> ^( DEC_VAR ID_OTHERS type ) ;
=======
    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:42:1: var_decl : 'var' ID_OTHERS ':' type ';' -> ^( DEC_VAR ID_OTHERS type ) ;
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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
<<<<<<< HEAD
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
=======
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
        RewriteRuleTokenStream stream_ID_OTHERS=new RewriteRuleTokenStream(adaptor,"token ID_OTHERS");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try { dbg.enterRule(getGrammarFileName(), "var_decl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
<<<<<<< HEAD
        dbg.location(41, 1);

        try {
            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:41:10: ( 'var' ID_OTHERS ':' type ';' -> ^( DEC_VAR ID_OTHERS type ) )
            dbg.enterAlt(1);

            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:42:2: 'var' ID_OTHERS ':' type ';'
            {
            dbg.location(42,2);
            string_literal12=(Token)match(input,34,FOLLOW_34_in_var_decl201);  
            stream_34.add(string_literal12);

            dbg.location(42,8);
            ID_OTHERS13=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_var_decl203);  
            stream_ID_OTHERS.add(ID_OTHERS13);

            dbg.location(42,18);
            char_literal14=(Token)match(input,35,FOLLOW_35_in_var_decl205);  
            stream_35.add(char_literal14);

            dbg.location(42,22);
            pushFollow(FOLLOW_type_in_var_decl207);
=======
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
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
            type15=type();

            state._fsp--;

            stream_type.add(type15.getTree());
<<<<<<< HEAD
            dbg.location(42,27);
            char_literal16=(Token)match(input,36,FOLLOW_36_in_var_decl209);  
            stream_36.add(char_literal16);
=======
            dbg.location(43,27);
            char_literal16=(Token)match(input,37,FOLLOW_37_in_var_decl212);  
            stream_37.add(char_literal16);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b



            // AST REWRITE
<<<<<<< HEAD
            // elements: ID_OTHERS, type
=======
            // elements: type, ID_OTHERS
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
            // 42:31: -> ^( DEC_VAR ID_OTHERS type )
            {
                dbg.location(42,33);
                // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:42:33: ^( DEC_VAR ID_OTHERS type )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(42,35);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEC_VAR, "DEC_VAR"), root_1);

                dbg.location(42,43);
                adaptor.addChild(root_1, stream_ID_OTHERS.nextNode());
                dbg.location(42,53);
=======
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
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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
<<<<<<< HEAD
        dbg.location(43, 2);
=======
        dbg.location(44, 2);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b

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
<<<<<<< HEAD
    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:45:1: type : ( ID_CLASS | 'int' | 'string' );
=======
    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:46:1: type : ( ID_CLASS | 'int' | 'string' );
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
    public final ExprParser.type_return type() throws RecognitionException {
        ExprParser.type_return retval = new ExprParser.type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set17=null;

        Object set17_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "type");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
<<<<<<< HEAD
        dbg.location(45, 1);

        try {
            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:45:6: ( ID_CLASS | 'int' | 'string' )
            dbg.enterAlt(1);

            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(45,6);
            set17=(Token)input.LT(1);
            if ( input.LA(1)==ID_CLASS||(input.LA(1)>=37 && input.LA(1)<=38) ) {
=======
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
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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
<<<<<<< HEAD
        dbg.location(49, 2);
=======
        dbg.location(50, 2);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b

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
<<<<<<< HEAD
    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:51:1: method_decl : 'method' ID_OTHERS '(' ( method_params )? ')' m -> ^( METHOD ID_OTHERS ( method_params )? m ) ;
=======
    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:52:1: method_decl : 'method' ID_OTHERS '(' ( method_params )? ')' m -> ^( METHOD ID_OTHERS ( method_params )? m ) ;
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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
<<<<<<< HEAD
        RewriteRuleTokenStream stream_ID_OTHERS=new RewriteRuleTokenStream(adaptor,"token ID_OTHERS");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
=======
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleTokenStream stream_ID_OTHERS=new RewriteRuleTokenStream(adaptor,"token ID_OTHERS");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
        RewriteRuleSubtreeStream stream_method_params=new RewriteRuleSubtreeStream(adaptor,"rule method_params");
        RewriteRuleSubtreeStream stream_m=new RewriteRuleSubtreeStream(adaptor,"rule m");
        try { dbg.enterRule(getGrammarFileName(), "method_decl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
<<<<<<< HEAD
        dbg.location(51, 1);

        try {
            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:51:13: ( 'method' ID_OTHERS '(' ( method_params )? ')' m -> ^( METHOD ID_OTHERS ( method_params )? m ) )
            dbg.enterAlt(1);

            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:52:2: 'method' ID_OTHERS '(' ( method_params )? ')' m
            {
            dbg.location(52,2);
            string_literal18=(Token)match(input,39,FOLLOW_39_in_method_decl252);  
            stream_39.add(string_literal18);

            dbg.location(52,11);
            ID_OTHERS19=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_method_decl254);  
            stream_ID_OTHERS.add(ID_OTHERS19);

            dbg.location(52,21);
            char_literal20=(Token)match(input,32,FOLLOW_32_in_method_decl256);  
            stream_32.add(char_literal20);

            dbg.location(52,26);
            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:52:26: ( method_params )?
=======
        dbg.location(52, 1);

        try {
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:52:13: ( 'method' ID_OTHERS '(' ( method_params )? ')' m -> ^( METHOD ID_OTHERS ( method_params )? m ) )
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
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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

<<<<<<< HEAD
                    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:52:26: method_params
                    {
                    dbg.location(52,26);
                    pushFollow(FOLLOW_method_params_in_method_decl259);
=======
                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:53:26: method_params
                    {
                    dbg.location(53,26);
                    pushFollow(FOLLOW_method_params_in_method_decl262);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                    method_params21=method_params();

                    state._fsp--;

                    stream_method_params.add(method_params21.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(7);}

<<<<<<< HEAD
            dbg.location(52,41);
            char_literal22=(Token)match(input,33,FOLLOW_33_in_method_decl262);  
            stream_33.add(char_literal22);

            dbg.location(52,45);
            pushFollow(FOLLOW_m_in_method_decl264);
=======
            dbg.location(53,41);
            char_literal22=(Token)match(input,34,FOLLOW_34_in_method_decl265);  
            stream_34.add(char_literal22);

            dbg.location(53,45);
            pushFollow(FOLLOW_m_in_method_decl267);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
            m23=m();

            state._fsp--;

            stream_m.add(m23.getTree());


            // AST REWRITE
<<<<<<< HEAD
            // elements: ID_OTHERS, m, method_params
=======
            // elements: method_params, ID_OTHERS, m
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
            // 52:47: -> ^( METHOD ID_OTHERS ( method_params )? m )
            {
                dbg.location(52,50);
                // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:52:50: ^( METHOD ID_OTHERS ( method_params )? m )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(52,52);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHOD, "METHOD"), root_1);

                dbg.location(52,59);
                adaptor.addChild(root_1, stream_ID_OTHERS.nextNode());
                dbg.location(52,71);
                // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:52:71: ( method_params )?
                if ( stream_method_params.hasNext() ) {
                    dbg.location(52,71);
=======
            // 53:47: -> ^( METHOD ID_OTHERS ( method_params )? m )
            {
                dbg.location(53,50);
                // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:53:50: ^( METHOD ID_OTHERS ( method_params )? m )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(53,52);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHOD, "METHOD"), root_1);

                dbg.location(53,59);
                adaptor.addChild(root_1, stream_ID_OTHERS.nextNode());
                dbg.location(53,71);
                // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:53:71: ( method_params )?
                if ( stream_method_params.hasNext() ) {
                    dbg.location(53,71);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                    adaptor.addChild(root_1, stream_method_params.nextTree());

                }
                stream_method_params.reset();
<<<<<<< HEAD
                dbg.location(52,87);
=======
                dbg.location(53,87);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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
<<<<<<< HEAD
        dbg.location(53, 2);
=======
        dbg.location(54, 2);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b

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
<<<<<<< HEAD
    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:55:1: m : ( '{' ( var_decl )* ( instr )+ '}' -> ^( BODY ( var_decl )* ( instr )+ ) | ':' type '{' ( var_decl )* ( instr )+ '}' -> type ^( BODY ( var_decl )* ( instr )+ ) );
=======
    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:56:1: m : ( '{' ( var_decl )* ( instr )+ '}' -> ^( BODY ( var_decl )* ( instr )+ ) | ':' type '{' ( var_decl )* ( instr )+ '}' -> type ^( BODY ( var_decl )* ( instr )+ ) );
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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
<<<<<<< HEAD
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
=======
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
        RewriteRuleSubtreeStream stream_instr=new RewriteRuleSubtreeStream(adaptor,"rule instr");
        RewriteRuleSubtreeStream stream_var_decl=new RewriteRuleSubtreeStream(adaptor,"rule var_decl");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try { dbg.enterRule(getGrammarFileName(), "m");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
<<<<<<< HEAD
        dbg.location(55, 1);

        try {
            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:55:4: ( '{' ( var_decl )* ( instr )+ '}' -> ^( BODY ( var_decl )* ( instr )+ ) | ':' type '{' ( var_decl )* ( instr )+ '}' -> type ^( BODY ( var_decl )* ( instr )+ ) )
=======
        dbg.location(56, 1);

        try {
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:56:4: ( '{' ( var_decl )* ( instr )+ '}' -> ^( BODY ( var_decl )* ( instr )+ ) | ':' type '{' ( var_decl )* ( instr )+ '}' -> type ^( BODY ( var_decl )* ( instr )+ ) )
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
            int alt12=2;
            try { dbg.enterDecision(12);

            int LA12_0 = input.LA(1);

<<<<<<< HEAD
            if ( (LA12_0==40) ) {
                alt12=1;
            }
            else if ( (LA12_0==35) ) {
=======
            if ( (LA12_0==41) ) {
                alt12=1;
            }
            else if ( (LA12_0==36) ) {
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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

<<<<<<< HEAD
                    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:56:2: '{' ( var_decl )* ( instr )+ '}'
                    {
                    dbg.location(56,2);
                    char_literal24=(Token)match(input,40,FOLLOW_40_in_m293);  
                    stream_40.add(char_literal24);

                    dbg.location(56,6);
                    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:56:6: ( var_decl )*
=======
                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:57:2: '{' ( var_decl )* ( instr )+ '}'
                    {
                    dbg.location(57,2);
                    char_literal24=(Token)match(input,41,FOLLOW_41_in_m296);  
                    stream_41.add(char_literal24);

                    dbg.location(57,6);
                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:57:6: ( var_decl )*
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                    try { dbg.enterSubRule(8);

                    loop8:
                    do {
                        int alt8=2;
                        try { dbg.enterDecision(8);

                        int LA8_0 = input.LA(1);

<<<<<<< HEAD
                        if ( (LA8_0==34) ) {
=======
                        if ( (LA8_0==35) ) {
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                            alt8=1;
                        }


                        } finally {dbg.exitDecision(8);}

                        switch (alt8) {
                    	case 1 :
                    	    dbg.enterAlt(1);

<<<<<<< HEAD
                    	    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:56:6: var_decl
                    	    {
                    	    dbg.location(56,6);
                    	    pushFollow(FOLLOW_var_decl_in_m295);
=======
                    	    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:57:6: var_decl
                    	    {
                    	    dbg.location(57,6);
                    	    pushFollow(FOLLOW_var_decl_in_m298);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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

<<<<<<< HEAD
                    dbg.location(56,16);
                    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:56:16: ( instr )+
=======
                    dbg.location(57,16);
                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:57:16: ( instr )+
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                    int cnt9=0;
                    try { dbg.enterSubRule(9);

                    loop9:
                    do {
                        int alt9=2;
                        try { dbg.enterDecision(9);

                        int LA9_0 = input.LA(1);

<<<<<<< HEAD
                        if ( (LA9_0==ID_OTHERS||LA9_0==40||LA9_0==44||LA9_0==48||LA9_0==50||(LA9_0>=54 && LA9_0<=56)) ) {
=======
                        if ( (LA9_0==ID_OTHERS||LA9_0==41||LA9_0==45||LA9_0==49||LA9_0==51||(LA9_0>=55 && LA9_0<=57)) ) {
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                            alt9=1;
                        }


                        } finally {dbg.exitDecision(9);}

                        switch (alt9) {
                    	case 1 :
                    	    dbg.enterAlt(1);

<<<<<<< HEAD
                    	    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:56:16: instr
                    	    {
                    	    dbg.location(56,16);
                    	    pushFollow(FOLLOW_instr_in_m298);
=======
                    	    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:57:16: instr
                    	    {
                    	    dbg.location(57,16);
                    	    pushFollow(FOLLOW_instr_in_m301);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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

<<<<<<< HEAD
                    dbg.location(56,23);
                    char_literal27=(Token)match(input,41,FOLLOW_41_in_m301);  
                    stream_41.add(char_literal27);
=======
                    dbg.location(57,23);
                    char_literal27=(Token)match(input,42,FOLLOW_42_in_m304);  
                    stream_42.add(char_literal27);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b



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
<<<<<<< HEAD
                    // 56:27: -> ^( BODY ( var_decl )* ( instr )+ )
                    {
                        dbg.location(56,29);
                        // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:56:29: ^( BODY ( var_decl )* ( instr )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(56,31);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_1);

                        dbg.location(56,37);
                        // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:56:37: ( var_decl )*
                        while ( stream_var_decl.hasNext() ) {
                            dbg.location(56,37);
=======
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
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                            adaptor.addChild(root_1, stream_var_decl.nextTree());

                        }
                        stream_var_decl.reset();
<<<<<<< HEAD
                        dbg.location(56,47);
=======
                        dbg.location(57,47);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                        if ( !(stream_instr.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_instr.hasNext() ) {
<<<<<<< HEAD
                            dbg.location(56,47);
=======
                            dbg.location(57,47);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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

<<<<<<< HEAD
                    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:57:4: ':' type '{' ( var_decl )* ( instr )+ '}'
                    {
                    dbg.location(57,4);
                    char_literal28=(Token)match(input,35,FOLLOW_35_in_m319);  
                    stream_35.add(char_literal28);

                    dbg.location(57,8);
                    pushFollow(FOLLOW_type_in_m321);
=======
                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:58:4: ':' type '{' ( var_decl )* ( instr )+ '}'
                    {
                    dbg.location(58,4);
                    char_literal28=(Token)match(input,36,FOLLOW_36_in_m322);  
                    stream_36.add(char_literal28);

                    dbg.location(58,8);
                    pushFollow(FOLLOW_type_in_m324);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                    type29=type();

                    state._fsp--;

                    stream_type.add(type29.getTree());
<<<<<<< HEAD
                    dbg.location(57,13);
                    char_literal30=(Token)match(input,40,FOLLOW_40_in_m323);  
                    stream_40.add(char_literal30);

                    dbg.location(57,17);
                    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:57:17: ( var_decl )*
=======
                    dbg.location(58,13);
                    char_literal30=(Token)match(input,41,FOLLOW_41_in_m326);  
                    stream_41.add(char_literal30);

                    dbg.location(58,17);
                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:58:17: ( var_decl )*
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                    try { dbg.enterSubRule(10);

                    loop10:
                    do {
                        int alt10=2;
                        try { dbg.enterDecision(10);

                        int LA10_0 = input.LA(1);

<<<<<<< HEAD
                        if ( (LA10_0==34) ) {
=======
                        if ( (LA10_0==35) ) {
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                            alt10=1;
                        }


                        } finally {dbg.exitDecision(10);}

                        switch (alt10) {
                    	case 1 :
                    	    dbg.enterAlt(1);

<<<<<<< HEAD
                    	    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:57:17: var_decl
                    	    {
                    	    dbg.location(57,17);
                    	    pushFollow(FOLLOW_var_decl_in_m325);
=======
                    	    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:58:17: var_decl
                    	    {
                    	    dbg.location(58,17);
                    	    pushFollow(FOLLOW_var_decl_in_m328);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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

<<<<<<< HEAD
                    dbg.location(57,27);
                    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:57:27: ( instr )+
=======
                    dbg.location(58,27);
                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:58:27: ( instr )+
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                    int cnt11=0;
                    try { dbg.enterSubRule(11);

                    loop11:
                    do {
                        int alt11=2;
                        try { dbg.enterDecision(11);

                        int LA11_0 = input.LA(1);

<<<<<<< HEAD
                        if ( (LA11_0==ID_OTHERS||LA11_0==40||LA11_0==44||LA11_0==48||LA11_0==50||(LA11_0>=54 && LA11_0<=56)) ) {
=======
                        if ( (LA11_0==ID_OTHERS||LA11_0==41||LA11_0==45||LA11_0==49||LA11_0==51||(LA11_0>=55 && LA11_0<=57)) ) {
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                            alt11=1;
                        }


                        } finally {dbg.exitDecision(11);}

                        switch (alt11) {
                    	case 1 :
                    	    dbg.enterAlt(1);

<<<<<<< HEAD
                    	    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:57:27: instr
                    	    {
                    	    dbg.location(57,27);
                    	    pushFollow(FOLLOW_instr_in_m328);
=======
                    	    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:58:27: instr
                    	    {
                    	    dbg.location(58,27);
                    	    pushFollow(FOLLOW_instr_in_m331);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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

<<<<<<< HEAD
                    dbg.location(57,34);
                    char_literal33=(Token)match(input,41,FOLLOW_41_in_m331);  
                    stream_41.add(char_literal33);
=======
                    dbg.location(58,34);
                    char_literal33=(Token)match(input,42,FOLLOW_42_in_m334);  
                    stream_42.add(char_literal33);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b



                    // AST REWRITE
<<<<<<< HEAD
                    // elements: var_decl, type, instr
=======
                    // elements: type, instr, var_decl
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
                    // 57:38: -> type ^( BODY ( var_decl )* ( instr )+ )
                    {
                        dbg.location(57,41);
                        adaptor.addChild(root_0, stream_type.nextTree());
                        dbg.location(57,46);
                        // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:57:46: ^( BODY ( var_decl )* ( instr )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(57,48);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_1);

                        dbg.location(57,54);
                        // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:57:54: ( var_decl )*
                        while ( stream_var_decl.hasNext() ) {
                            dbg.location(57,54);
=======
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
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                            adaptor.addChild(root_1, stream_var_decl.nextTree());

                        }
                        stream_var_decl.reset();
<<<<<<< HEAD
                        dbg.location(57,64);
=======
                        dbg.location(58,64);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                        if ( !(stream_instr.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_instr.hasNext() ) {
<<<<<<< HEAD
                            dbg.location(57,64);
=======
                            dbg.location(58,64);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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
<<<<<<< HEAD
        dbg.location(58, 2);
=======
        dbg.location(59, 2);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b

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
<<<<<<< HEAD
    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:61:1: method_params : params -> ^( PARAMS params ) ;
=======
    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:62:1: method_params : params -> ^( PARAMS params ) ;
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
    public final ExprParser.method_params_return method_params() throws RecognitionException {
        ExprParser.method_params_return retval = new ExprParser.method_params_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ExprParser.params_return params34 = null;


        RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
        try { dbg.enterRule(getGrammarFileName(), "method_params");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
<<<<<<< HEAD
        dbg.location(61, 1);

        try {
            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:61:15: ( params -> ^( PARAMS params ) )
            dbg.enterAlt(1);

            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:62:2: params
            {
            dbg.location(62,2);
            pushFollow(FOLLOW_params_in_method_params360);
=======
        dbg.location(62, 1);

        try {
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:62:15: ( params -> ^( PARAMS params ) )
            dbg.enterAlt(1);

            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:63:2: params
            {
            dbg.location(63,2);
            pushFollow(FOLLOW_params_in_method_params363);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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
<<<<<<< HEAD
            // 62:9: -> ^( PARAMS params )
            {
                dbg.location(62,12);
                // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:62:12: ^( PARAMS params )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(62,14);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMS, "PARAMS"), root_1);

                dbg.location(62,21);
=======
            // 63:9: -> ^( PARAMS params )
            {
                dbg.location(63,12);
                // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:63:12: ^( PARAMS params )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(63,14);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMS, "PARAMS"), root_1);

                dbg.location(63,21);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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
<<<<<<< HEAD
        dbg.location(63, 2);
=======
        dbg.location(64, 2);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b

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
<<<<<<< HEAD
    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:65:1: params : ID_OTHERS ':' type ( ',' ID_OTHERS ':' type )* -> ( ^( PARAM ID_OTHERS type ) )* ;
=======
    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:66:1: params : ID_OTHERS ':' type ( ',' ID_OTHERS ':' type )* -> ( ^( PARAM ID_OTHERS type ) )* ;
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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
<<<<<<< HEAD
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_ID_OTHERS=new RewriteRuleTokenStream(adaptor,"token ID_OTHERS");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
=======
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_ID_OTHERS=new RewriteRuleTokenStream(adaptor,"token ID_OTHERS");
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try { dbg.enterRule(getGrammarFileName(), "params");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
<<<<<<< HEAD
        dbg.location(65, 1);

        try {
            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:65:8: ( ID_OTHERS ':' type ( ',' ID_OTHERS ':' type )* -> ( ^( PARAM ID_OTHERS type ) )* )
            dbg.enterAlt(1);

            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:66:2: ID_OTHERS ':' type ( ',' ID_OTHERS ':' type )*
            {
            dbg.location(66,2);
            ID_OTHERS35=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_params380);  
            stream_ID_OTHERS.add(ID_OTHERS35);

            dbg.location(66,12);
            char_literal36=(Token)match(input,35,FOLLOW_35_in_params382);  
            stream_35.add(char_literal36);

            dbg.location(66,17);
            pushFollow(FOLLOW_type_in_params385);
=======
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
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
            type37=type();

            state._fsp--;

            stream_type.add(type37.getTree());
<<<<<<< HEAD
            dbg.location(66,22);
            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:66:22: ( ',' ID_OTHERS ':' type )*
=======
            dbg.location(67,22);
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:67:22: ( ',' ID_OTHERS ':' type )*
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
            try { dbg.enterSubRule(13);

            loop13:
            do {
                int alt13=2;
                try { dbg.enterDecision(13);

                int LA13_0 = input.LA(1);

<<<<<<< HEAD
                if ( (LA13_0==42) ) {
=======
                if ( (LA13_0==43) ) {
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                    alt13=1;
                }


                } finally {dbg.exitDecision(13);}

                switch (alt13) {
            	case 1 :
            	    dbg.enterAlt(1);

<<<<<<< HEAD
            	    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:66:23: ',' ID_OTHERS ':' type
            	    {
            	    dbg.location(66,23);
            	    char_literal38=(Token)match(input,42,FOLLOW_42_in_params388);  
            	    stream_42.add(char_literal38);

            	    dbg.location(66,27);
            	    ID_OTHERS39=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_params390);  
            	    stream_ID_OTHERS.add(ID_OTHERS39);

            	    dbg.location(66,37);
            	    char_literal40=(Token)match(input,35,FOLLOW_35_in_params392);  
            	    stream_35.add(char_literal40);

            	    dbg.location(66,41);
            	    pushFollow(FOLLOW_type_in_params394);
=======
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
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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
<<<<<<< HEAD
            // 66:48: -> ( ^( PARAM ID_OTHERS type ) )*
            {
                dbg.location(66,51);
                // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:66:51: ( ^( PARAM ID_OTHERS type ) )*
                while ( stream_ID_OTHERS.hasNext()||stream_type.hasNext() ) {
                    dbg.location(66,51);
                    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:66:51: ^( PARAM ID_OTHERS type )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    dbg.location(66,53);
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAM, "PARAM"), root_1);

                    dbg.location(66,59);
                    adaptor.addChild(root_1, stream_ID_OTHERS.nextNode());
                    dbg.location(66,70);
=======
            // 67:48: -> ( ^( PARAM ID_OTHERS type ) )*
            {
                dbg.location(67,51);
                // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:67:51: ( ^( PARAM ID_OTHERS type ) )*
                while ( stream_ID_OTHERS.hasNext()||stream_type.hasNext() ) {
                    dbg.location(67,51);
                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:67:51: ^( PARAM ID_OTHERS type )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    dbg.location(67,53);
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAM, "PARAM"), root_1);

                    dbg.location(67,59);
                    adaptor.addChild(root_1, stream_ID_OTHERS.nextNode());
                    dbg.location(67,70);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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
<<<<<<< HEAD
        dbg.location(67, 2);
=======
        dbg.location(68, 2);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b

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
<<<<<<< HEAD
    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:70:1: instr : ( ID_OTHERS ':=' i -> ^( AFFECT ID_OTHERS i ) | 'if' expr 'then' instr ( 'else' instr )? 'fi' -> ^( IF expr instr ( instr )? ) | 'for' ID_OTHERS 'in' boundaries 'do' ( instr )+ 'end' -> ^( FOR ID_OTHERS boundaries ( instr )+ ) | '{' ( var_decl )* ( instr )+ '}' -> ^( BLOC ( var_decl )* ( instr )+ ) | 'do' expr ';' -> ^( 'do' expr ) | print | read | retourne );
=======
    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:71:1: instr : ( ID_OTHERS ':=' i -> ^( AFFECT ID_OTHERS i ) | 'if' expr 'then' instr ( 'else' instr )? 'fi' -> ^( IF expr instr ( instr )? ) | 'for' ID_OTHERS 'in' boundaries 'do' ( instr )+ 'end' -> ^( FOR ID_OTHERS boundaries ( instr )+ ) | '{' ( var_decl )* ( instr )+ '}' -> ^( BLOC ( var_decl )* ( instr )+ ) | 'do' expr ';' -> ^( 'do' expr ) | print | read | retourne );
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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
<<<<<<< HEAD
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
=======
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_ID_OTHERS=new RewriteRuleTokenStream(adaptor,"token ID_OTHERS");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
<<<<<<< HEAD
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
=======
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
        RewriteRuleSubtreeStream stream_instr=new RewriteRuleSubtreeStream(adaptor,"rule instr");
        RewriteRuleSubtreeStream stream_i=new RewriteRuleSubtreeStream(adaptor,"rule i");
        RewriteRuleSubtreeStream stream_boundaries=new RewriteRuleSubtreeStream(adaptor,"rule boundaries");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_var_decl=new RewriteRuleSubtreeStream(adaptor,"rule var_decl");
        try { dbg.enterRule(getGrammarFileName(), "instr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
<<<<<<< HEAD
        dbg.location(70, 1);

        try {
            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:70:7: ( ID_OTHERS ':=' i -> ^( AFFECT ID_OTHERS i ) | 'if' expr 'then' instr ( 'else' instr )? 'fi' -> ^( IF expr instr ( instr )? ) | 'for' ID_OTHERS 'in' boundaries 'do' ( instr )+ 'end' -> ^( FOR ID_OTHERS boundaries ( instr )+ ) | '{' ( var_decl )* ( instr )+ '}' -> ^( BLOC ( var_decl )* ( instr )+ ) | 'do' expr ';' -> ^( 'do' expr ) | print | read | retourne )
=======
        dbg.location(71, 1);

        try {
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:71:7: ( ID_OTHERS ':=' i -> ^( AFFECT ID_OTHERS i ) | 'if' expr 'then' instr ( 'else' instr )? 'fi' -> ^( IF expr instr ( instr )? ) | 'for' ID_OTHERS 'in' boundaries 'do' ( instr )+ 'end' -> ^( FOR ID_OTHERS boundaries ( instr )+ ) | '{' ( var_decl )* ( instr )+ '}' -> ^( BLOC ( var_decl )* ( instr )+ ) | 'do' expr ';' -> ^( 'do' expr ) | print | read | retourne )
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
            int alt18=8;
            try { dbg.enterDecision(18);

            switch ( input.LA(1) ) {
            case ID_OTHERS:
                {
                alt18=1;
                }
                break;
<<<<<<< HEAD
            case 44:
=======
            case 45:
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                {
                alt18=2;
                }
                break;
<<<<<<< HEAD
            case 48:
=======
            case 49:
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                {
                alt18=3;
                }
                break;
<<<<<<< HEAD
            case 40:
=======
            case 41:
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                {
                alt18=4;
                }
                break;
<<<<<<< HEAD
            case 50:
=======
            case 51:
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                {
                alt18=5;
                }
                break;
<<<<<<< HEAD
            case 54:
=======
            case 55:
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                {
                alt18=6;
                }
                break;
<<<<<<< HEAD
            case 55:
=======
            case 56:
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                {
                alt18=7;
                }
                break;
<<<<<<< HEAD
            case 56:
=======
            case 57:
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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

<<<<<<< HEAD
                    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:71:2: ID_OTHERS ':=' i
                    {
                    dbg.location(71,2);
                    ID_OTHERS42=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_instr422);  
                    stream_ID_OTHERS.add(ID_OTHERS42);

                    dbg.location(71,12);
                    string_literal43=(Token)match(input,43,FOLLOW_43_in_instr424);  
                    stream_43.add(string_literal43);

                    dbg.location(71,17);
                    pushFollow(FOLLOW_i_in_instr426);
=======
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
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                    i44=i();

                    state._fsp--;

                    stream_i.add(i44.getTree());


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
<<<<<<< HEAD
                    // 71:19: -> ^( AFFECT ID_OTHERS i )
                    {
                        dbg.location(71,22);
                        // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:71:22: ^( AFFECT ID_OTHERS i )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(71,24);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AFFECT, "AFFECT"), root_1);

                        dbg.location(71,31);
                        adaptor.addChild(root_1, stream_ID_OTHERS.nextNode());
                        dbg.location(71,41);
=======
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
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                        adaptor.addChild(root_1, stream_i.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

<<<<<<< HEAD
                    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:72:3: 'if' expr 'then' instr ( 'else' instr )? 'fi'
                    {
                    dbg.location(72,3);
                    string_literal45=(Token)match(input,44,FOLLOW_44_in_instr440);  
                    stream_44.add(string_literal45);

                    dbg.location(72,8);
                    pushFollow(FOLLOW_expr_in_instr442);
=======
                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:73:3: 'if' expr 'then' instr ( 'else' instr )? 'fi'
                    {
                    dbg.location(73,3);
                    string_literal45=(Token)match(input,45,FOLLOW_45_in_instr443);  
                    stream_45.add(string_literal45);

                    dbg.location(73,8);
                    pushFollow(FOLLOW_expr_in_instr445);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                    expr46=expr();

                    state._fsp--;

                    stream_expr.add(expr46.getTree());
<<<<<<< HEAD
                    dbg.location(72,13);
                    string_literal47=(Token)match(input,45,FOLLOW_45_in_instr444);  
                    stream_45.add(string_literal47);

                    dbg.location(72,20);
                    pushFollow(FOLLOW_instr_in_instr446);
=======
                    dbg.location(73,13);
                    string_literal47=(Token)match(input,46,FOLLOW_46_in_instr447);  
                    stream_46.add(string_literal47);

                    dbg.location(73,20);
                    pushFollow(FOLLOW_instr_in_instr449);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                    instr48=instr();

                    state._fsp--;

                    stream_instr.add(instr48.getTree());
<<<<<<< HEAD
                    dbg.location(72,26);
                    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:72:26: ( 'else' instr )?
=======
                    dbg.location(73,26);
                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:73:26: ( 'else' instr )?
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                    int alt14=2;
                    try { dbg.enterSubRule(14);
                    try { dbg.enterDecision(14);

                    int LA14_0 = input.LA(1);

<<<<<<< HEAD
                    if ( (LA14_0==46) ) {
=======
                    if ( (LA14_0==47) ) {
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                        alt14=1;
                    }
                    } finally {dbg.exitDecision(14);}

                    switch (alt14) {
                        case 1 :
                            dbg.enterAlt(1);

<<<<<<< HEAD
                            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:72:27: 'else' instr
                            {
                            dbg.location(72,27);
                            string_literal49=(Token)match(input,46,FOLLOW_46_in_instr449);  
                            stream_46.add(string_literal49);

                            dbg.location(72,34);
                            pushFollow(FOLLOW_instr_in_instr451);
=======
                            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:73:27: 'else' instr
                            {
                            dbg.location(73,27);
                            string_literal49=(Token)match(input,47,FOLLOW_47_in_instr452);  
                            stream_47.add(string_literal49);

                            dbg.location(73,34);
                            pushFollow(FOLLOW_instr_in_instr454);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                            instr50=instr();

                            state._fsp--;

                            stream_instr.add(instr50.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(14);}

<<<<<<< HEAD
                    dbg.location(72,42);
                    string_literal51=(Token)match(input,47,FOLLOW_47_in_instr455);  
                    stream_47.add(string_literal51);
=======
                    dbg.location(73,42);
                    string_literal51=(Token)match(input,48,FOLLOW_48_in_instr458);  
                    stream_48.add(string_literal51);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b



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
<<<<<<< HEAD
                    // 72:48: -> ^( IF expr instr ( instr )? )
                    {
                        dbg.location(72,51);
                        // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:72:51: ^( IF expr instr ( instr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(72,53);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);

                        dbg.location(72,56);
                        adaptor.addChild(root_1, stream_expr.nextTree());
                        dbg.location(72,61);
                        adaptor.addChild(root_1, stream_instr.nextTree());
                        dbg.location(72,67);
                        // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:72:67: ( instr )?
                        if ( stream_instr.hasNext() ) {
                            dbg.location(72,67);
=======
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
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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

<<<<<<< HEAD
                    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:73:3: 'for' ID_OTHERS 'in' boundaries 'do' ( instr )+ 'end'
                    {
                    dbg.location(73,3);
                    string_literal52=(Token)match(input,48,FOLLOW_48_in_instr473);  
                    stream_48.add(string_literal52);

                    dbg.location(73,9);
                    ID_OTHERS53=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_instr475);  
                    stream_ID_OTHERS.add(ID_OTHERS53);

                    dbg.location(73,19);
                    string_literal54=(Token)match(input,49,FOLLOW_49_in_instr477);  
                    stream_49.add(string_literal54);

                    dbg.location(73,24);
                    pushFollow(FOLLOW_boundaries_in_instr479);
=======
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
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                    boundaries55=boundaries();

                    state._fsp--;

                    stream_boundaries.add(boundaries55.getTree());
<<<<<<< HEAD
                    dbg.location(73,35);
                    string_literal56=(Token)match(input,50,FOLLOW_50_in_instr481);  
                    stream_50.add(string_literal56);

                    dbg.location(73,40);
                    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:73:40: ( instr )+
=======
                    dbg.location(74,35);
                    string_literal56=(Token)match(input,51,FOLLOW_51_in_instr484);  
                    stream_51.add(string_literal56);

                    dbg.location(74,40);
                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:74:40: ( instr )+
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                    int cnt15=0;
                    try { dbg.enterSubRule(15);

                    loop15:
                    do {
                        int alt15=2;
                        try { dbg.enterDecision(15);

                        int LA15_0 = input.LA(1);

<<<<<<< HEAD
                        if ( (LA15_0==ID_OTHERS||LA15_0==40||LA15_0==44||LA15_0==48||LA15_0==50||(LA15_0>=54 && LA15_0<=56)) ) {
=======
                        if ( (LA15_0==ID_OTHERS||LA15_0==41||LA15_0==45||LA15_0==49||LA15_0==51||(LA15_0>=55 && LA15_0<=57)) ) {
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                            alt15=1;
                        }


                        } finally {dbg.exitDecision(15);}

                        switch (alt15) {
                    	case 1 :
                    	    dbg.enterAlt(1);

<<<<<<< HEAD
                    	    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:73:40: instr
                    	    {
                    	    dbg.location(73,40);
                    	    pushFollow(FOLLOW_instr_in_instr483);
=======
                    	    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:74:40: instr
                    	    {
                    	    dbg.location(74,40);
                    	    pushFollow(FOLLOW_instr_in_instr486);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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

<<<<<<< HEAD
                    dbg.location(73,47);
                    string_literal58=(Token)match(input,51,FOLLOW_51_in_instr486);  
                    stream_51.add(string_literal58);
=======
                    dbg.location(74,47);
                    string_literal58=(Token)match(input,52,FOLLOW_52_in_instr489);  
                    stream_52.add(string_literal58);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b



                    // AST REWRITE
<<<<<<< HEAD
                    // elements: ID_OTHERS, instr, boundaries
=======
                    // elements: ID_OTHERS, boundaries, instr
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
                    // 73:53: -> ^( FOR ID_OTHERS boundaries ( instr )+ )
                    {
                        dbg.location(73,56);
                        // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:73:56: ^( FOR ID_OTHERS boundaries ( instr )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(73,58);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR, "FOR"), root_1);

                        dbg.location(73,62);
                        adaptor.addChild(root_1, stream_ID_OTHERS.nextNode());
                        dbg.location(73,72);
                        adaptor.addChild(root_1, stream_boundaries.nextTree());
                        dbg.location(73,83);
=======
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
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                        if ( !(stream_instr.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_instr.hasNext() ) {
<<<<<<< HEAD
                            dbg.location(73,83);
=======
                            dbg.location(74,83);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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

<<<<<<< HEAD
                    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:74:3: '{' ( var_decl )* ( instr )+ '}'
                    {
                    dbg.location(74,3);
                    char_literal59=(Token)match(input,40,FOLLOW_40_in_instr503);  
                    stream_40.add(char_literal59);

                    dbg.location(74,7);
                    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:74:7: ( var_decl )*
=======
                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:75:3: '{' ( var_decl )* ( instr )+ '}'
                    {
                    dbg.location(75,3);
                    char_literal59=(Token)match(input,41,FOLLOW_41_in_instr506);  
                    stream_41.add(char_literal59);

                    dbg.location(75,7);
                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:75:7: ( var_decl )*
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                    try { dbg.enterSubRule(16);

                    loop16:
                    do {
                        int alt16=2;
                        try { dbg.enterDecision(16);

                        int LA16_0 = input.LA(1);

<<<<<<< HEAD
                        if ( (LA16_0==34) ) {
=======
                        if ( (LA16_0==35) ) {
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                            alt16=1;
                        }


                        } finally {dbg.exitDecision(16);}

                        switch (alt16) {
                    	case 1 :
                    	    dbg.enterAlt(1);

<<<<<<< HEAD
                    	    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:74:7: var_decl
                    	    {
                    	    dbg.location(74,7);
                    	    pushFollow(FOLLOW_var_decl_in_instr505);
=======
                    	    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:75:7: var_decl
                    	    {
                    	    dbg.location(75,7);
                    	    pushFollow(FOLLOW_var_decl_in_instr508);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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

<<<<<<< HEAD
                    dbg.location(74,17);
                    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:74:17: ( instr )+
=======
                    dbg.location(75,17);
                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:75:17: ( instr )+
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                    int cnt17=0;
                    try { dbg.enterSubRule(17);

                    loop17:
                    do {
                        int alt17=2;
                        try { dbg.enterDecision(17);

                        int LA17_0 = input.LA(1);

<<<<<<< HEAD
                        if ( (LA17_0==ID_OTHERS||LA17_0==40||LA17_0==44||LA17_0==48||LA17_0==50||(LA17_0>=54 && LA17_0<=56)) ) {
=======
                        if ( (LA17_0==ID_OTHERS||LA17_0==41||LA17_0==45||LA17_0==49||LA17_0==51||(LA17_0>=55 && LA17_0<=57)) ) {
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                            alt17=1;
                        }


                        } finally {dbg.exitDecision(17);}

                        switch (alt17) {
                    	case 1 :
                    	    dbg.enterAlt(1);

<<<<<<< HEAD
                    	    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:74:17: instr
                    	    {
                    	    dbg.location(74,17);
                    	    pushFollow(FOLLOW_instr_in_instr508);
=======
                    	    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:75:17: instr
                    	    {
                    	    dbg.location(75,17);
                    	    pushFollow(FOLLOW_instr_in_instr511);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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

<<<<<<< HEAD
                    dbg.location(74,24);
                    char_literal62=(Token)match(input,41,FOLLOW_41_in_instr511);  
                    stream_41.add(char_literal62);
=======
                    dbg.location(75,24);
                    char_literal62=(Token)match(input,42,FOLLOW_42_in_instr514);  
                    stream_42.add(char_literal62);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b



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
<<<<<<< HEAD
                    // 74:28: -> ^( BLOC ( var_decl )* ( instr )+ )
                    {
                        dbg.location(74,30);
                        // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:74:30: ^( BLOC ( var_decl )* ( instr )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(74,32);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOC, "BLOC"), root_1);

                        dbg.location(74,38);
                        // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:74:38: ( var_decl )*
                        while ( stream_var_decl.hasNext() ) {
                            dbg.location(74,38);
=======
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
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                            adaptor.addChild(root_1, stream_var_decl.nextTree());

                        }
                        stream_var_decl.reset();
<<<<<<< HEAD
                        dbg.location(74,48);
=======
                        dbg.location(75,48);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                        if ( !(stream_instr.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_instr.hasNext() ) {
<<<<<<< HEAD
                            dbg.location(74,48);
=======
                            dbg.location(75,48);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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

<<<<<<< HEAD
                    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:75:3: 'do' expr ';'
                    {
                    dbg.location(75,3);
                    string_literal63=(Token)match(input,50,FOLLOW_50_in_instr528);  
                    stream_50.add(string_literal63);

                    dbg.location(75,8);
                    pushFollow(FOLLOW_expr_in_instr530);
=======
                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:76:3: 'do' expr ';'
                    {
                    dbg.location(76,3);
                    string_literal63=(Token)match(input,51,FOLLOW_51_in_instr531);  
                    stream_51.add(string_literal63);

                    dbg.location(76,8);
                    pushFollow(FOLLOW_expr_in_instr533);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                    expr64=expr();

                    state._fsp--;

                    stream_expr.add(expr64.getTree());
<<<<<<< HEAD
                    dbg.location(75,13);
                    char_literal65=(Token)match(input,36,FOLLOW_36_in_instr532);  
                    stream_36.add(char_literal65);
=======
                    dbg.location(76,13);
                    char_literal65=(Token)match(input,37,FOLLOW_37_in_instr535);  
                    stream_37.add(char_literal65);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b



                    // AST REWRITE
<<<<<<< HEAD
                    // elements: 50, expr
=======
                    // elements: expr, 51
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
                    // 75:18: -> ^( 'do' expr )
                    {
                        dbg.location(75,21);
                        // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:75:21: ^( 'do' expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(75,23);
                        root_1 = (Object)adaptor.becomeRoot(stream_50.nextNode(), root_1);

                        dbg.location(75,27);
=======
                    // 76:18: -> ^( 'do' expr )
                    {
                        dbg.location(76,21);
                        // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:76:21: ^( 'do' expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(76,23);
                        root_1 = (Object)adaptor.becomeRoot(stream_51.nextNode(), root_1);

                        dbg.location(76,27);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

<<<<<<< HEAD
                    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:76:3: print
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(76,3);
                    pushFollow(FOLLOW_print_in_instr545);
=======
                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:77:3: print
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(77,3);
                    pushFollow(FOLLOW_print_in_instr548);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                    print66=print();

                    state._fsp--;

                    adaptor.addChild(root_0, print66.getTree());

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

<<<<<<< HEAD
                    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:77:3: read
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(77,3);
                    pushFollow(FOLLOW_read_in_instr549);
=======
                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:78:3: read
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(78,3);
                    pushFollow(FOLLOW_read_in_instr552);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                    read67=read();

                    state._fsp--;

                    adaptor.addChild(root_0, read67.getTree());

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

<<<<<<< HEAD
                    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:78:3: retourne
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(78,3);
                    pushFollow(FOLLOW_retourne_in_instr553);
=======
                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:79:3: retourne
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(79,3);
                    pushFollow(FOLLOW_retourne_in_instr556);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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
<<<<<<< HEAD
        dbg.location(79, 7);
=======
        dbg.location(80, 7);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b

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
<<<<<<< HEAD
    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:81:1: boundaries : a= expr '..' b= expr -> ^( '..' $a $b) ;
=======
    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:82:1: boundaries : a= expr '..' b= expr -> ^( '..' $a $b) ;
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
    public final ExprParser.boundaries_return boundaries() throws RecognitionException {
        ExprParser.boundaries_return retval = new ExprParser.boundaries_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal69=null;
        ExprParser.expr_return a = null;

        ExprParser.expr_return b = null;


        Object string_literal69_tree=null;
<<<<<<< HEAD
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
=======
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try { dbg.enterRule(getGrammarFileName(), "boundaries");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
<<<<<<< HEAD
        dbg.location(81, 1);

        try {
            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:81:12: (a= expr '..' b= expr -> ^( '..' $a $b) )
            dbg.enterAlt(1);

            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:82:3: a= expr '..' b= expr
            {
            dbg.location(82,4);
            pushFollow(FOLLOW_expr_in_boundaries572);
=======
        dbg.location(82, 1);

        try {
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:82:12: (a= expr '..' b= expr -> ^( '..' $a $b) )
            dbg.enterAlt(1);

            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:83:3: a= expr '..' b= expr
            {
            dbg.location(83,4);
            pushFollow(FOLLOW_expr_in_boundaries575);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
            a=expr();

            state._fsp--;

            stream_expr.add(a.getTree());
<<<<<<< HEAD
            dbg.location(82,10);
            string_literal69=(Token)match(input,52,FOLLOW_52_in_boundaries574);  
            stream_52.add(string_literal69);

            dbg.location(82,16);
            pushFollow(FOLLOW_expr_in_boundaries578);
=======
            dbg.location(83,10);
            string_literal69=(Token)match(input,53,FOLLOW_53_in_boundaries577);  
            stream_53.add(string_literal69);

            dbg.location(83,16);
            pushFollow(FOLLOW_expr_in_boundaries581);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
            b=expr();

            state._fsp--;

            stream_expr.add(b.getTree());


            // AST REWRITE
<<<<<<< HEAD
            // elements: a, b, 52
=======
            // elements: 53, b, a
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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
<<<<<<< HEAD
            // 82:23: -> ^( '..' $a $b)
            {
                dbg.location(82,26);
                // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:82:26: ^( '..' $a $b)
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(82,28);
                root_1 = (Object)adaptor.becomeRoot(stream_52.nextNode(), root_1);

                dbg.location(82,33);
                adaptor.addChild(root_1, stream_a.nextTree());
                dbg.location(82,36);
=======
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
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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
<<<<<<< HEAD
        dbg.location(83, 3);
=======
        dbg.location(84, 3);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b

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
<<<<<<< HEAD
    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:85:1: i : ( expr ';' -> expr | 'nil' ';' -> 'nil' );
=======
    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:86:1: i : ( expr ';' -> expr | 'nil' ';' -> 'nil' );
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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
<<<<<<< HEAD
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
=======
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try { dbg.enterRule(getGrammarFileName(), "i");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
<<<<<<< HEAD
        dbg.location(85, 1);

        try {
            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:85:3: ( expr ';' -> expr | 'nil' ';' -> 'nil' )
=======
        dbg.location(86, 1);

        try {
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:86:3: ( expr ';' -> expr | 'nil' ';' -> 'nil' )
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
            int alt19=2;
            try { dbg.enterDecision(19);

            int LA19_0 = input.LA(1);

<<<<<<< HEAD
            if ( (LA19_0==ID_OTHERS||(LA19_0>=STRING && LA19_0<=INT)||LA19_0==32||(LA19_0>=57 && LA19_0<=59)||LA19_0==62) ) {
                alt19=1;
            }
            else if ( (LA19_0==53) ) {
=======
            if ( (LA19_0==ID_OTHERS||(LA19_0>=STRING && LA19_0<=INT)||LA19_0==33||(LA19_0>=58 && LA19_0<=60)||LA19_0==63) ) {
                alt19=1;
            }
            else if ( (LA19_0==54) ) {
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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

<<<<<<< HEAD
                    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:86:2: expr ';'
                    {
                    dbg.location(86,2);
                    pushFollow(FOLLOW_expr_in_i604);
=======
                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:87:2: expr ';'
                    {
                    dbg.location(87,2);
                    pushFollow(FOLLOW_expr_in_i607);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                    expr70=expr();

                    state._fsp--;

                    stream_expr.add(expr70.getTree());
<<<<<<< HEAD
                    dbg.location(86,7);
                    char_literal71=(Token)match(input,36,FOLLOW_36_in_i606);  
                    stream_36.add(char_literal71);
=======
                    dbg.location(87,7);
                    char_literal71=(Token)match(input,37,FOLLOW_37_in_i609);  
                    stream_37.add(char_literal71);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b



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
<<<<<<< HEAD
                    // 86:11: -> expr
                    {
                        dbg.location(86,14);
=======
                    // 87:11: -> expr
                    {
                        dbg.location(87,14);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

<<<<<<< HEAD
                    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:87:4: 'nil' ';'
                    {
                    dbg.location(87,4);
                    string_literal72=(Token)match(input,53,FOLLOW_53_in_i615);  
                    stream_53.add(string_literal72);

                    dbg.location(87,10);
                    char_literal73=(Token)match(input,36,FOLLOW_36_in_i617);  
                    stream_36.add(char_literal73);
=======
                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:88:4: 'nil' ';'
                    {
                    dbg.location(88,4);
                    string_literal72=(Token)match(input,54,FOLLOW_54_in_i618);  
                    stream_54.add(string_literal72);

                    dbg.location(88,10);
                    char_literal73=(Token)match(input,37,FOLLOW_37_in_i620);  
                    stream_37.add(char_literal73);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b



                    // AST REWRITE
<<<<<<< HEAD
                    // elements: 53
=======
                    // elements: 54
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
                    // 87:14: -> 'nil'
                    {
                        dbg.location(87,17);
                        adaptor.addChild(root_0, stream_53.nextNode());
=======
                    // 88:14: -> 'nil'
                    {
                        dbg.location(88,17);
                        adaptor.addChild(root_0, stream_54.nextNode());
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b

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
<<<<<<< HEAD
        dbg.location(88, 2);
=======
        dbg.location(89, 2);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b

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
<<<<<<< HEAD
    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:90:1: print : 'write' expr ';' -> ^( 'write' expr ) ;
=======
    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:91:1: print : 'write' expr ';' -> ^( 'write' expr ) ;
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
    public final ExprParser.print_return print() throws RecognitionException {
        ExprParser.print_return retval = new ExprParser.print_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal74=null;
        Token char_literal76=null;
        ExprParser.expr_return expr75 = null;


        Object string_literal74_tree=null;
        Object char_literal76_tree=null;
<<<<<<< HEAD
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
=======
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try { dbg.enterRule(getGrammarFileName(), "print");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
<<<<<<< HEAD
        dbg.location(90, 1);

        try {
            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:90:7: ( 'write' expr ';' -> ^( 'write' expr ) )
            dbg.enterAlt(1);

            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:91:3: 'write' expr ';'
            {
            dbg.location(91,3);
            string_literal74=(Token)match(input,54,FOLLOW_54_in_print634);  
            stream_54.add(string_literal74);

            dbg.location(91,11);
            pushFollow(FOLLOW_expr_in_print636);
=======
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
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
            expr75=expr();

            state._fsp--;

            stream_expr.add(expr75.getTree());
<<<<<<< HEAD
            dbg.location(91,16);
            char_literal76=(Token)match(input,36,FOLLOW_36_in_print638);  
            stream_36.add(char_literal76);
=======
            dbg.location(92,16);
            char_literal76=(Token)match(input,37,FOLLOW_37_in_print641);  
            stream_37.add(char_literal76);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b



            // AST REWRITE
<<<<<<< HEAD
            // elements: expr, 54
=======
            // elements: expr, 55
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
            // 91:20: -> ^( 'write' expr )
            {
                dbg.location(91,23);
                // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:91:23: ^( 'write' expr )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(91,25);
                root_1 = (Object)adaptor.becomeRoot(stream_54.nextNode(), root_1);

                dbg.location(91,33);
=======
            // 92:20: -> ^( 'write' expr )
            {
                dbg.location(92,23);
                // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:92:23: ^( 'write' expr )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(92,25);
                root_1 = (Object)adaptor.becomeRoot(stream_55.nextNode(), root_1);

                dbg.location(92,33);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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
<<<<<<< HEAD
        dbg.location(92, 3);
=======
        dbg.location(93, 3);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b

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
<<<<<<< HEAD
    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:94:1: read : 'read' ID_OTHERS ';' -> ^( 'read' ID_OTHERS ) ;
=======
    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:95:1: read : 'read' ID_OTHERS ';' -> ^( 'read' ID_OTHERS ) ;
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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
<<<<<<< HEAD
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
=======
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
        RewriteRuleTokenStream stream_ID_OTHERS=new RewriteRuleTokenStream(adaptor,"token ID_OTHERS");

        try { dbg.enterRule(getGrammarFileName(), "read");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
<<<<<<< HEAD
        dbg.location(94, 1);

        try {
            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:94:6: ( 'read' ID_OTHERS ';' -> ^( 'read' ID_OTHERS ) )
            dbg.enterAlt(1);

            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:95:2: 'read' ID_OTHERS ';'
            {
            dbg.location(95,2);
            string_literal77=(Token)match(input,55,FOLLOW_55_in_read660);  
            stream_55.add(string_literal77);

            dbg.location(95,9);
            ID_OTHERS78=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_read662);  
            stream_ID_OTHERS.add(ID_OTHERS78);

            dbg.location(95,19);
            char_literal79=(Token)match(input,36,FOLLOW_36_in_read664);  
            stream_36.add(char_literal79);
=======
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
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b



            // AST REWRITE
<<<<<<< HEAD
            // elements: 55, ID_OTHERS
=======
            // elements: 56, ID_OTHERS
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
            // 95:23: -> ^( 'read' ID_OTHERS )
            {
                dbg.location(95,26);
                // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:95:26: ^( 'read' ID_OTHERS )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(95,28);
                root_1 = (Object)adaptor.becomeRoot(stream_55.nextNode(), root_1);

                dbg.location(95,35);
=======
            // 96:23: -> ^( 'read' ID_OTHERS )
            {
                dbg.location(96,26);
                // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:96:26: ^( 'read' ID_OTHERS )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(96,28);
                root_1 = (Object)adaptor.becomeRoot(stream_56.nextNode(), root_1);

                dbg.location(96,35);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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
<<<<<<< HEAD
        dbg.location(96, 2);
=======
        dbg.location(97, 2);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b

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
<<<<<<< HEAD
    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:98:1: retourne : 'return' '(' expr ')' ';' -> ^( RETURN expr ) ;
=======
    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:99:1: retourne : 'return' '(' expr ')' ';' -> ^( RETURN expr ) ;
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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
<<<<<<< HEAD
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
=======
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try { dbg.enterRule(getGrammarFileName(), "retourne");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
<<<<<<< HEAD
        dbg.location(98, 1);

        try {
            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:98:10: ( 'return' '(' expr ')' ';' -> ^( RETURN expr ) )
            dbg.enterAlt(1);

            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:99:2: 'return' '(' expr ')' ';'
            {
            dbg.location(99,2);
            string_literal80=(Token)match(input,56,FOLLOW_56_in_retourne683);  
            stream_56.add(string_literal80);

            dbg.location(99,11);
            char_literal81=(Token)match(input,32,FOLLOW_32_in_retourne685);  
            stream_32.add(char_literal81);

            dbg.location(99,15);
            pushFollow(FOLLOW_expr_in_retourne687);
=======
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
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
            expr82=expr();

            state._fsp--;

            stream_expr.add(expr82.getTree());
<<<<<<< HEAD
            dbg.location(99,20);
            char_literal83=(Token)match(input,33,FOLLOW_33_in_retourne689);  
            stream_33.add(char_literal83);

            dbg.location(99,23);
            char_literal84=(Token)match(input,36,FOLLOW_36_in_retourne690);  
            stream_36.add(char_literal84);
=======
            dbg.location(100,20);
            char_literal83=(Token)match(input,34,FOLLOW_34_in_retourne692);  
            stream_34.add(char_literal83);

            dbg.location(100,23);
            char_literal84=(Token)match(input,37,FOLLOW_37_in_retourne693);  
            stream_37.add(char_literal84);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b



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
<<<<<<< HEAD
            // 99:27: -> ^( RETURN expr )
            {
                dbg.location(99,30);
                // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:99:30: ^( RETURN expr )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(99,32);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RETURN, "RETURN"), root_1);

                dbg.location(99,39);
=======
            // 100:27: -> ^( RETURN expr )
            {
                dbg.location(100,30);
                // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:100:30: ^( RETURN expr )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(100,32);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RETURN, "RETURN"), root_1);

                dbg.location(100,39);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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
<<<<<<< HEAD
        dbg.location(100, 3);
=======
        dbg.location(101, 3);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b

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
    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:102:1: expr : ( exprplus e | 'this' e | 'super' e | 'new' ID_CLASS -> ^( NEW ID_CLASS ) );
=======
    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:103:1: expr : ( exprplus | 'this' e -> ^( 'this' e ) | 'super' e -> ^( 'super' e ) | 'new' ID_CLASS -> ^( NEW ID_CLASS ) );
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
    public final ExprParser.expr_return expr() throws RecognitionException {
        ExprParser.expr_return retval = new ExprParser.expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

<<<<<<< HEAD
        Token string_literal87=null;
        Token string_literal89=null;
        Token string_literal91=null;
        Token ID_CLASS92=null;
        ExprParser.exprplus_return exprplus85 = null;

        ExprParser.e_return e86 = null;

        ExprParser.e_return e88 = null;

        ExprParser.e_return e90 = null;


        Object string_literal87_tree=null;
        Object string_literal89_tree=null;
        Object string_literal91_tree=null;
        Object ID_CLASS92_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_ID_CLASS=new RewriteRuleTokenStream(adaptor,"token ID_CLASS");

        try { dbg.enterRule(getGrammarFileName(), "expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(102, 1);

        try {
            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:102:5: ( exprplus e | 'this' e | 'super' e | 'new' ID_CLASS -> ^( NEW ID_CLASS ) )
=======
        Token string_literal86=null;
        Token string_literal88=null;
        Token string_literal90=null;
        Token ID_CLASS91=null;
        ExprParser.exprplus_return exprplus85 = null;

        ExprParser.e_return e87 = null;

        ExprParser.e_return e89 = null;


        Object string_literal86_tree=null;
        Object string_literal88_tree=null;
        Object string_literal90_tree=null;
        Object ID_CLASS91_tree=null;
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_ID_CLASS=new RewriteRuleTokenStream(adaptor,"token ID_CLASS");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e");
        try { dbg.enterRule(getGrammarFileName(), "expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(103, 1);

        try {
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:103:5: ( exprplus | 'this' e -> ^( 'this' e ) | 'super' e -> ^( 'super' e ) | 'new' ID_CLASS -> ^( NEW ID_CLASS ) )
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
            int alt20=4;
            try { dbg.enterDecision(20);

            switch ( input.LA(1) ) {
            case ID_OTHERS:
            case STRING:
            case INT:
<<<<<<< HEAD
            case 32:
            case 62:
=======
            case 33:
            case 63:
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                {
                alt20=1;
                }
                break;
<<<<<<< HEAD
            case 57:
=======
            case 58:
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                {
                alt20=2;
                }
                break;
<<<<<<< HEAD
            case 58:
=======
            case 59:
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                {
                alt20=3;
                }
                break;
<<<<<<< HEAD
            case 59:
=======
            case 60:
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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
                    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:104:2: exprplus e
=======
                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:104:2: exprplus
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(104,2);
<<<<<<< HEAD
                    pushFollow(FOLLOW_exprplus_in_expr711);
=======
                    pushFollow(FOLLOW_exprplus_in_expr712);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                    exprplus85=exprplus();

                    state._fsp--;

                    adaptor.addChild(root_0, exprplus85.getTree());
<<<<<<< HEAD
                    dbg.location(104,11);
                    pushFollow(FOLLOW_e_in_expr713);
                    e86=e();

                    state._fsp--;

                    adaptor.addChild(root_0, e86.getTree());
=======
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

<<<<<<< HEAD
                    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:105:4: 'this' e
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(105,4);
                    string_literal87=(Token)match(input,57,FOLLOW_57_in_expr718); 
                    string_literal87_tree = (Object)adaptor.create(string_literal87);
                    adaptor.addChild(root_0, string_literal87_tree);

                    dbg.location(105,11);
                    pushFollow(FOLLOW_e_in_expr720);
                    e88=e();

                    state._fsp--;

                    adaptor.addChild(root_0, e88.getTree());

                    }
=======
                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:105:4: 'this' e
                    {
                    dbg.location(105,4);
                    string_literal86=(Token)match(input,58,FOLLOW_58_in_expr717);  
                    stream_58.add(string_literal86);

                    dbg.location(105,11);
                    pushFollow(FOLLOW_e_in_expr719);
                    e87=e();

                    state._fsp--;

                    stream_e.add(e87.getTree());


                    // AST REWRITE
                    // elements: e, 58
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 105:13: -> ^( 'this' e )
                    {
                        dbg.location(105,16);
                        // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:105:16: ^( 'this' e )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(105,18);
                        root_1 = (Object)adaptor.becomeRoot(stream_58.nextNode(), root_1);

                        dbg.location(105,25);
                        adaptor.addChild(root_1, stream_e.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                    break;
                case 3 :
                    dbg.enterAlt(3);

<<<<<<< HEAD
                    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:106:4: 'super' e
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(106,4);
                    string_literal89=(Token)match(input,58,FOLLOW_58_in_expr725); 
                    string_literal89_tree = (Object)adaptor.create(string_literal89);
                    adaptor.addChild(root_0, string_literal89_tree);

                    dbg.location(106,12);
                    pushFollow(FOLLOW_e_in_expr727);
                    e90=e();

                    state._fsp--;

                    adaptor.addChild(root_0, e90.getTree());

=======
                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:106:4: 'super' e
                    {
                    dbg.location(106,4);
                    string_literal88=(Token)match(input,59,FOLLOW_59_in_expr732);  
                    stream_59.add(string_literal88);

                    dbg.location(106,12);
                    pushFollow(FOLLOW_e_in_expr734);
                    e89=e();

                    state._fsp--;

                    stream_e.add(e89.getTree());


                    // AST REWRITE
                    // elements: e, 59
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 106:14: -> ^( 'super' e )
                    {
                        dbg.location(106,17);
                        // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:106:17: ^( 'super' e )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(106,19);
                        root_1 = (Object)adaptor.becomeRoot(stream_59.nextNode(), root_1);

                        dbg.location(106,27);
                        adaptor.addChild(root_1, stream_e.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

<<<<<<< HEAD
                    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:108:4: 'new' ID_CLASS
                    {
                    dbg.location(108,4);
                    string_literal91=(Token)match(input,59,FOLLOW_59_in_expr734);  
                    stream_59.add(string_literal91);

                    dbg.location(108,10);
                    ID_CLASS92=(Token)match(input,ID_CLASS,FOLLOW_ID_CLASS_in_expr736);  
                    stream_ID_CLASS.add(ID_CLASS92);
=======
                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:107:4: 'new' ID_CLASS
                    {
                    dbg.location(107,4);
                    string_literal90=(Token)match(input,60,FOLLOW_60_in_expr747);  
                    stream_60.add(string_literal90);

                    dbg.location(107,10);
                    ID_CLASS91=(Token)match(input,ID_CLASS,FOLLOW_ID_CLASS_in_expr749);  
                    stream_ID_CLASS.add(ID_CLASS91);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b



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
                    // 108:20: -> ^( NEW ID_CLASS )
                    {
                        dbg.location(108,23);
                        // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:108:23: ^( NEW ID_CLASS )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(108,25);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NEW, "NEW"), root_1);

                        dbg.location(108,29);
=======
                    // 107:20: -> ^( NEW ID_CLASS )
                    {
                        dbg.location(107,23);
                        // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:107:23: ^( NEW ID_CLASS )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(107,25);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NEW, "NEW"), root_1);

                        dbg.location(107,29);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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
<<<<<<< HEAD
        dbg.location(109, 2);
=======
        dbg.location(108, 2);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b

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
    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:110:1: e : ( '.' ID_OTHERS '(' ( f )? ')' e -> ^( APPELMETHODE ID_OTHERS ( f )? ( e )? ) | );
=======
    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:109:1: e : ( '.' ID_OTHERS '(' ( f )? ')' e -> ^( APPELMETHODE ID_OTHERS ( f )? ( e )? ) | );
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_ID_OTHERS=new RewriteRuleTokenStream(adaptor,"token ID_OTHERS");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
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
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleTokenStream stream_ID_OTHERS=new RewriteRuleTokenStream(adaptor,"token ID_OTHERS");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
        RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e");
        RewriteRuleSubtreeStream stream_f=new RewriteRuleSubtreeStream(adaptor,"rule f");
        try { dbg.enterRule(getGrammarFileName(), "e");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
<<<<<<< HEAD
        dbg.location(110, 1);

        try {
            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:110:3: ( '.' ID_OTHERS '(' ( f )? ')' e -> ^( APPELMETHODE ID_OTHERS ( f )? ( e )? ) | )
=======
        dbg.location(109, 1);

        try {
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:109:3: ( '.' ID_OTHERS '(' ( f )? ')' e -> ^( APPELMETHODE ID_OTHERS ( f )? ( e )? ) | )
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
            int alt22=2;
            try { dbg.enterDecision(22);

            int LA22_0 = input.LA(1);

<<<<<<< HEAD
            if ( (LA22_0==60) ) {
                alt22=1;
            }
            else if ( (LA22_0==33||LA22_0==36||LA22_0==42||LA22_0==45||LA22_0==50||LA22_0==52) ) {
=======
            if ( (LA22_0==61) ) {
                alt22=1;
            }
            else if ( (LA22_0==OPERCONDITION||LA22_0==34||LA22_0==37||LA22_0==43||LA22_0==46||LA22_0==51||LA22_0==53||(LA22_0>=62 && LA22_0<=64)) ) {
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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

<<<<<<< HEAD
                    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:111:2: '.' ID_OTHERS '(' ( f )? ')' e
                    {
                    dbg.location(111,2);
                    char_literal93=(Token)match(input,60,FOLLOW_60_in_e756);  
                    stream_60.add(char_literal93);

                    dbg.location(111,6);
                    ID_OTHERS94=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_e758);  
                    stream_ID_OTHERS.add(ID_OTHERS94);

                    dbg.location(111,16);
                    char_literal95=(Token)match(input,32,FOLLOW_32_in_e760);  
                    stream_32.add(char_literal95);

                    dbg.location(111,20);
                    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:111:20: ( f )?
=======
                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:110:2: '.' ID_OTHERS '(' ( f )? ')' e
                    {
                    dbg.location(110,2);
                    char_literal92=(Token)match(input,61,FOLLOW_61_in_e769);  
                    stream_61.add(char_literal92);

                    dbg.location(110,6);
                    ID_OTHERS93=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_e771);  
                    stream_ID_OTHERS.add(ID_OTHERS93);

                    dbg.location(110,16);
                    char_literal94=(Token)match(input,33,FOLLOW_33_in_e773);  
                    stream_33.add(char_literal94);

                    dbg.location(110,20);
                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:110:20: ( f )?
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                    int alt21=2;
                    try { dbg.enterSubRule(21);
                    try { dbg.enterDecision(21);

                    int LA21_0 = input.LA(1);

<<<<<<< HEAD
                    if ( (LA21_0==ID_OTHERS||(LA21_0>=STRING && LA21_0<=INT)||LA21_0==32||(LA21_0>=57 && LA21_0<=59)||LA21_0==62) ) {
=======
                    if ( (LA21_0==ID_OTHERS||(LA21_0>=STRING && LA21_0<=INT)||LA21_0==33||(LA21_0>=58 && LA21_0<=60)||LA21_0==63) ) {
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                        alt21=1;
                    }
                    } finally {dbg.exitDecision(21);}

                    switch (alt21) {
                        case 1 :
                            dbg.enterAlt(1);

<<<<<<< HEAD
                            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:111:20: f
                            {
                            dbg.location(111,20);
                            pushFollow(FOLLOW_f_in_e762);
                            f96=f();

                            state._fsp--;

                            stream_f.add(f96.getTree());
=======
                            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:110:20: f
                            {
                            dbg.location(110,20);
                            pushFollow(FOLLOW_f_in_e775);
                            f95=f();

                            state._fsp--;

                            stream_f.add(f95.getTree());
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(21);}

<<<<<<< HEAD
                    dbg.location(111,23);
                    char_literal97=(Token)match(input,33,FOLLOW_33_in_e765);  
                    stream_33.add(char_literal97);

                    dbg.location(111,27);
                    pushFollow(FOLLOW_e_in_e767);
                    e98=e();

                    state._fsp--;

                    stream_e.add(e98.getTree());


                    // AST REWRITE
                    // elements: f, e, ID_OTHERS
=======
                    dbg.location(110,23);
                    char_literal96=(Token)match(input,34,FOLLOW_34_in_e778);  
                    stream_34.add(char_literal96);

                    dbg.location(110,27);
                    pushFollow(FOLLOW_e_in_e780);
                    e97=e();

                    state._fsp--;

                    stream_e.add(e97.getTree());


                    // AST REWRITE
                    // elements: ID_OTHERS, e, f
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
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
=======
                    // 110:29: -> ^( APPELMETHODE ID_OTHERS ( f )? ( e )? )
                    {
                        dbg.location(110,32);
                        // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:110:32: ^( APPELMETHODE ID_OTHERS ( f )? ( e )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(110,34);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(APPELMETHODE, "APPELMETHODE"), root_1);

                        dbg.location(110,47);
                        adaptor.addChild(root_1, stream_ID_OTHERS.nextNode());
                        dbg.location(110,57);
                        // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:110:57: ( f )?
                        if ( stream_f.hasNext() ) {
                            dbg.location(110,57);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                            adaptor.addChild(root_1, stream_f.nextTree());

                        }
                        stream_f.reset();
<<<<<<< HEAD
                        dbg.location(111,60);
                        // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:111:60: ( e )?
                        if ( stream_e.hasNext() ) {
                            dbg.location(111,60);
=======
                        dbg.location(110,60);
                        // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:110:60: ( e )?
                        if ( stream_e.hasNext() ) {
                            dbg.location(110,60);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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
                    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:113:2: 
=======
                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:112:2: 
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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
<<<<<<< HEAD
        dbg.location(113, 2);
=======
        dbg.location(112, 2);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b

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
    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:115:1: f : expr ( ',' expr )* -> ^( ARGS ( expr )* ) ;
=======
    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:114:1: f : expr ( ',' expr )* -> ^( ARGS ( expr )* ) ;
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
    public final ExprParser.f_return f() throws RecognitionException {
        ExprParser.f_return retval = new ExprParser.f_return();
        retval.start = input.LT(1);

        Object root_0 = null;

<<<<<<< HEAD
        Token char_literal100=null;
        ExprParser.expr_return expr99 = null;

        ExprParser.expr_return expr101 = null;


        Object char_literal100_tree=null;
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
=======
        Token char_literal99=null;
        ExprParser.expr_return expr98 = null;

        ExprParser.expr_return expr100 = null;


        Object char_literal99_tree=null;
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try { dbg.enterRule(getGrammarFileName(), "f");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
<<<<<<< HEAD
        dbg.location(115, 1);

        try {
            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:115:5: ( expr ( ',' expr )* -> ^( ARGS ( expr )* ) )
            dbg.enterAlt(1);

            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:115:8: expr ( ',' expr )*
            {
            dbg.location(115,8);
            pushFollow(FOLLOW_expr_in_f798);
            expr99=expr();

            state._fsp--;

            stream_expr.add(expr99.getTree());
            dbg.location(115,13);
            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:115:13: ( ',' expr )*
=======
        dbg.location(114, 1);

        try {
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:114:5: ( expr ( ',' expr )* -> ^( ARGS ( expr )* ) )
            dbg.enterAlt(1);

            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:114:8: expr ( ',' expr )*
            {
            dbg.location(114,8);
            pushFollow(FOLLOW_expr_in_f811);
            expr98=expr();

            state._fsp--;

            stream_expr.add(expr98.getTree());
            dbg.location(114,13);
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:114:13: ( ',' expr )*
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
            try { dbg.enterSubRule(23);

            loop23:
            do {
                int alt23=2;
                try { dbg.enterDecision(23);

                int LA23_0 = input.LA(1);

<<<<<<< HEAD
                if ( (LA23_0==42) ) {
=======
                if ( (LA23_0==43) ) {
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                    alt23=1;
                }


                } finally {dbg.exitDecision(23);}

                switch (alt23) {
            	case 1 :
            	    dbg.enterAlt(1);

<<<<<<< HEAD
            	    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:115:14: ',' expr
            	    {
            	    dbg.location(115,14);
            	    char_literal100=(Token)match(input,42,FOLLOW_42_in_f801);  
            	    stream_42.add(char_literal100);

            	    dbg.location(115,18);
            	    pushFollow(FOLLOW_expr_in_f803);
            	    expr101=expr();

            	    state._fsp--;

            	    stream_expr.add(expr101.getTree());
=======
            	    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:114:14: ',' expr
            	    {
            	    dbg.location(114,14);
            	    char_literal99=(Token)match(input,43,FOLLOW_43_in_f814);  
            	    stream_43.add(char_literal99);

            	    dbg.location(114,18);
            	    pushFollow(FOLLOW_expr_in_f816);
            	    expr100=expr();

            	    state._fsp--;

            	    stream_expr.add(expr100.getTree());
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b

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
<<<<<<< HEAD
            // 115:26: -> ^( ARGS ( expr )* )
            {
                dbg.location(115,29);
                // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:115:29: ^( ARGS ( expr )* )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(115,31);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGS, "ARGS"), root_1);

                dbg.location(115,36);
                // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:115:36: ( expr )*
                while ( stream_expr.hasNext() ) {
                    dbg.location(115,36);
=======
            // 114:26: -> ^( ARGS ( expr )* )
            {
                dbg.location(114,29);
                // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:114:29: ^( ARGS ( expr )* )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(114,31);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGS, "ARGS"), root_1);

                dbg.location(114,36);
                // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:114:36: ( expr )*
                while ( stream_expr.hasNext() ) {
                    dbg.location(114,36);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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
<<<<<<< HEAD
        dbg.location(116, 2);
=======
        dbg.location(115, 2);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b

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
    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:119:1: exprplus : exprmult ( ( '+' | '-' ) exprmult )* ;
=======
    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:118:1: exprplus : exprmult ( ( '+' | '-' ) exprmult )* ;
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
    public final ExprParser.exprplus_return exprplus() throws RecognitionException {
        ExprParser.exprplus_return retval = new ExprParser.exprplus_return();
        retval.start = input.LT(1);

        Object root_0 = null;

<<<<<<< HEAD
        Token char_literal103=null;
        Token char_literal104=null;
        ExprParser.exprmult_return exprmult102 = null;

        ExprParser.exprmult_return exprmult105 = null;


        Object char_literal103_tree=null;
        Object char_literal104_tree=null;
=======
        Token char_literal102=null;
        Token char_literal103=null;
        ExprParser.exprmult_return exprmult101 = null;

        ExprParser.exprmult_return exprmult104 = null;


        Object char_literal102_tree=null;
        Object char_literal103_tree=null;
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b

        try { dbg.enterRule(getGrammarFileName(), "exprplus");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
<<<<<<< HEAD
        dbg.location(119, 1);

        try {
            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:119:9: ( exprmult ( ( '+' | '-' ) exprmult )* )
            dbg.enterAlt(1);

            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:120:2: exprmult ( ( '+' | '-' ) exprmult )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(120,2);
            pushFollow(FOLLOW_exprmult_in_exprplus827);
            exprmult102=exprmult();

            state._fsp--;

            adaptor.addChild(root_0, exprmult102.getTree());
            dbg.location(120,12);
            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:120:12: ( ( '+' | '-' ) exprmult )*
=======
        dbg.location(118, 1);

        try {
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:118:9: ( exprmult ( ( '+' | '-' ) exprmult )* )
            dbg.enterAlt(1);

            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:119:2: exprmult ( ( '+' | '-' ) exprmult )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(119,2);
            pushFollow(FOLLOW_exprmult_in_exprplus840);
            exprmult101=exprmult();

            state._fsp--;

            adaptor.addChild(root_0, exprmult101.getTree());
            dbg.location(119,11);
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:119:11: ( ( '+' | '-' ) exprmult )*
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
            try { dbg.enterSubRule(25);

            loop25:
            do {
                int alt25=2;
                try { dbg.enterDecision(25);

                int LA25_0 = input.LA(1);

<<<<<<< HEAD
                if ( ((LA25_0>=61 && LA25_0<=62)) ) {
=======
                if ( ((LA25_0>=62 && LA25_0<=63)) ) {
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                    alt25=1;
                }


                } finally {dbg.exitDecision(25);}

                switch (alt25) {
            	case 1 :
            	    dbg.enterAlt(1);

<<<<<<< HEAD
            	    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:120:14: ( '+' | '-' ) exprmult
            	    {
            	    dbg.location(120,14);
            	    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:120:14: ( '+' | '-' )
=======
            	    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:119:13: ( '+' | '-' ) exprmult
            	    {
            	    dbg.location(119,13);
            	    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:119:13: ( '+' | '-' )
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
            	    int alt24=2;
            	    try { dbg.enterSubRule(24);
            	    try { dbg.enterDecision(24);

            	    int LA24_0 = input.LA(1);

<<<<<<< HEAD
            	    if ( (LA24_0==61) ) {
            	        alt24=1;
            	    }
            	    else if ( (LA24_0==62) ) {
=======
            	    if ( (LA24_0==62) ) {
            	        alt24=1;
            	    }
            	    else if ( (LA24_0==63) ) {
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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
            	            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:120:15: '+'
            	            {
            	            dbg.location(120,18);
            	            char_literal103=(Token)match(input,61,FOLLOW_61_in_exprplus833); 
            	            char_literal103_tree = (Object)adaptor.create(char_literal103);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal103_tree, root_0);
=======
            	            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:119:14: '+'
            	            {
            	            dbg.location(119,17);
            	            char_literal102=(Token)match(input,62,FOLLOW_62_in_exprplus845); 
            	            char_literal102_tree = (Object)adaptor.create(char_literal102);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal102_tree, root_0);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b


            	            }
            	            break;
            	        case 2 :
            	            dbg.enterAlt(2);

<<<<<<< HEAD
            	            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:120:20: '-'
            	            {
            	            dbg.location(120,23);
            	            char_literal104=(Token)match(input,62,FOLLOW_62_in_exprplus836); 
            	            char_literal104_tree = (Object)adaptor.create(char_literal104);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal104_tree, root_0);
=======
            	            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:119:19: '-'
            	            {
            	            dbg.location(119,22);
            	            char_literal103=(Token)match(input,63,FOLLOW_63_in_exprplus848); 
            	            char_literal103_tree = (Object)adaptor.create(char_literal103);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal103_tree, root_0);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b


            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(24);}

<<<<<<< HEAD
            	    dbg.location(120,26);
            	    pushFollow(FOLLOW_exprmult_in_exprplus840);
            	    exprmult105=exprmult();

            	    state._fsp--;

            	    adaptor.addChild(root_0, exprmult105.getTree());
=======
            	    dbg.location(119,25);
            	    pushFollow(FOLLOW_exprmult_in_exprplus852);
            	    exprmult104=exprmult();

            	    state._fsp--;

            	    adaptor.addChild(root_0, exprmult104.getTree());
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b

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
<<<<<<< HEAD
        dbg.location(121, 2);
=======
        dbg.location(120, 2);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b

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
    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:124:1: exprmult : oper ( '*' oper )? ;
=======
    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:123:1: exprmult : oper ( '*' oper )? ;
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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
        Token char_literal106=null;
        ExprParser.oper_return oper105 = null;

        ExprParser.oper_return oper107 = null;


        Object char_literal106_tree=null;
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b

        try { dbg.enterRule(getGrammarFileName(), "exprmult");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
<<<<<<< HEAD
        dbg.location(124, 1);

        try {
            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:124:9: ( oper ( '*' oper )? )
            dbg.enterAlt(1);

            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:125:3: oper ( '*' oper )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(125,3);
            pushFollow(FOLLOW_oper_in_exprmult855);
            oper106=oper();

            state._fsp--;

            adaptor.addChild(root_0, oper106.getTree());
            dbg.location(125,7);
            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:125:7: ( '*' oper )?
=======
        dbg.location(123, 1);

        try {
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:123:9: ( oper ( '*' oper )? )
            dbg.enterAlt(1);

            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:124:3: oper ( '*' oper )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(124,3);
            pushFollow(FOLLOW_oper_in_exprmult866);
            oper105=oper();

            state._fsp--;

            adaptor.addChild(root_0, oper105.getTree());
            dbg.location(124,7);
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:124:7: ( '*' oper )?
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
            int alt26=2;
            try { dbg.enterSubRule(26);
            try { dbg.enterDecision(26);

            int LA26_0 = input.LA(1);

<<<<<<< HEAD
            if ( (LA26_0==63) ) {
=======
            if ( (LA26_0==64) ) {
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                alt26=1;
            }
            } finally {dbg.exitDecision(26);}

            switch (alt26) {
                case 1 :
                    dbg.enterAlt(1);

<<<<<<< HEAD
                    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:125:9: '*' oper
                    {
                    dbg.location(125,12);
                    char_literal107=(Token)match(input,63,FOLLOW_63_in_exprmult858); 
                    char_literal107_tree = (Object)adaptor.create(char_literal107);
                    root_0 = (Object)adaptor.becomeRoot(char_literal107_tree, root_0);

                    dbg.location(125,14);
                    pushFollow(FOLLOW_oper_in_exprmult861);
                    oper108=oper();

                    state._fsp--;

                    adaptor.addChild(root_0, oper108.getTree());
=======
                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:124:9: '*' oper
                    {
                    dbg.location(124,12);
                    char_literal106=(Token)match(input,64,FOLLOW_64_in_exprmult869); 
                    char_literal106_tree = (Object)adaptor.create(char_literal106);
                    root_0 = (Object)adaptor.becomeRoot(char_literal106_tree, root_0);

                    dbg.location(124,14);
                    pushFollow(FOLLOW_oper_in_exprmult872);
                    oper107=oper();

                    state._fsp--;

                    adaptor.addChild(root_0, oper107.getTree());
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b

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
<<<<<<< HEAD
        dbg.location(126, 2);
=======
        dbg.location(125, 2);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b

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
    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:128:1: oper : moinsunaire ( OPERCONDITION moinsunaire )* ;
=======
    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:127:1: oper : moinsunaire ( OPERCONDITION moinsunaire )* ;
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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
        Token OPERCONDITION109=null;
        ExprParser.moinsunaire_return moinsunaire108 = null;

        ExprParser.moinsunaire_return moinsunaire110 = null;


        Object OPERCONDITION109_tree=null;
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b

        try { dbg.enterRule(getGrammarFileName(), "oper");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
<<<<<<< HEAD
        dbg.location(128, 1);

        try {
            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:128:5: ( moinsunaire ( OPERCONDITION moinsunaire )* )
            dbg.enterAlt(1);

            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:129:2: moinsunaire ( OPERCONDITION moinsunaire )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(129,2);
            pushFollow(FOLLOW_moinsunaire_in_oper874);
            moinsunaire109=moinsunaire();

            state._fsp--;

            adaptor.addChild(root_0, moinsunaire109.getTree());
            dbg.location(129,14);
            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:129:14: ( OPERCONDITION moinsunaire )*
=======
        dbg.location(127, 1);

        try {
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:127:5: ( moinsunaire ( OPERCONDITION moinsunaire )* )
            dbg.enterAlt(1);

            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:128:2: moinsunaire ( OPERCONDITION moinsunaire )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(128,2);
            pushFollow(FOLLOW_moinsunaire_in_oper885);
            moinsunaire108=moinsunaire();

            state._fsp--;

            adaptor.addChild(root_0, moinsunaire108.getTree());
            dbg.location(128,14);
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:128:14: ( OPERCONDITION moinsunaire )*
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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

<<<<<<< HEAD
            	    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:129:15: OPERCONDITION moinsunaire
            	    {
            	    dbg.location(129,28);
            	    OPERCONDITION110=(Token)match(input,OPERCONDITION,FOLLOW_OPERCONDITION_in_oper877); 
            	    OPERCONDITION110_tree = (Object)adaptor.create(OPERCONDITION110);
            	    root_0 = (Object)adaptor.becomeRoot(OPERCONDITION110_tree, root_0);

            	    dbg.location(129,30);
            	    pushFollow(FOLLOW_moinsunaire_in_oper880);
            	    moinsunaire111=moinsunaire();

            	    state._fsp--;

            	    adaptor.addChild(root_0, moinsunaire111.getTree());
=======
            	    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:128:15: OPERCONDITION moinsunaire
            	    {
            	    dbg.location(128,28);
            	    OPERCONDITION109=(Token)match(input,OPERCONDITION,FOLLOW_OPERCONDITION_in_oper888); 
            	    OPERCONDITION109_tree = (Object)adaptor.create(OPERCONDITION109);
            	    root_0 = (Object)adaptor.becomeRoot(OPERCONDITION109_tree, root_0);

            	    dbg.location(128,30);
            	    pushFollow(FOLLOW_moinsunaire_in_oper891);
            	    moinsunaire110=moinsunaire();

            	    state._fsp--;

            	    adaptor.addChild(root_0, moinsunaire110.getTree());
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b

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
<<<<<<< HEAD
        dbg.location(130, 2);
=======
        dbg.location(129, 2);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b

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
    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:132:1: moinsunaire : ( '-' atom -> ^( OPPOSE atom ) | atom );
=======
    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:131:1: moinsunaire : ( '-' atom -> ^( OPPOSE atom ) | atom );
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
    public final ExprParser.moinsunaire_return moinsunaire() throws RecognitionException {
        ExprParser.moinsunaire_return retval = new ExprParser.moinsunaire_return();
        retval.start = input.LT(1);

        Object root_0 = null;

<<<<<<< HEAD
        Token char_literal112=null;
        ExprParser.atom_return atom113 = null;

        ExprParser.atom_return atom114 = null;


        Object char_literal112_tree=null;
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
=======
        Token char_literal111=null;
        ExprParser.atom_return atom112 = null;

        ExprParser.atom_return atom113 = null;


        Object char_literal111_tree=null;
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        try { dbg.enterRule(getGrammarFileName(), "moinsunaire");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
<<<<<<< HEAD
        dbg.location(132, 1);

        try {
            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:132:12: ( '-' atom -> ^( OPPOSE atom ) | atom )
=======
        dbg.location(131, 1);

        try {
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:131:12: ( '-' atom -> ^( OPPOSE atom ) | atom )
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
            int alt28=2;
            try { dbg.enterDecision(28);

            int LA28_0 = input.LA(1);

<<<<<<< HEAD
            if ( (LA28_0==62) ) {
                alt28=1;
            }
            else if ( (LA28_0==ID_OTHERS||(LA28_0>=STRING && LA28_0<=INT)||LA28_0==32) ) {
=======
            if ( (LA28_0==63) ) {
                alt28=1;
            }
            else if ( (LA28_0==ID_OTHERS||(LA28_0>=STRING && LA28_0<=INT)||LA28_0==33) ) {
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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
                    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:133:2: '-' atom
                    {
                    dbg.location(133,2);
                    char_literal112=(Token)match(input,62,FOLLOW_62_in_moinsunaire893);  
                    stream_62.add(char_literal112);

                    dbg.location(133,6);
                    pushFollow(FOLLOW_atom_in_moinsunaire895);
                    atom113=atom();

                    state._fsp--;

                    stream_atom.add(atom113.getTree());
=======
                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:132:2: '-' atom
                    {
                    dbg.location(132,2);
                    char_literal111=(Token)match(input,63,FOLLOW_63_in_moinsunaire904);  
                    stream_63.add(char_literal111);

                    dbg.location(132,6);
                    pushFollow(FOLLOW_atom_in_moinsunaire906);
                    atom112=atom();

                    state._fsp--;

                    stream_atom.add(atom112.getTree());
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b


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
<<<<<<< HEAD
                    // 133:11: -> ^( OPPOSE atom )
                    {
                        dbg.location(133,14);
                        // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:133:14: ^( OPPOSE atom )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(133,16);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPPOSE, "OPPOSE"), root_1);

                        dbg.location(133,23);
=======
                    // 132:11: -> ^( OPPOSE atom )
                    {
                        dbg.location(132,14);
                        // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:132:14: ^( OPPOSE atom )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(132,16);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPPOSE, "OPPOSE"), root_1);

                        dbg.location(132,23);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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
                    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:134:4: atom
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(134,4);
                    pushFollow(FOLLOW_atom_in_moinsunaire908);
                    atom114=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom114.getTree());
=======
                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:133:4: atom
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(133,4);
                    pushFollow(FOLLOW_atom_in_moinsunaire919);
                    atom113=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom113.getTree());
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b

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
        dbg.location(135, 2);
=======
        dbg.location(134, 2);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b

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
    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:136:1: atom : ( ID_OTHERS | STRING | INT | '(' expr ')' );
=======
    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:135:1: atom : ( ID_OTHERS e -> ^( ID_OTHERS ( e )? ) | STRING | INT | '(' expr ')' );
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
    public final ExprParser.atom_return atom() throws RecognitionException {
        ExprParser.atom_return retval = new ExprParser.atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

<<<<<<< HEAD
        Token ID_OTHERS115=null;
=======
        Token ID_OTHERS114=null;
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
        Token STRING116=null;
        Token INT117=null;
        Token char_literal118=null;
        Token char_literal120=null;
<<<<<<< HEAD
        ExprParser.expr_return expr119 = null;


        Object ID_OTHERS115_tree=null;
=======
        ExprParser.e_return e115 = null;

        ExprParser.expr_return expr119 = null;


        Object ID_OTHERS114_tree=null;
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
        Object STRING116_tree=null;
        Object INT117_tree=null;
        Object char_literal118_tree=null;
        Object char_literal120_tree=null;
<<<<<<< HEAD

        try { dbg.enterRule(getGrammarFileName(), "atom");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(136, 1);

        try {
            // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:136:5: ( ID_OTHERS | STRING | INT | '(' expr ')' )
=======
        RewriteRuleTokenStream stream_ID_OTHERS=new RewriteRuleTokenStream(adaptor,"token ID_OTHERS");
        RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e");
        try { dbg.enterRule(getGrammarFileName(), "atom");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(135, 1);

        try {
            // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:135:5: ( ID_OTHERS e -> ^( ID_OTHERS ( e )? ) | STRING | INT | '(' expr ')' )
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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
            case INT:
                {
                alt29=3;
                }
                break;
<<<<<<< HEAD
            case 32:
=======
            case 33:
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
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
                    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:137:3: ID_OTHERS
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(137,3);
                    ID_OTHERS115=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_atom919); 
                    ID_OTHERS115_tree = (Object)adaptor.create(ID_OTHERS115);
                    adaptor.addChild(root_0, ID_OTHERS115_tree);


                    }
=======
                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:136:3: ID_OTHERS e
                    {
                    dbg.location(136,3);
                    ID_OTHERS114=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_atom930);  
                    stream_ID_OTHERS.add(ID_OTHERS114);

                    dbg.location(136,13);
                    pushFollow(FOLLOW_e_in_atom932);
                    e115=e();

                    state._fsp--;

                    stream_e.add(e115.getTree());


                    // AST REWRITE
                    // elements: ID_OTHERS, e
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 136:16: -> ^( ID_OTHERS ( e )? )
                    {
                        dbg.location(136,19);
                        // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:136:19: ^( ID_OTHERS ( e )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(136,21);
                        root_1 = (Object)adaptor.becomeRoot(stream_ID_OTHERS.nextNode(), root_1);

                        dbg.location(136,31);
                        // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:136:31: ( e )?
                        if ( stream_e.hasNext() ) {
                            dbg.location(136,31);
                            adaptor.addChild(root_1, stream_e.nextTree());

                        }
                        stream_e.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                    break;
                case 2 :
                    dbg.enterAlt(2);

<<<<<<< HEAD
                    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:138:4: STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(138,4);
                    STRING116=(Token)match(input,STRING,FOLLOW_STRING_in_atom924); 
=======
                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:137:4: STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(137,4);
                    STRING116=(Token)match(input,STRING,FOLLOW_STRING_in_atom947); 
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                    STRING116_tree = (Object)adaptor.create(STRING116);
                    adaptor.addChild(root_0, STRING116_tree);


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

<<<<<<< HEAD
                    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:139:5: INT
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(139,5);
                    INT117=(Token)match(input,INT,FOLLOW_INT_in_atom930); 
=======
                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:138:5: INT
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(138,5);
                    INT117=(Token)match(input,INT,FOLLOW_INT_in_atom953); 
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                    INT117_tree = (Object)adaptor.create(INT117);
                    adaptor.addChild(root_0, INT117_tree);


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

<<<<<<< HEAD
                    // /home/clement/workspace/Compil_MACA/Fichiers/Expr.g:140:4: '(' expr ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(140,4);
                    char_literal118=(Token)match(input,32,FOLLOW_32_in_atom936); 
                    char_literal118_tree = (Object)adaptor.create(char_literal118);
                    adaptor.addChild(root_0, char_literal118_tree);

                    dbg.location(140,7);
                    pushFollow(FOLLOW_expr_in_atom937);
=======
                    // /home/adam/workspace/Compil_MACA/Fichiers/Expr.g:139:4: '(' expr ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(139,4);
                    char_literal118=(Token)match(input,33,FOLLOW_33_in_atom959); 
                    char_literal118_tree = (Object)adaptor.create(char_literal118);
                    adaptor.addChild(root_0, char_literal118_tree);

                    dbg.location(139,7);
                    pushFollow(FOLLOW_expr_in_atom960);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                    expr119=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr119.getTree());
<<<<<<< HEAD
                    dbg.location(140,11);
                    char_literal120=(Token)match(input,33,FOLLOW_33_in_atom938); 
=======
                    dbg.location(139,11);
                    char_literal120=(Token)match(input,34,FOLLOW_34_in_atom961); 
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b
                    char_literal120_tree = (Object)adaptor.create(char_literal120);
                    adaptor.addChild(root_0, char_literal120_tree);


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
        dbg.location(141, 2);
=======
        dbg.location(140, 2);
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b

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


 

<<<<<<< HEAD
    public static final BitSet FOLLOW_class_decl_in_prog88 = new BitSet(new long[]{0x01C5110420400000L});
    public static final BitSet FOLLOW_var_decl_in_prog91 = new BitSet(new long[]{0x01C5110400400000L});
    public static final BitSet FOLLOW_instr_in_prog94 = new BitSet(new long[]{0x01C5110400400002L});
    public static final BitSet FOLLOW_29_in_class_decl123 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ID_CLASS_in_class_decl127 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_30_in_class_decl130 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ID_CLASS_in_class_decl134 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_class_decl138 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_class_decl140 = new BitSet(new long[]{0x0000008600000000L});
    public static final BitSet FOLLOW_class_item_decl_in_class_decl142 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_class_decl144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_decl_in_class_item_decl174 = new BitSet(new long[]{0x0000008400000002L});
    public static final BitSet FOLLOW_method_decl_in_class_item_decl177 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_34_in_var_decl201 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ID_OTHERS_in_var_decl203 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_var_decl205 = new BitSet(new long[]{0x0000006000200000L});
    public static final BitSet FOLLOW_type_in_var_decl207 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_var_decl209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_type0 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_exprplus_in_expr711 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_e_in_expr713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_expr718 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_e_in_expr720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_expr725 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_e_in_expr727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_expr734 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ID_CLASS_in_expr736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_e756 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ID_OTHERS_in_e758 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_e760 = new BitSet(new long[]{0x4E00000303400000L});
    public static final BitSet FOLLOW_f_in_e762 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_e765 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_e_in_e767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_f798 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_f801 = new BitSet(new long[]{0x4E00000103400000L});
    public static final BitSet FOLLOW_expr_in_f803 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_exprmult_in_exprplus827 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_61_in_exprplus833 = new BitSet(new long[]{0x4000000103400000L});
    public static final BitSet FOLLOW_62_in_exprplus836 = new BitSet(new long[]{0x4000000103400000L});
    public static final BitSet FOLLOW_exprmult_in_exprplus840 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_oper_in_exprmult855 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_exprmult858 = new BitSet(new long[]{0x4000000103400000L});
    public static final BitSet FOLLOW_oper_in_exprmult861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moinsunaire_in_oper874 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_OPERCONDITION_in_oper877 = new BitSet(new long[]{0x4000000103400000L});
    public static final BitSet FOLLOW_moinsunaire_in_oper880 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_62_in_moinsunaire893 = new BitSet(new long[]{0x4000000103400000L});
    public static final BitSet FOLLOW_atom_in_moinsunaire895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_moinsunaire908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_OTHERS_in_atom919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_atom924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_atom936 = new BitSet(new long[]{0x4E00000103400000L});
    public static final BitSet FOLLOW_expr_in_atom937 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_atom938 = new BitSet(new long[]{0x0000000000000002L});
=======
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
    public static final BitSet FOLLOW_exprplus_in_expr712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_expr717 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_e_in_expr719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_expr732 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_e_in_expr734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_expr747 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ID_CLASS_in_expr749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_e769 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ID_OTHERS_in_e771 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_e773 = new BitSet(new long[]{0x9C00000606800000L});
    public static final BitSet FOLLOW_f_in_e775 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_e778 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_e_in_e780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_f811 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_f814 = new BitSet(new long[]{0x9C00000206800000L});
    public static final BitSet FOLLOW_expr_in_f816 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_exprmult_in_exprplus840 = new BitSet(new long[]{0xC000000000000002L});
    public static final BitSet FOLLOW_62_in_exprplus845 = new BitSet(new long[]{0x8000000206800000L});
    public static final BitSet FOLLOW_63_in_exprplus848 = new BitSet(new long[]{0x8000000206800000L});
    public static final BitSet FOLLOW_exprmult_in_exprplus852 = new BitSet(new long[]{0xC000000000000002L});
    public static final BitSet FOLLOW_oper_in_exprmult866 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_exprmult869 = new BitSet(new long[]{0x8000000206800000L});
    public static final BitSet FOLLOW_oper_in_exprmult872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moinsunaire_in_oper885 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_OPERCONDITION_in_oper888 = new BitSet(new long[]{0x8000000206800000L});
    public static final BitSet FOLLOW_moinsunaire_in_oper891 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_63_in_moinsunaire904 = new BitSet(new long[]{0x8000000206800000L});
    public static final BitSet FOLLOW_atom_in_moinsunaire906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_moinsunaire919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_OTHERS_in_atom930 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_e_in_atom932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_atom947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_atom959 = new BitSet(new long[]{0x9C00000206800000L});
    public static final BitSet FOLLOW_expr_in_atom960 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_atom961 = new BitSet(new long[]{0x0000000000000002L});
>>>>>>> d473f6e3e42d404edc44d145c7baadfa2f0fe16b

}