package com.ntnu.wip.nabl.MVCView.ClientsList;

import com.ntnu.wip.nabl.MVCView.IAbstractMvcView;

/**
 * Interface connect between ClientListView (View) and it's (controller) LogAClientController
 * Created by a7med on 29.04.18.
 */
public interface IClientListView extends IAbstractMvcView {
    // Functions to implement in the controller
    interface ClientListListener {

    }

    // Functions to implement in the View
    void registerListener(ClientListListener listener);
}