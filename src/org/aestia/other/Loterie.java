// 
// Decompiled by Procyon v0.5.30
// 

package org.aestia.other;

import org.aestia.client.Player;
import org.aestia.common.Formulas;
import org.aestia.common.SocketManager;
import org.aestia.game.world.World;

public class Loterie {
	public static void startLoterie(final Player perso, final int args) {
		switch (args) {
		case 1: {
			if (!perso.hasItemTemplate(15001, 1)) {
				SocketManager.GAME_SEND_Im_PACKET(perso, "14|43");
				break;
			}
			final int objIdWin = getCadeau1();
			perso.removeByTemplateID(15001, 1);
			SocketManager.GAME_SEND_Im_PACKET(perso, "022;1~15001");
			SocketManager.GAME_SEND_Im_PACKET(perso, "021;1~" + objIdWin);
			final org.aestia.object.Object newObjAdded = World.getObjTemplate(objIdWin).createNewItem(1, false);
			if (!perso.addObjetSimiler(newObjAdded, true, -1)) {
				World.addObjet(newObjAdded, true);
				perso.addObjet(newObjAdded);
				break;
			}
			break;
		}
		case 2: {
			if (!perso.hasItemTemplate(19072, 1)) {
				SocketManager.GAME_SEND_Im_PACKET(perso, "14|43");
				break;
			}
			final int objIdWin = getCadeau2();
			perso.removeByTemplateID(19072, 1);
			SocketManager.GAME_SEND_Im_PACKET(perso, "022;1~19072");
			SocketManager.GAME_SEND_Im_PACKET(perso, "021;1~" + objIdWin);
			final org.aestia.object.Object newObjAdded = World.getObjTemplate(objIdWin).createNewItem(1, false);
			if (!perso.addObjetSimiler(newObjAdded, true, -1)) {
				World.addObjet(newObjAdded, true);
				perso.addObjet(newObjAdded);
				break;
			}
			break;
		}
		}
	}

	public static void startLoteriePioute(final Player perso) {
		final int objIdWin = getCadeauPioute();
		SocketManager.GAME_SEND_Im_PACKET(perso, "021;1~" + objIdWin);
		final org.aestia.object.Object newObjAdded = World.getObjTemplate(objIdWin).createNewItem(1, false);
		if (!perso.addObjetSimiler(newObjAdded, true, -1)) {
			World.addObjet(newObjAdded, true);
			perso.addObjet(newObjAdded);
		}
	}

	public static int getCadeau1() {
		final int Chance = Formulas.getRandomValue(1, 18);
		switch (Chance) {
		case 1: {
			return 10338;
		}
		case 2: {
			return 8899;
		}
		case 3: {
			return 8903;
		}
		case 4: {
			return 9339;
		}
		case 5: {
			return 9348;
		}
		case 6: {
			return 9500;
		}
		case 7: {
			return 9583;
		}
		case 8: {
			return 9889;
		}
		case 9: {
			return 9893;
		}
		case 10: {
			return 10150;
		}
		case 11: {
			return 8817;
		}
		case 12: {
			return 8912;
		}
		case 13: {
			return 8983;
		}
		case 14: {
			return 9353;
		}
		case 15: {
			return 9354;
		}
		case 16: {
			return 9356;
		}
		case 17: {
			return 9358;
		}
		case 18: {
			return 9184;
		}
		default: {
			return Chance;
		}
		}
	}

	public static int getCadeau2() {
		final int Chance = Formulas.getRandomValue(1, 26);
		switch (Chance) {
		case 1: {
			return 9643;
		}
		case 2: {
			return 9642;
		}
		case 3: {
			return 9641;
		}
		case 4: {
			return 9640;
		}
		case 5: {
			return 9639;
		}
		case 6: {
			return 9638;
		}
		case 7: {
			return 9637;
		}
		case 8: {
			return 9636;
		}
		case 9: {
			return 9635;
		}
		case 10: {
			return 8955;
		}
		case 11: {
			return 8954;
		}
		case 12: {
			return 8953;
		}
		case 13: {
			return 8952;
		}
		case 14: {
			return 8951;
		}
		case 15: {
			return 8950;
		}
		case 16: {
			return 8949;
		}
		case 17: {
			return 8948;
		}
		case 18: {
			return 7804;
		}
		case 19: {
			return 7803;
		}
		case 20: {
			return 7802;
		}
		case 21: {
			return 2333;
		}
		case 22: {
			return 2332;
		}
		case 23: {
			return 992;
		}
		case 24: {
			return 991;
		}
		case 25: {
			return 990;
		}
		case 26: {
			return 989;
		}
		default: {
			return Chance;
		}
		}
	}

	public static int getCadeauPioute() {
		final int Chance = Formulas.getRandomValue(1, 6);
		switch (Chance) {
		case 1: {
			return 7708;
		}
		case 2: {
			return 7709;
		}
		case 3: {
			return 7710;
		}
		case 4: {
			return 7711;
		}
		case 5: {
			return 7712;
		}
		case 6: {
			return 7713;
		}
		default: {
			return Chance;
		}
		}
	}

	public static int getCadeauBworker() {
		final int Chance = Formulas.getRandomValue(1, 8);
		switch (Chance) {
		case 1: {
			return 6799;
		}
		case 2: {
			return 6804;
		}
		case 3: {
			return 6805;
		}
		case 4: {
			return 6807;
		}
		case 5: {
			return 6811;
		}
		case 6: {
			return 6812;
		}
		case 7: {
			return 6813;
		}
		case 8: {
			return 6904;
		}
		default: {
			return Chance;
		}
		}
	}
}