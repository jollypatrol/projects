//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.5-b16-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.07.10 at 05:31:30 PM PDT 
//


package com.google.checkout.schema._2.impl;

public class DefaultTaxRuleImpl implements com.google.checkout.schema._2.DefaultTaxRule, com.sun.xml.bind.JAXBObject, com.google.checkout.schema._2.impl.runtime.UnmarshallableObject, com.google.checkout.schema._2.impl.runtime.XMLSerializable, com.google.checkout.schema._2.impl.runtime.ValidatableObject
{

    protected boolean has_ShippingTaxed;
    protected boolean _ShippingTaxed;
    protected com.google.checkout.schema._2.DefaultTaxRule.TaxAreaType _TaxArea;
    protected boolean has_Rate;
    protected double _Rate;
    public final static java.lang.Class version = (com.google.checkout.schema._2.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (com.google.checkout.schema._2.DefaultTaxRule.class);
    }

    public boolean isShippingTaxed() {
        return _ShippingTaxed;
    }

    public void setShippingTaxed(boolean value) {
        _ShippingTaxed = value;
        has_ShippingTaxed = true;
    }

    public com.google.checkout.schema._2.DefaultTaxRule.TaxAreaType getTaxArea() {
        return _TaxArea;
    }

    public void setTaxArea(com.google.checkout.schema._2.DefaultTaxRule.TaxAreaType value) {
        _TaxArea = value;
    }

    public double getRate() {
        return _Rate;
    }

    public void setRate(double value) {
        _Rate = value;
        has_Rate = true;
    }

    public com.google.checkout.schema._2.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.google.checkout.schema._2.impl.runtime.UnmarshallingContext context) {
        return new com.google.checkout.schema._2.impl.DefaultTaxRuleImpl.Unmarshaller(context);
    }

    public void serializeBody(com.google.checkout.schema._2.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        if (!has_Rate) {
            context.reportError(com.sun.xml.bind.serializer.Util.createMissingObjectError(this, "Rate"));
        }
        context.startElement("http://checkout.google.com/schema/2", "rate");
        context.endNamespaceDecls();
        context.endAttributes();
        try {
            context.text(javax.xml.bind.DatatypeConverter.printDouble(((double) _Rate)), "Rate");
        } catch (java.lang.Exception e) {
            com.google.checkout.schema._2.impl.runtime.Util.handlePrintConversionException(this, e, context);
        }
        context.endElement();
        if (has_ShippingTaxed) {
            context.startElement("http://checkout.google.com/schema/2", "shipping-taxed");
            context.endNamespaceDecls();
            context.endAttributes();
            try {
                context.text(javax.xml.bind.DatatypeConverter.printBoolean(((boolean) _ShippingTaxed)), "ShippingTaxed");
            } catch (java.lang.Exception e) {
                com.google.checkout.schema._2.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endElement();
        }
        context.startElement("http://checkout.google.com/schema/2", "tax-area");
        context.childAsURIs(((com.sun.xml.bind.JAXBObject) _TaxArea), "TaxArea");
        context.endNamespaceDecls();
        context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _TaxArea), "TaxArea");
        context.endAttributes();
        context.childAsBody(((com.sun.xml.bind.JAXBObject) _TaxArea), "TaxArea");
        context.endElement();
    }

    public void serializeAttributes(com.google.checkout.schema._2.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        if (!has_Rate) {
            context.reportError(com.sun.xml.bind.serializer.Util.createMissingObjectError(this, "Rate"));
        }
    }

    public void serializeURIs(com.google.checkout.schema._2.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        if (!has_Rate) {
            context.reportError(com.sun.xml.bind.serializer.Util.createMissingObjectError(this, "Rate"));
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (com.google.checkout.schema._2.DefaultTaxRule.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000!com.sun.msv.grammar.InterleaveExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom."
+"sun.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/g"
+"rammar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expres"
+"sion\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L"
+"\u0000\u000bexpandedExpq\u0000~\u0000\u0002xpppsq\u0000~\u0000\u0000ppsr\u0000\'com.sun.msv.grammar.trex.E"
+"lementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/grammar/"
+"NameClass;xr\u0000\u001ecom.sun.msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aig"
+"noreUndeclaredAttributesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003pp\u0000sr\u0000\u001fcom"
+".sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsr\u0000\u001bcom.sun.m"
+"sv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/D"
+"atatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair"
+";xq\u0000~\u0000\u0003ppsr\u0000#com.sun.msv.datatype.xsd.DoubleType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000x"
+"r\u0000+com.sun.msv.datatype.xsd.FloatingNumberType\u00fc\u00e3\u00b6\u0087\u008c\u00a8|\u00e0\u0002\u0000\u0000xr\u0000"
+"*com.sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%co"
+"m.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.ms"
+"v.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUrit\u0000\u0012Lj"
+"ava/lang/String;L\u0000\btypeNameq\u0000~\u0000\u0016L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv"
+"/datatype/xsd/WhiteSpaceProcessor;xpt\u0000 http://www.w3.org/200"
+"1/XMLSchemat\u0000\u0006doublesr\u00005com.sun.msv.datatype.xsd.WhiteSpaceP"
+"rocessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.Whi"
+"teSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Express"
+"ion$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003ppsr\u0000\u001bcom.sun.msv.util"
+".StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u0016L\u0000\fnamespaceURIq\u0000~\u0000\u0016x"
+"pq\u0000~\u0000\u001aq\u0000~\u0000\u0019sr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000"
+"\u0001ppsr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000"
+"\u0002L\u0000\tnameClassq\u0000~\u0000\bxq\u0000~\u0000\u0003sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005v"
+"aluexp\u0000psq\u0000~\u0000\rppsr\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0013q\u0000~\u0000\u0019t\u0000\u0005QNameq\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000+q\u0000~\u0000\u0019sr\u0000#com.su"
+"n.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u0016L\u0000\f"
+"namespaceURIq\u0000~\u0000\u0016xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0000xpt\u0000\u0004typet\u0000)http://www.w3.org/2001/XMLSchema-instancesr\u00000co"
+"m.sun.msv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000"
+"~\u0000\u0003sq\u0000~\u0000&\u0001q\u0000~\u00003sq\u0000~\u0000-t\u0000\u0004ratet\u0000#http://checkout.google.com/sc"
+"hema/2sq\u0000~\u0000\"ppsq\u0000~\u0000\u0007q\u0000~\u0000\'p\u0000sq\u0000~\u0000\u000bppsq\u0000~\u0000\rppsr\u0000$com.sun.msv.d"
+"atatype.xsd.BooleanType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0013q\u0000~\u0000\u0019t\u0000\u0007booleanq\u0000~\u0000\u001d"
+"q\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000>q\u0000~\u0000\u0019sq\u0000~\u0000\"ppsq\u0000~\u0000$q\u0000~\u0000\'pq\u0000~\u0000(q\u0000~\u0000/q\u0000~\u00003sq\u0000~"
+"\u0000-t\u0000\u000eshipping-taxedq\u0000~\u00007q\u0000~\u00003sq\u0000~\u0000\u0007pp\u0000sq\u0000~\u0000\u000bppsq\u0000~\u0000\u0007pp\u0000sq\u0000~\u0000"
+"\"ppsr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.su"
+"n.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003q\u0000~\u0000\'psq\u0000~"
+"\u0000$q\u0000~\u0000\'psr\u00002com.sun.msv.grammar.Expression$AnyStringExpressi"
+"on\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u00004q\u0000~\u0000Msr\u0000 com.sun.msv.grammar.AnyName"
+"Class\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000.q\u0000~\u00003sq\u0000~\u0000-t\u00008com.google.checkout.sche"
+"ma._2.DefaultTaxRule.TaxAreaTypet\u0000+http://java.sun.com/jaxb/"
+"xjc/dummy-elementssq\u0000~\u0000\"ppsq\u0000~\u0000$q\u0000~\u0000\'pq\u0000~\u0000(q\u0000~\u0000/q\u0000~\u00003sq\u0000~\u0000-t"
+"\u0000\btax-areaq\u0000~\u00007sr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$Closed"
+"Hash;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N"
+"\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/gram"
+"mar/ExpressionPool;xp\u0000\u0000\u0000\u000b\u0001pq\u0000~\u0000Eq\u0000~\u0000\fq\u0000~\u00008q\u0000~\u0000\u0005q\u0000~\u0000#q\u0000~\u0000@q\u0000~"
+"\u0000Sq\u0000~\u0000Jq\u0000~\u0000Gq\u0000~\u0000\u0006q\u0000~\u0000:x"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public static class TaxAreaTypeImpl implements com.google.checkout.schema._2.DefaultTaxRule.TaxAreaType, com.sun.xml.bind.JAXBObject, com.google.checkout.schema._2.impl.runtime.UnmarshallableObject, com.google.checkout.schema._2.impl.runtime.XMLSerializable, com.google.checkout.schema._2.impl.runtime.ValidatableObject
    {

        protected com.google.checkout.schema._2.USZipArea _UsZipArea;
        protected com.google.checkout.schema._2.USCountryArea _UsCountryArea;
        protected com.google.checkout.schema._2.USStateArea _UsStateArea;
        public final static java.lang.Class version = (com.google.checkout.schema._2.impl.JAXBVersion.class);
        private static com.sun.msv.grammar.Grammar schemaFragment;

        private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
            return (com.google.checkout.schema._2.DefaultTaxRule.TaxAreaType.class);
        }

        public com.google.checkout.schema._2.USZipArea getUsZipArea() {
            return _UsZipArea;
        }

        public void setUsZipArea(com.google.checkout.schema._2.USZipArea value) {
            _UsZipArea = value;
        }

        public com.google.checkout.schema._2.USCountryArea getUsCountryArea() {
            return _UsCountryArea;
        }

        public void setUsCountryArea(com.google.checkout.schema._2.USCountryArea value) {
            _UsCountryArea = value;
        }

        public com.google.checkout.schema._2.USStateArea getUsStateArea() {
            return _UsStateArea;
        }

        public void setUsStateArea(com.google.checkout.schema._2.USStateArea value) {
            _UsStateArea = value;
        }

        public com.google.checkout.schema._2.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.google.checkout.schema._2.impl.runtime.UnmarshallingContext context) {
            return new com.google.checkout.schema._2.impl.DefaultTaxRuleImpl.TaxAreaTypeImpl.Unmarshaller(context);
        }

        public void serializeBody(com.google.checkout.schema._2.impl.runtime.XMLSerializer context)
            throws org.xml.sax.SAXException
        {
            if (((_UsStateArea!= null)&&(_UsCountryArea == null))&&(_UsZipArea == null)) {
                context.startElement("http://checkout.google.com/schema/2", "us-state-area");
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _UsStateArea), "UsStateArea");
                context.endNamespaceDecls();
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _UsStateArea), "UsStateArea");
                context.endAttributes();
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _UsStateArea), "UsStateArea");
                context.endElement();
            } else {
                if (((_UsStateArea == null)&&(_UsCountryArea == null))&&(_UsZipArea!= null)) {
                    context.startElement("http://checkout.google.com/schema/2", "us-zip-area");
                    context.childAsURIs(((com.sun.xml.bind.JAXBObject) _UsZipArea), "UsZipArea");
                    context.endNamespaceDecls();
                    context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _UsZipArea), "UsZipArea");
                    context.endAttributes();
                    context.childAsBody(((com.sun.xml.bind.JAXBObject) _UsZipArea), "UsZipArea");
                    context.endElement();
                } else {
                    if (((_UsStateArea == null)&&(_UsCountryArea!= null))&&(_UsZipArea == null)) {
                        context.startElement("http://checkout.google.com/schema/2", "us-country-area");
                        context.childAsURIs(((com.sun.xml.bind.JAXBObject) _UsCountryArea), "UsCountryArea");
                        context.endNamespaceDecls();
                        context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _UsCountryArea), "UsCountryArea");
                        context.endAttributes();
                        context.childAsBody(((com.sun.xml.bind.JAXBObject) _UsCountryArea), "UsCountryArea");
                        context.endElement();
                    }
                }
            }
        }

        public void serializeAttributes(com.google.checkout.schema._2.impl.runtime.XMLSerializer context)
            throws org.xml.sax.SAXException
        {
        }

        public void serializeURIs(com.google.checkout.schema._2.impl.runtime.XMLSerializer context)
            throws org.xml.sax.SAXException
        {
        }

        public java.lang.Class getPrimaryInterface() {
            return (com.google.checkout.schema._2.DefaultTaxRule.TaxAreaType.class);
        }

        public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
            if (schemaFragment == null) {
                schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gramm"
+"ar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expression"
+"\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bex"
+"pandedExpq\u0000~\u0000\u0002xpppsq\u0000~\u0000\u0000ppsr\u0000\'com.sun.msv.grammar.trex.Eleme"
+"ntPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/grammar/Name"
+"Class;xr\u0000\u001ecom.sun.msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignore"
+"UndeclaredAttributesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003pp\u0000sr\u0000\u001fcom.sun"
+".msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsq\u0000~\u0000\u0007pp\u0000sq\u0000~\u0000\u0000pp"
+"sr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.m"
+"sv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003sr\u0000\u0011java.lang"
+".Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000 com.sun.msv.grammar.Attri"
+"buteExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\bxq\u0000~\u0000\u0003q\u0000~\u0000\u0013psr"
+"\u00002com.sun.msv.grammar.Expression$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001"
+"\u0002\u0000\u0000xq\u0000~\u0000\u0003sq\u0000~\u0000\u0012\u0001q\u0000~\u0000\u0017sr\u0000 com.sun.msv.grammar.AnyNameClass\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000co"
+"m.sun.msv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000"
+"~\u0000\u0003q\u0000~\u0000\u0018q\u0000~\u0000\u001dsr\u0000#com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001"
+"\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000\u001fxq\u0000~"
+"\u0000\u001at\u0000)com.google.checkout.schema._2.USStateAreat\u0000+http://java"
+".sun.com/jaxb/xjc/dummy-elementssq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0014q\u0000~\u0000\u0013psr\u0000\u001bcom."
+"sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datat"
+"ype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/Strin"
+"gPair;xq\u0000~\u0000\u0003ppsr\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001"
+"\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000"
+"xr\u0000%com.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com."
+"sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUr"
+"iq\u0000~\u0000\u001fL\u0000\btypeNameq\u0000~\u0000\u001fL\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/"
+"xsd/WhiteSpaceProcessor;xpt\u0000 http://www.w3.org/2001/XMLSchem"
+"at\u0000\u0005QNamesr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcessor$Co"
+"llapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpaceProc"
+"essor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$NullSet"
+"Expression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003ppsr\u0000\u001bcom.sun.msv.util.StringPair"
+"\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u001fL\u0000\fnamespaceURIq\u0000~\u0000\u001fxpq\u0000~\u00000q\u0000~\u0000/"
+"sq\u0000~\u0000\u001et\u0000\u0004typet\u0000)http://www.w3.org/2001/XMLSchema-instanceq\u0000~"
+"\u0000\u001dsq\u0000~\u0000\u001et\u0000\rus-state-areat\u0000#http://checkout.google.com/schema"
+"/2sq\u0000~\u0000\u0007pp\u0000sq\u0000~\u0000\u000bppsq\u0000~\u0000\u0007pp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u000fq\u0000~\u0000\u0013psq\u0000~\u0000\u0014q\u0000~\u0000\u0013p"
+"q\u0000~\u0000\u0017q\u0000~\u0000\u001bq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u0000\'com.google.checkout.schema._2.USZipA"
+"reaq\u0000~\u0000\"sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0014q\u0000~\u0000\u0013pq\u0000~\u0000(q\u0000~\u00008q\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u0000\u000bus-zip-a"
+"reaq\u0000~\u0000=sq\u0000~\u0000\u0007pp\u0000sq\u0000~\u0000\u000bppsq\u0000~\u0000\u0007pp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u000fq\u0000~\u0000\u0013psq\u0000~\u0000\u0014"
+"q\u0000~\u0000\u0013pq\u0000~\u0000\u0017q\u0000~\u0000\u001bq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u0000+com.google.checkout.schema._2."
+"USCountryAreaq\u0000~\u0000\"sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0014q\u0000~\u0000\u0013pq\u0000~\u0000(q\u0000~\u00008q\u0000~\u0000\u001dsq\u0000~\u0000\u001et"
+"\u0000\u000fus-country-areaq\u0000~\u0000=sr\u0000\"com.sun.msv.grammar.ExpressionPool"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool"
+"$ClosedHash;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedH"
+"ash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$Lcom/sun/m"
+"sv/grammar/ExpressionPool;xp\u0000\u0000\u0000\u000e\u0001pq\u0000~\u0000\fq\u0000~\u0000?q\u0000~\u0000Kq\u0000~\u0000\u0005q\u0000~\u0000#q"
+"\u0000~\u0000Fq\u0000~\u0000Rq\u0000~\u0000\u0011q\u0000~\u0000Bq\u0000~\u0000Nq\u0000~\u0000\u000eq\u0000~\u0000Aq\u0000~\u0000Mq\u0000~\u0000\u0006x"));
            }
            return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
        }

        public class Unmarshaller
            extends com.google.checkout.schema._2.impl.runtime.AbstractUnmarshallingEventHandlerImpl
        {


            public Unmarshaller(com.google.checkout.schema._2.impl.runtime.UnmarshallingContext context) {
                super(context, "--------");
            }

            protected Unmarshaller(com.google.checkout.schema._2.impl.runtime.UnmarshallingContext context, int startState) {
                this(context);
                state = startState;
            }

            public java.lang.Object owner() {
                return com.google.checkout.schema._2.impl.DefaultTaxRuleImpl.TaxAreaTypeImpl.this;
            }

            public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
                throws org.xml.sax.SAXException
            {
                int attIdx;
                outer:
                while (true) {
                    switch (state) {
                        case  0 :
                            if (("us-state-area" == ___local)&&("http://checkout.google.com/schema/2" == ___uri)) {
                                context.pushAttributes(__atts, false);
                                state = 6;
                                return ;
                            }
                            if (("us-zip-area" == ___local)&&("http://checkout.google.com/schema/2" == ___uri)) {
                                context.pushAttributes(__atts, false);
                                state = 1;
                                return ;
                            }
                            if (("us-country-area" == ___local)&&("http://checkout.google.com/schema/2" == ___uri)) {
                                context.pushAttributes(__atts, false);
                                state = 4;
                                return ;
                            }
                            break;
                        case  1 :
                            if (("zip-pattern" == ___local)&&("http://checkout.google.com/schema/2" == ___uri)) {
                                _UsZipArea = ((com.google.checkout.schema._2.impl.USZipAreaImpl) spawnChildFromEnterElement((com.google.checkout.schema._2.impl.USZipAreaImpl.class), 2, ___uri, ___local, ___qname, __atts));
                                return ;
                            }
                            break;
                        case  6 :
                            if (("state" == ___local)&&("http://checkout.google.com/schema/2" == ___uri)) {
                                _UsStateArea = ((com.google.checkout.schema._2.impl.USStateAreaImpl) spawnChildFromEnterElement((com.google.checkout.schema._2.impl.USStateAreaImpl.class), 7, ___uri, ___local, ___qname, __atts));
                                return ;
                            }
                            break;
                        case  3 :
                            revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        case  4 :
                            attIdx = context.getAttribute("", "country-area");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                                return ;
                            }
                            break;
                    }
                    super.enterElement(___uri, ___local, ___qname, __atts);
                    break;
                }
            }

            public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
                throws org.xml.sax.SAXException
            {
                int attIdx;
                outer:
                while (true) {
                    switch (state) {
                        case  7 :
                            if (("us-state-area" == ___local)&&("http://checkout.google.com/schema/2" == ___uri)) {
                                context.popAttributes();
                                state = 3;
                                return ;
                            }
                            break;
                        case  2 :
                            if (("us-zip-area" == ___local)&&("http://checkout.google.com/schema/2" == ___uri)) {
                                context.popAttributes();
                                state = 3;
                                return ;
                            }
                            break;
                        case  3 :
                            revertToParentFromLeaveElement(___uri, ___local, ___qname);
                            return ;
                        case  5 :
                            if (("us-country-area" == ___local)&&("http://checkout.google.com/schema/2" == ___uri)) {
                                context.popAttributes();
                                state = 3;
                                return ;
                            }
                            break;
                        case  4 :
                            attIdx = context.getAttribute("", "country-area");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                                return ;
                            }
                            break;
                    }
                    super.leaveElement(___uri, ___local, ___qname);
                    break;
                }
            }

            public void enterAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
                throws org.xml.sax.SAXException
            {
                int attIdx;
                outer:
                while (true) {
                    switch (state) {
                        case  3 :
                            revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                            return ;
                        case  4 :
                            if (("country-area" == ___local)&&("" == ___uri)) {
                                _UsCountryArea = ((com.google.checkout.schema._2.impl.USCountryAreaImpl) spawnChildFromEnterAttribute((com.google.checkout.schema._2.impl.USCountryAreaImpl.class), 5, ___uri, ___local, ___qname));
                                return ;
                            }
                            break;
                    }
                    super.enterAttribute(___uri, ___local, ___qname);
                    break;
                }
            }

            public void leaveAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
                throws org.xml.sax.SAXException
            {
                int attIdx;
                outer:
                while (true) {
                    switch (state) {
                        case  3 :
                            revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                            return ;
                        case  4 :
                            attIdx = context.getAttribute("", "country-area");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                                return ;
                            }
                            break;
                    }
                    super.leaveAttribute(___uri, ___local, ___qname);
                    break;
                }
            }

            public void handleText(final java.lang.String value)
                throws org.xml.sax.SAXException
            {
                int attIdx;
                outer:
                while (true) {
                    try {
                        switch (state) {
                            case  3 :
                                revertToParentFromText(value);
                                return ;
                            case  4 :
                                attIdx = context.getAttribute("", "country-area");
                                if (attIdx >= 0) {
                                    context.consumeAttribute(attIdx);
                                    context.getCurrentHandler().text(value);
                                    return ;
                                }
                                break;
                        }
                    } catch (java.lang.RuntimeException e) {
                        handleUnexpectedTextException(value, e);
                    }
                    break;
                }
            }

        }

    }

    public class Unmarshaller
        extends com.google.checkout.schema._2.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(com.google.checkout.schema._2.impl.runtime.UnmarshallingContext context) {
            super(context, "-------");
        }

        protected Unmarshaller(com.google.checkout.schema._2.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return com.google.checkout.schema._2.impl.DefaultTaxRuleImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  5 :
                        if (("us-state-area" == ___local)&&("http://checkout.google.com/schema/2" == ___uri)) {
                            _TaxArea = ((com.google.checkout.schema._2.impl.DefaultTaxRuleImpl.TaxAreaTypeImpl) spawnChildFromEnterElement((com.google.checkout.schema._2.impl.DefaultTaxRuleImpl.TaxAreaTypeImpl.class), 6, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("us-zip-area" == ___local)&&("http://checkout.google.com/schema/2" == ___uri)) {
                            _TaxArea = ((com.google.checkout.schema._2.impl.DefaultTaxRuleImpl.TaxAreaTypeImpl) spawnChildFromEnterElement((com.google.checkout.schema._2.impl.DefaultTaxRuleImpl.TaxAreaTypeImpl.class), 6, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("us-country-area" == ___local)&&("http://checkout.google.com/schema/2" == ___uri)) {
                            _TaxArea = ((com.google.checkout.schema._2.impl.DefaultTaxRuleImpl.TaxAreaTypeImpl) spawnChildFromEnterElement((com.google.checkout.schema._2.impl.DefaultTaxRuleImpl.TaxAreaTypeImpl.class), 6, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        break;
                    case  0 :
                        if (("tax-area" == ___local)&&("http://checkout.google.com/schema/2" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 5;
                            return ;
                        }
                        if (("shipping-taxed" == ___local)&&("http://checkout.google.com/schema/2" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 1;
                            return ;
                        }
                        if (("rate" == ___local)&&("http://checkout.google.com/schema/2" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 3;
                            return ;
                        }
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  2 :
                        if (("shipping-taxed" == ___local)&&("http://checkout.google.com/schema/2" == ___uri)) {
                            context.popAttributes();
                            state = 0;
                            return ;
                        }
                        break;
                    case  4 :
                        if (("rate" == ___local)&&("http://checkout.google.com/schema/2" == ___uri)) {
                            context.popAttributes();
                            state = 0;
                            return ;
                        }
                        break;
                    case  6 :
                        if (("tax-area" == ___local)&&("http://checkout.google.com/schema/2" == ___uri)) {
                            context.popAttributes();
                            state = 0;
                            return ;
                        }
                        break;
                    case  0 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                }
                super.leaveElement(___uri, ___local, ___qname);
                break;
            }
        }

        public void enterAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  0 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                }
                super.enterAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void leaveAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  0 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                }
                super.leaveAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void handleText(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                try {
                    switch (state) {
                        case  3 :
                            state = 4;
                            eatText1(value);
                            return ;
                        case  1 :
                            state = 2;
                            eatText2(value);
                            return ;
                        case  0 :
                            revertToParentFromText(value);
                            return ;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

        private void eatText1(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Rate = javax.xml.bind.DatatypeConverter.parseDouble(com.sun.xml.bind.WhiteSpaceProcessor.collapse(value));
                has_Rate = true;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText2(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _ShippingTaxed = javax.xml.bind.DatatypeConverter.parseBoolean(com.sun.xml.bind.WhiteSpaceProcessor.collapse(value));
                has_ShippingTaxed = true;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

    }

}