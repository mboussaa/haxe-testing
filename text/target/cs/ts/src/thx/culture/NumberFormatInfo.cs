// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx.culture {
	public class NumberFormatInfo : global::haxe.lang.HxObject {
		
		static NumberFormatInfo() {
			unchecked {
				global::thx.culture.NumberFormatInfo.invariant = new global::thx.culture.NumberFormatInfo(2, 2, 2, new global::Array<int>(new int[]{3}), new global::Array<int>(new int[]{3}), new global::Array<int>(new int[]{3}), 0, 1, 0, 0, 0, ".", ".", ".", ",", ",", ",", "-", "+", "\u00a4", "NaN", "-Infinity", "%", "\u2030", "Infinity");
			}
		}
		
		
		public NumberFormatInfo(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public NumberFormatInfo(int decimalDigitsCurrency, int decimalDigitsNumber, int decimalDigitsPercent, global::Array<int> groupSizesCurrency, global::Array<int> groupSizesNumber, global::Array<int> groupSizesPercent, int patternNegativeCurrency, int patternNegativeNumber, int patternNegativePercent, int patternPositiveCurrency, int patternPositivePercent, string separatorDecimalCurrency, string separatorDecimalNumber, string separatorDecimalPercent, string separatorGroupCurrency, string separatorGroupNumber, string separatorGroupPercent, string signNegative, string signPositive, string symbolCurrency, string symbolNaN, string symbolNegativeInfinity, string symbolPercent, string symbolPermille, string symbolPositiveInfinity) {
			global::thx.culture.NumberFormatInfo.__hx_ctor_thx_culture_NumberFormatInfo(this, decimalDigitsCurrency, decimalDigitsNumber, decimalDigitsPercent, groupSizesCurrency, groupSizesNumber, groupSizesPercent, patternNegativeCurrency, patternNegativeNumber, patternNegativePercent, patternPositiveCurrency, patternPositivePercent, separatorDecimalCurrency, separatorDecimalNumber, separatorDecimalPercent, separatorGroupCurrency, separatorGroupNumber, separatorGroupPercent, signNegative, signPositive, symbolCurrency, symbolNaN, symbolNegativeInfinity, symbolPercent, symbolPermille, symbolPositiveInfinity);
		}
		
		
		public static void __hx_ctor_thx_culture_NumberFormatInfo(global::thx.culture.NumberFormatInfo __temp_me154, int decimalDigitsCurrency, int decimalDigitsNumber, int decimalDigitsPercent, global::Array<int> groupSizesCurrency, global::Array<int> groupSizesNumber, global::Array<int> groupSizesPercent, int patternNegativeCurrency, int patternNegativeNumber, int patternNegativePercent, int patternPositiveCurrency, int patternPositivePercent, string separatorDecimalCurrency, string separatorDecimalNumber, string separatorDecimalPercent, string separatorGroupCurrency, string separatorGroupNumber, string separatorGroupPercent, string signNegative, string signPositive, string symbolCurrency, string symbolNaN, string symbolNegativeInfinity, string symbolPercent, string symbolPermille, string symbolPositiveInfinity) {
			__temp_me154.decimalDigitsCurrency = decimalDigitsCurrency;
			__temp_me154.decimalDigitsNumber = decimalDigitsNumber;
			__temp_me154.decimalDigitsPercent = decimalDigitsPercent;
			__temp_me154.groupSizesCurrency = groupSizesCurrency;
			__temp_me154.groupSizesNumber = groupSizesNumber;
			__temp_me154.groupSizesPercent = groupSizesPercent;
			__temp_me154.patternNegativeCurrency = patternNegativeCurrency;
			__temp_me154.patternNegativeNumber = patternNegativeNumber;
			__temp_me154.patternNegativePercent = patternNegativePercent;
			__temp_me154.patternPositiveCurrency = patternPositiveCurrency;
			__temp_me154.patternPositivePercent = patternPositivePercent;
			__temp_me154.separatorDecimalCurrency = separatorDecimalCurrency;
			__temp_me154.separatorDecimalNumber = separatorDecimalNumber;
			__temp_me154.separatorDecimalPercent = separatorDecimalPercent;
			__temp_me154.separatorGroupCurrency = separatorGroupCurrency;
			__temp_me154.separatorGroupNumber = separatorGroupNumber;
			__temp_me154.separatorGroupPercent = separatorGroupPercent;
			__temp_me154.signNegative = signNegative;
			__temp_me154.signPositive = signPositive;
			__temp_me154.symbolCurrency = symbolCurrency;
			__temp_me154.symbolNaN = symbolNaN;
			__temp_me154.symbolNegativeInfinity = symbolNegativeInfinity;
			__temp_me154.symbolPercent = symbolPercent;
			__temp_me154.symbolPermille = symbolPermille;
			__temp_me154.symbolPositiveInfinity = symbolPositiveInfinity;
		}
		
		
		public static global::thx.culture.NumberFormatInfo invariant;
		
		public static global::thx.culture.NumberFormatInfo fromObject(object o) {
			return new global::thx.culture.NumberFormatInfo(((int) (global::haxe.lang.Runtime.toInt(global::haxe.lang.Runtime.getField(o, "decimalDigitsCurrency", 1531979784, true))) ), ((int) (global::haxe.lang.Runtime.toInt(global::haxe.lang.Runtime.getField(o, "decimalDigitsNumber", 1437940672, true))) ), ((int) (global::haxe.lang.Runtime.toInt(global::haxe.lang.Runtime.getField(o, "decimalDigitsPercent", 2013154798, true))) ), ((global::Array<int>) (global::Array<object>.__hx_cast<int>(((global::Array) (global::haxe.lang.Runtime.getField(o, "groupSizesCurrency", 1798631236, true)) ))) ), ((global::Array<int>) (global::Array<object>.__hx_cast<int>(((global::Array) (global::haxe.lang.Runtime.getField(o, "groupSizesNumber", 1293712380, true)) ))) ), ((global::Array<int>) (global::Array<object>.__hx_cast<int>(((global::Array) (global::haxe.lang.Runtime.getField(o, "groupSizesPercent", 2062500402, true)) ))) ), ((int) (global::haxe.lang.Runtime.toInt(global::haxe.lang.Runtime.getField(o, "patternNegativeCurrency", 45312342, true))) ), ((int) (global::haxe.lang.Runtime.toInt(global::haxe.lang.Runtime.getField(o, "patternNegativeNumber", 1747840398, true))) ), ((int) (global::haxe.lang.Runtime.toInt(global::haxe.lang.Runtime.getField(o, "patternNegativePercent", 253833312, true))) ), ((int) (global::haxe.lang.Runtime.toInt(global::haxe.lang.Runtime.getField(o, "patternPositiveCurrency", 822857114, true))) ), ((int) (global::haxe.lang.Runtime.toInt(global::haxe.lang.Runtime.getField(o, "patternPositivePercent", 652148892, true))) ), global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(o, "separatorDecimalCurrency", 2058605085, true)), global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(o, "separatorDecimalNumber", 1660995221, true)), global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(o, "separatorDecimalPercent", 214711673, true)), global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(o, "separatorGroupCurrency", 2037785099, true)), global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(o, "separatorGroupNumber", 193568515, true)), global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(o, "separatorGroupPercent", 1543554379, true)), global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(o, "signNegative", 282949586, true)), global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(o, "signPositive", 177600534, true)), global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(o, "symbolCurrency", 311921353, true)), global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(o, "symbolNaN", 1610611779, true)), global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(o, "symbolNegativeInfinity", 1484698101, true)), global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(o, "symbolPercent", 1112096333, true)), global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(o, "symbolPermille", 41050500, true)), global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(o, "symbolPositiveInfinity", 114759225, true)));
		}
		
		
		public static new object __hx_createEmpty() {
			return new global::thx.culture.NumberFormatInfo(global::haxe.lang.EmptyObject.EMPTY);
		}
		
		
		public static new object __hx_create(global::Array arr) {
			unchecked {
				return new global::thx.culture.NumberFormatInfo(((int) (global::haxe.lang.Runtime.toInt(arr[0])) ), ((int) (global::haxe.lang.Runtime.toInt(arr[1])) ), ((int) (global::haxe.lang.Runtime.toInt(arr[2])) ), ((global::Array<int>) (global::Array<object>.__hx_cast<int>(((global::Array) (arr[3]) ))) ), ((global::Array<int>) (global::Array<object>.__hx_cast<int>(((global::Array) (arr[4]) ))) ), ((global::Array<int>) (global::Array<object>.__hx_cast<int>(((global::Array) (arr[5]) ))) ), ((int) (global::haxe.lang.Runtime.toInt(arr[6])) ), ((int) (global::haxe.lang.Runtime.toInt(arr[7])) ), ((int) (global::haxe.lang.Runtime.toInt(arr[8])) ), ((int) (global::haxe.lang.Runtime.toInt(arr[9])) ), ((int) (global::haxe.lang.Runtime.toInt(arr[10])) ), global::haxe.lang.Runtime.toString(arr[11]), global::haxe.lang.Runtime.toString(arr[12]), global::haxe.lang.Runtime.toString(arr[13]), global::haxe.lang.Runtime.toString(arr[14]), global::haxe.lang.Runtime.toString(arr[15]), global::haxe.lang.Runtime.toString(arr[16]), global::haxe.lang.Runtime.toString(arr[17]), global::haxe.lang.Runtime.toString(arr[18]), global::haxe.lang.Runtime.toString(arr[19]), global::haxe.lang.Runtime.toString(arr[20]), global::haxe.lang.Runtime.toString(arr[21]), global::haxe.lang.Runtime.toString(arr[22]), global::haxe.lang.Runtime.toString(arr[23]), global::haxe.lang.Runtime.toString(arr[24]));
			}
		}
		
		
		public int decimalDigitsCurrency;
		
		public int decimalDigitsNumber;
		
		public int decimalDigitsPercent;
		
		public global::Array<int> groupSizesCurrency;
		
		public global::Array<int> groupSizesNumber;
		
		public global::Array<int> groupSizesPercent;
		
		public int patternNegativeCurrency;
		
		public int patternNegativeNumber;
		
		public int patternNegativePercent;
		
		public int patternPositiveCurrency;
		
		public int patternPositivePercent;
		
		public string separatorDecimalCurrency;
		
		public string separatorDecimalNumber;
		
		public string separatorDecimalPercent;
		
		public string separatorGroupCurrency;
		
		public string separatorGroupNumber;
		
		public string separatorGroupPercent;
		
		public string signNegative;
		
		public string signPositive;
		
		public string symbolCurrency;
		
		public string symbolNaN;
		
		public string symbolNegativeInfinity;
		
		public string symbolPercent;
		
		public string symbolPermille;
		
		public string symbolPositiveInfinity;
		
		public virtual object toObject() {
			return new global::haxe.lang.DynamicObject(new int[]{41050500, 114759225, 177600534, 193568515, 214711673, 282949586, 311921353, 1112096333, 1293712380, 1484698101, 1543554379, 1610611779, 1660995221, 1798631236, 2037785099, 2058605085, 2062500402}, new object[]{this.symbolPermille, this.symbolPositiveInfinity, this.signPositive, this.separatorGroupNumber, this.separatorDecimalPercent, this.signNegative, this.symbolCurrency, this.symbolPercent, this.groupSizesNumber, this.symbolNegativeInfinity, this.separatorGroupPercent, this.symbolNaN, this.separatorDecimalNumber, this.groupSizesCurrency, this.separatorGroupCurrency, this.separatorDecimalCurrency, this.groupSizesPercent}, new int[]{45312342, 253833312, 652148892, 822857114, 1437940672, 1531979784, 1747840398, 2013154798}, new double[]{((double) (this.patternNegativeCurrency) ), ((double) (this.patternNegativePercent) ), ((double) (this.patternPositivePercent) ), ((double) (this.patternPositiveCurrency) ), ((double) (this.decimalDigitsNumber) ), ((double) (this.decimalDigitsCurrency) ), ((double) (this.patternNegativeNumber) ), ((double) (this.decimalDigitsPercent) )});
		}
		
		
		public override double __hx_setField_f(string field, int hash, double @value, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 652148892:
					{
						this.patternPositivePercent = ((int) (@value) );
						return @value;
					}
					
					
					case 822857114:
					{
						this.patternPositiveCurrency = ((int) (@value) );
						return @value;
					}
					
					
					case 253833312:
					{
						this.patternNegativePercent = ((int) (@value) );
						return @value;
					}
					
					
					case 1747840398:
					{
						this.patternNegativeNumber = ((int) (@value) );
						return @value;
					}
					
					
					case 45312342:
					{
						this.patternNegativeCurrency = ((int) (@value) );
						return @value;
					}
					
					
					case 2013154798:
					{
						this.decimalDigitsPercent = ((int) (@value) );
						return @value;
					}
					
					
					case 1437940672:
					{
						this.decimalDigitsNumber = ((int) (@value) );
						return @value;
					}
					
					
					case 1531979784:
					{
						this.decimalDigitsCurrency = ((int) (@value) );
						return @value;
					}
					
					
					default:
					{
						return base.__hx_setField_f(field, hash, @value, handleProperties);
					}
					
				}
				
			}
		}
		
		
		public override object __hx_setField(string field, int hash, object @value, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 114759225:
					{
						this.symbolPositiveInfinity = global::haxe.lang.Runtime.toString(@value);
						return @value;
					}
					
					
					case 41050500:
					{
						this.symbolPermille = global::haxe.lang.Runtime.toString(@value);
						return @value;
					}
					
					
					case 1112096333:
					{
						this.symbolPercent = global::haxe.lang.Runtime.toString(@value);
						return @value;
					}
					
					
					case 1484698101:
					{
						this.symbolNegativeInfinity = global::haxe.lang.Runtime.toString(@value);
						return @value;
					}
					
					
					case 1610611779:
					{
						this.symbolNaN = global::haxe.lang.Runtime.toString(@value);
						return @value;
					}
					
					
					case 311921353:
					{
						this.symbolCurrency = global::haxe.lang.Runtime.toString(@value);
						return @value;
					}
					
					
					case 177600534:
					{
						this.signPositive = global::haxe.lang.Runtime.toString(@value);
						return @value;
					}
					
					
					case 282949586:
					{
						this.signNegative = global::haxe.lang.Runtime.toString(@value);
						return @value;
					}
					
					
					case 1543554379:
					{
						this.separatorGroupPercent = global::haxe.lang.Runtime.toString(@value);
						return @value;
					}
					
					
					case 193568515:
					{
						this.separatorGroupNumber = global::haxe.lang.Runtime.toString(@value);
						return @value;
					}
					
					
					case 2037785099:
					{
						this.separatorGroupCurrency = global::haxe.lang.Runtime.toString(@value);
						return @value;
					}
					
					
					case 214711673:
					{
						this.separatorDecimalPercent = global::haxe.lang.Runtime.toString(@value);
						return @value;
					}
					
					
					case 1660995221:
					{
						this.separatorDecimalNumber = global::haxe.lang.Runtime.toString(@value);
						return @value;
					}
					
					
					case 2058605085:
					{
						this.separatorDecimalCurrency = global::haxe.lang.Runtime.toString(@value);
						return @value;
					}
					
					
					case 652148892:
					{
						this.patternPositivePercent = ((int) (global::haxe.lang.Runtime.toInt(@value)) );
						return @value;
					}
					
					
					case 822857114:
					{
						this.patternPositiveCurrency = ((int) (global::haxe.lang.Runtime.toInt(@value)) );
						return @value;
					}
					
					
					case 253833312:
					{
						this.patternNegativePercent = ((int) (global::haxe.lang.Runtime.toInt(@value)) );
						return @value;
					}
					
					
					case 1747840398:
					{
						this.patternNegativeNumber = ((int) (global::haxe.lang.Runtime.toInt(@value)) );
						return @value;
					}
					
					
					case 45312342:
					{
						this.patternNegativeCurrency = ((int) (global::haxe.lang.Runtime.toInt(@value)) );
						return @value;
					}
					
					
					case 2062500402:
					{
						this.groupSizesPercent = ((global::Array<int>) (global::Array<object>.__hx_cast<int>(((global::Array) (@value) ))) );
						return @value;
					}
					
					
					case 1293712380:
					{
						this.groupSizesNumber = ((global::Array<int>) (global::Array<object>.__hx_cast<int>(((global::Array) (@value) ))) );
						return @value;
					}
					
					
					case 1798631236:
					{
						this.groupSizesCurrency = ((global::Array<int>) (global::Array<object>.__hx_cast<int>(((global::Array) (@value) ))) );
						return @value;
					}
					
					
					case 2013154798:
					{
						this.decimalDigitsPercent = ((int) (global::haxe.lang.Runtime.toInt(@value)) );
						return @value;
					}
					
					
					case 1437940672:
					{
						this.decimalDigitsNumber = ((int) (global::haxe.lang.Runtime.toInt(@value)) );
						return @value;
					}
					
					
					case 1531979784:
					{
						this.decimalDigitsCurrency = ((int) (global::haxe.lang.Runtime.toInt(@value)) );
						return @value;
					}
					
					
					default:
					{
						return base.__hx_setField(field, hash, @value, handleProperties);
					}
					
				}
				
			}
		}
		
		
		public override object __hx_getField(string field, int hash, bool throwErrors, bool isCheck, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 1014900378:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "toObject", 1014900378)) );
					}
					
					
					case 114759225:
					{
						return this.symbolPositiveInfinity;
					}
					
					
					case 41050500:
					{
						return this.symbolPermille;
					}
					
					
					case 1112096333:
					{
						return this.symbolPercent;
					}
					
					
					case 1484698101:
					{
						return this.symbolNegativeInfinity;
					}
					
					
					case 1610611779:
					{
						return this.symbolNaN;
					}
					
					
					case 311921353:
					{
						return this.symbolCurrency;
					}
					
					
					case 177600534:
					{
						return this.signPositive;
					}
					
					
					case 282949586:
					{
						return this.signNegative;
					}
					
					
					case 1543554379:
					{
						return this.separatorGroupPercent;
					}
					
					
					case 193568515:
					{
						return this.separatorGroupNumber;
					}
					
					
					case 2037785099:
					{
						return this.separatorGroupCurrency;
					}
					
					
					case 214711673:
					{
						return this.separatorDecimalPercent;
					}
					
					
					case 1660995221:
					{
						return this.separatorDecimalNumber;
					}
					
					
					case 2058605085:
					{
						return this.separatorDecimalCurrency;
					}
					
					
					case 652148892:
					{
						return this.patternPositivePercent;
					}
					
					
					case 822857114:
					{
						return this.patternPositiveCurrency;
					}
					
					
					case 253833312:
					{
						return this.patternNegativePercent;
					}
					
					
					case 1747840398:
					{
						return this.patternNegativeNumber;
					}
					
					
					case 45312342:
					{
						return this.patternNegativeCurrency;
					}
					
					
					case 2062500402:
					{
						return this.groupSizesPercent;
					}
					
					
					case 1293712380:
					{
						return this.groupSizesNumber;
					}
					
					
					case 1798631236:
					{
						return this.groupSizesCurrency;
					}
					
					
					case 2013154798:
					{
						return this.decimalDigitsPercent;
					}
					
					
					case 1437940672:
					{
						return this.decimalDigitsNumber;
					}
					
					
					case 1531979784:
					{
						return this.decimalDigitsCurrency;
					}
					
					
					default:
					{
						return base.__hx_getField(field, hash, throwErrors, isCheck, handleProperties);
					}
					
				}
				
			}
		}
		
		
		public override double __hx_getField_f(string field, int hash, bool throwErrors, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 652148892:
					{
						return ((double) (this.patternPositivePercent) );
					}
					
					
					case 822857114:
					{
						return ((double) (this.patternPositiveCurrency) );
					}
					
					
					case 253833312:
					{
						return ((double) (this.patternNegativePercent) );
					}
					
					
					case 1747840398:
					{
						return ((double) (this.patternNegativeNumber) );
					}
					
					
					case 45312342:
					{
						return ((double) (this.patternNegativeCurrency) );
					}
					
					
					case 2013154798:
					{
						return ((double) (this.decimalDigitsPercent) );
					}
					
					
					case 1437940672:
					{
						return ((double) (this.decimalDigitsNumber) );
					}
					
					
					case 1531979784:
					{
						return ((double) (this.decimalDigitsCurrency) );
					}
					
					
					default:
					{
						return base.__hx_getField_f(field, hash, throwErrors, handleProperties);
					}
					
				}
				
			}
		}
		
		
		public override object __hx_invokeField(string field, int hash, global::Array dynargs) {
			unchecked {
				switch (hash) {
					case 1014900378:
					{
						return this.toObject();
					}
					
					
					default:
					{
						return base.__hx_invokeField(field, hash, dynargs);
					}
					
				}
				
			}
		}
		
		
		public override void __hx_getFields(global::Array<object> baseArr) {
			baseArr.push("symbolPositiveInfinity");
			baseArr.push("symbolPermille");
			baseArr.push("symbolPercent");
			baseArr.push("symbolNegativeInfinity");
			baseArr.push("symbolNaN");
			baseArr.push("symbolCurrency");
			baseArr.push("signPositive");
			baseArr.push("signNegative");
			baseArr.push("separatorGroupPercent");
			baseArr.push("separatorGroupNumber");
			baseArr.push("separatorGroupCurrency");
			baseArr.push("separatorDecimalPercent");
			baseArr.push("separatorDecimalNumber");
			baseArr.push("separatorDecimalCurrency");
			baseArr.push("patternPositivePercent");
			baseArr.push("patternPositiveCurrency");
			baseArr.push("patternNegativePercent");
			baseArr.push("patternNegativeNumber");
			baseArr.push("patternNegativeCurrency");
			baseArr.push("groupSizesPercent");
			baseArr.push("groupSizesNumber");
			baseArr.push("groupSizesCurrency");
			baseArr.push("decimalDigitsPercent");
			baseArr.push("decimalDigitsNumber");
			baseArr.push("decimalDigitsCurrency");
			{
				base.__hx_getFields(baseArr);
			}
			
		}
		
		
	}
}


