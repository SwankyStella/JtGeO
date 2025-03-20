package net.junedev.modcompat;

import net.minecraftforge.eventbus.api.Cancelable;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.Cancelable;
import net.minecraftforge.eventbus.api.Event;

    @Cancelable
    public class StoneTypeEvent extends Event {
        private final IStoneType stoneType;

        public StoneTypeEvent(IStoneType stoneType) {
            this.stoneType = stoneType;
        }

        public IStoneType getStoneType() {
            return this.stoneType;
        }
    }


