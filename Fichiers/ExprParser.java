// $ANTLR 3.3 Nov 30, 2010 12:50:56 Expr.g 2017-04-07 00:08:24

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class ExprParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ROOT", "DEC_CLASS", "DEC_VAR", "AFFECT", "RETURN", "FOR", "IF", "BLOC", "BODY", "METHOD", "ARGS", "PARAMS", "OPPOSE", "APPELMETHODE", "PARAM", "NEW", "BODY_CLASS", "VOID", "ID_CLASS", "ID_OTHERS", "OPERCONDITION", "STRING", "INT", "COMMENTS", "NEWLINE", "WS", "'class'", "'inherit'", "'='", "'('", "')'", "'var'", "':'", "';'", "'int'", "'string'", "'method'", "'{'", "'}'", "','", "':='", "'if'", "'then'", "'else'", "'fi'", "'for'", "'in'", "'do'", "'end'", "'..'", "'nil'", "'write'", "'read'", "'return'", "'this'", "'super'", "'new'", "'.'", "'+'", "'-'", "'*'"
    };
    public static final int EOF=-1;
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
    public static final int T__64=64;
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
    public static final int VOID=21;
    public static final int ID_CLASS=22;
    public static final int ID_OTHERS=23;
    public static final int OPERCONDITION=24;
    public static final int STRING=25;
    public static final int INT=26;
    public static final int COMMENTS=27;
    public static final int NEWLINE=28;
    public static final int WS=29;

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
    // Expr.g:29:1: prog : ( class_decl )* ( var_decl )* ( instr )+ -> ^( ROOT ( class_decl )* ( var_decl )* ( instr )+ ) ;
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
            // Expr.g:29:6: ( ( class_decl )* ( var_decl )* ( instr )+ -> ^( ROOT ( class_decl )* ( var_decl )* ( instr )+ ) )
            // Expr.g:30:2: ( class_decl )* ( var_decl )* ( instr )+
            {
            // Expr.g:30:2: ( class_decl )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==30) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Expr.g:30:2: class_decl
            	    {
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

            // Expr.g:30:14: ( var_decl )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==35) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Expr.g:30:14: var_decl
            	    {
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

            // Expr.g:30:24: ( instr )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==ID_OTHERS||LA3_0==41||LA3_0==45||LA3_0==49||LA3_0==51||(LA3_0>=55 && LA3_0<=57)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Expr.g:30:24: instr
            	    {
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
            // 30:31: -> ^( ROOT ( class_decl )* ( var_decl )* ( instr )+ )
            {
                // Expr.g:30:34: ^( ROOT ( class_decl )* ( var_decl )* ( instr )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ROOT, "ROOT"), root_1);

                // Expr.g:30:41: ( class_decl )*
                while ( stream_class_decl.hasNext() ) {
                    adaptor.addChild(root_1, stream_class_decl.nextTree());

                }
                stream_class_decl.reset();
                // Expr.g:30:53: ( var_decl )*
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
    // Expr.g:34:1: class_decl : 'class' a= ID_CLASS ( 'inherit' b= ID_CLASS )? '=' '(' class_item_decl ')' -> ^( DEC_CLASS $a ( $b)? ( class_item_decl )? ) ;
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
        try {
            // Expr.g:34:12: ( 'class' a= ID_CLASS ( 'inherit' b= ID_CLASS )? '=' '(' class_item_decl ')' -> ^( DEC_CLASS $a ( $b)? ( class_item_decl )? ) )
            // Expr.g:35:3: 'class' a= ID_CLASS ( 'inherit' b= ID_CLASS )? '=' '(' class_item_decl ')'
            {
            string_literal4=(Token)match(input,30,FOLLOW_30_in_class_decl126);  
            stream_30.add(string_literal4);

            a=(Token)match(input,ID_CLASS,FOLLOW_ID_CLASS_in_class_decl130);  
            stream_ID_CLASS.add(a);

            // Expr.g:35:22: ( 'inherit' b= ID_CLASS )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==31) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // Expr.g:35:23: 'inherit' b= ID_CLASS
                    {
                    string_literal5=(Token)match(input,31,FOLLOW_31_in_class_decl133);  
                    stream_31.add(string_literal5);

                    b=(Token)match(input,ID_CLASS,FOLLOW_ID_CLASS_in_class_decl137);  
                    stream_ID_CLASS.add(b);


                    }
                    break;

            }

            char_literal6=(Token)match(input,32,FOLLOW_32_in_class_decl141);  
            stream_32.add(char_literal6);

            char_literal7=(Token)match(input,33,FOLLOW_33_in_class_decl143);  
            stream_33.add(char_literal7);

            pushFollow(FOLLOW_class_item_decl_in_class_decl145);
            class_item_decl8=class_item_decl();

            state._fsp--;

            stream_class_item_decl.add(class_item_decl8.getTree());
            char_literal9=(Token)match(input,34,FOLLOW_34_in_class_decl147);  
            stream_34.add(char_literal9);



            // AST REWRITE
            // elements: b, a, class_item_decl
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
                // Expr.g:35:76: ^( DEC_CLASS $a ( $b)? ( class_item_decl )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEC_CLASS, "DEC_CLASS"), root_1);

                adaptor.addChild(root_1, stream_a.nextNode());
                // Expr.g:35:91: ( $b)?
                if ( stream_b.hasNext() ) {
                    adaptor.addChild(root_1, stream_b.nextNode());

                }
                stream_b.reset();
                // Expr.g:35:97: ( class_item_decl )?
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
    // Expr.g:38:1: class_item_decl : ( var_decl )* ( method_decl )* -> ^( BODY_CLASS ( var_decl )* ( method_decl )* ) ;
    public final ExprParser.class_item_decl_return class_item_decl() throws RecognitionException {
        ExprParser.class_item_decl_return retval = new ExprParser.class_item_decl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ExprParser.var_decl_return var_decl10 = null;

        ExprParser.method_decl_return method_decl11 = null;


        RewriteRuleSubtreeStream stream_method_decl=new RewriteRuleSubtreeStream(adaptor,"rule method_decl");
        RewriteRuleSubtreeStream stream_var_decl=new RewriteRuleSubtreeStream(adaptor,"rule var_decl");
        try {
            // Expr.g:38:17: ( ( var_decl )* ( method_decl )* -> ^( BODY_CLASS ( var_decl )* ( method_decl )* ) )
            // Expr.g:39:2: ( var_decl )* ( method_decl )*
            {
            // Expr.g:39:2: ( var_decl )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==35) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Expr.g:39:2: var_decl
            	    {
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

            // Expr.g:39:12: ( method_decl )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==40) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Expr.g:39:12: method_decl
            	    {
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
                // Expr.g:39:27: ^( BODY_CLASS ( var_decl )* ( method_decl )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY_CLASS, "BODY_CLASS"), root_1);

                // Expr.g:39:40: ( var_decl )*
                while ( stream_var_decl.hasNext() ) {
                    adaptor.addChild(root_1, stream_var_decl.nextTree());

                }
                stream_var_decl.reset();
                // Expr.g:39:50: ( method_decl )*
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
    // Expr.g:42:1: var_decl : 'var' ID_OTHERS ':' type ';' -> ^( DEC_VAR ID_OTHERS type ) ;
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
        try {
            // Expr.g:42:10: ( 'var' ID_OTHERS ':' type ';' -> ^( DEC_VAR ID_OTHERS type ) )
            // Expr.g:43:2: 'var' ID_OTHERS ':' type ';'
            {
            string_literal12=(Token)match(input,35,FOLLOW_35_in_var_decl204);  
            stream_35.add(string_literal12);

            ID_OTHERS13=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_var_decl206);  
            stream_ID_OTHERS.add(ID_OTHERS13);

            char_literal14=(Token)match(input,36,FOLLOW_36_in_var_decl208);  
            stream_36.add(char_literal14);

            pushFollow(FOLLOW_type_in_var_decl210);
            type15=type();

            state._fsp--;

            stream_type.add(type15.getTree());
            char_literal16=(Token)match(input,37,FOLLOW_37_in_var_decl212);  
            stream_37.add(char_literal16);



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
            // 43:31: -> ^( DEC_VAR ID_OTHERS type )
            {
                // Expr.g:43:33: ^( DEC_VAR ID_OTHERS type )
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
    // Expr.g:46:1: type : ( ID_CLASS | 'int' | 'string' );
    public final ExprParser.type_return type() throws RecognitionException {
        ExprParser.type_return retval = new ExprParser.type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set17=null;

        Object set17_tree=null;

        try {
            // Expr.g:46:6: ( ID_CLASS | 'int' | 'string' )
            // Expr.g:
            {
            root_0 = (Object)adaptor.nil();

            set17=(Token)input.LT(1);
            if ( input.LA(1)==ID_CLASS||(input.LA(1)>=38 && input.LA(1)<=39) ) {
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
    // Expr.g:52:1: method_decl : 'method' ID_OTHERS '(' ( method_params )? ')' m -> ^( METHOD ID_OTHERS ( method_params )? m ) ;
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
        try {
            // Expr.g:52:13: ( 'method' ID_OTHERS '(' ( method_params )? ')' m -> ^( METHOD ID_OTHERS ( method_params )? m ) )
            // Expr.g:53:2: 'method' ID_OTHERS '(' ( method_params )? ')' m
            {
            string_literal18=(Token)match(input,40,FOLLOW_40_in_method_decl255);  
            stream_40.add(string_literal18);

            ID_OTHERS19=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_method_decl257);  
            stream_ID_OTHERS.add(ID_OTHERS19);

            char_literal20=(Token)match(input,33,FOLLOW_33_in_method_decl259);  
            stream_33.add(char_literal20);

            // Expr.g:53:26: ( method_params )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ID_OTHERS) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // Expr.g:53:26: method_params
                    {
                    pushFollow(FOLLOW_method_params_in_method_decl262);
                    method_params21=method_params();

                    state._fsp--;

                    stream_method_params.add(method_params21.getTree());

                    }
                    break;

            }

            char_literal22=(Token)match(input,34,FOLLOW_34_in_method_decl265);  
            stream_34.add(char_literal22);

            pushFollow(FOLLOW_m_in_method_decl267);
            m23=m();

            state._fsp--;

            stream_m.add(m23.getTree());


            // AST REWRITE
            // elements: method_params, ID_OTHERS, m
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 53:47: -> ^( METHOD ID_OTHERS ( method_params )? m )
            {
                // Expr.g:53:50: ^( METHOD ID_OTHERS ( method_params )? m )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHOD, "METHOD"), root_1);

                adaptor.addChild(root_1, stream_ID_OTHERS.nextNode());
                // Expr.g:53:71: ( method_params )?
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
    // Expr.g:56:1: m : ( '{' ( var_decl )* ( instr )+ '}' -> ^( BODY ( var_decl )* ( instr )+ ) | ':' type '{' ( var_decl )* ( instr )+ '}' -> type ^( BODY ( var_decl )* ( instr )+ ) );
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
        try {
            // Expr.g:56:4: ( '{' ( var_decl )* ( instr )+ '}' -> ^( BODY ( var_decl )* ( instr )+ ) | ':' type '{' ( var_decl )* ( instr )+ '}' -> type ^( BODY ( var_decl )* ( instr )+ ) )
            int alt12=2;
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

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // Expr.g:57:2: '{' ( var_decl )* ( instr )+ '}'
                    {
                    char_literal24=(Token)match(input,41,FOLLOW_41_in_m296);  
                    stream_41.add(char_literal24);

                    // Expr.g:57:6: ( var_decl )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==35) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // Expr.g:57:6: var_decl
                    	    {
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

                    // Expr.g:57:16: ( instr )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==ID_OTHERS||LA9_0==41||LA9_0==45||LA9_0==49||LA9_0==51||(LA9_0>=55 && LA9_0<=57)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // Expr.g:57:16: instr
                    	    {
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
                                throw eee;
                        }
                        cnt9++;
                    } while (true);

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
                        // Expr.g:57:29: ^( BODY ( var_decl )* ( instr )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_1);

                        // Expr.g:57:37: ( var_decl )*
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
                    // Expr.g:58:4: ':' type '{' ( var_decl )* ( instr )+ '}'
                    {
                    char_literal28=(Token)match(input,36,FOLLOW_36_in_m322);  
                    stream_36.add(char_literal28);

                    pushFollow(FOLLOW_type_in_m324);
                    type29=type();

                    state._fsp--;

                    stream_type.add(type29.getTree());
                    char_literal30=(Token)match(input,41,FOLLOW_41_in_m326);  
                    stream_41.add(char_literal30);

                    // Expr.g:58:17: ( var_decl )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==35) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // Expr.g:58:17: var_decl
                    	    {
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

                    // Expr.g:58:27: ( instr )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==ID_OTHERS||LA11_0==41||LA11_0==45||LA11_0==49||LA11_0==51||(LA11_0>=55 && LA11_0<=57)) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // Expr.g:58:27: instr
                    	    {
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
                                throw eee;
                        }
                        cnt11++;
                    } while (true);

                    char_literal33=(Token)match(input,42,FOLLOW_42_in_m334);  
                    stream_42.add(char_literal33);



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
                    // 58:38: -> type ^( BODY ( var_decl )* ( instr )+ )
                    {
                        adaptor.addChild(root_0, stream_type.nextTree());
                        // Expr.g:58:46: ^( BODY ( var_decl )* ( instr )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_1);

                        // Expr.g:58:54: ( var_decl )*
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
    // Expr.g:62:1: method_params : params -> ^( PARAMS params ) ;
    public final ExprParser.method_params_return method_params() throws RecognitionException {
        ExprParser.method_params_return retval = new ExprParser.method_params_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ExprParser.params_return params34 = null;


        RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
        try {
            // Expr.g:62:15: ( params -> ^( PARAMS params ) )
            // Expr.g:63:2: params
            {
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
                // Expr.g:63:12: ^( PARAMS params )
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
    // Expr.g:66:1: params : ID_OTHERS ':' type ( ',' ID_OTHERS ':' type )* -> ( ^( PARAM ID_OTHERS type ) )* ;
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
        try {
            // Expr.g:66:8: ( ID_OTHERS ':' type ( ',' ID_OTHERS ':' type )* -> ( ^( PARAM ID_OTHERS type ) )* )
            // Expr.g:67:2: ID_OTHERS ':' type ( ',' ID_OTHERS ':' type )*
            {
            ID_OTHERS35=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_params383);  
            stream_ID_OTHERS.add(ID_OTHERS35);

            char_literal36=(Token)match(input,36,FOLLOW_36_in_params385);  
            stream_36.add(char_literal36);

            pushFollow(FOLLOW_type_in_params388);
            type37=type();

            state._fsp--;

            stream_type.add(type37.getTree());
            // Expr.g:67:22: ( ',' ID_OTHERS ':' type )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==43) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // Expr.g:67:23: ',' ID_OTHERS ':' type
            	    {
            	    char_literal38=(Token)match(input,43,FOLLOW_43_in_params391);  
            	    stream_43.add(char_literal38);

            	    ID_OTHERS39=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_params393);  
            	    stream_ID_OTHERS.add(ID_OTHERS39);

            	    char_literal40=(Token)match(input,36,FOLLOW_36_in_params395);  
            	    stream_36.add(char_literal40);

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
                // Expr.g:67:51: ( ^( PARAM ID_OTHERS type ) )*
                while ( stream_type.hasNext()||stream_ID_OTHERS.hasNext() ) {
                    // Expr.g:67:51: ^( PARAM ID_OTHERS type )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAM, "PARAM"), root_1);

                    adaptor.addChild(root_1, stream_ID_OTHERS.nextNode());
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
        return retval;
    }
    // $ANTLR end "params"

    public static class instr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instr"
    // Expr.g:71:1: instr : ( ID_OTHERS ':=' i -> ^( AFFECT ID_OTHERS i ) | 'if' expr 'then' instr ( 'else' instr )? 'fi' -> ^( IF expr instr ( instr )? ) | 'for' ID_OTHERS 'in' boundaries 'do' ( instr )+ 'end' -> ^( FOR ID_OTHERS boundaries ( instr )+ ) | '{' ( var_decl )* ( instr )+ '}' -> ^( BLOC ( var_decl )* ( instr )+ ) | 'do' expr ';' -> ^( 'do' expr ) | print | read | retourne );
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
        try {
            // Expr.g:71:7: ( ID_OTHERS ':=' i -> ^( AFFECT ID_OTHERS i ) | 'if' expr 'then' instr ( 'else' instr )? 'fi' -> ^( IF expr instr ( instr )? ) | 'for' ID_OTHERS 'in' boundaries 'do' ( instr )+ 'end' -> ^( FOR ID_OTHERS boundaries ( instr )+ ) | '{' ( var_decl )* ( instr )+ '}' -> ^( BLOC ( var_decl )* ( instr )+ ) | 'do' expr ';' -> ^( 'do' expr ) | print | read | retourne )
            int alt18=8;
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

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // Expr.g:72:2: ID_OTHERS ':=' i
                    {
                    ID_OTHERS42=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_instr425);  
                    stream_ID_OTHERS.add(ID_OTHERS42);

                    string_literal43=(Token)match(input,44,FOLLOW_44_in_instr427);  
                    stream_44.add(string_literal43);

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
                        // Expr.g:72:22: ^( AFFECT ID_OTHERS i )
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
                    // Expr.g:73:3: 'if' expr 'then' instr ( 'else' instr )? 'fi'
                    {
                    string_literal45=(Token)match(input,45,FOLLOW_45_in_instr443);  
                    stream_45.add(string_literal45);

                    pushFollow(FOLLOW_expr_in_instr445);
                    expr46=expr();

                    state._fsp--;

                    stream_expr.add(expr46.getTree());
                    string_literal47=(Token)match(input,46,FOLLOW_46_in_instr447);  
                    stream_46.add(string_literal47);

                    pushFollow(FOLLOW_instr_in_instr449);
                    instr48=instr();

                    state._fsp--;

                    stream_instr.add(instr48.getTree());
                    // Expr.g:73:26: ( 'else' instr )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==47) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // Expr.g:73:27: 'else' instr
                            {
                            string_literal49=(Token)match(input,47,FOLLOW_47_in_instr452);  
                            stream_47.add(string_literal49);

                            pushFollow(FOLLOW_instr_in_instr454);
                            instr50=instr();

                            state._fsp--;

                            stream_instr.add(instr50.getTree());

                            }
                            break;

                    }

                    string_literal51=(Token)match(input,48,FOLLOW_48_in_instr458);  
                    stream_48.add(string_literal51);



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
                    // 73:48: -> ^( IF expr instr ( instr )? )
                    {
                        // Expr.g:73:51: ^( IF expr instr ( instr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());
                        adaptor.addChild(root_1, stream_instr.nextTree());
                        // Expr.g:73:67: ( instr )?
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
                    // Expr.g:74:3: 'for' ID_OTHERS 'in' boundaries 'do' ( instr )+ 'end'
                    {
                    string_literal52=(Token)match(input,49,FOLLOW_49_in_instr476);  
                    stream_49.add(string_literal52);

                    ID_OTHERS53=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_instr478);  
                    stream_ID_OTHERS.add(ID_OTHERS53);

                    string_literal54=(Token)match(input,50,FOLLOW_50_in_instr480);  
                    stream_50.add(string_literal54);

                    pushFollow(FOLLOW_boundaries_in_instr482);
                    boundaries55=boundaries();

                    state._fsp--;

                    stream_boundaries.add(boundaries55.getTree());
                    string_literal56=(Token)match(input,51,FOLLOW_51_in_instr484);  
                    stream_51.add(string_literal56);

                    // Expr.g:74:40: ( instr )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==ID_OTHERS||LA15_0==41||LA15_0==45||LA15_0==49||LA15_0==51||(LA15_0>=55 && LA15_0<=57)) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // Expr.g:74:40: instr
                    	    {
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
                                throw eee;
                        }
                        cnt15++;
                    } while (true);

                    string_literal58=(Token)match(input,52,FOLLOW_52_in_instr489);  
                    stream_52.add(string_literal58);



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
                    // 74:53: -> ^( FOR ID_OTHERS boundaries ( instr )+ )
                    {
                        // Expr.g:74:56: ^( FOR ID_OTHERS boundaries ( instr )+ )
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
                    // Expr.g:75:3: '{' ( var_decl )* ( instr )+ '}'
                    {
                    char_literal59=(Token)match(input,41,FOLLOW_41_in_instr506);  
                    stream_41.add(char_literal59);

                    // Expr.g:75:7: ( var_decl )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==35) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // Expr.g:75:7: var_decl
                    	    {
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

                    // Expr.g:75:17: ( instr )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==ID_OTHERS||LA17_0==41||LA17_0==45||LA17_0==49||LA17_0==51||(LA17_0>=55 && LA17_0<=57)) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // Expr.g:75:17: instr
                    	    {
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
                                throw eee;
                        }
                        cnt17++;
                    } while (true);

                    char_literal62=(Token)match(input,42,FOLLOW_42_in_instr514);  
                    stream_42.add(char_literal62);



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
                    // 75:28: -> ^( BLOC ( var_decl )* ( instr )+ )
                    {
                        // Expr.g:75:30: ^( BLOC ( var_decl )* ( instr )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOC, "BLOC"), root_1);

                        // Expr.g:75:38: ( var_decl )*
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
                    // Expr.g:76:3: 'do' expr ';'
                    {
                    string_literal63=(Token)match(input,51,FOLLOW_51_in_instr531);  
                    stream_51.add(string_literal63);

                    pushFollow(FOLLOW_expr_in_instr533);
                    expr64=expr();

                    state._fsp--;

                    stream_expr.add(expr64.getTree());
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
                        // Expr.g:76:21: ^( 'do' expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_51.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // Expr.g:77:3: print
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_print_in_instr548);
                    print66=print();

                    state._fsp--;

                    adaptor.addChild(root_0, print66.getTree());

                    }
                    break;
                case 7 :
                    // Expr.g:78:3: read
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_read_in_instr552);
                    read67=read();

                    state._fsp--;

                    adaptor.addChild(root_0, read67.getTree());

                    }
                    break;
                case 8 :
                    // Expr.g:79:3: retourne
                    {
                    root_0 = (Object)adaptor.nil();

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
        return retval;
    }
    // $ANTLR end "instr"

    public static class boundaries_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "boundaries"
    // Expr.g:82:1: boundaries : a= expr '..' b= expr -> ^( '..' $a $b) ;
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
        try {
            // Expr.g:82:12: (a= expr '..' b= expr -> ^( '..' $a $b) )
            // Expr.g:83:3: a= expr '..' b= expr
            {
            pushFollow(FOLLOW_expr_in_boundaries575);
            a=expr();

            state._fsp--;

            stream_expr.add(a.getTree());
            string_literal69=(Token)match(input,53,FOLLOW_53_in_boundaries577);  
            stream_53.add(string_literal69);

            pushFollow(FOLLOW_expr_in_boundaries581);
            b=expr();

            state._fsp--;

            stream_expr.add(b.getTree());


            // AST REWRITE
            // elements: 53, a, b
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
                // Expr.g:83:26: ^( '..' $a $b)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_53.nextNode(), root_1);

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
    // Expr.g:86:1: i : ( expr ';' -> expr | 'nil' ';' -> 'nil' );
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
        try {
            // Expr.g:86:3: ( expr ';' -> expr | 'nil' ';' -> 'nil' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==ID_OTHERS||(LA19_0>=STRING && LA19_0<=INT)||LA19_0==33||(LA19_0>=58 && LA19_0<=60)||LA19_0==63) ) {
                alt19=1;
            }
            else if ( (LA19_0==54) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // Expr.g:87:2: expr ';'
                    {
                    pushFollow(FOLLOW_expr_in_i607);
                    expr70=expr();

                    state._fsp--;

                    stream_expr.add(expr70.getTree());
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
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // Expr.g:88:4: 'nil' ';'
                    {
                    string_literal72=(Token)match(input,54,FOLLOW_54_in_i618);  
                    stream_54.add(string_literal72);

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
        return retval;
    }
    // $ANTLR end "i"

    public static class print_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "print"
    // Expr.g:91:1: print : 'write' expr ';' -> ^( 'write' expr ) ;
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
        try {
            // Expr.g:91:7: ( 'write' expr ';' -> ^( 'write' expr ) )
            // Expr.g:92:3: 'write' expr ';'
            {
            string_literal74=(Token)match(input,55,FOLLOW_55_in_print637);  
            stream_55.add(string_literal74);

            pushFollow(FOLLOW_expr_in_print639);
            expr75=expr();

            state._fsp--;

            stream_expr.add(expr75.getTree());
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
                // Expr.g:92:23: ^( 'write' expr )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_55.nextNode(), root_1);

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
    // Expr.g:95:1: read : 'read' ID_OTHERS ';' -> ^( 'read' ID_OTHERS ) ;
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

        try {
            // Expr.g:95:6: ( 'read' ID_OTHERS ';' -> ^( 'read' ID_OTHERS ) )
            // Expr.g:96:2: 'read' ID_OTHERS ';'
            {
            string_literal77=(Token)match(input,56,FOLLOW_56_in_read663);  
            stream_56.add(string_literal77);

            ID_OTHERS78=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_read665);  
            stream_ID_OTHERS.add(ID_OTHERS78);

            char_literal79=(Token)match(input,37,FOLLOW_37_in_read667);  
            stream_37.add(char_literal79);



            // AST REWRITE
            // elements: 56, ID_OTHERS
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
                // Expr.g:96:26: ^( 'read' ID_OTHERS )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_56.nextNode(), root_1);

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
    // Expr.g:99:1: retourne : 'return' '(' expr ')' ';' -> ^( RETURN expr ) ;
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
        try {
            // Expr.g:99:10: ( 'return' '(' expr ')' ';' -> ^( RETURN expr ) )
            // Expr.g:100:2: 'return' '(' expr ')' ';'
            {
            string_literal80=(Token)match(input,57,FOLLOW_57_in_retourne686);  
            stream_57.add(string_literal80);

            char_literal81=(Token)match(input,33,FOLLOW_33_in_retourne688);  
            stream_33.add(char_literal81);

            pushFollow(FOLLOW_expr_in_retourne690);
            expr82=expr();

            state._fsp--;

            stream_expr.add(expr82.getTree());
            char_literal83=(Token)match(input,34,FOLLOW_34_in_retourne692);  
            stream_34.add(char_literal83);

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
                // Expr.g:100:30: ^( RETURN expr )
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
    // Expr.g:103:1: expr : ( exprplus | 'this' e -> ^( 'this' e ) | 'super' e -> ^( 'super' e ) | 'new' ID_CLASS -> ^( NEW ID_CLASS ) );
    public final ExprParser.expr_return expr() throws RecognitionException {
        ExprParser.expr_return retval = new ExprParser.expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

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
        try {
            // Expr.g:103:5: ( exprplus | 'this' e -> ^( 'this' e ) | 'super' e -> ^( 'super' e ) | 'new' ID_CLASS -> ^( NEW ID_CLASS ) )
            int alt20=4;
            switch ( input.LA(1) ) {
            case ID_OTHERS:
            case STRING:
            case INT:
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
            case 60:
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
                    // Expr.g:104:2: exprplus
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_exprplus_in_expr712);
                    exprplus85=exprplus();

                    state._fsp--;

                    adaptor.addChild(root_0, exprplus85.getTree());

                    }
                    break;
                case 2 :
                    // Expr.g:105:4: 'this' e
                    {
                    string_literal86=(Token)match(input,58,FOLLOW_58_in_expr717);  
                    stream_58.add(string_literal86);

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
                        // Expr.g:105:16: ^( 'this' e )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_58.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_e.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // Expr.g:106:4: 'super' e
                    {
                    string_literal88=(Token)match(input,59,FOLLOW_59_in_expr732);  
                    stream_59.add(string_literal88);

                    pushFollow(FOLLOW_e_in_expr734);
                    e89=e();

                    state._fsp--;

                    stream_e.add(e89.getTree());


                    // AST REWRITE
                    // elements: 59, e
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
                        // Expr.g:106:17: ^( 'super' e )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_59.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_e.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // Expr.g:107:4: 'new' ID_CLASS
                    {
                    string_literal90=(Token)match(input,60,FOLLOW_60_in_expr747);  
                    stream_60.add(string_literal90);

                    ID_CLASS91=(Token)match(input,ID_CLASS,FOLLOW_ID_CLASS_in_expr749);  
                    stream_ID_CLASS.add(ID_CLASS91);



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
                    // 107:20: -> ^( NEW ID_CLASS )
                    {
                        // Expr.g:107:23: ^( NEW ID_CLASS )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NEW, "NEW"), root_1);

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
        return retval;
    }
    // $ANTLR end "expr"

    public static class e_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "e"
    // Expr.g:109:1: e : ( '.' ID_OTHERS '(' ( f )? ')' e -> ^( APPELMETHODE ID_OTHERS ( f )? ( e )? ) | );
    public final ExprParser.e_return e() throws RecognitionException {
        ExprParser.e_return retval = new ExprParser.e_return();
        retval.start = input.LT(1);

        Object root_0 = null;

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
        RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e");
        RewriteRuleSubtreeStream stream_f=new RewriteRuleSubtreeStream(adaptor,"rule f");
        try {
            // Expr.g:109:3: ( '.' ID_OTHERS '(' ( f )? ')' e -> ^( APPELMETHODE ID_OTHERS ( f )? ( e )? ) | )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==61) ) {
                alt22=1;
            }
            else if ( (LA22_0==OPERCONDITION||LA22_0==34||LA22_0==37||LA22_0==43||LA22_0==46||LA22_0==51||LA22_0==53||(LA22_0>=62 && LA22_0<=64)) ) {
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
                    char_literal92=(Token)match(input,61,FOLLOW_61_in_e769);  
                    stream_61.add(char_literal92);

                    ID_OTHERS93=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_e771);  
                    stream_ID_OTHERS.add(ID_OTHERS93);

                    char_literal94=(Token)match(input,33,FOLLOW_33_in_e773);  
                    stream_33.add(char_literal94);

                    // Expr.g:110:20: ( f )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==ID_OTHERS||(LA21_0>=STRING && LA21_0<=INT)||LA21_0==33||(LA21_0>=58 && LA21_0<=60)||LA21_0==63) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // Expr.g:110:20: f
                            {
                            pushFollow(FOLLOW_f_in_e775);
                            f95=f();

                            state._fsp--;

                            stream_f.add(f95.getTree());

                            }
                            break;

                    }

                    char_literal96=(Token)match(input,34,FOLLOW_34_in_e778);  
                    stream_34.add(char_literal96);

                    pushFollow(FOLLOW_e_in_e780);
                    e97=e();

                    state._fsp--;

                    stream_e.add(e97.getTree());


                    // AST REWRITE
                    // elements: f, e, ID_OTHERS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 110:29: -> ^( APPELMETHODE ID_OTHERS ( f )? ( e )? )
                    {
                        // Expr.g:110:32: ^( APPELMETHODE ID_OTHERS ( f )? ( e )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(APPELMETHODE, "APPELMETHODE"), root_1);

                        adaptor.addChild(root_1, stream_ID_OTHERS.nextNode());
                        // Expr.g:110:57: ( f )?
                        if ( stream_f.hasNext() ) {
                            adaptor.addChild(root_1, stream_f.nextTree());

                        }
                        stream_f.reset();
                        // Expr.g:110:60: ( e )?
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

        Token char_literal99=null;
        ExprParser.expr_return expr98 = null;

        ExprParser.expr_return expr100 = null;


        Object char_literal99_tree=null;
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Expr.g:114:5: ( expr ( ',' expr )* -> ^( ARGS ( expr )* ) )
            // Expr.g:114:8: expr ( ',' expr )*
            {
            pushFollow(FOLLOW_expr_in_f811);
            expr98=expr();

            state._fsp--;

            stream_expr.add(expr98.getTree());
            // Expr.g:114:13: ( ',' expr )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==43) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // Expr.g:114:14: ',' expr
            	    {
            	    char_literal99=(Token)match(input,43,FOLLOW_43_in_f814);  
            	    stream_43.add(char_literal99);

            	    pushFollow(FOLLOW_expr_in_f816);
            	    expr100=expr();

            	    state._fsp--;

            	    stream_expr.add(expr100.getTree());

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

        Token char_literal102=null;
        Token char_literal103=null;
        ExprParser.exprmult_return exprmult101 = null;

        ExprParser.exprmult_return exprmult104 = null;


        Object char_literal102_tree=null;
        Object char_literal103_tree=null;

        try {
            // Expr.g:118:9: ( exprmult ( ( '+' | '-' ) exprmult )* )
            // Expr.g:119:2: exprmult ( ( '+' | '-' ) exprmult )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_exprmult_in_exprplus840);
            exprmult101=exprmult();

            state._fsp--;

            adaptor.addChild(root_0, exprmult101.getTree());
            // Expr.g:119:11: ( ( '+' | '-' ) exprmult )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=62 && LA25_0<=63)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // Expr.g:119:13: ( '+' | '-' ) exprmult
            	    {
            	    // Expr.g:119:13: ( '+' | '-' )
            	    int alt24=2;
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

            	        throw nvae;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // Expr.g:119:14: '+'
            	            {
            	            char_literal102=(Token)match(input,62,FOLLOW_62_in_exprplus845); 
            	            char_literal102_tree = (Object)adaptor.create(char_literal102);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal102_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // Expr.g:119:19: '-'
            	            {
            	            char_literal103=(Token)match(input,63,FOLLOW_63_in_exprplus848); 
            	            char_literal103_tree = (Object)adaptor.create(char_literal103);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal103_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_exprmult_in_exprplus852);
            	    exprmult104=exprmult();

            	    state._fsp--;

            	    adaptor.addChild(root_0, exprmult104.getTree());

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

        Token char_literal106=null;
        ExprParser.oper_return oper105 = null;

        ExprParser.oper_return oper107 = null;


        Object char_literal106_tree=null;

        try {
            // Expr.g:123:9: ( oper ( '*' oper )? )
            // Expr.g:124:3: oper ( '*' oper )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_oper_in_exprmult866);
            oper105=oper();

            state._fsp--;

            adaptor.addChild(root_0, oper105.getTree());
            // Expr.g:124:7: ( '*' oper )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==64) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // Expr.g:124:9: '*' oper
                    {
                    char_literal106=(Token)match(input,64,FOLLOW_64_in_exprmult869); 
                    char_literal106_tree = (Object)adaptor.create(char_literal106);
                    root_0 = (Object)adaptor.becomeRoot(char_literal106_tree, root_0);

                    pushFollow(FOLLOW_oper_in_exprmult872);
                    oper107=oper();

                    state._fsp--;

                    adaptor.addChild(root_0, oper107.getTree());

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

        Token OPERCONDITION109=null;
        ExprParser.moinsunaire_return moinsunaire108 = null;

        ExprParser.moinsunaire_return moinsunaire110 = null;


        Object OPERCONDITION109_tree=null;

        try {
            // Expr.g:127:5: ( moinsunaire ( OPERCONDITION moinsunaire )* )
            // Expr.g:128:2: moinsunaire ( OPERCONDITION moinsunaire )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_moinsunaire_in_oper885);
            moinsunaire108=moinsunaire();

            state._fsp--;

            adaptor.addChild(root_0, moinsunaire108.getTree());
            // Expr.g:128:14: ( OPERCONDITION moinsunaire )*
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
            	    OPERCONDITION109=(Token)match(input,OPERCONDITION,FOLLOW_OPERCONDITION_in_oper888); 
            	    OPERCONDITION109_tree = (Object)adaptor.create(OPERCONDITION109);
            	    root_0 = (Object)adaptor.becomeRoot(OPERCONDITION109_tree, root_0);

            	    pushFollow(FOLLOW_moinsunaire_in_oper891);
            	    moinsunaire110=moinsunaire();

            	    state._fsp--;

            	    adaptor.addChild(root_0, moinsunaire110.getTree());

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

        Token char_literal111=null;
        ExprParser.atom_return atom112 = null;

        ExprParser.atom_return atom113 = null;


        Object char_literal111_tree=null;
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        try {
            // Expr.g:131:12: ( '-' atom -> ^( OPPOSE atom ) | atom )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==63) ) {
                alt28=1;
            }
            else if ( (LA28_0==ID_OTHERS||(LA28_0>=STRING && LA28_0<=INT)||LA28_0==33) ) {
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
                    char_literal111=(Token)match(input,63,FOLLOW_63_in_moinsunaire904);  
                    stream_63.add(char_literal111);

                    pushFollow(FOLLOW_atom_in_moinsunaire906);
                    atom112=atom();

                    state._fsp--;

                    stream_atom.add(atom112.getTree());


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

                    pushFollow(FOLLOW_atom_in_moinsunaire919);
                    atom113=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom113.getTree());

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
    // Expr.g:135:1: atom : ( ID_OTHERS e -> ^( ID_OTHERS ( e )? ) | STRING | INT | '(' expr ')' );
    public final ExprParser.atom_return atom() throws RecognitionException {
        ExprParser.atom_return retval = new ExprParser.atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID_OTHERS114=null;
        Token STRING116=null;
        Token INT117=null;
        Token char_literal118=null;
        Token char_literal120=null;
        ExprParser.e_return e115 = null;

        ExprParser.expr_return expr119 = null;


        Object ID_OTHERS114_tree=null;
        Object STRING116_tree=null;
        Object INT117_tree=null;
        Object char_literal118_tree=null;
        Object char_literal120_tree=null;
        RewriteRuleTokenStream stream_ID_OTHERS=new RewriteRuleTokenStream(adaptor,"token ID_OTHERS");
        RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e");
        try {
            // Expr.g:135:5: ( ID_OTHERS e -> ^( ID_OTHERS ( e )? ) | STRING | INT | '(' expr ')' )
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
            case INT:
                {
                alt29=3;
                }
                break;
            case 33:
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
                    // Expr.g:136:3: ID_OTHERS e
                    {
                    ID_OTHERS114=(Token)match(input,ID_OTHERS,FOLLOW_ID_OTHERS_in_atom930);  
                    stream_ID_OTHERS.add(ID_OTHERS114);

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
                        // Expr.g:136:19: ^( ID_OTHERS ( e )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_ID_OTHERS.nextNode(), root_1);

                        // Expr.g:136:31: ( e )?
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
                case 2 :
                    // Expr.g:137:4: STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING116=(Token)match(input,STRING,FOLLOW_STRING_in_atom947); 
                    STRING116_tree = (Object)adaptor.create(STRING116);
                    adaptor.addChild(root_0, STRING116_tree);


                    }
                    break;
                case 3 :
                    // Expr.g:138:5: INT
                    {
                    root_0 = (Object)adaptor.nil();

                    INT117=(Token)match(input,INT,FOLLOW_INT_in_atom953); 
                    INT117_tree = (Object)adaptor.create(INT117);
                    adaptor.addChild(root_0, INT117_tree);


                    }
                    break;
                case 4 :
                    // Expr.g:139:4: '(' expr ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal118=(Token)match(input,33,FOLLOW_33_in_atom959); 
                    char_literal118_tree = (Object)adaptor.create(char_literal118);
                    adaptor.addChild(root_0, char_literal118_tree);

                    pushFollow(FOLLOW_expr_in_atom960);
                    expr119=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr119.getTree());
                    char_literal120=(Token)match(input,34,FOLLOW_34_in_atom961); 
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
        return retval;
    }
    // $ANTLR end "atom"

    // Delegated rules


 

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

}