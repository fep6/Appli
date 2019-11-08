package fr.menu;
public class FrKB {
	
	private String[][] caracTouche = new String[21][6];
	
	FrKB(){
		caracTouche[0][0]="Esc";
		caracTouche[1][0]="F1";
		caracTouche[2][0]="F2";
		caracTouche[3][0]="F3";
		caracTouche[4][0]="F4";
		caracTouche[5][0]="F5";
		caracTouche[6][0]="F6";
		caracTouche[7][0]="F7";
		caracTouche[8][0]="F8";
		caracTouche[9][0]="F9";
		caracTouche[10][0]="F10";
		caracTouche[11][0]="F11";
		caracTouche[12][0]="F12";
		caracTouche[13][0]="Imp";
		caracTouche[14][0]="Arr";
		caracTouche[15][0]="Pau";
		
		caracTouche[0][1]="²";
		caracTouche[1][1]="&";
		caracTouche[2][1]="é";
		caracTouche[3][1]="\"";
		caracTouche[4][1]="\'";
		caracTouche[5][1]="(";
		caracTouche[6][1]="-";
		caracTouche[7][1]="è";
		caracTouche[8][1]="_";
		caracTouche[9][1]="ç";
		caracTouche[10][1]="à";
		caracTouche[11][1]=")";
		caracTouche[12][1]="=";
		caracTouche[13][1]="Bsp";
		caracTouche[14][1]="Ins";
		caracTouche[15][1]="Déb";
		caracTouche[16][1]="PagH";
		caracTouche[17][1]="Vnum";
		caracTouche[18][1]="/";
		caracTouche[19][1]="*";
		caracTouche[20][1]="-";	
		
		caracTouche[0][2]="Tab";
		caracTouche[1][2]="a";
		caracTouche[2][2]="z";
		caracTouche[3][2]="e";
		caracTouche[4][2]="r";
		caracTouche[5][2]="t";
		caracTouche[6][2]="y";
		caracTouche[7][2]="u";
		caracTouche[8][2]="i";
		caracTouche[9][2]="o";
		caracTouche[10][2]="p";
		caracTouche[11][2]="^";
		caracTouche[12][2]="$";
		caracTouche[13][2]="Ent";
		caracTouche[14][2]="Sup";
		caracTouche[15][2]="Fin";
		caracTouche[16][2]="PagB";
		caracTouche[17][2]="7";
		caracTouche[18][2]="8";
		caracTouche[19][2]="9";
		caracTouche[20][2]="+";
		
		caracTouche[0][3]="VerU";
		caracTouche[1][3]="q";
		caracTouche[2][3]="s";
		caracTouche[3][3]="d";
		caracTouche[4][3]="f";
		caracTouche[5][3]="g";
		caracTouche[6][3]="h";
		caracTouche[7][3]="j";
		caracTouche[8][3]="k";
		caracTouche[9][3]="l";
		caracTouche[10][3]="m";
		caracTouche[11][3]="ù";
		caracTouche[12][3]="*";
		caracTouche[13][3]="4";
		caracTouche[14][3]="5";
		caracTouche[15][3]="6";
		
		caracTouche[0][4]="LSh";		
		caracTouche[1][4]="<";
		caracTouche[2][4]="w";
		caracTouche[3][4]="x";
		caracTouche[4][4]="c";
		caracTouche[5][4]="v";
		caracTouche[6][4]="b";
		caracTouche[7][4]="n";
		caracTouche[8][4]=",";
		caracTouche[9][4]=";";
		caracTouche[10][4]=":";
		caracTouche[11][4]="!";
		caracTouche[12][4]="RSh";
		caracTouche[13][4]="UAr";
		caracTouche[14][4]="1";
		caracTouche[15][4]="2";
		caracTouche[16][4]="3";
		caracTouche[17][4]="EntN";
		
		caracTouche[0][5]="LCtrl";
		caracTouche[1][5]="Win";
		caracTouche[2][5]="LAlt";
		caracTouche[3][5]="Spa";
		caracTouche[4][5]="AltGr";
		caracTouche[5][5]="Win";
		caracTouche[6][5]="RCtrl";
		caracTouche[7][5]="LAr";
		caracTouche[8][5]="DAr";
		caracTouche[9][5]="RAr";
		caracTouche[10][5]="0";
		caracTouche[11][5]=".";
		
	}
	
	String getTouche(int i, int j) {
		return caracTouche[i][j]; }
	
}
