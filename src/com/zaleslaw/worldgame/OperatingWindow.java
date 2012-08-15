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

		// Инициализируем заглушками, птом будем получать это из старшей
		// активности
		String state = "Russia";
		String person = "Putin";
		int complexcity = 3;
		String DataTime = "14032012";

		game = new Game(state, person, complexcity, DataTime);

		TabHost tabs = (TabHost) findViewById(R.id.tabhost);
		tabs.setup();

		TabHost.TabSpec spec = tabs.newTabSpec("tag1");

		spec.setContent(R.id.tab1);
		spec.setIndicator("Показатели");
		tabs.addTab(spec);

		spec = tabs.newTabSpec("tag2");
		spec.setContent(R.id.tab2);
		spec.setIndicator("Карта");
		tabs.addTab(spec);

		spec = tabs.newTabSpec("tag3");
		spec.setContent(R.id.tab3);
		spec.setIndicator("Картины");
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
    	
    	SubMenu subMenuGame = menu.addSubMenu("Игра");
    	subMenuGame.add(Menu.NONE, IDM_NEW, Menu.NONE, "Новый");
    	subMenuGame.add(Menu.NONE, IDM_CLOSE, Menu.NONE, "Закрыть");
    	subMenuGame.add(Menu.NONE, IDM_SAVE, Menu.NONE, "Сохранить");
    	
    	SubMenu subMenuGameSettings = menu.addSubMenu("Настройки игры");
    	subMenuGameSettings.add(Menu.NONE, IDM_CUT, Menu.NONE, "Вырезать");
    	subMenuGameSettings.add(Menu.NONE, IDM_COPY, Menu.NONE, "Копировать");
    	subMenuGameSettings.add(Menu.NONE, IDM_PASTE, Menu.NONE, "Вставить");
    	menu.add(Menu.NONE, IDM_HELP, Menu.NONE, "Справка");
    	
    	
    	// Для подобных вещей необходимы кнопки на панели с всплывающими списками кнопок и выборов, не закрывающих весь экран (ибо тут вложенность треху уровней Управление государством - демография - конкретное действие
    	SubMenu subMenuDemography = menu.addSubMenu("Демография");
    	subMenuDemography.add(Menu.NONE, IDM_GENOCIDE, Menu.NONE, "Геноцид");
    	return super.onCreateOptionsMenu(menu); 
    }

    @Override 
    public boolean onOptionsItemSelected(MenuItem item) 
    {
    	CharSequence message;

    	switch (item.getItemId()) {
    	case IDM_NEW:
    		message = "Выбран пункт Новый";
    		break;
    	case IDM_CLOSE:
    		message = "Выбран пункт Открыть";
    		break;
    	case IDM_SAVE:
    		message = "Выбран пункт Сохранить";
    		break;
    	case IDM_CUT:
    		message = "Выбран пункт Вырезать";
    		break;
    	case IDM_COPY:
    		message = "Выбран пункт Копировать";
    		break;
    	case IDM_PASTE:
    		message = "Выбран пункт Вставить";
    		break;
    	case IDM_HELP:
    		message = "Выбран пункт Справка";
    		break;
    	case IDM_GENOCIDE:
    		message = "Убито 100 русских";
    		game.Genocide("Русские", 100);
    		break;
    	default:
    		return false;
    	}
    	// выводим уведомление о выбранном пункте меню
    	Toast toast = Toast.makeText(this, message, Toast.LENGTH_LONG);

    	toast.setGravity(Gravity.CENTER, 0, 0);
    	toast.show();
    	return true;
    }
}