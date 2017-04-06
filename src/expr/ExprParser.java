package expr;

<<<<<<< HEAD
// $ANTLR 3.3 Nov 30, 2010 12:50:56 Expr.g 2017-04-06 16:56:19
=======
// $ANTLR 3.3 Nov 30, 2010 12:50:56 Expr.g 2017-04-06 15:21:11
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class ExprParser extends Parser {
    public static final String[] tokenNames = new String[] {
<<<<<<< HEAD
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ROOT", "DEC_CLASS", "DEC_VAR", "AFFECT", "RETURN", "FOR", "IF", "BLOC", "BODY", "METHOD", "ARGS", "PARAMS", "OPPOSE", "APPELMETHODE", "PARAM", "NEW", "BODY_CLASS", "ID_CLASS", "ID_OTHERS", "OPERCONDITION", "INT", "STRING", "COMMENTS", "NEWLINE", "WS", "'class'", "'inherit'", "'='", "'('", "')'", "'var'", "':'", "';'", "'int'", "'string'", "'method'", "'{'", "'}'", "','", "':='", "'if'", "'then'", "'else'", "'fi'", "'for'", "'in'", "'do'", "'end'", "'..'", "'nil'", "'write'", "'read'", "'return'", "'this'", "'super'", "'new'", "'.'", "'+'", "'-'", "'*'"
=======
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ROOT", "DEC_CLASS", "DEC_VAR", "AFFECT", "RETURN", "FOR", "IF", "BLOC", "BODY", "METHOD", "ARGS", "PARAMS", "OPPOSE", "APPELMETHODE", "PARAM", "NEW", "BODY_CLASS", "ID_CLASS", "ID_OTHERS", "OPERCONDITION", "STRING", "INT", "COMMENTS", "NEWLINE", "WS", "'class'", "'inherit'", "'='", "'('", "')'", "'var'", "':'", "';'", "'int'", "'string'", "'method'", "'{'", "'}'", "','", "':='", "'if'", "'then'", "'else'", "'fi'", "'for'", "'in'", "'do'", "'end'", "'..'", "'nil'", "'write'", "'read'", "'return'", "'this'", "'super'", "'new'", "'.'", "'+'", "'-'", "'*'"
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
    };
    public static final int EOF=-1;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int ROOT=4;
    public static final int DEC_CLASS=5;
    public static final int DEC_VAR=6;
    public static final int AFFECT=7;
    public static final int RETURN=8;
    public static final int FOR=9;
    public static final int IF=10;
    public static final int BLOC=11;
    public static final int BODY=12;
    public static final int METHOD=13;
    public static final int ARGS=14;
    public static final int PARAMS=15;
    public static final int OPPOSE=16;
    public static final int APPELMETHODE=17;
    public static final int PARAM=18;
    public static final int NEW=19;
    public static final int BODY_CLASS=20;
    public static final int ID_CLASS=21;
    public static final int ID_OTHERS=22;
    public static final int OPERCONDITION=23;
<<<<<<< HEAD
    public static final int INT=24;
    public static final int STRING=25;
=======
    public static final int STRING=24;
    public static final int INT=25;
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
    public static final int COMMENTS=26;
    public static final int NEWLINE=27;
    public static final int WS=28;

    // delegates
    // delegators


        public ExprParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public ExprParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return ExprParser.tokenNames; }
    public String getGrammarFileName() { return "Expr.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prog"
    // Expr.g:28:1: prog : ( class_decl )* ( var_decl )* ( instr )+ -> ^( ROOT ( class_decl )* ( var_decl )* ( instr )+ ) ;
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
        try {
            // Expr.g:28:6: ( ( class_decl )* ( var_decl )* ( instr )+ -> ^( ROOT ( class_decl )* ( var_decl )* ( instr )+ ) )
            // Expr.g:29:2: ( class_decl )* ( var_decl )* ( instr )+
            {
            // Expr.g:29:2: ( class_decl )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==29) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Expr.g:29:2: class_decl
            	    {
            	    pushFollow(FOLLOW_class_decl_in_prog88);
            	    class_decl1=class_decl();

            	    state._fsp--;

            	    stream_class_decl.add(class_decl1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // Expr.g:29:14: ( var_decl )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==34) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Expr.g:29:14: var_decl
            	    {
            	    pushFollow(FOLLOW_var_decl_in_prog91);
            	    var_decl2=var_decl();

            	    state._fsp--;

            	    stream_var_decl.add(var_decl2.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // Expr.g:29:24: ( instr )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==ID_OTHERS||LA3_0==40||LA3_0==44||LA3_0==48||LA3_0==50||(LA3_0>=54 && LA3_0<=56)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Expr.g:29:24: instr
            	    {
            	    pushFollow(FOLLOW_instr_in_prog94);
            	    instr3=instr();

            	    state._fsp--;

            	    stream_instr.add(instr3.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);



            // AST REWRITE
            // elements: instr, var_decl, class_decl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 29:31: -> ^( ROOT ( class_decl )* ( var_decl )* ( instr )+ )
            {
                // Expr.g:29:34: ^( ROOT ( class_decl )* ( var_decl )* ( instr )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ROOT, "ROOT"), root_1);

                // Expr.g:29:41: ( class_decl )*
                while ( stream_class_decl.hasNext() ) {
                    adaptor.addChild(root_1, stream_class_decl.nextTree());

                }
                stream_class_decl.reset();
                // Expr.g:29:53: ( var_decl )*
                while ( stream_var_decl.hasNext() ) {
                    adaptor.addChild(root_1, stream_var_decl.nextTree());

                }
                stream_var_decl.reset();
                if ( !(stream_instr.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_instr.hasNext() ) {
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
        return retval;
    }
    // $ANTLR end "prog"

    public static class class_decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "class_decl"
    // Expr.g:33:1: class_decl : 'class' a= ID_CLASS ( 'inherit' b= ID_CLASS )? '=' '(' class_item_decl ')' -> ^( DEC_CLASS $a ( $b)? ( class_item_decl )? ) ;
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
        try {
            // Expr.g:33:12: ( 'class' a= ID_CLASS ( 'inherit' b= ID_CLASS )? '=' '(' class_item_decl ')' -> ^( DEC_CLASS $a ( $b)? ( class_item_decl )? ) )
            // Expr.g:34:3: 'class' a= ID_CLASS ( 'inherit' b= ID_CLASS )? '=' '(' class_item_decl ')'
            {
            string_literal4=(Token)match(input,29,FOLLOW_29_in_class_decl123);  
            stream_29.add(string_literal4);

            a=(Token)match(input,ID_CLASS,FOLLOW_ID_CLASS_in_class_decl127);  
            stream_ID_CLASS.add(a);

            // Expr.g:34:22: ( 'inherit' b= ID_CLASS )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==30) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // Expr.g:34:23: 'inherit' b= ID_CLASS
                    {
                    string_literal5=(Token)match(input,30,FOLLOW_30_in_class_decl130);  
                    stream_30.add(string_literal5);

                    b=(Token)match(input,ID_CLASS,FOLLOW_ID_CLASS_in_class_decl134);  
                    stream_ID_CLASS.add(b);


                    }
                    break;

            }

            char_literal6=(Token)match(input,31,FOLLOW_31_in_class_decl138);  
            stream_31.add(char_literal6);

            char_literal7=(Token)match(input,32,FOLLOW_32_in_class_decl140);  
            stream_32.add(char_literal7);

            pushFollow(FOLLOW_class_item_decl_in_class_decl142);
            class_item_decl8=class_item_decl();

            state._fsp--;

            stream_class_item_decl.add(class_item_decl8.getTree());
            char_literal9=(Token)match(input,33,FOLLOW_33_in_class_decl144);  
            stream_33.add(char_literal9);



            // AST REWRITE
            // elements: b, class_item_decl, a
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
            // 34:74: -> ^( DEC_CLASS $a ( $b)? ( class_item_decl )? )
            {
                // Expr.g:34:76: ^( DEC_CLASS $a ( $b)? ( class_item_decl )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEC_CLASS, "DEC_CLASS"), root_1);

                adaptor.addChild(root_1, stream_a.nextNode());
                // Expr.g:34:91: ( $b)?
                if ( stream_b.hasNext() ) {
                    adaptor.addChild(root_1, stream_b.nextNode());

                }
                stream_b.reset();
                // Expr.g:34:97: ( class_item_decl )?
                if ( stream_class_item_decl.hasNext() ) {
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
        return retval;
    }
    // $ANTLR end "class_decl"

    public static class class_item_decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "class_item_decl"
    // Expr.g:37:1: class_item_decl : ( var_decl )* ( method_decl )* -> ^( BODY_CLASS ( var_decl )* ( method_decl )* ) ;
    public final ExprParser.class_item_decl_return class_item_decl() throws RecognitionException {
        ExprParser.class_item_decl_return retval = new ExprParser.class_item_decl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ExprParser.var_decl_return var_decl10 = null;

        ExprParser.method_decl_return method_decl11 = null;


        RewriteRuleSubtreeStream stream_method_decl=new RewriteRuleSubtreeStream(adaptor,"rule method_decl");
        RewriteRuleSubtreeStream stream_var_decl=new RewriteRuleSubtreeStream(adaptor,"rule var_decl");
        try {
            // Expr.g:37:17: ( ( var_decl )* ( method_decl )* -> ^( BODY_CLASS ( var_decl )* ( method_decl )* ) )
            // Expr.g:38:2: ( var_decl )* ( method_decl )*
            {
            // Expr.g:38:2: ( var_decl )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==34) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Expr.g:38:2: var_decl
            	    {
            	    pushFollow(FOLLOW_var_decl_in_class_item_decl174);
            	    var_decl10=var_decl();

            	    state._fsp--;

            	    stream_var_decl.add(var_decl10.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // Expr.g:38:12: ( method_decl )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==39) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Expr.g:38:12: method_decl
            	    {
            	    pushFollow(FOLLOW_method_decl_in_class_item_decl177);
            	    method_decl11=method_decl();

            	    state._fsp--;

            	    stream_method_decl.add(method_decl11.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);



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
            // 38:25: -> ^( BODY_CLASS ( var_decl )* ( method_decl )* )
            {
                // Expr.g:38:27: ^( BODY_CLASS ( var_decl )* ( method_decl )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY_CLASS, "BODY_CLASS"), root_1);

                // Expr.g:38:40: ( var_decl )*
                while ( stream_var_decl.hasNext() ) {
                    adaptor.addChild(root_1, stream_var_decl.nextTree());

                }
                stream_var_decl.reset();
                // Expr.g:38:50: ( method_decl )*
                while ( stream_method_decl.hasNext() ) {
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
        return retval;
    }
    // $ANTLR end "class_item_decl"

    public static class var_decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "var_decl"
    // Expr.g:41:1: var_decl : 'var' ID_OTHERS ':' type ';' -> ^( DEC_VAR ID_OTHERS type ) ;
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
        try {
            // Expr.g:41:10: ( 'var' ID_OTHERS ':' type ';' -> ^( DEC_VAR ID_OTHERS type ) )
            // Expr.g:42:2: 'var' ID_OTHERS ':' type ';'
            {
            string_literal12=(Token)match(input,34,FOLLOW_34_in_var_decl201);  
            stream_34.add(string_literal12);

            ID_OTHERS13=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_var_decl203);  
            stream_ID_OTHERS.add(ID_OTHERS13);

            char_literal14=(Token)match(input,35,FOLLOW_35_in_var_decl205);  
            stream_35.add(char_literal14);

            pushFollow(FOLLOW_type_in_var_decl207);
            type15=type();

            state._fsp--;

            stream_type.add(type15.getTree());
            char_literal16=(Token)match(input,36,FOLLOW_36_in_var_decl209);  
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
            // 42:31: -> ^( DEC_VAR ID_OTHERS type )
            {
                // Expr.g:42:33: ^( DEC_VAR ID_OTHERS type )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEC_VAR, "DEC_VAR"), root_1);

                adaptor.addChild(root_1, stream_ID_OTHERS.nextNode());
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
        return retval;
    }
    // $ANTLR end "var_decl"

    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // Expr.g:45:1: type : ( ID_CLASS | 'int' | 'string' );
    public final ExprParser.type_return type() throws RecognitionException {
        ExprParser.type_return retval = new ExprParser.type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set17=null;

        Object set17_tree=null;

        try {
            // Expr.g:45:6: ( ID_CLASS | 'int' | 'string' )
            // Expr.g:
            {
            root_0 = (Object)adaptor.nil();

            set17=(Token)input.LT(1);
            if ( input.LA(1)==ID_CLASS||(input.LA(1)>=37 && input.LA(1)<=38) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set17));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
        return retval;
    }
    // $ANTLR end "type"

    public static class method_decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "method_decl"
    // Expr.g:51:1: method_decl : 'method' ID_OTHERS '(' ( method_params )? ')' m -> ^( METHOD ID_OTHERS ( method_params )? m ) ;
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
        try {
            // Expr.g:51:13: ( 'method' ID_OTHERS '(' ( method_params )? ')' m -> ^( METHOD ID_OTHERS ( method_params )? m ) )
            // Expr.g:52:2: 'method' ID_OTHERS '(' ( method_params )? ')' m
            {
            string_literal18=(Token)match(input,39,FOLLOW_39_in_method_decl252);  
            stream_39.add(string_literal18);

            ID_OTHERS19=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_method_decl254);  
            stream_ID_OTHERS.add(ID_OTHERS19);

            char_literal20=(Token)match(input,32,FOLLOW_32_in_method_decl256);  
            stream_32.add(char_literal20);

            // Expr.g:52:26: ( method_params )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ID_OTHERS) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // Expr.g:52:26: method_params
                    {
                    pushFollow(FOLLOW_method_params_in_method_decl259);
                    method_params21=method_params();

                    state._fsp--;

                    stream_method_params.add(method_params21.getTree());

                    }
                    break;

            }

            char_literal22=(Token)match(input,33,FOLLOW_33_in_method_decl262);  
            stream_33.add(char_literal22);

            pushFollow(FOLLOW_m_in_method_decl264);
            m23=m();

            state._fsp--;

            stream_m.add(m23.getTree());


            // AST REWRITE
            // elements: ID_OTHERS, method_params, m
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
                // Expr.g:52:50: ^( METHOD ID_OTHERS ( method_params )? m )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHOD, "METHOD"), root_1);

                adaptor.addChild(root_1, stream_ID_OTHERS.nextNode());
                // Expr.g:52:71: ( method_params )?
                if ( stream_method_params.hasNext() ) {
                    adaptor.addChild(root_1, stream_method_params.nextTree());

                }
                stream_method_params.reset();
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
        return retval;
    }
    // $ANTLR end "method_decl"

    public static class m_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "m"
    // Expr.g:55:1: m : ( '{' ( var_decl )* ( instr )+ '}' -> ^( BODY ( var_decl )* ( instr )+ ) | ':' type '{' ( var_decl )* ( instr )+ '}' -> type ^( BODY ( var_decl )* ( instr )+ ) );
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
        try {
            // Expr.g:55:4: ( '{' ( var_decl )* ( instr )+ '}' -> ^( BODY ( var_decl )* ( instr )+ ) | ':' type '{' ( var_decl )* ( instr )+ '}' -> type ^( BODY ( var_decl )* ( instr )+ ) )
            int alt12=2;
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

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // Expr.g:56:2: '{' ( var_decl )* ( instr )+ '}'
                    {
                    char_literal24=(Token)match(input,40,FOLLOW_40_in_m293);  
                    stream_40.add(char_literal24);

                    // Expr.g:56:6: ( var_decl )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==34) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // Expr.g:56:6: var_decl
                    	    {
                    	    pushFollow(FOLLOW_var_decl_in_m295);
                    	    var_decl25=var_decl();

                    	    state._fsp--;

                    	    stream_var_decl.add(var_decl25.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    // Expr.g:56:16: ( instr )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==ID_OTHERS||LA9_0==40||LA9_0==44||LA9_0==48||LA9_0==50||(LA9_0>=54 && LA9_0<=56)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // Expr.g:56:16: instr
                    	    {
                    	    pushFollow(FOLLOW_instr_in_m298);
                    	    instr26=instr();

                    	    state._fsp--;

                    	    stream_instr.add(instr26.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);

                    char_literal27=(Token)match(input,41,FOLLOW_41_in_m301);  
                    stream_41.add(char_literal27);



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
                    // 56:27: -> ^( BODY ( var_decl )* ( instr )+ )
                    {
                        // Expr.g:56:29: ^( BODY ( var_decl )* ( instr )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_1);

                        // Expr.g:56:37: ( var_decl )*
                        while ( stream_var_decl.hasNext() ) {
                            adaptor.addChild(root_1, stream_var_decl.nextTree());

                        }
                        stream_var_decl.reset();
                        if ( !(stream_instr.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_instr.hasNext() ) {
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
                    // Expr.g:57:4: ':' type '{' ( var_decl )* ( instr )+ '}'
                    {
                    char_literal28=(Token)match(input,35,FOLLOW_35_in_m319);  
                    stream_35.add(char_literal28);

                    pushFollow(FOLLOW_type_in_m321);
                    type29=type();

                    state._fsp--;

                    stream_type.add(type29.getTree());
                    char_literal30=(Token)match(input,40,FOLLOW_40_in_m323);  
                    stream_40.add(char_literal30);

                    // Expr.g:57:17: ( var_decl )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==34) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // Expr.g:57:17: var_decl
                    	    {
                    	    pushFollow(FOLLOW_var_decl_in_m325);
                    	    var_decl31=var_decl();

                    	    state._fsp--;

                    	    stream_var_decl.add(var_decl31.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    // Expr.g:57:27: ( instr )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==ID_OTHERS||LA11_0==40||LA11_0==44||LA11_0==48||LA11_0==50||(LA11_0>=54 && LA11_0<=56)) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // Expr.g:57:27: instr
                    	    {
                    	    pushFollow(FOLLOW_instr_in_m328);
                    	    instr32=instr();

                    	    state._fsp--;

                    	    stream_instr.add(instr32.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);

                    char_literal33=(Token)match(input,41,FOLLOW_41_in_m331);  
                    stream_41.add(char_literal33);



                    // AST REWRITE
                    // elements: var_decl, type, instr
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
                        adaptor.addChild(root_0, stream_type.nextTree());
                        // Expr.g:57:46: ^( BODY ( var_decl )* ( instr )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_1);

                        // Expr.g:57:54: ( var_decl )*
                        while ( stream_var_decl.hasNext() ) {
                            adaptor.addChild(root_1, stream_var_decl.nextTree());

                        }
                        stream_var_decl.reset();
                        if ( !(stream_instr.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_instr.hasNext() ) {
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
        return retval;
    }
    // $ANTLR end "m"

    public static class method_params_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "method_params"
    // Expr.g:61:1: method_params : params -> ^( PARAMS params ) ;
    public final ExprParser.method_params_return method_params() throws RecognitionException {
        ExprParser.method_params_return retval = new ExprParser.method_params_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ExprParser.params_return params34 = null;


        RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
        try {
            // Expr.g:61:15: ( params -> ^( PARAMS params ) )
            // Expr.g:62:2: params
            {
            pushFollow(FOLLOW_params_in_method_params360);
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
                // Expr.g:62:12: ^( PARAMS params )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMS, "PARAMS"), root_1);

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
        return retval;
    }
    // $ANTLR end "method_params"

    public static class params_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "params"
    // Expr.g:65:1: params : ID_OTHERS ':' type ( ',' ID_OTHERS ':' type )* -> ( ^( PARAM ID_OTHERS type ) )* ;
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
        try {
            // Expr.g:65:8: ( ID_OTHERS ':' type ( ',' ID_OTHERS ':' type )* -> ( ^( PARAM ID_OTHERS type ) )* )
            // Expr.g:66:2: ID_OTHERS ':' type ( ',' ID_OTHERS ':' type )*
            {
            ID_OTHERS35=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_params380);  
            stream_ID_OTHERS.add(ID_OTHERS35);

            char_literal36=(Token)match(input,35,FOLLOW_35_in_params382);  
            stream_35.add(char_literal36);

            pushFollow(FOLLOW_type_in_params385);
            type37=type();

            state._fsp--;

            stream_type.add(type37.getTree());
            // Expr.g:66:22: ( ',' ID_OTHERS ':' type )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==42) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // Expr.g:66:23: ',' ID_OTHERS ':' type
            	    {
            	    char_literal38=(Token)match(input,42,FOLLOW_42_in_params388);  
            	    stream_42.add(char_literal38);

            	    ID_OTHERS39=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_params390);  
            	    stream_ID_OTHERS.add(ID_OTHERS39);

            	    char_literal40=(Token)match(input,35,FOLLOW_35_in_params392);  
            	    stream_35.add(char_literal40);

            	    pushFollow(FOLLOW_type_in_params394);
            	    type41=type();

            	    state._fsp--;

            	    stream_type.add(type41.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);



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
                // Expr.g:66:51: ( ^( PARAM ID_OTHERS type ) )*
<<<<<<< HEAD
                while ( stream_type.hasNext()||stream_ID_OTHERS.hasNext() ) {
=======
                while ( stream_ID_OTHERS.hasNext()||stream_type.hasNext() ) {
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
                    // Expr.g:66:51: ^( PARAM ID_OTHERS type )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAM, "PARAM"), root_1);

                    adaptor.addChild(root_1, stream_ID_OTHERS.nextNode());
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
        return retval;
    }
    // $ANTLR end "params"

    public static class instr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instr"
    // Expr.g:70:1: instr : ( ID_OTHERS ':=' i -> ^( AFFECT ID_OTHERS i ) | 'if' expr 'then' instr ( 'else' instr )? 'fi' -> ^( IF expr instr ( instr )? ) | 'for' ID_OTHERS 'in' boundaries 'do' ( instr )+ 'end' -> ^( FOR ID_OTHERS boundaries ( instr )+ ) | '{' ( var_decl )* ( instr )+ '}' -> ^( BLOC ( var_decl )* ( instr )+ ) | 'do' expr ';' -> ^( 'do' expr ) | print | read | retourne );
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
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_ID_OTHERS=new RewriteRuleTokenStream(adaptor,"token ID_OTHERS");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleSubtreeStream stream_instr=new RewriteRuleSubtreeStream(adaptor,"rule instr");
        RewriteRuleSubtreeStream stream_i=new RewriteRuleSubtreeStream(adaptor,"rule i");
        RewriteRuleSubtreeStream stream_boundaries=new RewriteRuleSubtreeStream(adaptor,"rule boundaries");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_var_decl=new RewriteRuleSubtreeStream(adaptor,"rule var_decl");
        try {
            // Expr.g:70:7: ( ID_OTHERS ':=' i -> ^( AFFECT ID_OTHERS i ) | 'if' expr 'then' instr ( 'else' instr )? 'fi' -> ^( IF expr instr ( instr )? ) | 'for' ID_OTHERS 'in' boundaries 'do' ( instr )+ 'end' -> ^( FOR ID_OTHERS boundaries ( instr )+ ) | '{' ( var_decl )* ( instr )+ '}' -> ^( BLOC ( var_decl )* ( instr )+ ) | 'do' expr ';' -> ^( 'do' expr ) | print | read | retourne )
            int alt18=8;
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

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // Expr.g:71:2: ID_OTHERS ':=' i
                    {
                    ID_OTHERS42=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_instr422);  
                    stream_ID_OTHERS.add(ID_OTHERS42);

                    string_literal43=(Token)match(input,43,FOLLOW_43_in_instr424);  
                    stream_43.add(string_literal43);

                    pushFollow(FOLLOW_i_in_instr426);
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
                    // 71:19: -> ^( AFFECT ID_OTHERS i )
                    {
                        // Expr.g:71:22: ^( AFFECT ID_OTHERS i )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AFFECT, "AFFECT"), root_1);

                        adaptor.addChild(root_1, stream_ID_OTHERS.nextNode());
                        adaptor.addChild(root_1, stream_i.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // Expr.g:72:3: 'if' expr 'then' instr ( 'else' instr )? 'fi'
                    {
                    string_literal45=(Token)match(input,44,FOLLOW_44_in_instr440);  
                    stream_44.add(string_literal45);

                    pushFollow(FOLLOW_expr_in_instr442);
                    expr46=expr();

                    state._fsp--;

                    stream_expr.add(expr46.getTree());
                    string_literal47=(Token)match(input,45,FOLLOW_45_in_instr444);  
                    stream_45.add(string_literal47);

                    pushFollow(FOLLOW_instr_in_instr446);
                    instr48=instr();

                    state._fsp--;

                    stream_instr.add(instr48.getTree());
                    // Expr.g:72:26: ( 'else' instr )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==46) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // Expr.g:72:27: 'else' instr
                            {
                            string_literal49=(Token)match(input,46,FOLLOW_46_in_instr449);  
                            stream_46.add(string_literal49);

                            pushFollow(FOLLOW_instr_in_instr451);
                            instr50=instr();

                            state._fsp--;

                            stream_instr.add(instr50.getTree());

                            }
                            break;

                    }

                    string_literal51=(Token)match(input,47,FOLLOW_47_in_instr455);  
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
                        // Expr.g:72:51: ^( IF expr instr ( instr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());
                        adaptor.addChild(root_1, stream_instr.nextTree());
                        // Expr.g:72:67: ( instr )?
                        if ( stream_instr.hasNext() ) {
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
                    // Expr.g:73:3: 'for' ID_OTHERS 'in' boundaries 'do' ( instr )+ 'end'
                    {
                    string_literal52=(Token)match(input,48,FOLLOW_48_in_instr473);  
                    stream_48.add(string_literal52);

                    ID_OTHERS53=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_instr475);  
                    stream_ID_OTHERS.add(ID_OTHERS53);

                    string_literal54=(Token)match(input,49,FOLLOW_49_in_instr477);  
                    stream_49.add(string_literal54);

                    pushFollow(FOLLOW_boundaries_in_instr479);
                    boundaries55=boundaries();

                    state._fsp--;

                    stream_boundaries.add(boundaries55.getTree());
                    string_literal56=(Token)match(input,50,FOLLOW_50_in_instr481);  
                    stream_50.add(string_literal56);

                    // Expr.g:73:40: ( instr )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==ID_OTHERS||LA15_0==40||LA15_0==44||LA15_0==48||LA15_0==50||(LA15_0>=54 && LA15_0<=56)) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // Expr.g:73:40: instr
                    	    {
                    	    pushFollow(FOLLOW_instr_in_instr483);
                    	    instr57=instr();

                    	    state._fsp--;

                    	    stream_instr.add(instr57.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);

                    string_literal58=(Token)match(input,51,FOLLOW_51_in_instr486);  
                    stream_51.add(string_literal58);



                    // AST REWRITE
                    // elements: ID_OTHERS, instr, boundaries
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
                        // Expr.g:73:56: ^( FOR ID_OTHERS boundaries ( instr )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR, "FOR"), root_1);

                        adaptor.addChild(root_1, stream_ID_OTHERS.nextNode());
                        adaptor.addChild(root_1, stream_boundaries.nextTree());
                        if ( !(stream_instr.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_instr.hasNext() ) {
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
                    // Expr.g:74:3: '{' ( var_decl )* ( instr )+ '}'
                    {
                    char_literal59=(Token)match(input,40,FOLLOW_40_in_instr503);  
                    stream_40.add(char_literal59);

                    // Expr.g:74:7: ( var_decl )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==34) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // Expr.g:74:7: var_decl
                    	    {
                    	    pushFollow(FOLLOW_var_decl_in_instr505);
                    	    var_decl60=var_decl();

                    	    state._fsp--;

                    	    stream_var_decl.add(var_decl60.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    // Expr.g:74:17: ( instr )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==ID_OTHERS||LA17_0==40||LA17_0==44||LA17_0==48||LA17_0==50||(LA17_0>=54 && LA17_0<=56)) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // Expr.g:74:17: instr
                    	    {
                    	    pushFollow(FOLLOW_instr_in_instr508);
                    	    instr61=instr();

                    	    state._fsp--;

                    	    stream_instr.add(instr61.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);

                    char_literal62=(Token)match(input,41,FOLLOW_41_in_instr511);  
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
                        // Expr.g:74:30: ^( BLOC ( var_decl )* ( instr )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOC, "BLOC"), root_1);

                        // Expr.g:74:38: ( var_decl )*
                        while ( stream_var_decl.hasNext() ) {
                            adaptor.addChild(root_1, stream_var_decl.nextTree());

                        }
                        stream_var_decl.reset();
                        if ( !(stream_instr.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_instr.hasNext() ) {
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
                    // Expr.g:75:3: 'do' expr ';'
                    {
                    string_literal63=(Token)match(input,50,FOLLOW_50_in_instr528);  
                    stream_50.add(string_literal63);

                    pushFollow(FOLLOW_expr_in_instr530);
                    expr64=expr();

                    state._fsp--;

                    stream_expr.add(expr64.getTree());
                    char_literal65=(Token)match(input,36,FOLLOW_36_in_instr532);  
                    stream_36.add(char_literal65);



                    // AST REWRITE
<<<<<<< HEAD
                    // elements: expr, 50
=======
                    // elements: 50, expr
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
                    // 75:18: -> ^( 'do' expr )
                    {
                        // Expr.g:75:21: ^( 'do' expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_50.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // Expr.g:76:3: print
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_print_in_instr545);
                    print66=print();

                    state._fsp--;

                    adaptor.addChild(root_0, print66.getTree());

                    }
                    break;
                case 7 :
                    // Expr.g:77:3: read
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_read_in_instr549);
                    read67=read();

                    state._fsp--;

                    adaptor.addChild(root_0, read67.getTree());

                    }
                    break;
                case 8 :
                    // Expr.g:78:3: retourne
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_retourne_in_instr553);
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
        return retval;
    }
    // $ANTLR end "instr"

    public static class boundaries_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "boundaries"
    // Expr.g:81:1: boundaries : a= expr '..' b= expr -> ^( '..' $a $b) ;
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
        try {
            // Expr.g:81:12: (a= expr '..' b= expr -> ^( '..' $a $b) )
            // Expr.g:82:3: a= expr '..' b= expr
            {
            pushFollow(FOLLOW_expr_in_boundaries572);
            a=expr();

            state._fsp--;

            stream_expr.add(a.getTree());
            string_literal69=(Token)match(input,52,FOLLOW_52_in_boundaries574);  
            stream_52.add(string_literal69);

            pushFollow(FOLLOW_expr_in_boundaries578);
            b=expr();

            state._fsp--;

            stream_expr.add(b.getTree());


            // AST REWRITE
<<<<<<< HEAD
            // elements: 52, a, b
=======
            // elements: a, b, 52
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
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
                // Expr.g:82:26: ^( '..' $a $b)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_52.nextNode(), root_1);

                adaptor.addChild(root_1, stream_a.nextTree());
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
        return retval;
    }
    // $ANTLR end "boundaries"

    public static class i_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "i"
    // Expr.g:85:1: i : ( expr ';' -> expr | 'nil' ';' -> 'nil' );
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
        try {
            // Expr.g:85:3: ( expr ';' -> expr | 'nil' ';' -> 'nil' )
            int alt19=2;
            int LA19_0 = input.LA(1);

<<<<<<< HEAD
            if ( (LA19_0==ID_OTHERS||(LA19_0>=INT && LA19_0<=STRING)||LA19_0==32||(LA19_0>=57 && LA19_0<=59)||LA19_0==62) ) {
=======
            if ( (LA19_0==ID_OTHERS||(LA19_0>=STRING && LA19_0<=INT)||LA19_0==32||(LA19_0>=57 && LA19_0<=59)||LA19_0==62) ) {
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
                alt19=1;
            }
            else if ( (LA19_0==53) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // Expr.g:86:2: expr ';'
                    {
                    pushFollow(FOLLOW_expr_in_i604);
                    expr70=expr();

                    state._fsp--;

                    stream_expr.add(expr70.getTree());
                    char_literal71=(Token)match(input,36,FOLLOW_36_in_i606);  
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
                    // 86:11: -> expr
                    {
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // Expr.g:87:4: 'nil' ';'
                    {
                    string_literal72=(Token)match(input,53,FOLLOW_53_in_i615);  
                    stream_53.add(string_literal72);

                    char_literal73=(Token)match(input,36,FOLLOW_36_in_i617);  
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
                    // 87:14: -> 'nil'
                    {
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
        return retval;
    }
    // $ANTLR end "i"

    public static class print_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "print"
    // Expr.g:90:1: print : 'write' expr ';' -> ^( 'write' expr ) ;
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
        try {
            // Expr.g:90:7: ( 'write' expr ';' -> ^( 'write' expr ) )
            // Expr.g:91:3: 'write' expr ';'
            {
            string_literal74=(Token)match(input,54,FOLLOW_54_in_print634);  
            stream_54.add(string_literal74);

            pushFollow(FOLLOW_expr_in_print636);
            expr75=expr();

            state._fsp--;

            stream_expr.add(expr75.getTree());
            char_literal76=(Token)match(input,36,FOLLOW_36_in_print638);  
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
            // 91:20: -> ^( 'write' expr )
            {
                // Expr.g:91:23: ^( 'write' expr )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_54.nextNode(), root_1);

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
        return retval;
    }
    // $ANTLR end "print"

    public static class read_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "read"
    // Expr.g:94:1: read : 'read' ID_OTHERS ';' -> ^( 'read' ID_OTHERS ) ;
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

        try {
            // Expr.g:94:6: ( 'read' ID_OTHERS ';' -> ^( 'read' ID_OTHERS ) )
            // Expr.g:95:2: 'read' ID_OTHERS ';'
            {
            string_literal77=(Token)match(input,55,FOLLOW_55_in_read660);  
            stream_55.add(string_literal77);

            ID_OTHERS78=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_read662);  
            stream_ID_OTHERS.add(ID_OTHERS78);

            char_literal79=(Token)match(input,36,FOLLOW_36_in_read664);  
            stream_36.add(char_literal79);



            // AST REWRITE
            // elements: 55, ID_OTHERS
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 95:23: -> ^( 'read' ID_OTHERS )
            {
                // Expr.g:95:26: ^( 'read' ID_OTHERS )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_55.nextNode(), root_1);

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
        return retval;
    }
    // $ANTLR end "read"

    public static class retourne_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "retourne"
    // Expr.g:98:1: retourne : 'return' '(' expr ')' ';' -> ^( RETURN expr ) ;
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
        try {
            // Expr.g:98:10: ( 'return' '(' expr ')' ';' -> ^( RETURN expr ) )
            // Expr.g:99:2: 'return' '(' expr ')' ';'
            {
            string_literal80=(Token)match(input,56,FOLLOW_56_in_retourne683);  
            stream_56.add(string_literal80);

            char_literal81=(Token)match(input,32,FOLLOW_32_in_retourne685);  
            stream_32.add(char_literal81);

            pushFollow(FOLLOW_expr_in_retourne687);
            expr82=expr();

            state._fsp--;

            stream_expr.add(expr82.getTree());
            char_literal83=(Token)match(input,33,FOLLOW_33_in_retourne689);  
            stream_33.add(char_literal83);

            char_literal84=(Token)match(input,36,FOLLOW_36_in_retourne690);  
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
            // 99:27: -> ^( RETURN expr )
            {
                // Expr.g:99:30: ^( RETURN expr )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RETURN, "RETURN"), root_1);

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
        return retval;
    }
    // $ANTLR end "retourne"

    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // Expr.g:102:1: expr : ( exprplus e | 'this' e | 'super' e | 'new' ID_CLASS e -> ^( NEW ID_CLASS ( e )? ) );
    public final ExprParser.expr_return expr() throws RecognitionException {
        ExprParser.expr_return retval = new ExprParser.expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal87=null;
        Token string_literal89=null;
        Token string_literal91=null;
        Token ID_CLASS92=null;
        ExprParser.exprplus_return exprplus85 = null;

        ExprParser.e_return e86 = null;

        ExprParser.e_return e88 = null;

        ExprParser.e_return e90 = null;

        ExprParser.e_return e93 = null;


        Object string_literal87_tree=null;
        Object string_literal89_tree=null;
        Object string_literal91_tree=null;
        Object ID_CLASS92_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_ID_CLASS=new RewriteRuleTokenStream(adaptor,"token ID_CLASS");
        RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e");
        try {
            // Expr.g:102:5: ( exprplus e | 'this' e | 'super' e | 'new' ID_CLASS e -> ^( NEW ID_CLASS ( e )? ) )
            int alt20=4;
            switch ( input.LA(1) ) {
            case ID_OTHERS:
            case STRING:
            case INT:
<<<<<<< HEAD
            case STRING:
=======
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
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
            case 59:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // Expr.g:103:3: exprplus e
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_exprplus_in_expr710);
                    exprplus85=exprplus();

                    state._fsp--;

                    adaptor.addChild(root_0, exprplus85.getTree());
                    pushFollow(FOLLOW_e_in_expr712);
                    e86=e();

                    state._fsp--;

                    adaptor.addChild(root_0, e86.getTree());

                    }
                    break;
                case 2 :
                    // Expr.g:104:4: 'this' e
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal87=(Token)match(input,57,FOLLOW_57_in_expr718); 
                    string_literal87_tree = (Object)adaptor.create(string_literal87);
                    adaptor.addChild(root_0, string_literal87_tree);

                    pushFollow(FOLLOW_e_in_expr720);
                    e88=e();

                    state._fsp--;

                    adaptor.addChild(root_0, e88.getTree());

                    }
                    break;
                case 3 :
                    // Expr.g:105:4: 'super' e
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal89=(Token)match(input,58,FOLLOW_58_in_expr725); 
                    string_literal89_tree = (Object)adaptor.create(string_literal89);
                    adaptor.addChild(root_0, string_literal89_tree);

                    pushFollow(FOLLOW_e_in_expr727);
                    e90=e();

                    state._fsp--;

                    adaptor.addChild(root_0, e90.getTree());

                    }
                    break;
                case 4 :
<<<<<<< HEAD
                    // Expr.g:106:4: 'new' ID_CLASS e
                    {
                    string_literal91=(Token)match(input,59,FOLLOW_59_in_expr732);  
                    stream_59.add(string_literal91);

                    ID_CLASS92=(Token)match(input,ID_CLASS,FOLLOW_ID_CLASS_in_expr734);  
                    stream_ID_CLASS.add(ID_CLASS92);

                    pushFollow(FOLLOW_e_in_expr736);
=======
                    // Expr.g:107:4: 'new' ID_CLASS e
                    {
                    string_literal91=(Token)match(input,59,FOLLOW_59_in_expr734);  
                    stream_59.add(string_literal91);

                    ID_CLASS92=(Token)match(input,ID_CLASS,FOLLOW_ID_CLASS_in_expr736);  
                    stream_ID_CLASS.add(ID_CLASS92);

                    pushFollow(FOLLOW_e_in_expr738);
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
                    e93=e();

                    state._fsp--;

                    stream_e.add(e93.getTree());


                    // AST REWRITE
                    // elements: ID_CLASS, e
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 107:21: -> ^( NEW ID_CLASS ( e )? )
                    {
                        // Expr.g:107:24: ^( NEW ID_CLASS ( e )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NEW, "NEW"), root_1);

                        adaptor.addChild(root_1, stream_ID_CLASS.nextNode());
                        // Expr.g:107:39: ( e )?
                        if ( stream_e.hasNext() ) {
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
        return retval;
    }
    // $ANTLR end "expr"

    public static class e_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "e"
<<<<<<< HEAD
    // Expr.g:108:1: e : ( '.' ID_OTHERS '(' ( f )? ')' e -> ^( APPELMETHODE ID_OTHERS ( f )? e ) | );
=======
    // Expr.g:109:1: e : ( '.' ID_OTHERS '(' ( f )? ')' e -> ^( APPELMETHODE ID_OTHERS ( f )? ( e )? ) | );
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
    public final ExprParser.e_return e() throws RecognitionException {
        ExprParser.e_return retval = new ExprParser.e_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal94=null;
        Token ID_OTHERS95=null;
        Token char_literal96=null;
        Token char_literal98=null;
        ExprParser.f_return f97 = null;

        ExprParser.e_return e99 = null;


        Object char_literal94_tree=null;
        Object ID_OTHERS95_tree=null;
        Object char_literal96_tree=null;
        Object char_literal98_tree=null;
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_ID_OTHERS=new RewriteRuleTokenStream(adaptor,"token ID_OTHERS");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e");
        RewriteRuleSubtreeStream stream_f=new RewriteRuleSubtreeStream(adaptor,"rule f");
        try {
<<<<<<< HEAD
            // Expr.g:108:3: ( '.' ID_OTHERS '(' ( f )? ')' e -> ^( APPELMETHODE ID_OTHERS ( f )? e ) | )
=======
            // Expr.g:109:3: ( '.' ID_OTHERS '(' ( f )? ')' e -> ^( APPELMETHODE ID_OTHERS ( f )? ( e )? ) | )
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
            int alt22=2;
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

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // Expr.g:110:2: '.' ID_OTHERS '(' ( f )? ')' e
                    {
<<<<<<< HEAD
                    char_literal94=(Token)match(input,60,FOLLOW_60_in_e757);  
                    stream_60.add(char_literal94);

                    ID_OTHERS95=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_e759);  
                    stream_ID_OTHERS.add(ID_OTHERS95);

                    char_literal96=(Token)match(input,32,FOLLOW_32_in_e761);  
=======
                    char_literal94=(Token)match(input,60,FOLLOW_60_in_e759);  
                    stream_60.add(char_literal94);

                    ID_OTHERS95=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_e761);  
                    stream_ID_OTHERS.add(ID_OTHERS95);

                    char_literal96=(Token)match(input,32,FOLLOW_32_in_e763);  
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
                    stream_32.add(char_literal96);

                    // Expr.g:110:20: ( f )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

<<<<<<< HEAD
                    if ( (LA21_0==ID_OTHERS||(LA21_0>=INT && LA21_0<=STRING)||LA21_0==32||(LA21_0>=57 && LA21_0<=59)||LA21_0==62) ) {
=======
                    if ( (LA21_0==ID_OTHERS||(LA21_0>=STRING && LA21_0<=INT)||LA21_0==32||(LA21_0>=57 && LA21_0<=59)||LA21_0==62) ) {
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // Expr.g:110:20: f
                            {
<<<<<<< HEAD
                            pushFollow(FOLLOW_f_in_e763);
=======
                            pushFollow(FOLLOW_f_in_e765);
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
                            f97=f();

                            state._fsp--;

                            stream_f.add(f97.getTree());

                            }
                            break;

                    }

<<<<<<< HEAD
                    char_literal98=(Token)match(input,33,FOLLOW_33_in_e766);  
                    stream_33.add(char_literal98);

                    pushFollow(FOLLOW_e_in_e768);
=======
                    char_literal98=(Token)match(input,33,FOLLOW_33_in_e768);  
                    stream_33.add(char_literal98);

                    pushFollow(FOLLOW_e_in_e770);
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
                    e99=e();

                    state._fsp--;

                    stream_e.add(e99.getTree());


                    // AST REWRITE
                    // elements: e, ID_OTHERS, f
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
                    // 109:29: -> ^( APPELMETHODE ID_OTHERS ( f )? e )
                    {
                        // Expr.g:109:32: ^( APPELMETHODE ID_OTHERS ( f )? e )
=======
                    // 110:29: -> ^( APPELMETHODE ID_OTHERS ( f )? ( e )? )
                    {
                        // Expr.g:110:32: ^( APPELMETHODE ID_OTHERS ( f )? ( e )? )
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(APPELMETHODE, "APPELMETHODE"), root_1);

                        adaptor.addChild(root_1, stream_ID_OTHERS.nextNode());
                        // Expr.g:110:57: ( f )?
                        if ( stream_f.hasNext() ) {
                            adaptor.addChild(root_1, stream_f.nextTree());

                        }
                        stream_f.reset();
<<<<<<< HEAD
                        adaptor.addChild(root_1, stream_e.nextTree());
=======
                        // Expr.g:110:60: ( e )?
                        if ( stream_e.hasNext() ) {
                            adaptor.addChild(root_1, stream_e.nextTree());

                        }
                        stream_e.reset();
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // Expr.g:112:2: 
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
        return retval;
    }
    // $ANTLR end "e"

    public static class f_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "f"
    // Expr.g:114:1: f : expr ( ',' expr )* -> ^( ARGS ( expr )* ) ;
    public final ExprParser.f_return f() throws RecognitionException {
        ExprParser.f_return retval = new ExprParser.f_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal101=null;
        ExprParser.expr_return expr100 = null;

        ExprParser.expr_return expr102 = null;


        Object char_literal101_tree=null;
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Expr.g:114:5: ( expr ( ',' expr )* -> ^( ARGS ( expr )* ) )
            // Expr.g:114:8: expr ( ',' expr )*
            {
<<<<<<< HEAD
            pushFollow(FOLLOW_expr_in_f798);
=======
            pushFollow(FOLLOW_expr_in_f801);
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
            expr100=expr();

            state._fsp--;

            stream_expr.add(expr100.getTree());
<<<<<<< HEAD
            // Expr.g:113:13: ( ',' expr )*
=======
            // Expr.g:114:13: ( ',' expr )*
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==42) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // Expr.g:114:14: ',' expr
            	    {
<<<<<<< HEAD
            	    char_literal101=(Token)match(input,42,FOLLOW_42_in_f801);  
            	    stream_42.add(char_literal101);

            	    pushFollow(FOLLOW_expr_in_f803);
=======
            	    char_literal101=(Token)match(input,42,FOLLOW_42_in_f804);  
            	    stream_42.add(char_literal101);

            	    pushFollow(FOLLOW_expr_in_f806);
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
            	    expr102=expr();

            	    state._fsp--;

            	    stream_expr.add(expr102.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);



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
            // 114:26: -> ^( ARGS ( expr )* )
            {
                // Expr.g:114:29: ^( ARGS ( expr )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGS, "ARGS"), root_1);

                // Expr.g:114:36: ( expr )*
                while ( stream_expr.hasNext() ) {
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
        return retval;
    }
    // $ANTLR end "f"

    public static class exprplus_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprplus"
    // Expr.g:118:1: exprplus : exprmult ( ( '+' | '-' ) exprmult )* ;
    public final ExprParser.exprplus_return exprplus() throws RecognitionException {
        ExprParser.exprplus_return retval = new ExprParser.exprplus_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal104=null;
        Token char_literal105=null;
        ExprParser.exprmult_return exprmult103 = null;

        ExprParser.exprmult_return exprmult106 = null;


        Object char_literal104_tree=null;
        Object char_literal105_tree=null;

        try {
            // Expr.g:118:9: ( exprmult ( ( '+' | '-' ) exprmult )* )
            // Expr.g:119:2: exprmult ( ( '+' | '-' ) exprmult )*
            {
            root_0 = (Object)adaptor.nil();

<<<<<<< HEAD
            pushFollow(FOLLOW_exprmult_in_exprplus827);
=======
            pushFollow(FOLLOW_exprmult_in_exprplus830);
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
            exprmult103=exprmult();

            state._fsp--;

            adaptor.addChild(root_0, exprmult103.getTree());
<<<<<<< HEAD
            // Expr.g:118:11: ( ( '+' | '-' ) exprmult )*
=======
            // Expr.g:119:11: ( ( '+' | '-' ) exprmult )*
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=61 && LA25_0<=62)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // Expr.g:119:13: ( '+' | '-' ) exprmult
            	    {
            	    // Expr.g:119:13: ( '+' | '-' )
            	    int alt24=2;
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

            	        throw nvae;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // Expr.g:119:14: '+'
            	            {
<<<<<<< HEAD
            	            char_literal104=(Token)match(input,61,FOLLOW_61_in_exprplus832); 
=======
            	            char_literal104=(Token)match(input,61,FOLLOW_61_in_exprplus835); 
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
            	            char_literal104_tree = (Object)adaptor.create(char_literal104);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal104_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // Expr.g:119:19: '-'
            	            {
<<<<<<< HEAD
            	            char_literal105=(Token)match(input,62,FOLLOW_62_in_exprplus835); 
=======
            	            char_literal105=(Token)match(input,62,FOLLOW_62_in_exprplus838); 
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
            	            char_literal105_tree = (Object)adaptor.create(char_literal105);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal105_tree, root_0);


            	            }
            	            break;

            	    }

<<<<<<< HEAD
            	    pushFollow(FOLLOW_exprmult_in_exprplus839);
=======
            	    pushFollow(FOLLOW_exprmult_in_exprplus842);
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
            	    exprmult106=exprmult();

            	    state._fsp--;

            	    adaptor.addChild(root_0, exprmult106.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


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
        return retval;
    }
    // $ANTLR end "exprplus"

    public static class exprmult_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprmult"
    // Expr.g:123:1: exprmult : oper ( '*' oper )? ;
    public final ExprParser.exprmult_return exprmult() throws RecognitionException {
        ExprParser.exprmult_return retval = new ExprParser.exprmult_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal108=null;
        ExprParser.oper_return oper107 = null;

        ExprParser.oper_return oper109 = null;


        Object char_literal108_tree=null;

        try {
            // Expr.g:123:9: ( oper ( '*' oper )? )
            // Expr.g:124:3: oper ( '*' oper )?
            {
            root_0 = (Object)adaptor.nil();

<<<<<<< HEAD
            pushFollow(FOLLOW_oper_in_exprmult853);
=======
            pushFollow(FOLLOW_oper_in_exprmult856);
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
            oper107=oper();

            state._fsp--;

            adaptor.addChild(root_0, oper107.getTree());
<<<<<<< HEAD
            // Expr.g:123:7: ( '*' oper )?
=======
            // Expr.g:124:7: ( '*' oper )?
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==63) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // Expr.g:124:9: '*' oper
                    {
<<<<<<< HEAD
                    char_literal108=(Token)match(input,63,FOLLOW_63_in_exprmult856); 
                    char_literal108_tree = (Object)adaptor.create(char_literal108);
                    root_0 = (Object)adaptor.becomeRoot(char_literal108_tree, root_0);

                    pushFollow(FOLLOW_oper_in_exprmult859);
=======
                    char_literal108=(Token)match(input,63,FOLLOW_63_in_exprmult859); 
                    char_literal108_tree = (Object)adaptor.create(char_literal108);
                    root_0 = (Object)adaptor.becomeRoot(char_literal108_tree, root_0);

                    pushFollow(FOLLOW_oper_in_exprmult862);
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
                    oper109=oper();

                    state._fsp--;

                    adaptor.addChild(root_0, oper109.getTree());

                    }
                    break;

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
        return retval;
    }
    // $ANTLR end "exprmult"

    public static class oper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "oper"
    // Expr.g:127:1: oper : moinsunaire ( OPERCONDITION moinsunaire )* ;
    public final ExprParser.oper_return oper() throws RecognitionException {
        ExprParser.oper_return retval = new ExprParser.oper_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OPERCONDITION111=null;
        ExprParser.moinsunaire_return moinsunaire110 = null;

        ExprParser.moinsunaire_return moinsunaire112 = null;


        Object OPERCONDITION111_tree=null;

        try {
            // Expr.g:127:5: ( moinsunaire ( OPERCONDITION moinsunaire )* )
            // Expr.g:128:2: moinsunaire ( OPERCONDITION moinsunaire )*
            {
            root_0 = (Object)adaptor.nil();

<<<<<<< HEAD
            pushFollow(FOLLOW_moinsunaire_in_oper872);
=======
            pushFollow(FOLLOW_moinsunaire_in_oper875);
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
            moinsunaire110=moinsunaire();

            state._fsp--;

            adaptor.addChild(root_0, moinsunaire110.getTree());
<<<<<<< HEAD
            // Expr.g:127:14: ( OPERCONDITION moinsunaire )*
=======
            // Expr.g:128:14: ( OPERCONDITION moinsunaire )*
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==OPERCONDITION) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // Expr.g:128:15: OPERCONDITION moinsunaire
            	    {
<<<<<<< HEAD
            	    OPERCONDITION111=(Token)match(input,OPERCONDITION,FOLLOW_OPERCONDITION_in_oper875); 
            	    OPERCONDITION111_tree = (Object)adaptor.create(OPERCONDITION111);
            	    root_0 = (Object)adaptor.becomeRoot(OPERCONDITION111_tree, root_0);

            	    pushFollow(FOLLOW_moinsunaire_in_oper878);
=======
            	    OPERCONDITION111=(Token)match(input,OPERCONDITION,FOLLOW_OPERCONDITION_in_oper878); 
            	    OPERCONDITION111_tree = (Object)adaptor.create(OPERCONDITION111);
            	    root_0 = (Object)adaptor.becomeRoot(OPERCONDITION111_tree, root_0);

            	    pushFollow(FOLLOW_moinsunaire_in_oper881);
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
            	    moinsunaire112=moinsunaire();

            	    state._fsp--;

            	    adaptor.addChild(root_0, moinsunaire112.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


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
        return retval;
    }
    // $ANTLR end "oper"

    public static class moinsunaire_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "moinsunaire"
    // Expr.g:131:1: moinsunaire : ( '-' atom -> ^( OPPOSE atom ) | atom );
    public final ExprParser.moinsunaire_return moinsunaire() throws RecognitionException {
        ExprParser.moinsunaire_return retval = new ExprParser.moinsunaire_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal113=null;
        ExprParser.atom_return atom114 = null;

        ExprParser.atom_return atom115 = null;


        Object char_literal113_tree=null;
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        try {
            // Expr.g:131:12: ( '-' atom -> ^( OPPOSE atom ) | atom )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==62) ) {
                alt28=1;
            }
<<<<<<< HEAD
            else if ( (LA28_0==ID_OTHERS||(LA28_0>=INT && LA28_0<=STRING)||LA28_0==32) ) {
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

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // Expr.g:132:2: '-' atom
                    {
<<<<<<< HEAD
                    char_literal113=(Token)match(input,62,FOLLOW_62_in_moinsunaire891);  
                    stream_62.add(char_literal113);

                    pushFollow(FOLLOW_atom_in_moinsunaire893);
=======
                    char_literal113=(Token)match(input,62,FOLLOW_62_in_moinsunaire894);  
                    stream_62.add(char_literal113);

                    pushFollow(FOLLOW_atom_in_moinsunaire896);
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
                    atom114=atom();

                    state._fsp--;

                    stream_atom.add(atom114.getTree());


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
                    // 132:11: -> ^( OPPOSE atom )
                    {
                        // Expr.g:132:14: ^( OPPOSE atom )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPPOSE, "OPPOSE"), root_1);

                        adaptor.addChild(root_1, stream_atom.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // Expr.g:133:4: atom
                    {
                    root_0 = (Object)adaptor.nil();

<<<<<<< HEAD
                    pushFollow(FOLLOW_atom_in_moinsunaire906);
=======
                    pushFollow(FOLLOW_atom_in_moinsunaire909);
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
                    atom115=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom115.getTree());

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
        return retval;
    }
    // $ANTLR end "moinsunaire"

    public static class atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom"
<<<<<<< HEAD
    // Expr.g:134:1: atom : ( ID_OTHERS | INT | STRING | '(' expr ')' );
=======
    // Expr.g:135:1: atom : ( ID_OTHERS | STRING | INT | '(' expr ')' );
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
    public final ExprParser.atom_return atom() throws RecognitionException {
        ExprParser.atom_return retval = new ExprParser.atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID_OTHERS116=null;
<<<<<<< HEAD
        Token INT117=null;
        Token STRING118=null;
=======
        Token STRING117=null;
        Token INT118=null;
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
        Token char_literal119=null;
        Token char_literal121=null;
        ExprParser.expr_return expr120 = null;


        Object ID_OTHERS116_tree=null;
<<<<<<< HEAD
        Object INT117_tree=null;
        Object STRING118_tree=null;
=======
        Object STRING117_tree=null;
        Object INT118_tree=null;
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
        Object char_literal119_tree=null;
        Object char_literal121_tree=null;

        try {
<<<<<<< HEAD
            // Expr.g:134:5: ( ID_OTHERS | INT | STRING | '(' expr ')' )
=======
            // Expr.g:135:5: ( ID_OTHERS | STRING | INT | '(' expr ')' )
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
            int alt29=4;
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
            case 32:
                {
                alt29=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // Expr.g:136:3: ID_OTHERS
                    {
                    root_0 = (Object)adaptor.nil();

<<<<<<< HEAD
                    ID_OTHERS116=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_atom917); 
=======
                    ID_OTHERS116=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_atom920); 
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
                    ID_OTHERS116_tree = (Object)adaptor.create(ID_OTHERS116);
                    adaptor.addChild(root_0, ID_OTHERS116_tree);


                    }
                    break;
                case 2 :
<<<<<<< HEAD
                    // Expr.g:136:4: INT
                    {
                    root_0 = (Object)adaptor.nil();

                    INT117=(Token)match(input,INT,FOLLOW_INT_in_atom922); 
                    INT117_tree = (Object)adaptor.create(INT117);
                    adaptor.addChild(root_0, INT117_tree);
=======
                    // Expr.g:137:4: STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING117=(Token)match(input,STRING,FOLLOW_STRING_in_atom925); 
                    STRING117_tree = (Object)adaptor.create(STRING117);
                    adaptor.addChild(root_0, STRING117_tree);


                    }
                    break;
                case 3 :
                    // Expr.g:138:5: INT
                    {
                    root_0 = (Object)adaptor.nil();

                    INT118=(Token)match(input,INT,FOLLOW_INT_in_atom931); 
                    INT118_tree = (Object)adaptor.create(INT118);
                    adaptor.addChild(root_0, INT118_tree);
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes


                    }
                    break;
<<<<<<< HEAD
                case 3 :
                    // Expr.g:137:4: STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING118=(Token)match(input,STRING,FOLLOW_STRING_in_atom927); 
                    STRING118_tree = (Object)adaptor.create(STRING118);
                    adaptor.addChild(root_0, STRING118_tree);


                    }
                    break;
                case 4 :
                    // Expr.g:138:4: '(' expr ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal119=(Token)match(input,32,FOLLOW_32_in_atom932); 
                    char_literal119_tree = (Object)adaptor.create(char_literal119);
                    adaptor.addChild(root_0, char_literal119_tree);

                    pushFollow(FOLLOW_expr_in_atom933);
=======
                case 4 :
                    // Expr.g:139:4: '(' expr ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal119=(Token)match(input,32,FOLLOW_32_in_atom936); 
                    char_literal119_tree = (Object)adaptor.create(char_literal119);
                    adaptor.addChild(root_0, char_literal119_tree);

                    pushFollow(FOLLOW_expr_in_atom937);
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
                    expr120=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr120.getTree());
<<<<<<< HEAD
                    char_literal121=(Token)match(input,33,FOLLOW_33_in_atom934); 
=======
                    char_literal121=(Token)match(input,33,FOLLOW_33_in_atom938); 
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes
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
        return retval;
    }
    // $ANTLR end "atom"

    // Delegated rules


 

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
    public static final BitSet FOLLOW_exprplus_in_expr710 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_e_in_expr712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_expr718 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_e_in_expr720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_expr725 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_e_in_expr727 = new BitSet(new long[]{0x0000000000000002L});
<<<<<<< HEAD
    public static final BitSet FOLLOW_59_in_expr732 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ID_CLASS_in_expr734 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_e_in_expr736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_e757 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ID_OTHERS_in_e759 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_e761 = new BitSet(new long[]{0x4E00000303400000L});
    public static final BitSet FOLLOW_f_in_e763 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_e766 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_e_in_e768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_f798 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_f801 = new BitSet(new long[]{0x4E00000103400000L});
    public static final BitSet FOLLOW_expr_in_f803 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_exprmult_in_exprplus827 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_61_in_exprplus832 = new BitSet(new long[]{0x4000000103400000L});
    public static final BitSet FOLLOW_62_in_exprplus835 = new BitSet(new long[]{0x4000000103400000L});
    public static final BitSet FOLLOW_exprmult_in_exprplus839 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_oper_in_exprmult853 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_exprmult856 = new BitSet(new long[]{0x4000000103400000L});
    public static final BitSet FOLLOW_oper_in_exprmult859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moinsunaire_in_oper872 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_OPERCONDITION_in_oper875 = new BitSet(new long[]{0x4000000103400000L});
    public static final BitSet FOLLOW_moinsunaire_in_oper878 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_62_in_moinsunaire891 = new BitSet(new long[]{0x4000000103400000L});
    public static final BitSet FOLLOW_atom_in_moinsunaire893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_moinsunaire906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_OTHERS_in_atom917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_atom927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_atom932 = new BitSet(new long[]{0x4E00000103400000L});
    public static final BitSet FOLLOW_expr_in_atom933 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_atom934 = new BitSet(new long[]{0x0000000000000002L});
=======
    public static final BitSet FOLLOW_59_in_expr734 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ID_CLASS_in_expr736 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_e_in_expr738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_e759 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ID_OTHERS_in_e761 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_e763 = new BitSet(new long[]{0x4E00000303400000L});
    public static final BitSet FOLLOW_f_in_e765 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_e768 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_e_in_e770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_f801 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_f804 = new BitSet(new long[]{0x4E00000103400000L});
    public static final BitSet FOLLOW_expr_in_f806 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_exprmult_in_exprplus830 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_61_in_exprplus835 = new BitSet(new long[]{0x4000000103400000L});
    public static final BitSet FOLLOW_62_in_exprplus838 = new BitSet(new long[]{0x4000000103400000L});
    public static final BitSet FOLLOW_exprmult_in_exprplus842 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_oper_in_exprmult856 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_exprmult859 = new BitSet(new long[]{0x4000000103400000L});
    public static final BitSet FOLLOW_oper_in_exprmult862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moinsunaire_in_oper875 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_OPERCONDITION_in_oper878 = new BitSet(new long[]{0x4000000103400000L});
    public static final BitSet FOLLOW_moinsunaire_in_oper881 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_62_in_moinsunaire894 = new BitSet(new long[]{0x4000000103400000L});
    public static final BitSet FOLLOW_atom_in_moinsunaire896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_moinsunaire909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_OTHERS_in_atom920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_atom925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_atom936 = new BitSet(new long[]{0x4E00000103400000L});
    public static final BitSet FOLLOW_expr_in_atom937 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_atom938 = new BitSet(new long[]{0x0000000000000002L});
<<<<<<< Updated upstream
>>>>>>> 4ee3460ba8d8bb80f35fbc5a0d2306eafa2bb940
=======
>>>>>>> refs/remotes/origin/master
>>>>>>> Stashed changes

}