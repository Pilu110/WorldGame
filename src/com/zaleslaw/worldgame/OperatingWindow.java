package com.zaleslaw.worldgame;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.TabHost;
import android.widget.Toast;

import com.zaleslaw.worldgame.logic.Game;

public class OperatingWindow extends Activity {

	private Game game;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.operatingwindow);

		// mp = MediaPlayer.create(context, resource);

		// �������������� ����������, ���� ����� �������� ��� �� �������
		// ����������
		String state = "Russia";
		String person = "Putin";
		int complexcity = 3;
		String DataTime = "14032012";

		game = new Game(state, person, complexcity, DataTime);

		TabHost tabs = (TabHost) findViewById(R.id.tabhost);
		tabs.setup();

		TabHost.TabSpec spec = tabs.newTabSpec("tag1");

		spec.setContent(R.id.tab1);
		spec.setIndicator("����������");
		tabs.addTab(spec);

		spec = tabs.newTabSpec("tag2");
		spec.setContent(R.id.tab2);
		spec.setIndicator("�����");
		tabs.addTab(spec);

		spec = tabs.newTabSpec("tag3");
		spec.setContent(R.id.tab3);
		spec.setIndicator("�������");
		tabs.addTab(spec);

		tabs.setCurrentTab(0);

	}
    
    
    
    
    
    
    
    
    
    public static final int IDM_HELP = 101; 
    public static final int IDM_NEW = 201; 
    public static final int IDM_CLOSE = 202; 
    public static final int IDM_SAVE = 203; 
    public static final int IDM_CUT = 301; 
    public static final int IDM_COPY = 302; 
    public static final int IDM_PASTE = 303; 
    public static final int IDM_GENOCIDE = 401;
    @Override 
    public boolean onCreateOptionsMenu(Menu menu) 
    {
    	
    	SubMenu subMenuGame = menu.addSubMenu("����");
    	subMenuGame.add(Menu.NONE, IDM_NEW, Menu.NONE, "�����");
    	subMenuGame.add(Menu.NONE, IDM_CLOSE, Menu.NONE, "�������");
    	subMenuGame.add(Menu.NONE, IDM_SAVE, Menu.NONE, "���������");
    	
    	SubMenu subMenuGameSettings = menu.addSubMenu("��������� ����");
    	subMenuGameSettings.add(Menu.NONE, IDM_CUT, Menu.NONE, "��������");
    	subMenuGameSettings.add(Menu.NONE, IDM_COPY, Menu.NONE, "����������");
    	subMenuGameSettings.add(Menu.NONE, IDM_PASTE, Menu.NONE, "��������");
    	menu.add(Menu.NONE, IDM_HELP, Menu.NONE, "�������");
    	
    	
    	// ��� �������� ����� ���������� ������ �� ������ � ������������ �������� ������ � �������, �� ����������� ���� ����� (��� ��� ����������� ����� ������� ���������� ������������ - ���������� - ���������� ��������
    	SubMenu subMenuDemography = menu.addSubMenu("����������");
    	subMenuDemography.add(Menu.NONE, IDM_GENOCIDE, Menu.NONE, "�������");
    	return super.onCreateOptionsMenu(menu); 
    }

    @Override 
    public boolean onOptionsItemSelected(MenuItem item) 
    {
    	CharSequence message;

    	switch (item.getItemId()) {
    	case IDM_NEW:
    		message = "������ ����� �����";
    		break;
    	case IDM_CLOSE:
    		message = "������ ����� �������";
    		break;
    	case IDM_SAVE:
    		message = "������ ����� ���������";
    		break;
    	case IDM_CUT:
    		message = "������ ����� ��������";
    		break;
    	case IDM_COPY:
    		message = "������ ����� ����������";
    		break;
    	case IDM_PASTE:
    		message = "������ ����� ��������";
    		break;
    	case IDM_HELP:
    		message = "������ ����� �������";
    		break;
    	case IDM_GENOCIDE:
    		message = "����� 100 �������";
    		game.Genocide("�������", 100);
    		break;
    	default:
    		return false;
    	}
    	// ������� ����������� � ��������� ������ ����
    	Toast toast = Toast.makeText(this, message, Toast.LENGTH_LONG);

    	toast.setGravity(Gravity.CENTER, 0, 0);
    	toast.show();
    	return true;
    }
}